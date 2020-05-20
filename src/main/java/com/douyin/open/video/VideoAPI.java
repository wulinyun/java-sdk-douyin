package com.douyin.open.video;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * 串行上传
 */
public class VideoAPI {
    private static final String InitURL = "https://open.douyin.com/video/part/init/?access_token=%s&open_id=%s";
    private static final String UploadPartURL = "https://open.douyin.com/video/part/upload/?access_token=%s&open_id=%s&upload_id=%s&part_number=%d";
    private static final String CompleteURL = "https://open.douyin.com/video/part/complete/?access_token=%s&open_id=%s&upload_id=%s";

    /**
     * 初始化上传分片，获取上传ID
     *
     * @param accessToken
     * @param openId
     * @return 上传ID
     * @throws Exception
     */
    public String initMPUpload(String accessToken, String openId) throws Exception {
        String url = String.format(InitURL, accessToken, openId);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost postReq = new HttpPost(url);
        postReq.setHeader("X-USE-PPE", "1");
        postReq.setHeader("X-TT-ENV", "ppe_openapi");
        CloseableHttpResponse resp = httpClient.execute(postReq);
        HttpEntity respEntity = resp.getEntity();
        String sResponse = EntityUtils.toString(respEntity, "UTF-8");
        System.out.println("post result=" + sResponse);
        InitUploadResp initResp = new Gson().fromJson(sResponse, InitUploadResp.class);
        return initResp.data.uploadId;
    }

    /**
     * 分片上传
     *
     * @param uploadFile
     * @param accessToken
     * @param openId
     * @param uploadId
     * @return
     * @throws Exception
     */
    public void uploadMPPart(File uploadFile, String accessToken, String openId, String uploadId) throws Exception {
        // 建议分片20MB
        final int chunkSize = 20 * 1024 * 1024;
        // 分片最少不能低于5MB
        final int minChunkSize = 5 * 1024 * 1024;
        InputStream is = new FileInputStream(uploadFile);
        byte[] pre = new byte[chunkSize];
        byte[] cur = new byte[chunkSize];
        is.read(pre);
        int j = 0;
        for (int i = 1; ; i++) {
            j++;
            int num = is.read(cur);
            if (num <= 0) {
                break;
            }
            // 所以如果当前分片小于MinChunkSize，表示文件已经读到末尾，当前分片与前一片合起来一起上传。
            if (num < chunkSize) {
                if (num < minChunkSize) {
                    pre = concatenate(pre, cur, num);
                } else {
                    this.uploadPart(accessToken, openId, uploadId, i + 1, cur, uploadFile.getName(), 3);
                }
            }
            System.out.printf("round=%d\n", j);
            this.uploadPart(accessToken, openId, uploadId, i, pre, uploadFile.getName(), 3);
            byte[] t = pre;
            pre = cur;
            cur = t;
        }
    }

    /**
     * 完成上传
     *
     * @param accessToken
     * @param openId
     * @param uploadId
     * @return 视频id
     * @throws Exception
     */
    public CompleteUploadResp completeUpload(String accessToken, String openId, String uploadId) throws Exception {
        String url = String.format(CompleteURL, accessToken, openId, URLEncoder.encode(uploadId, "UTF-8"));
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost postReq = new HttpPost(url);
        postReq.setHeader("X-USE-PPE", "1");
        postReq.setHeader("X-TT-ENV", "ppe_openapi");
        CloseableHttpResponse resp = httpClient.execute(postReq); // auto close
        HttpEntity respEntity = resp.getEntity();
        String sResponse = EntityUtils.toString(respEntity, "UTF-8");
        System.out.println(sResponse);
        CompleteUploadResp completeUploadResp = new Gson().fromJson(sResponse, CompleteUploadResp.class);
        return completeUploadResp;
    }

    public byte[] concatenate(byte[] a, byte[] b, int readLatterNum) {
        System.out.println("concatenate");
        int aLen = a.length;
        int bLen = readLatterNum;

        @SuppressWarnings("unchecked")
        byte[] c = (byte[]) Array.newInstance(a.getClass().getComponentType(), aLen + readLatterNum);
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, readLatterNum);

        return c;
    }

    /**
     * @param accessToken
     * @param openId
     * @param uploadId
     * @param partNumber
     * @param body
     * @param fileName
     * @param retres      重试次数，注意调用一次减一。当单个分片上传结果504，可以重试。如果多个出现504，请调小分片大小。
     * @return
     * @throws Exception
     */
    private String uploadPart(String accessToken, String openId, String uploadId, int partNumber, byte[] body, String fileName, int retres) throws Exception {
        if (retres < 0) {
            throw new Exception("retry failed");
        }

        printMd5(body);

        System.out.printf("part_number=%s, body.length=%d, filename=%s, retres=%d\n", partNumber, body.length, fileName, retres);
        // 包含特殊字符的需要url encode
        String url = String.format(UploadPartURL, accessToken, openId, URLEncoder.encode(uploadId, "UTF-8"), partNumber);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost postReq = new HttpPost(url);
        postReq.setHeader("X-USE-PPE", "1");
        postReq.setHeader("X-TT-ENV", "ppe_openapi");
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();

        builder.addBinaryBody("video",
                new ByteArrayInputStream(body),
                ContentType.APPLICATION_OCTET_STREAM,
                fileName);
        HttpEntity entity = builder.build();
        postReq.setEntity(entity);
        CloseableHttpResponse resp = httpClient.execute(postReq);
        HttpEntity respEntity = resp.getEntity();
        System.out.printf("upload part status code=%s\n", resp.getStatusLine().getStatusCode());
        if (resp.getStatusLine().getStatusCode() == 504 || resp.getStatusLine().getStatusCode() == 502) {
            // 超时重传
            return uploadPart(accessToken, openId, uploadId, partNumber, body, fileName, retres - 1);
        }
        String sResponse = EntityUtils.toString(respEntity, "UTF-8");
        System.out.println("post result=" + sResponse);
        return sResponse;
    }

    private void printMd5(byte[] body) throws Exception {
        byte[] res = MessageDigest.getInstance("MD5").digest(body);

        // Convert byte array into signum representation
        BigInteger no = new BigInteger(1, res);

        // Convert message digest into hex value
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        System.out.println("res=" + hashtext);
    }
}

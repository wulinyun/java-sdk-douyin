package com.douyin.open;

import com.douyin.open.client.DefaultApi;
import com.douyin.open.client.VideoPublishApi;
import com.douyin.open.model.Video;
import com.douyin.open.model.VideoCreateBody;
import com.douyin.open.model.VideoCreateResponse;
import com.douyin.open.model.VideoCreateResponseData;
import com.douyin.open.video.VideoAPI;

import java.io.File;
import java.io.FileInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            String accessToken = "act.a1afc59657287aae317c51b5a089921dVGHyehETdgZQMfWZQS8VfFmGfKdw";
            String openId = "236b48f1-a993-4c75-ba64-d1f810df0a73";
//            VideoAPI videoAPI = new VideoAPI();
//            String uploadId = videoAPI.initMPUpload(accessToken, openId);
//            // String uploadId = "@9VwA3ueLSd4iNm+5Z8IoUM6phmHtOa3RP8N5+1vwfgcVO/L+1HTpLF4hgQby5DoK84BBGPBq1ZqM3ft3iY8qAQ==";
//            System.out.println(uploadId);
//            videoAPI.uploadMPPart(new File("/Users/breakup/Desktop/out2.mov"), accessToken, openId, uploadId);
//            videoAPI.completeUpload(accessToken, openId, uploadId);
            VideoCreateBody reqBody = new VideoCreateBody();
            reqBody.setText("test sdk video create");
            reqBody.setVideoId("vfadfa");
            VideoCreateResponse resp = new VideoPublishApi().videoCreatePost(openId, accessToken, reqBody);
            VideoCreateResponseData data = resp.getData();
            System.out.println(data.getErrorCode());
            System.out.println(data.getItemId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

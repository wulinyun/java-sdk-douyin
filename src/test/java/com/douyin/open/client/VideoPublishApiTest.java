
package com.douyin.open.client;

import com.douyin.open.ApiException;
import java.io.File;
import com.douyin.open.model.VideoCreateBody;
import com.douyin.open.model.VideoCreateResponse;
import com.douyin.open.model.VideoPartCompleteResponse;
import com.douyin.open.model.VideoPartInitResponse;
import com.douyin.open.model.VideoPartUploadResponse;
import com.douyin.open.model.VideoUploadResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for VideoPublishApi
 */
@Ignore
public class VideoPublishApiTest {

    private final VideoPublishApi client = new VideoPublishApi();

    /**
     * 创建抖音视频
     *
     * * Scope: &#x60;video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCreatePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        VideoCreateBody body = new VideoCreateBody();
        VideoCreateResponse response = client.videoCreatePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 完成上传
     *
     * * Scope: &#x60;video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoPartCompletePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String uploadId = "uploadId_example";
        VideoPartCompleteResponse response = client.videoPartCompletePost(openId, accessToken, uploadId);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 初始化上传
     *
     * * Scope: &#x60;video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoPartInitPostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        VideoPartInitResponse response = client.videoPartInitPost(openId, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 上传视频分片到文件服务器
     *
     * * Scope: &#x60;video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoPartUploadPostTest() throws ApiException {
        File video = new File("/path/to/file");
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String uploadId = "uploadId_example";
        Long partNumber = 56;
        VideoPartUploadResponse response = client.videoPartUploadPost(video, openId, accessToken, uploadId, partNumber);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 上传视频到文件服务器
     *
     * * Scope: &#x60;video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoUploadPostTest() throws ApiException {
        File video = new File("/path/to/file");
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        VideoUploadResponse response = client.videoUploadPost(video, openId, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

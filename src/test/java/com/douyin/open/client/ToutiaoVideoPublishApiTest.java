
package com.douyin.open.client;

import com.douyin.open.ApiException;
import java.io.File;
import com.douyin.open.model.ToutiaoVideoCreateBody;
import com.douyin.open.model.ToutiaoVideoCreateResponse;
import com.douyin.open.model.ToutiaoVideoUploadResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for ToutiaoVideoPublishApi
 */
@Ignore
public class ToutiaoVideoPublishApiTest {

    private final ToutiaoVideoPublishApi client = new ToutiaoVideoPublishApi();

    /**
     * 创建头条视频  注意：重复的video_id不会生成新的视频
     *
     * * Scope: &#x60;toutiao.video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void toutiaoVideoCreatePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        ToutiaoVideoCreateBody body = new ToutiaoVideoCreateBody();
        ToutiaoVideoCreateResponse response = client.toutiaoVideoCreatePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 上传视频到文件服务器
     *
     * * Scope: &#x60;toutiao.video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void toutiaoVideoUploadPostTest() throws ApiException {
        File video = new File("/path/to/file");
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        ToutiaoVideoUploadResponse response = client.toutiaoVideoUploadPost(video, openId, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

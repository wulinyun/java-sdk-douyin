
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.VideoDeleteBody;
import com.douyin.open.model.VideoDeleteResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for VideoDeleteApi
 */
@Ignore
public class VideoDeleteApiTest {

    private final VideoDeleteApi client = new VideoDeleteApi();

    /**
     * 删除授权用户发布的视频
     *
     * * Scope: &#x60;video.delete&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoDeletePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        VideoDeleteBody body = new VideoDeleteBody();
        VideoDeleteResponse response = client.videoDeletePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

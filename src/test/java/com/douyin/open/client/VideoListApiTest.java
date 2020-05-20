
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.VideoListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for VideoListApi
 */
@Ignore
public class VideoListApiTest {

    private final VideoListApi client = new VideoListApi();

    /**
     * 列出已发布的视频
     *
     * * Scope: &#x60;video.list&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer count = 10;
        Integer cursor = 0;
        VideoListResponse response = client.videoListGet(openId, accessToken, count, cursor);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

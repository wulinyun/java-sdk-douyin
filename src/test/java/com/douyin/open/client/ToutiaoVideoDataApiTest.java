
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.ToutiaoVideoDataBody;
import com.douyin.open.model.ToutiaoVideoDataResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for ToutiaoVideoDataApi
 */
@Ignore
public class ToutiaoVideoDataApiTest {

    private final ToutiaoVideoDataApi client = new ToutiaoVideoDataApi();

    /**
     * 批量获取视频数据信息
     *
     * * Scope: &#x60;toutiao.video.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void toutiaoVideoDataPostTest() throws ApiException {
        ToutiaoVideoDataBody body = new ToutiaoVideoDataBody();
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        ToutiaoVideoDataResponse response = client.toutiaoVideoDataPost(body, openId, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

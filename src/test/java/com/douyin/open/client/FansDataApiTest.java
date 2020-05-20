
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.FansDataResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for FansDataApi
 */
@Ignore
public class FansDataApiTest {

    private final FansDataApi client = new FansDataApi();

    /**
     * 获取用户粉丝数据
     *
     * * Scope: &#x60;fans.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fansDataGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        FansDataResponse response = client.fansDataGet(openId, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

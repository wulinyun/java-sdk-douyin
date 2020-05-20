
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.ImMessageSendBody;
import com.douyin.open.model.ImMessageSendResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for ImApi
 */
@Ignore
public class ImApiTest {

    private final ImApi client = new ImApi();

    /**
     * 给抖音用户发送消息
     *
     * * Scope: &#x60;im&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imMessageSendPostTest() throws ApiException {
        ImMessageSendBody body = new ImMessageSendBody();
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        ImMessageSendResponse response = client.imMessageSendPost(body, openId, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

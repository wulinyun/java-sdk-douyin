
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.EventStatusListResponse;
import com.douyin.open.model.EventStatusUpdateBody;
import com.douyin.open.model.EventStatusUpdateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for EventStatusApi
 */
@Ignore
public class EventStatusApiTest {

    private final EventStatusApi client = new EventStatusApi();

    /**
     * 获取事件订阅状态
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventStatusListGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        EventStatusListResponse response = client.eventStatusListGet(accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 更新应用推送事件订阅状态
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventStatusUpdatePostTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        EventStatusUpdateBody body = new EventStatusUpdateBody();
        EventStatusUpdateResponse response = client.eventStatusUpdatePost(accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

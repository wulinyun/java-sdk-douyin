
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.CommonResponse;
import com.douyin.open.model.SandboxWebhookEventSendBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for SandboxApi
 */
@Ignore
public class SandboxApiTest {

    private final SandboxApi client = new SandboxApi();

    /**
     * 模拟webhook事件
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sandboxWebhookEventSendPostTest() throws ApiException {
        SandboxWebhookEventSendBody body = new SandboxWebhookEventSendBody();
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        CommonResponse response = client.sandboxWebhookEventSendPost(body, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

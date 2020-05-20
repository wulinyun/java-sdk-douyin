
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.OauthRefreshTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi client = new DefaultApi();

    /**
     * 刷新access_token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthRefreshTokenGetTest() throws ApiException {
        String clientKey = "clientKey_example";
        String grantType = "grantType_example";
        String refreshToken = "refreshToken_example";
        OauthRefreshTokenResponse response = client.oauthRefreshTokenGet(clientKey, grantType, refreshToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

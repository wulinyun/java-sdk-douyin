
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.OauthUserinfoResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for UserInfoApi
 */
@Ignore
public class UserInfoApiTest {

    private final UserInfoApi client = new UserInfoApi();

    /**
     * 获取用户信息
     *
     * * Scope: &#x60;user_info&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthUserinfoGetTest() throws ApiException {
        String accessToken = "accessToken_example";
        String openId = "openId_example";
        OauthUserinfoResponse response = client.oauthUserinfoGet(accessToken, openId);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

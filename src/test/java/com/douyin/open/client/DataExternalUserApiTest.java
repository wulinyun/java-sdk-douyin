
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.DataExternalUserCommentResponse;
import com.douyin.open.model.DataExternalUserFansResponse;
import com.douyin.open.model.DataExternalUserItemResponse;
import com.douyin.open.model.DataExternalUserLikeResponse;
import com.douyin.open.model.DataExternalUserProfileResponse;
import com.douyin.open.model.DataExternalUserShareResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for DataExternalUserApi
 */
@Ignore
public class DataExternalUserApiTest {

    private final DataExternalUserApi client = new DataExternalUserApi();

    /**
     * 获取用户评论数
     *
     * * Scope: &#x60;data.external.user&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalUserCommentGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer dateType = 56;
        DataExternalUserCommentResponse response = client.dataExternalUserCommentGet(openId, accessToken, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取用户粉丝数
     *
     * * Scope: &#x60;data.external.user&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalUserFansGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer dateType = 56;
        DataExternalUserFansResponse response = client.dataExternalUserFansGet(openId, accessToken, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取用户视频情况
     *
     * * Scope: &#x60;data.external.user&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalUserItemGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer dateType = 56;
        DataExternalUserItemResponse response = client.dataExternalUserItemGet(openId, accessToken, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取用户点赞数
     *
     * * Scope: &#x60;data.external.user&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalUserLikeGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer dateType = 56;
        DataExternalUserLikeResponse response = client.dataExternalUserLikeGet(openId, accessToken, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取用户主页访问数
     *
     * * Scope: &#x60;data.external.user&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalUserProfileGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer dateType = 56;
        DataExternalUserProfileResponse response = client.dataExternalUserProfileGet(openId, accessToken, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取用户分享数
     *
     * * Scope: &#x60;data.external.user&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalUserShareGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer dateType = 56;
        DataExternalUserShareResponse response = client.dataExternalUserShareGet(openId, accessToken, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}


package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.EnterpriseLeadsTagCreateBody;
import com.douyin.open.model.EnterpriseLeadsTagCreateResponse;
import com.douyin.open.model.EnterpriseLeadsTagDeleteBody;
import com.douyin.open.model.EnterpriseLeadsTagDeleteResponse;
import com.douyin.open.model.EnterpriseLeadsTagListResponse;
import com.douyin.open.model.EnterpriseLeadsTagUpdateBody;
import com.douyin.open.model.EnterpriseLeadsTagUserListResponse;
import com.douyin.open.model.EnterpriseLeadsTagUserUpdateBody;
import com.douyin.open.model.EnterpriseLeadsUserActionListResponse;
import com.douyin.open.model.EnterpriseLeadsUserDetailResponse;
import com.douyin.open.model.EnterpriseLeadsUserListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for EnterpriseLeadsApi
 */
@Ignore
public class EnterpriseLeadsApiTest {

    private final EnterpriseLeadsApi client = new EnterpriseLeadsApi();

    /**
     * 创建标签
     *
     * * Scope: &#x60;enterprise.data&#x60; * 一个企业号最多创建100个标签 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsTagCreatePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        EnterpriseLeadsTagCreateBody body = new EnterpriseLeadsTagCreateBody();
        EnterpriseLeadsTagCreateResponse response = client.enterpriseLeadsTagCreatePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 删除标签
     *
     * * Scope: &#x60;enterprise.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsTagDeletePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        EnterpriseLeadsTagDeleteBody body = new EnterpriseLeadsTagDeleteBody();
        EnterpriseLeadsTagDeleteResponse response = client.enterpriseLeadsTagDeletePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取标签列表
     *
     * * Scope: &#x60;enterprise.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsTagListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Long count = 10;
        Long cursor = 56;
        EnterpriseLeadsTagListResponse response = client.enterpriseLeadsTagListGet(openId, accessToken, count, cursor);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 编辑标签
     *
     * * Scope: &#x60;enterprise.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsTagUpdatePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        EnterpriseLeadsTagUpdateBody body = new EnterpriseLeadsTagUpdateBody();
        EnterpriseLeadsTagCreateResponse response = client.enterpriseLeadsTagUpdatePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取打标签的用户列表
     *
     * * Scope: &#x60;enterprise.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsTagUserListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Long count = 10;
        Long tagId = 56;
        Long cursor = 56;
        EnterpriseLeadsTagUserListResponse response = client.enterpriseLeadsTagUserListGet(openId, accessToken, count, tagId, cursor);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 给用户设置标签
     *
     * * Scope: &#x60;enterprise.data&#x60; * 一个用户最多设置5个标签 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsTagUserUpdatePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        EnterpriseLeadsTagUserUpdateBody body = new EnterpriseLeadsTagUserUpdateBody();
        EnterpriseLeadsTagDeleteResponse response = client.enterpriseLeadsTagUserUpdatePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取意向用户互动记录
     *
     * * Scope: &#x60;enterprise.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsUserActionListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Long count = 10;
        String userId = "userId_example";
        String cursor = "cursor_example";
        Long actionType = 56;
        EnterpriseLeadsUserActionListResponse response = client.enterpriseLeadsUserActionListGet(openId, accessToken, count, userId, cursor, actionType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取意向用户详情
     *
     * * Scope: &#x60;enterprise.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsUserDetailGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String userId = "userId_example";
        EnterpriseLeadsUserDetailResponse response = client.enterpriseLeadsUserDetailGet(openId, accessToken, userId);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取意向用户列表
     *
     * * Scope: &#x60;enterprise.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseLeadsUserListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Long count = 10;
        Long startTime = 56;
        Long endTime = 56;
        Long actionType = 56;
        Long cursor = 56;
        Long leadsLevel = 56;
        EnterpriseLeadsUserListResponse response = client.enterpriseLeadsUserListGet(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

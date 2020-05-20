
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.DataExternalItemBaseResponse;
import com.douyin.open.model.DataExternalItemCommentResponse;
import com.douyin.open.model.DataExternalItemLikeResponse;
import com.douyin.open.model.DataExternalItemPlayResponse;
import com.douyin.open.model.DataExternalItemShareResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for DataExternalItemApi
 */
@Ignore
public class DataExternalItemApiTest {

    private final DataExternalItemApi client = new DataExternalItemApi();

    /**
     * 获取视频基础数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemBaseGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String itemId = "itemId_example";
        DataExternalItemBaseResponse response = client.dataExternalItemBaseGet(openId, accessToken, itemId);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取视频评论数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemCommentGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String itemId = "itemId_example";
        Integer dateType = 56;
        DataExternalItemCommentResponse response = client.dataExternalItemCommentGet(openId, accessToken, itemId, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取视频点赞数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemLikeGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String itemId = "itemId_example";
        Integer dateType = 56;
        DataExternalItemLikeResponse response = client.dataExternalItemLikeGet(openId, accessToken, itemId, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取视频播放数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemPlayGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String itemId = "itemId_example";
        Integer dateType = 56;
        DataExternalItemPlayResponse response = client.dataExternalItemPlayGet(openId, accessToken, itemId, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取视频分享数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemShareGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        String itemId = "itemId_example";
        Integer dateType = 56;
        DataExternalItemShareResponse response = client.dataExternalItemShareGet(openId, accessToken, itemId, dateType);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

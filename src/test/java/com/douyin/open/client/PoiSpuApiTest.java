
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.PoiSkuSyncBody;
import com.douyin.open.model.PoiSkuSyncResponse;
import com.douyin.open.model.PoiSpuQueryResponse;
import com.douyin.open.model.PoiSpuSyncBody;
import com.douyin.open.model.PoiSpuSyncResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for PoiSpuApi
 */
@Ignore
public class PoiSpuApiTest {

    private final PoiSpuApi client = new PoiSpuApi();

    /**
     * SKU同步
     *
     * # description 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSkuSyncPostTest() throws ApiException {
        PoiSkuSyncBody body = new PoiSkuSyncBody();
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        PoiSkuSyncResponse response = client.poiSkuSyncPost(body, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 查询SPU
     *
     * # description 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSpuQueryGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        String spuExtId = "spuExtId_example";
        PoiSpuQueryResponse response = client.poiSpuQueryGet(accessToken, spuExtId);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * SPU同步
     *
     * # description 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSpuSyncPostTest() throws ApiException {
        PoiSpuSyncBody body = new PoiSpuSyncBody();
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        PoiSpuSyncResponse response = client.poiSpuSyncPost(body, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}


package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.PoiQueryResponse;
import com.douyin.open.model.PoiSupplierQueryResponse;
import com.douyin.open.model.PoiSupplierSyncBody;
import com.douyin.open.model.PoiSupplierSyncResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for PoiSupplierApi
 */
@Ignore
public class PoiSupplierApiTest {

    private final PoiSupplierApi client = new PoiSupplierApi();

    /**
     * 获取抖音POI ID
     *
     * 通过高德ID获取抖音POI ID 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiQueryGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        String amapId = "amapId_example";
        PoiQueryResponse response = client.poiQueryGet(accessToken, amapId);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 查询店铺
     *
     * # description 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSupplierQueryGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        String supplierExtId = "supplierExtId_example";
        PoiSupplierQueryResponse response = client.poiSupplierQueryGet(accessToken, supplierExtId);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 商铺同步
     *
     * # description 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSupplierSyncPostTest() throws ApiException {
        PoiSupplierSyncBody body = new PoiSupplierSyncBody();
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        PoiSupplierSyncResponse response = client.poiSupplierSyncPost(body, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

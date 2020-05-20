
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.PoiOrderSyncBody;
import com.douyin.open.model.PoiOrderSyncResponse1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for PoiOrderSyncApi
 */
@Ignore
public class PoiOrderSyncApiTest {

    private final PoiOrderSyncApi client = new PoiOrderSyncApi();

    /**
     * 订单同步
     *
     * * Scope: &#x60;poi.product&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiOrderSyncPostTest() throws ApiException {
        PoiOrderSyncBody body = new PoiOrderSyncBody();
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        PoiOrderSyncResponse1 response = client.poiOrderSyncPost(body, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

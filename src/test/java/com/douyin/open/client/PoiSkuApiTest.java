
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.PoiExtHotelSkuResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for PoiSkuApi
 */
@Ignore
public class PoiSkuApiTest {

    private final PoiSkuApi client = new PoiSkuApi();

    /**
     * sku拉取(该接口由接入方实现)
     *
     * # 该接口由接入方实现 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiExtHotelSkuGetTest() throws ApiException {
        List<String> spuExtId = Arrays.asList("[\"y0001\",\"y0002\"]");
        String startDate = "20191001";
        String endDate = "20191007";
        PoiExtHotelSkuResponse response = client.poiExtHotelSkuGet(spuExtId, startDate, endDate);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

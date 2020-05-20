
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.PoiExtHotelOrderCancelBody;
import com.douyin.open.model.PoiExtHotelOrderCommitBody;
import com.douyin.open.model.PoiExtHotelOrderCommitResponse2;
import com.douyin.open.model.PoiExtHotelOrderStatusBody;
import com.douyin.open.model.PoiExtHotelOrderStatusResponse;
import com.douyin.open.model.PoiOrderStatusBody;
import com.douyin.open.model.PoiOrderStatusResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for PoiOrderApi
 */
@Ignore
public class PoiOrderApiTest {

    private final PoiOrderApi client = new PoiOrderApi();

    /**
     * 订单退款(该接口由接入方实现)
     *
     * # 该接口由接入方实现 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiExtHotelOrderCancelPostTest() throws ApiException {
        PoiExtHotelOrderCancelBody body = new PoiExtHotelOrderCancelBody();
        PoiOrderStatusResponse response = client.poiExtHotelOrderCancelPost(body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 下单接口(该接口由接入方实现)
     *
     * # 该接口由接入方实现 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiExtHotelOrderCommitPostTest() throws ApiException {
        PoiExtHotelOrderCommitBody body = new PoiExtHotelOrderCommitBody();
        PoiExtHotelOrderCommitResponse2 response = client.poiExtHotelOrderCommitPost(body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 订单状态通知(该接口由接入方实现)
     *
     * # 该接口由接入方实现 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiExtHotelOrderStatusPostTest() throws ApiException {
        PoiExtHotelOrderStatusBody body = new PoiExtHotelOrderStatusBody();
        PoiExtHotelOrderStatusResponse response = client.poiExtHotelOrderStatusPost(body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 订单状态同步接口
     *
     * # 订单状态同步接口 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiOrderStatusPostTest() throws ApiException {
        PoiOrderStatusBody body = new PoiOrderStatusBody();
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        PoiOrderStatusResponse response = client.poiOrderStatusPost(body, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

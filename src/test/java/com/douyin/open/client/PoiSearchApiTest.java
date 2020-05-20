
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.PoiSearchKeywordResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for PoiSearchApi
 */
@Ignore
public class PoiSearchApiTest {

    private final PoiSearchApi client = new PoiSearchApi();

    /**
     * 关键字搜索
     *
     * * Scope: &#x60;poi.search&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSearchKeywordGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        Integer count = 10;
        String keyword = "keyword_example";
        Integer cursor = 0;
        String city = "city_example";
        PoiSearchKeywordResponse response = client.poiSearchKeywordGet(accessToken, count, keyword, cursor, city);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}


package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.HotsearchSentencesResponse;
import com.douyin.open.model.HotsearchVideosResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for HotsearchApi
 */
@Ignore
public class HotsearchApiTest {

    private final HotsearchApi client = new HotsearchApi();

    /**
     * 获取实时热点词
     *
     * * Scope: &#x60;hotsearch&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hotsearchSentencesGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        HotsearchSentencesResponse response = client.hotsearchSentencesGet(accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 获取热点词聚合的视频
     *
     * * Scope: &#x60;hotsearch&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hotsearchVideosGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        String hotSentence = "hotSentence_example";
        HotsearchVideosResponse response = client.hotsearchVideosGet(accessToken, hotSentence);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}


package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.ShareidResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for ShareIdApi
 */
@Ignore
public class ShareIdApiTest {

    private final ShareIdApi client = new ShareIdApi();

    /**
     * 获取share-id
     *
     * * Scope: &#x60;aweme.share&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shareIdGetTest() throws ApiException {
        String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ";
        Boolean needCallback = true;
        String sourceStyleId = "sourceStyleId_example";
        String defaultHashtag = "defaultHashtag_example";
        String linkParam = "linkParam_example";
        ShareidResponse response = client.shareIdGet(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}

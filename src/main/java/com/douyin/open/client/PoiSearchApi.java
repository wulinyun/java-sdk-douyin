/*
 * 
 *
 * 
 *
 * 本文件由抖音小开生成，请勿手动更改
 */

package com.douyin.open.client;

import com.douyin.open.ApiCallback;
import com.douyin.open.ApiClient;
import com.douyin.open.ApiException;
import com.douyin.open.ApiResponse;
import com.douyin.open.Configuration;
import com.douyin.open.Pair;
import com.douyin.open.ProgressRequestBody;
import com.douyin.open.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.douyin.open.model.PoiSearchKeywordResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiSearchApi {
    private ApiClient apiClient;

    public PoiSearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PoiSearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for poiSearchKeywordGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param keyword 查询关键字，例如美食 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param city 查询城市，例如上海、北京 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiSearchKeywordGetCall(String accessToken, Integer count, String keyword, Long cursor, String city, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/poi/search/keyword/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (keyword != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword", keyword));
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("city", city));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call poiSearchKeywordGetValidateBeforeCall(String accessToken, Integer count, String keyword, Long cursor, String city, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiSearchKeywordGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling poiSearchKeywordGet(Async)");
        }
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new ApiException("Missing the required parameter 'keyword' when calling poiSearchKeywordGet(Async)");
        }
        
        com.squareup.okhttp.Call call = poiSearchKeywordGetCall(accessToken, count, keyword, cursor, city, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 关键字搜索
     * * Scope: &#x60;poi.search&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param keyword 查询关键字，例如美食 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param city 查询城市，例如上海、北京 (optional)
     * @return PoiSearchKeywordResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiSearchKeywordResponse poiSearchKeywordGet(String accessToken, Integer count, String keyword, Long cursor, String city) throws ApiException {
        ApiResponse<PoiSearchKeywordResponse> resp = poiSearchKeywordGetWithHttpInfo(accessToken, count, keyword, cursor, city);
        return resp.getData();
    }

    /**
     * 关键字搜索
     * * Scope: &#x60;poi.search&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param keyword 查询关键字，例如美食 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param city 查询城市，例如上海、北京 (optional)
     * @return ApiResponse&lt;PoiSearchKeywordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiSearchKeywordResponse> poiSearchKeywordGetWithHttpInfo(String accessToken, Integer count, String keyword, Long cursor, String city) throws ApiException {
        com.squareup.okhttp.Call call = poiSearchKeywordGetValidateBeforeCall(accessToken, count, keyword, cursor, city, null, null);
        Type localVarReturnType = new TypeToken<PoiSearchKeywordResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 关键字搜索 (asynchronously)
     * * Scope: &#x60;poi.search&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param keyword 查询关键字，例如美食 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param city 查询城市，例如上海、北京 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiSearchKeywordGetAsync(String accessToken, Integer count, String keyword, Long cursor, String city, final ApiCallback<PoiSearchKeywordResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = poiSearchKeywordGetValidateBeforeCall(accessToken, count, keyword, cursor, city, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiSearchKeywordResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

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


import com.douyin.open.model.HotsearchSentencesResponse;
import com.douyin.open.model.HotsearchTrendingSentencesResponse;
import com.douyin.open.model.HotsearchVideosResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotsearchApi {
    private ApiClient apiClient;

    public HotsearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HotsearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for hotsearchSentencesGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call hotsearchSentencesGetCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/hotsearch/sentences/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

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
    private com.squareup.okhttp.Call hotsearchSentencesGetValidateBeforeCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling hotsearchSentencesGet(Async)");
        }
        
        com.squareup.okhttp.Call call = hotsearchSentencesGetCall(accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取实时热点词
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return HotsearchSentencesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HotsearchSentencesResponse hotsearchSentencesGet(String accessToken) throws ApiException {
        ApiResponse<HotsearchSentencesResponse> resp = hotsearchSentencesGetWithHttpInfo(accessToken);
        return resp.getData();
    }

    /**
     * 获取实时热点词
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return ApiResponse&lt;HotsearchSentencesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HotsearchSentencesResponse> hotsearchSentencesGetWithHttpInfo(String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = hotsearchSentencesGetValidateBeforeCall(accessToken, null, null);
        Type localVarReturnType = new TypeToken<HotsearchSentencesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取实时热点词 (asynchronously)
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call hotsearchSentencesGetAsync(String accessToken, final ApiCallback<HotsearchSentencesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = hotsearchSentencesGetValidateBeforeCall(accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HotsearchSentencesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for hotsearchTrendingSentencesGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call hotsearchTrendingSentencesGetCall(String accessToken, Integer count, Long cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/hotsearch/trending/sentences/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));

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
    private com.squareup.okhttp.Call hotsearchTrendingSentencesGetValidateBeforeCall(String accessToken, Integer count, Long cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling hotsearchTrendingSentencesGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling hotsearchTrendingSentencesGet(Async)");
        }
        
        com.squareup.okhttp.Call call = hotsearchTrendingSentencesGetCall(accessToken, count, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取上升词
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @return HotsearchTrendingSentencesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HotsearchTrendingSentencesResponse hotsearchTrendingSentencesGet(String accessToken, Integer count, Long cursor) throws ApiException {
        ApiResponse<HotsearchTrendingSentencesResponse> resp = hotsearchTrendingSentencesGetWithHttpInfo(accessToken, count, cursor);
        return resp.getData();
    }

    /**
     * 获取上升词
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @return ApiResponse&lt;HotsearchTrendingSentencesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HotsearchTrendingSentencesResponse> hotsearchTrendingSentencesGetWithHttpInfo(String accessToken, Integer count, Long cursor) throws ApiException {
        com.squareup.okhttp.Call call = hotsearchTrendingSentencesGetValidateBeforeCall(accessToken, count, cursor, null, null);
        Type localVarReturnType = new TypeToken<HotsearchTrendingSentencesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取上升词 (asynchronously)
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call hotsearchTrendingSentencesGetAsync(String accessToken, Integer count, Long cursor, final ApiCallback<HotsearchTrendingSentencesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = hotsearchTrendingSentencesGetValidateBeforeCall(accessToken, count, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HotsearchTrendingSentencesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for hotsearchVideosGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param hotSentence 热点词 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call hotsearchVideosGetCall(String accessToken, String hotSentence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/hotsearch/videos/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (hotSentence != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hot_sentence", hotSentence));

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
    private com.squareup.okhttp.Call hotsearchVideosGetValidateBeforeCall(String accessToken, String hotSentence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling hotsearchVideosGet(Async)");
        }
        // verify the required parameter 'hotSentence' is set
        if (hotSentence == null) {
            throw new ApiException("Missing the required parameter 'hotSentence' when calling hotsearchVideosGet(Async)");
        }
        
        com.squareup.okhttp.Call call = hotsearchVideosGetCall(accessToken, hotSentence, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取热点词聚合的视频
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param hotSentence 热点词 (required)
     * @return HotsearchVideosResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HotsearchVideosResponse hotsearchVideosGet(String accessToken, String hotSentence) throws ApiException {
        ApiResponse<HotsearchVideosResponse> resp = hotsearchVideosGetWithHttpInfo(accessToken, hotSentence);
        return resp.getData();
    }

    /**
     * 获取热点词聚合的视频
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param hotSentence 热点词 (required)
     * @return ApiResponse&lt;HotsearchVideosResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HotsearchVideosResponse> hotsearchVideosGetWithHttpInfo(String accessToken, String hotSentence) throws ApiException {
        com.squareup.okhttp.Call call = hotsearchVideosGetValidateBeforeCall(accessToken, hotSentence, null, null);
        Type localVarReturnType = new TypeToken<HotsearchVideosResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取热点词聚合的视频 (asynchronously)
     * * Scope: &#x60;hotsearch&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param hotSentence 热点词 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call hotsearchVideosGetAsync(String accessToken, String hotSentence, final ApiCallback<HotsearchVideosResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = hotsearchVideosGetValidateBeforeCall(accessToken, hotSentence, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HotsearchVideosResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

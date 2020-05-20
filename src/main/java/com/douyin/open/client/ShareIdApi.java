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


import com.douyin.open.model.ShareidResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShareIdApi {
    private ApiClient apiClient;

    public ShareIdApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShareIdApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for shareIdGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param needCallback 如果需要知道视频分享成功的结果，need_callback设置为true (optional)
     * @param sourceStyleId 多来源样式id（暂未开放） (optional)
     * @param defaultHashtag 追踪分享默认hashtag (optional)
     * @param linkParam 分享来源url附加参数（暂未开放） (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shareIdGetCall(String accessToken, Boolean needCallback, String sourceStyleId, String defaultHashtag, String linkParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/share-id/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (needCallback != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("need_callback", needCallback));
        if (sourceStyleId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source_style_id", sourceStyleId));
        if (defaultHashtag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("default_hashtag", defaultHashtag));
        if (linkParam != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("link_param", linkParam));

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
    private com.squareup.okhttp.Call shareIdGetValidateBeforeCall(String accessToken, Boolean needCallback, String sourceStyleId, String defaultHashtag, String linkParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling shareIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = shareIdGetCall(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取share-id
     * * Scope: &#x60;aweme.share&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param needCallback 如果需要知道视频分享成功的结果，need_callback设置为true (optional)
     * @param sourceStyleId 多来源样式id（暂未开放） (optional)
     * @param defaultHashtag 追踪分享默认hashtag (optional)
     * @param linkParam 分享来源url附加参数（暂未开放） (optional)
     * @return ShareidResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShareidResponse shareIdGet(String accessToken, Boolean needCallback, String sourceStyleId, String defaultHashtag, String linkParam) throws ApiException {
        ApiResponse<ShareidResponse> resp = shareIdGetWithHttpInfo(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam);
        return resp.getData();
    }

    /**
     * 获取share-id
     * * Scope: &#x60;aweme.share&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param needCallback 如果需要知道视频分享成功的结果，need_callback设置为true (optional)
     * @param sourceStyleId 多来源样式id（暂未开放） (optional)
     * @param defaultHashtag 追踪分享默认hashtag (optional)
     * @param linkParam 分享来源url附加参数（暂未开放） (optional)
     * @return ApiResponse&lt;ShareidResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShareidResponse> shareIdGetWithHttpInfo(String accessToken, Boolean needCallback, String sourceStyleId, String defaultHashtag, String linkParam) throws ApiException {
        com.squareup.okhttp.Call call = shareIdGetValidateBeforeCall(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam, null, null);
        Type localVarReturnType = new TypeToken<ShareidResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取share-id (asynchronously)
     * * Scope: &#x60;aweme.share&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param needCallback 如果需要知道视频分享成功的结果，need_callback设置为true (optional)
     * @param sourceStyleId 多来源样式id（暂未开放） (optional)
     * @param defaultHashtag 追踪分享默认hashtag (optional)
     * @param linkParam 分享来源url附加参数（暂未开放） (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shareIdGetAsync(String accessToken, Boolean needCallback, String sourceStyleId, String defaultHashtag, String linkParam, final ApiCallback<ShareidResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shareIdGetValidateBeforeCall(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ShareidResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

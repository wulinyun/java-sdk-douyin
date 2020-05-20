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


import com.douyin.open.model.OauthUserinfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoApi {
    private ApiClient apiClient;

    public UserInfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserInfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for oauthUserinfoGet
     * @param accessToken  (required)
     * @param openId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthUserinfoGetCall(String accessToken, String openId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/userinfo/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));

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
    private com.squareup.okhttp.Call oauthUserinfoGetValidateBeforeCall(String accessToken, String openId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling oauthUserinfoGet(Async)");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling oauthUserinfoGet(Async)");
        }
        
        com.squareup.okhttp.Call call = oauthUserinfoGetCall(accessToken, openId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户信息
     * * Scope: &#x60;user_info&#x60; 
     * @param accessToken  (required)
     * @param openId  (required)
     * @return OauthUserinfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthUserinfoResponse oauthUserinfoGet(String accessToken, String openId) throws ApiException {
        ApiResponse<OauthUserinfoResponse> resp = oauthUserinfoGetWithHttpInfo(accessToken, openId);
        return resp.getData();
    }

    /**
     * 获取用户信息
     * * Scope: &#x60;user_info&#x60; 
     * @param accessToken  (required)
     * @param openId  (required)
     * @return ApiResponse&lt;OauthUserinfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OauthUserinfoResponse> oauthUserinfoGetWithHttpInfo(String accessToken, String openId) throws ApiException {
        com.squareup.okhttp.Call call = oauthUserinfoGetValidateBeforeCall(accessToken, openId, null, null);
        Type localVarReturnType = new TypeToken<OauthUserinfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户信息 (asynchronously)
     * * Scope: &#x60;user_info&#x60; 
     * @param accessToken  (required)
     * @param openId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthUserinfoGetAsync(String accessToken, String openId, final ApiCallback<OauthUserinfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oauthUserinfoGetValidateBeforeCall(accessToken, openId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OauthUserinfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

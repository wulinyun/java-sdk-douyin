/*
 * 获取应用推送事件订阅状态
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


import com.douyin.open.model.EventStatusListResponse;
import com.douyin.open.model.EventStatusUpdateBody;
import com.douyin.open.model.EventStatusUpdateResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventStatusApi {
    private ApiClient apiClient;

    public EventStatusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventStatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for eventStatusListGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call eventStatusListGetCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/event/status/list/";

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
    private com.squareup.okhttp.Call eventStatusListGetValidateBeforeCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling eventStatusListGet(Async)");
        }
        
        com.squareup.okhttp.Call call = eventStatusListGetCall(accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取事件订阅状态
     * 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return EventStatusListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventStatusListResponse eventStatusListGet(String accessToken) throws ApiException {
        ApiResponse<EventStatusListResponse> resp = eventStatusListGetWithHttpInfo(accessToken);
        return resp.getData();
    }

    /**
     * 获取事件订阅状态
     * 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return ApiResponse&lt;EventStatusListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventStatusListResponse> eventStatusListGetWithHttpInfo(String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = eventStatusListGetValidateBeforeCall(accessToken, null, null);
        Type localVarReturnType = new TypeToken<EventStatusListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取事件订阅状态 (asynchronously)
     * 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call eventStatusListGetAsync(String accessToken, final ApiCallback<EventStatusListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = eventStatusListGetValidateBeforeCall(accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventStatusListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for eventStatusUpdatePost
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call eventStatusUpdatePostCall(String accessToken, EventStatusUpdateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/event/status/update/";

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call eventStatusUpdatePostValidateBeforeCall(String accessToken, EventStatusUpdateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling eventStatusUpdatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = eventStatusUpdatePostCall(accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 更新应用推送事件订阅状态
     * 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param body  (optional)
     * @return EventStatusUpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventStatusUpdateResponse eventStatusUpdatePost(String accessToken, EventStatusUpdateBody body) throws ApiException {
        ApiResponse<EventStatusUpdateResponse> resp = eventStatusUpdatePostWithHttpInfo(accessToken, body);
        return resp.getData();
    }

    /**
     * 更新应用推送事件订阅状态
     * 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;EventStatusUpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventStatusUpdateResponse> eventStatusUpdatePostWithHttpInfo(String accessToken, EventStatusUpdateBody body) throws ApiException {
        com.squareup.okhttp.Call call = eventStatusUpdatePostValidateBeforeCall(accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<EventStatusUpdateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 更新应用推送事件订阅状态 (asynchronously)
     * 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call eventStatusUpdatePostAsync(String accessToken, EventStatusUpdateBody body, final ApiCallback<EventStatusUpdateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = eventStatusUpdatePostValidateBeforeCall(accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventStatusUpdateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

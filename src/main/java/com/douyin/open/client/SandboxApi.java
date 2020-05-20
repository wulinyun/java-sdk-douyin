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


import com.douyin.open.model.CommonResponse;
import com.douyin.open.model.SandboxWebhookEventSendBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandboxApi {
    private ApiClient apiClient;

    public SandboxApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SandboxApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for sandboxWebhookEventSendPost
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sandboxWebhookEventSendPostCall(SandboxWebhookEventSendBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/sandbox/webhook/event/send/";

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
    private com.squareup.okhttp.Call sandboxWebhookEventSendPostValidateBeforeCall(SandboxWebhookEventSendBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling sandboxWebhookEventSendPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling sandboxWebhookEventSendPost(Async)");
        }
        
        com.squareup.okhttp.Call call = sandboxWebhookEventSendPostCall(body, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 模拟webhook事件
     * 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommonResponse sandboxWebhookEventSendPost(SandboxWebhookEventSendBody body, String accessToken) throws ApiException {
        ApiResponse<CommonResponse> resp = sandboxWebhookEventSendPostWithHttpInfo(body, accessToken);
        return resp.getData();
    }

    /**
     * 模拟webhook事件
     * 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommonResponse> sandboxWebhookEventSendPostWithHttpInfo(SandboxWebhookEventSendBody body, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = sandboxWebhookEventSendPostValidateBeforeCall(body, accessToken, null, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 模拟webhook事件 (asynchronously)
     * 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sandboxWebhookEventSendPostAsync(SandboxWebhookEventSendBody body, String accessToken, final ApiCallback<CommonResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sandboxWebhookEventSendPostValidateBeforeCall(body, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

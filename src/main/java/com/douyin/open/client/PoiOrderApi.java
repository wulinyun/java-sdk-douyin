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


import com.douyin.open.model.PoiExtHotelOrderCancelBody;
import com.douyin.open.model.PoiExtHotelOrderCancelResponse;
import com.douyin.open.model.PoiExtHotelOrderCommitBody;
import com.douyin.open.model.PoiExtHotelOrderCommitResponse2;
import com.douyin.open.model.PoiExtHotelOrderStatusBody;
import com.douyin.open.model.PoiExtHotelOrderStatusResponse;
import com.douyin.open.model.PoiOrderStatusBody;
import com.douyin.open.model.PoiOrderStatusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiOrderApi {
    private ApiClient apiClient;

    public PoiOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PoiOrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for poiExtHotelOrderCancelPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelOrderCancelPostCall(PoiExtHotelOrderCancelBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/poi/ext/hotel/order/cancel/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call poiExtHotelOrderCancelPostValidateBeforeCall(PoiExtHotelOrderCancelBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = poiExtHotelOrderCancelPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 取消订单(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @return PoiExtHotelOrderCancelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiExtHotelOrderCancelResponse poiExtHotelOrderCancelPost(PoiExtHotelOrderCancelBody body) throws ApiException {
        ApiResponse<PoiExtHotelOrderCancelResponse> resp = poiExtHotelOrderCancelPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 取消订单(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @return ApiResponse&lt;PoiExtHotelOrderCancelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiExtHotelOrderCancelResponse> poiExtHotelOrderCancelPostWithHttpInfo(PoiExtHotelOrderCancelBody body) throws ApiException {
        com.squareup.okhttp.Call call = poiExtHotelOrderCancelPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PoiExtHotelOrderCancelResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 取消订单(该接口由接入方实现) (asynchronously)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelOrderCancelPostAsync(PoiExtHotelOrderCancelBody body, final ApiCallback<PoiExtHotelOrderCancelResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiExtHotelOrderCancelPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiExtHotelOrderCancelResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for poiExtHotelOrderCommitPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelOrderCommitPostCall(PoiExtHotelOrderCommitBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/poi/ext/hotel/order/commit/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call poiExtHotelOrderCommitPostValidateBeforeCall(PoiExtHotelOrderCommitBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = poiExtHotelOrderCommitPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 下单接口(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @return PoiExtHotelOrderCommitResponse2
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiExtHotelOrderCommitResponse2 poiExtHotelOrderCommitPost(PoiExtHotelOrderCommitBody body) throws ApiException {
        ApiResponse<PoiExtHotelOrderCommitResponse2> resp = poiExtHotelOrderCommitPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 下单接口(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @return ApiResponse&lt;PoiExtHotelOrderCommitResponse2&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiExtHotelOrderCommitResponse2> poiExtHotelOrderCommitPostWithHttpInfo(PoiExtHotelOrderCommitBody body) throws ApiException {
        com.squareup.okhttp.Call call = poiExtHotelOrderCommitPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PoiExtHotelOrderCommitResponse2>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 下单接口(该接口由接入方实现) (asynchronously)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelOrderCommitPostAsync(PoiExtHotelOrderCommitBody body, final ApiCallback<PoiExtHotelOrderCommitResponse2> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiExtHotelOrderCommitPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiExtHotelOrderCommitResponse2>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for poiExtHotelOrderStatusPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelOrderStatusPostCall(PoiExtHotelOrderStatusBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/poi/ext/hotel/order/status/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call poiExtHotelOrderStatusPostValidateBeforeCall(PoiExtHotelOrderStatusBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = poiExtHotelOrderStatusPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 支付状态通知(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @return PoiExtHotelOrderStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiExtHotelOrderStatusResponse poiExtHotelOrderStatusPost(PoiExtHotelOrderStatusBody body) throws ApiException {
        ApiResponse<PoiExtHotelOrderStatusResponse> resp = poiExtHotelOrderStatusPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 支付状态通知(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @return ApiResponse&lt;PoiExtHotelOrderStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiExtHotelOrderStatusResponse> poiExtHotelOrderStatusPostWithHttpInfo(PoiExtHotelOrderStatusBody body) throws ApiException {
        com.squareup.okhttp.Call call = poiExtHotelOrderStatusPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PoiExtHotelOrderStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 支付状态通知(该接口由接入方实现) (asynchronously)
     * # 该接口由接入方实现 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelOrderStatusPostAsync(PoiExtHotelOrderStatusBody body, final ApiCallback<PoiExtHotelOrderStatusResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiExtHotelOrderStatusPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiExtHotelOrderStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for poiOrderStatusPost
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiOrderStatusPostCall(PoiOrderStatusBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/poi/order/status/";

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
    private com.squareup.okhttp.Call poiOrderStatusPostValidateBeforeCall(PoiOrderStatusBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling poiOrderStatusPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiOrderStatusPost(Async)");
        }
        
        com.squareup.okhttp.Call call = poiOrderStatusPostCall(body, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 订单状态同步接口
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return PoiOrderStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiOrderStatusResponse poiOrderStatusPost(PoiOrderStatusBody body, String accessToken) throws ApiException {
        ApiResponse<PoiOrderStatusResponse> resp = poiOrderStatusPostWithHttpInfo(body, accessToken);
        return resp.getData();
    }

    /**
     * 订单状态同步接口
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return ApiResponse&lt;PoiOrderStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiOrderStatusResponse> poiOrderStatusPostWithHttpInfo(PoiOrderStatusBody body, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = poiOrderStatusPostValidateBeforeCall(body, accessToken, null, null);
        Type localVarReturnType = new TypeToken<PoiOrderStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 订单状态同步接口 (asynchronously)
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiOrderStatusPostAsync(PoiOrderStatusBody body, String accessToken, final ApiCallback<PoiOrderStatusResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiOrderStatusPostValidateBeforeCall(body, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiOrderStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

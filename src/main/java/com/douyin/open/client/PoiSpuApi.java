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


import com.douyin.open.model.PoiSkuSyncBody;
import com.douyin.open.model.PoiSkuSyncResponse;
import com.douyin.open.model.PoiSpuQueryResponse;
import com.douyin.open.model.PoiSpuSyncBody;
import com.douyin.open.model.PoiSpuSyncResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiSpuApi {
    private ApiClient apiClient;

    public PoiSpuApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PoiSpuApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for poiSkuSyncPost
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiSkuSyncPostCall(PoiSkuSyncBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/poi/sku/sync/";

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
    private com.squareup.okhttp.Call poiSkuSyncPostValidateBeforeCall(PoiSkuSyncBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling poiSkuSyncPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiSkuSyncPost(Async)");
        }
        
        com.squareup.okhttp.Call call = poiSkuSyncPostCall(body, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * SKU同步
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return PoiSkuSyncResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiSkuSyncResponse poiSkuSyncPost(PoiSkuSyncBody body, String accessToken) throws ApiException {
        ApiResponse<PoiSkuSyncResponse> resp = poiSkuSyncPostWithHttpInfo(body, accessToken);
        return resp.getData();
    }

    /**
     * SKU同步
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return ApiResponse&lt;PoiSkuSyncResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiSkuSyncResponse> poiSkuSyncPostWithHttpInfo(PoiSkuSyncBody body, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = poiSkuSyncPostValidateBeforeCall(body, accessToken, null, null);
        Type localVarReturnType = new TypeToken<PoiSkuSyncResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * SKU同步 (asynchronously)
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiSkuSyncPostAsync(PoiSkuSyncBody body, String accessToken, final ApiCallback<PoiSkuSyncResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiSkuSyncPostValidateBeforeCall(body, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiSkuSyncResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for poiSpuQueryGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param spuExtId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiSpuQueryGetCall(String accessToken, String spuExtId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/poi/spu/query/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (spuExtId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spu_ext_id", spuExtId));

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
    private com.squareup.okhttp.Call poiSpuQueryGetValidateBeforeCall(String accessToken, String spuExtId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiSpuQueryGet(Async)");
        }
        // verify the required parameter 'spuExtId' is set
        if (spuExtId == null) {
            throw new ApiException("Missing the required parameter 'spuExtId' when calling poiSpuQueryGet(Async)");
        }
        
        com.squareup.okhttp.Call call = poiSpuQueryGetCall(accessToken, spuExtId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询SPU
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param spuExtId  (required)
     * @return PoiSpuQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiSpuQueryResponse poiSpuQueryGet(String accessToken, String spuExtId) throws ApiException {
        ApiResponse<PoiSpuQueryResponse> resp = poiSpuQueryGetWithHttpInfo(accessToken, spuExtId);
        return resp.getData();
    }

    /**
     * 查询SPU
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param spuExtId  (required)
     * @return ApiResponse&lt;PoiSpuQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiSpuQueryResponse> poiSpuQueryGetWithHttpInfo(String accessToken, String spuExtId) throws ApiException {
        com.squareup.okhttp.Call call = poiSpuQueryGetValidateBeforeCall(accessToken, spuExtId, null, null);
        Type localVarReturnType = new TypeToken<PoiSpuQueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询SPU (asynchronously)
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param spuExtId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiSpuQueryGetAsync(String accessToken, String spuExtId, final ApiCallback<PoiSpuQueryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiSpuQueryGetValidateBeforeCall(accessToken, spuExtId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiSpuQueryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for poiSpuSyncPost
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiSpuSyncPostCall(PoiSpuSyncBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/poi/spu/sync/";

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
    private com.squareup.okhttp.Call poiSpuSyncPostValidateBeforeCall(PoiSpuSyncBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling poiSpuSyncPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiSpuSyncPost(Async)");
        }
        
        com.squareup.okhttp.Call call = poiSpuSyncPostCall(body, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * SPU同步
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return PoiSpuSyncResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiSpuSyncResponse poiSpuSyncPost(PoiSpuSyncBody body, String accessToken) throws ApiException {
        ApiResponse<PoiSpuSyncResponse> resp = poiSpuSyncPostWithHttpInfo(body, accessToken);
        return resp.getData();
    }

    /**
     * SPU同步
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return ApiResponse&lt;PoiSpuSyncResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiSpuSyncResponse> poiSpuSyncPostWithHttpInfo(PoiSpuSyncBody body, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = poiSpuSyncPostValidateBeforeCall(body, accessToken, null, null);
        Type localVarReturnType = new TypeToken<PoiSpuSyncResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * SPU同步 (asynchronously)
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiSpuSyncPostAsync(PoiSpuSyncBody body, String accessToken, final ApiCallback<PoiSpuSyncResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiSpuSyncPostValidateBeforeCall(body, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiSpuSyncResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

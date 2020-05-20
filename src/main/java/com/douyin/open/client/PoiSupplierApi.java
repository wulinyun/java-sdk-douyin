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


import com.douyin.open.model.PoiQueryResponse;
import com.douyin.open.model.PoiSupplierQueryResponse;
import com.douyin.open.model.PoiSupplierSyncBody;
import com.douyin.open.model.PoiSupplierSyncResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiSupplierApi {
    private ApiClient apiClient;

    public PoiSupplierApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PoiSupplierApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for poiQueryGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param amapId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiQueryGetCall(String accessToken, String amapId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/poi/query/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (amapId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("amap_id", amapId));

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
    private com.squareup.okhttp.Call poiQueryGetValidateBeforeCall(String accessToken, String amapId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiQueryGet(Async)");
        }
        // verify the required parameter 'amapId' is set
        if (amapId == null) {
            throw new ApiException("Missing the required parameter 'amapId' when calling poiQueryGet(Async)");
        }
        
        com.squareup.okhttp.Call call = poiQueryGetCall(accessToken, amapId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取抖音POI ID
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param amapId  (required)
     * @return PoiQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiQueryResponse poiQueryGet(String accessToken, String amapId) throws ApiException {
        ApiResponse<PoiQueryResponse> resp = poiQueryGetWithHttpInfo(accessToken, amapId);
        return resp.getData();
    }

    /**
     * 获取抖音POI ID
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param amapId  (required)
     * @return ApiResponse&lt;PoiQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiQueryResponse> poiQueryGetWithHttpInfo(String accessToken, String amapId) throws ApiException {
        com.squareup.okhttp.Call call = poiQueryGetValidateBeforeCall(accessToken, amapId, null, null);
        Type localVarReturnType = new TypeToken<PoiQueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取抖音POI ID (asynchronously)
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param amapId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiQueryGetAsync(String accessToken, String amapId, final ApiCallback<PoiQueryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiQueryGetValidateBeforeCall(accessToken, amapId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiQueryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for poiSupplierQueryGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param supplierExtId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiSupplierQueryGetCall(String accessToken, String supplierExtId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/poi/supplier/query/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (supplierExtId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("supplier_ext_id", supplierExtId));

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
    private com.squareup.okhttp.Call poiSupplierQueryGetValidateBeforeCall(String accessToken, String supplierExtId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiSupplierQueryGet(Async)");
        }
        // verify the required parameter 'supplierExtId' is set
        if (supplierExtId == null) {
            throw new ApiException("Missing the required parameter 'supplierExtId' when calling poiSupplierQueryGet(Async)");
        }
        
        com.squareup.okhttp.Call call = poiSupplierQueryGetCall(accessToken, supplierExtId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询店铺
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param supplierExtId  (required)
     * @return PoiSupplierQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiSupplierQueryResponse poiSupplierQueryGet(String accessToken, String supplierExtId) throws ApiException {
        ApiResponse<PoiSupplierQueryResponse> resp = poiSupplierQueryGetWithHttpInfo(accessToken, supplierExtId);
        return resp.getData();
    }

    /**
     * 查询店铺
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param supplierExtId  (required)
     * @return ApiResponse&lt;PoiSupplierQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiSupplierQueryResponse> poiSupplierQueryGetWithHttpInfo(String accessToken, String supplierExtId) throws ApiException {
        com.squareup.okhttp.Call call = poiSupplierQueryGetValidateBeforeCall(accessToken, supplierExtId, null, null);
        Type localVarReturnType = new TypeToken<PoiSupplierQueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询店铺 (asynchronously)
     * * Scope: &#x60;poi.product&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param supplierExtId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiSupplierQueryGetAsync(String accessToken, String supplierExtId, final ApiCallback<PoiSupplierQueryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiSupplierQueryGetValidateBeforeCall(accessToken, supplierExtId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiSupplierQueryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for poiSupplierSyncPost
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiSupplierSyncPostCall(PoiSupplierSyncBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/poi/supplier/sync/";

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
    private com.squareup.okhttp.Call poiSupplierSyncPostValidateBeforeCall(PoiSupplierSyncBody body, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling poiSupplierSyncPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling poiSupplierSyncPost(Async)");
        }
        
        com.squareup.okhttp.Call call = poiSupplierSyncPostCall(body, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 商铺同步
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return PoiSupplierSyncResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiSupplierSyncResponse poiSupplierSyncPost(PoiSupplierSyncBody body, String accessToken) throws ApiException {
        ApiResponse<PoiSupplierSyncResponse> resp = poiSupplierSyncPostWithHttpInfo(body, accessToken);
        return resp.getData();
    }

    /**
     * 商铺同步
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @return ApiResponse&lt;PoiSupplierSyncResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiSupplierSyncResponse> poiSupplierSyncPostWithHttpInfo(PoiSupplierSyncBody body, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = poiSupplierSyncPostValidateBeforeCall(body, accessToken, null, null);
        Type localVarReturnType = new TypeToken<PoiSupplierSyncResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 商铺同步 (asynchronously)
     * * Scope: &#x60;poi.product&#x60; 
     * @param body  (required)
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiSupplierSyncPostAsync(PoiSupplierSyncBody body, String accessToken, final ApiCallback<PoiSupplierSyncResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiSupplierSyncPostValidateBeforeCall(body, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiSupplierSyncResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

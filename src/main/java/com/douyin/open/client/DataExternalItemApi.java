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


import com.douyin.open.model.DataExternalItemBaseResponse;
import com.douyin.open.model.DataExternalItemCommentResponse;
import com.douyin.open.model.DataExternalItemLikeResponse;
import com.douyin.open.model.DataExternalItemPlayResponse;
import com.douyin.open.model.DataExternalItemShareResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataExternalItemApi {
    private ApiClient apiClient;

    public DataExternalItemApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataExternalItemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for dataExternalItemBaseGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemBaseGetCall(String openId, String accessToken, String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/item/base/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_id", itemId));

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
    private com.squareup.okhttp.Call dataExternalItemBaseGetValidateBeforeCall(String openId, String accessToken, String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalItemBaseGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalItemBaseGet(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling dataExternalItemBaseGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalItemBaseGetCall(openId, accessToken, itemId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取视频基础数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @return DataExternalItemBaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalItemBaseResponse dataExternalItemBaseGet(String openId, String accessToken, String itemId) throws ApiException {
        ApiResponse<DataExternalItemBaseResponse> resp = dataExternalItemBaseGetWithHttpInfo(openId, accessToken, itemId);
        return resp.getData();
    }

    /**
     * 获取视频基础数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @return ApiResponse&lt;DataExternalItemBaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalItemBaseResponse> dataExternalItemBaseGetWithHttpInfo(String openId, String accessToken, String itemId) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalItemBaseGetValidateBeforeCall(openId, accessToken, itemId, null, null);
        Type localVarReturnType = new TypeToken<DataExternalItemBaseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取视频基础数据 (asynchronously)
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemBaseGetAsync(String openId, String accessToken, String itemId, final ApiCallback<DataExternalItemBaseResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalItemBaseGetValidateBeforeCall(openId, accessToken, itemId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalItemBaseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalItemCommentGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemCommentGetCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/item/comment/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_id", itemId));
        if (dateType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date_type", dateType));

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
    private com.squareup.okhttp.Call dataExternalItemCommentGetValidateBeforeCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalItemCommentGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalItemCommentGet(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling dataExternalItemCommentGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalItemCommentGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalItemCommentGetCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取视频评论数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalItemCommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalItemCommentResponse dataExternalItemCommentGet(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        ApiResponse<DataExternalItemCommentResponse> resp = dataExternalItemCommentGetWithHttpInfo(openId, accessToken, itemId, dateType);
        return resp.getData();
    }

    /**
     * 获取视频评论数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalItemCommentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalItemCommentResponse> dataExternalItemCommentGetWithHttpInfo(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalItemCommentGetValidateBeforeCall(openId, accessToken, itemId, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalItemCommentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取视频评论数据 (asynchronously)
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemCommentGetAsync(String openId, String accessToken, String itemId, Integer dateType, final ApiCallback<DataExternalItemCommentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalItemCommentGetValidateBeforeCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalItemCommentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalItemLikeGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemLikeGetCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/item/like/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_id", itemId));
        if (dateType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date_type", dateType));

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
    private com.squareup.okhttp.Call dataExternalItemLikeGetValidateBeforeCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalItemLikeGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalItemLikeGet(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling dataExternalItemLikeGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalItemLikeGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalItemLikeGetCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取视频点赞数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalItemLikeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalItemLikeResponse dataExternalItemLikeGet(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        ApiResponse<DataExternalItemLikeResponse> resp = dataExternalItemLikeGetWithHttpInfo(openId, accessToken, itemId, dateType);
        return resp.getData();
    }

    /**
     * 获取视频点赞数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalItemLikeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalItemLikeResponse> dataExternalItemLikeGetWithHttpInfo(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalItemLikeGetValidateBeforeCall(openId, accessToken, itemId, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalItemLikeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取视频点赞数据 (asynchronously)
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemLikeGetAsync(String openId, String accessToken, String itemId, Integer dateType, final ApiCallback<DataExternalItemLikeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalItemLikeGetValidateBeforeCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalItemLikeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalItemPlayGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemPlayGetCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/item/play/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_id", itemId));
        if (dateType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date_type", dateType));

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
    private com.squareup.okhttp.Call dataExternalItemPlayGetValidateBeforeCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalItemPlayGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalItemPlayGet(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling dataExternalItemPlayGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalItemPlayGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalItemPlayGetCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取视频播放数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalItemPlayResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalItemPlayResponse dataExternalItemPlayGet(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        ApiResponse<DataExternalItemPlayResponse> resp = dataExternalItemPlayGetWithHttpInfo(openId, accessToken, itemId, dateType);
        return resp.getData();
    }

    /**
     * 获取视频播放数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalItemPlayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalItemPlayResponse> dataExternalItemPlayGetWithHttpInfo(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalItemPlayGetValidateBeforeCall(openId, accessToken, itemId, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalItemPlayResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取视频播放数据 (asynchronously)
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemPlayGetAsync(String openId, String accessToken, String itemId, Integer dateType, final ApiCallback<DataExternalItemPlayResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalItemPlayGetValidateBeforeCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalItemPlayResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalItemShareGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemShareGetCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/item/share/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_id", itemId));
        if (dateType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date_type", dateType));

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
    private com.squareup.okhttp.Call dataExternalItemShareGetValidateBeforeCall(String openId, String accessToken, String itemId, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalItemShareGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalItemShareGet(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling dataExternalItemShareGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalItemShareGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalItemShareGetCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取视频分享数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalItemShareResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalItemShareResponse dataExternalItemShareGet(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        ApiResponse<DataExternalItemShareResponse> resp = dataExternalItemShareGetWithHttpInfo(openId, accessToken, itemId, dateType);
        return resp.getData();
    }

    /**
     * 获取视频分享数据
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalItemShareResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalItemShareResponse> dataExternalItemShareGetWithHttpInfo(String openId, String accessToken, String itemId, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalItemShareGetValidateBeforeCall(openId, accessToken, itemId, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalItemShareResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取视频分享数据 (asynchronously)
     * * Scope: &#x60;data.external.item&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param itemId item_id，仅能查询access_token对应用户上传的视频 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalItemShareGetAsync(String openId, String accessToken, String itemId, Integer dateType, final ApiCallback<DataExternalItemShareResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalItemShareGetValidateBeforeCall(openId, accessToken, itemId, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalItemShareResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

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


import com.douyin.open.model.DataExternalUserCommentResponse;
import com.douyin.open.model.DataExternalUserFansResponse;
import com.douyin.open.model.DataExternalUserItemResponse;
import com.douyin.open.model.DataExternalUserLikeResponse;
import com.douyin.open.model.DataExternalUserProfileResponse;
import com.douyin.open.model.DataExternalUserShareResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataExternalUserApi {
    private ApiClient apiClient;

    public DataExternalUserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataExternalUserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for dataExternalUserCommentGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserCommentGetCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/user/comment/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
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
    private com.squareup.okhttp.Call dataExternalUserCommentGetValidateBeforeCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalUserCommentGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalUserCommentGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalUserCommentGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalUserCommentGetCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户评论数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalUserCommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalUserCommentResponse dataExternalUserCommentGet(String openId, String accessToken, Integer dateType) throws ApiException {
        ApiResponse<DataExternalUserCommentResponse> resp = dataExternalUserCommentGetWithHttpInfo(openId, accessToken, dateType);
        return resp.getData();
    }

    /**
     * 获取用户评论数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalUserCommentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalUserCommentResponse> dataExternalUserCommentGetWithHttpInfo(String openId, String accessToken, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalUserCommentGetValidateBeforeCall(openId, accessToken, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalUserCommentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户评论数 (asynchronously)
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserCommentGetAsync(String openId, String accessToken, Integer dateType, final ApiCallback<DataExternalUserCommentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalUserCommentGetValidateBeforeCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalUserCommentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalUserFansGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserFansGetCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/user/fans/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
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
    private com.squareup.okhttp.Call dataExternalUserFansGetValidateBeforeCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalUserFansGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalUserFansGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalUserFansGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalUserFansGetCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户粉丝数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalUserFansResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalUserFansResponse dataExternalUserFansGet(String openId, String accessToken, Integer dateType) throws ApiException {
        ApiResponse<DataExternalUserFansResponse> resp = dataExternalUserFansGetWithHttpInfo(openId, accessToken, dateType);
        return resp.getData();
    }

    /**
     * 获取用户粉丝数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalUserFansResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalUserFansResponse> dataExternalUserFansGetWithHttpInfo(String openId, String accessToken, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalUserFansGetValidateBeforeCall(openId, accessToken, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalUserFansResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户粉丝数 (asynchronously)
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserFansGetAsync(String openId, String accessToken, Integer dateType, final ApiCallback<DataExternalUserFansResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalUserFansGetValidateBeforeCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalUserFansResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalUserItemGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserItemGetCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/user/item/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
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
    private com.squareup.okhttp.Call dataExternalUserItemGetValidateBeforeCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalUserItemGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalUserItemGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalUserItemGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalUserItemGetCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户视频情况
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalUserItemResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalUserItemResponse dataExternalUserItemGet(String openId, String accessToken, Integer dateType) throws ApiException {
        ApiResponse<DataExternalUserItemResponse> resp = dataExternalUserItemGetWithHttpInfo(openId, accessToken, dateType);
        return resp.getData();
    }

    /**
     * 获取用户视频情况
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalUserItemResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalUserItemResponse> dataExternalUserItemGetWithHttpInfo(String openId, String accessToken, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalUserItemGetValidateBeforeCall(openId, accessToken, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalUserItemResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户视频情况 (asynchronously)
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserItemGetAsync(String openId, String accessToken, Integer dateType, final ApiCallback<DataExternalUserItemResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalUserItemGetValidateBeforeCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalUserItemResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalUserLikeGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserLikeGetCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/user/like/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
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
    private com.squareup.okhttp.Call dataExternalUserLikeGetValidateBeforeCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalUserLikeGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalUserLikeGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalUserLikeGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalUserLikeGetCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户点赞数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalUserLikeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalUserLikeResponse dataExternalUserLikeGet(String openId, String accessToken, Integer dateType) throws ApiException {
        ApiResponse<DataExternalUserLikeResponse> resp = dataExternalUserLikeGetWithHttpInfo(openId, accessToken, dateType);
        return resp.getData();
    }

    /**
     * 获取用户点赞数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalUserLikeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalUserLikeResponse> dataExternalUserLikeGetWithHttpInfo(String openId, String accessToken, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalUserLikeGetValidateBeforeCall(openId, accessToken, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalUserLikeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户点赞数 (asynchronously)
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserLikeGetAsync(String openId, String accessToken, Integer dateType, final ApiCallback<DataExternalUserLikeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalUserLikeGetValidateBeforeCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalUserLikeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalUserProfileGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserProfileGetCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/user/profile/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
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
    private com.squareup.okhttp.Call dataExternalUserProfileGetValidateBeforeCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalUserProfileGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalUserProfileGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalUserProfileGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalUserProfileGetCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户主页访问数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalUserProfileResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalUserProfileResponse dataExternalUserProfileGet(String openId, String accessToken, Integer dateType) throws ApiException {
        ApiResponse<DataExternalUserProfileResponse> resp = dataExternalUserProfileGetWithHttpInfo(openId, accessToken, dateType);
        return resp.getData();
    }

    /**
     * 获取用户主页访问数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalUserProfileResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalUserProfileResponse> dataExternalUserProfileGetWithHttpInfo(String openId, String accessToken, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalUserProfileGetValidateBeforeCall(openId, accessToken, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalUserProfileResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户主页访问数 (asynchronously)
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserProfileGetAsync(String openId, String accessToken, Integer dateType, final ApiCallback<DataExternalUserProfileResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalUserProfileGetValidateBeforeCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalUserProfileResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataExternalUserShareGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserShareGetCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/external/user/share/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
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
    private com.squareup.okhttp.Call dataExternalUserShareGetValidateBeforeCall(String openId, String accessToken, Integer dateType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling dataExternalUserShareGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataExternalUserShareGet(Async)");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new ApiException("Missing the required parameter 'dateType' when calling dataExternalUserShareGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataExternalUserShareGetCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户分享数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return DataExternalUserShareResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataExternalUserShareResponse dataExternalUserShareGet(String openId, String accessToken, Integer dateType) throws ApiException {
        ApiResponse<DataExternalUserShareResponse> resp = dataExternalUserShareGetWithHttpInfo(openId, accessToken, dateType);
        return resp.getData();
    }

    /**
     * 获取用户分享数
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @return ApiResponse&lt;DataExternalUserShareResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataExternalUserShareResponse> dataExternalUserShareGetWithHttpInfo(String openId, String accessToken, Integer dateType) throws ApiException {
        com.squareup.okhttp.Call call = dataExternalUserShareGetValidateBeforeCall(openId, accessToken, dateType, null, null);
        Type localVarReturnType = new TypeToken<DataExternalUserShareResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户分享数 (asynchronously)
     * * Scope: &#x60;data.external.user&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param dateType 近7/15天；输入7代表7天、15代表15天 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataExternalUserShareGetAsync(String openId, String accessToken, Integer dateType, final ApiCallback<DataExternalUserShareResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataExternalUserShareGetValidateBeforeCall(openId, accessToken, dateType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataExternalUserShareResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

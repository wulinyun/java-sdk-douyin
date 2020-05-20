/*
 * 企业号意向用户管理
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


import com.douyin.open.model.EnterpriseLeadsTagCreateBody;
import com.douyin.open.model.EnterpriseLeadsTagCreateResponse;
import com.douyin.open.model.EnterpriseLeadsTagDeleteBody;
import com.douyin.open.model.EnterpriseLeadsTagDeleteResponse;
import com.douyin.open.model.EnterpriseLeadsTagListResponse;
import com.douyin.open.model.EnterpriseLeadsTagUpdateBody;
import com.douyin.open.model.EnterpriseLeadsTagUserListResponse;
import com.douyin.open.model.EnterpriseLeadsTagUserUpdateBody;
import com.douyin.open.model.EnterpriseLeadsUserActionListResponse;
import com.douyin.open.model.EnterpriseLeadsUserDetailResponse;
import com.douyin.open.model.EnterpriseLeadsUserListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterpriseLeadsApi {
    private ApiClient apiClient;

    public EnterpriseLeadsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnterpriseLeadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for enterpriseLeadsTagCreatePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagCreatePostCall(String openId, String accessToken, EnterpriseLeadsTagCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/tag/create/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
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
    private com.squareup.okhttp.Call enterpriseLeadsTagCreatePostValidateBeforeCall(String openId, String accessToken, EnterpriseLeadsTagCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsTagCreatePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsTagCreatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsTagCreatePostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建标签
     * * Scope: &#x60;enterprise.data&#x60; * 一个企业号最多创建100个标签 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return EnterpriseLeadsTagCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsTagCreateResponse enterpriseLeadsTagCreatePost(String openId, String accessToken, EnterpriseLeadsTagCreateBody body) throws ApiException {
        ApiResponse<EnterpriseLeadsTagCreateResponse> resp = enterpriseLeadsTagCreatePostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 创建标签
     * * Scope: &#x60;enterprise.data&#x60; * 一个企业号最多创建100个标签 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;EnterpriseLeadsTagCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsTagCreateResponse> enterpriseLeadsTagCreatePostWithHttpInfo(String openId, String accessToken, EnterpriseLeadsTagCreateBody body) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsTagCreatePostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagCreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建标签 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; * 一个企业号最多创建100个标签 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagCreatePostAsync(String openId, String accessToken, EnterpriseLeadsTagCreateBody body, final ApiCallback<EnterpriseLeadsTagCreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsTagCreatePostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagCreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsTagDeletePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagDeletePostCall(String openId, String accessToken, EnterpriseLeadsTagDeleteBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/tag/delete/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
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
    private com.squareup.okhttp.Call enterpriseLeadsTagDeletePostValidateBeforeCall(String openId, String accessToken, EnterpriseLeadsTagDeleteBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsTagDeletePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsTagDeletePost(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsTagDeletePostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 删除标签
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return EnterpriseLeadsTagDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsTagDeleteResponse enterpriseLeadsTagDeletePost(String openId, String accessToken, EnterpriseLeadsTagDeleteBody body) throws ApiException {
        ApiResponse<EnterpriseLeadsTagDeleteResponse> resp = enterpriseLeadsTagDeletePostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 删除标签
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;EnterpriseLeadsTagDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsTagDeleteResponse> enterpriseLeadsTagDeletePostWithHttpInfo(String openId, String accessToken, EnterpriseLeadsTagDeleteBody body) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsTagDeletePostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagDeleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除标签 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagDeletePostAsync(String openId, String accessToken, EnterpriseLeadsTagDeleteBody body, final ApiCallback<EnterpriseLeadsTagDeleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsTagDeletePostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagDeleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsTagListGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagListGetCall(String openId, String accessToken, Integer count, Integer cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/tag/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
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
    private com.squareup.okhttp.Call enterpriseLeadsTagListGetValidateBeforeCall(String openId, String accessToken, Integer count, Integer cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsTagListGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsTagListGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling enterpriseLeadsTagListGet(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsTagListGetCall(openId, accessToken, count, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取标签列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标 (optional)
     * @return EnterpriseLeadsTagListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsTagListResponse enterpriseLeadsTagListGet(String openId, String accessToken, Integer count, Integer cursor) throws ApiException {
        ApiResponse<EnterpriseLeadsTagListResponse> resp = enterpriseLeadsTagListGetWithHttpInfo(openId, accessToken, count, cursor);
        return resp.getData();
    }

    /**
     * 获取标签列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标 (optional)
     * @return ApiResponse&lt;EnterpriseLeadsTagListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsTagListResponse> enterpriseLeadsTagListGetWithHttpInfo(String openId, String accessToken, Integer count, Integer cursor) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsTagListGetValidateBeforeCall(openId, accessToken, count, cursor, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取标签列表 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param cursor 分页游标 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagListGetAsync(String openId, String accessToken, Integer count, Integer cursor, final ApiCallback<EnterpriseLeadsTagListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsTagListGetValidateBeforeCall(openId, accessToken, count, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsTagUpdatePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagUpdatePostCall(String openId, String accessToken, EnterpriseLeadsTagUpdateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/tag/update/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
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
    private com.squareup.okhttp.Call enterpriseLeadsTagUpdatePostValidateBeforeCall(String openId, String accessToken, EnterpriseLeadsTagUpdateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsTagUpdatePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsTagUpdatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsTagUpdatePostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 编辑标签
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return EnterpriseLeadsTagCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsTagCreateResponse enterpriseLeadsTagUpdatePost(String openId, String accessToken, EnterpriseLeadsTagUpdateBody body) throws ApiException {
        ApiResponse<EnterpriseLeadsTagCreateResponse> resp = enterpriseLeadsTagUpdatePostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 编辑标签
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;EnterpriseLeadsTagCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsTagCreateResponse> enterpriseLeadsTagUpdatePostWithHttpInfo(String openId, String accessToken, EnterpriseLeadsTagUpdateBody body) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsTagUpdatePostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagCreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 编辑标签 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagUpdatePostAsync(String openId, String accessToken, EnterpriseLeadsTagUpdateBody body, final ApiCallback<EnterpriseLeadsTagCreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsTagUpdatePostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagCreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsTagUserListGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param tagId  (required)
     * @param cursor 分页游标 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagUserListGetCall(String openId, String accessToken, Integer count, Integer tagId, Integer cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/tag/user/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (tagId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tag_id", tagId));

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
    private com.squareup.okhttp.Call enterpriseLeadsTagUserListGetValidateBeforeCall(String openId, String accessToken, Integer count, Integer tagId, Integer cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsTagUserListGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsTagUserListGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling enterpriseLeadsTagUserListGet(Async)");
        }
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling enterpriseLeadsTagUserListGet(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsTagUserListGetCall(openId, accessToken, count, tagId, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取打标签的用户列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param tagId  (required)
     * @param cursor 分页游标 (optional)
     * @return EnterpriseLeadsTagUserListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsTagUserListResponse enterpriseLeadsTagUserListGet(String openId, String accessToken, Integer count, Integer tagId, Integer cursor) throws ApiException {
        ApiResponse<EnterpriseLeadsTagUserListResponse> resp = enterpriseLeadsTagUserListGetWithHttpInfo(openId, accessToken, count, tagId, cursor);
        return resp.getData();
    }

    /**
     * 获取打标签的用户列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param tagId  (required)
     * @param cursor 分页游标 (optional)
     * @return ApiResponse&lt;EnterpriseLeadsTagUserListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsTagUserListResponse> enterpriseLeadsTagUserListGetWithHttpInfo(String openId, String accessToken, Integer count, Integer tagId, Integer cursor) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsTagUserListGetValidateBeforeCall(openId, accessToken, count, tagId, cursor, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagUserListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取打标签的用户列表 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param tagId  (required)
     * @param cursor 分页游标 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagUserListGetAsync(String openId, String accessToken, Integer count, Integer tagId, Integer cursor, final ApiCallback<EnterpriseLeadsTagUserListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsTagUserListGetValidateBeforeCall(openId, accessToken, count, tagId, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagUserListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsTagUserUpdatePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagUserUpdatePostCall(String openId, String accessToken, EnterpriseLeadsTagUserUpdateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/tag/user/update/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
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
    private com.squareup.okhttp.Call enterpriseLeadsTagUserUpdatePostValidateBeforeCall(String openId, String accessToken, EnterpriseLeadsTagUserUpdateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsTagUserUpdatePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsTagUserUpdatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsTagUserUpdatePostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 给用户设置标签
     * * Scope: &#x60;enterprise.data&#x60; * 一个用户最多设置5个标签 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return EnterpriseLeadsTagDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsTagDeleteResponse enterpriseLeadsTagUserUpdatePost(String openId, String accessToken, EnterpriseLeadsTagUserUpdateBody body) throws ApiException {
        ApiResponse<EnterpriseLeadsTagDeleteResponse> resp = enterpriseLeadsTagUserUpdatePostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 给用户设置标签
     * * Scope: &#x60;enterprise.data&#x60; * 一个用户最多设置5个标签 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;EnterpriseLeadsTagDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsTagDeleteResponse> enterpriseLeadsTagUserUpdatePostWithHttpInfo(String openId, String accessToken, EnterpriseLeadsTagUserUpdateBody body) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsTagUserUpdatePostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagDeleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 给用户设置标签 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; * 一个用户最多设置5个标签 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsTagUserUpdatePostAsync(String openId, String accessToken, EnterpriseLeadsTagUserUpdateBody body, final ApiCallback<EnterpriseLeadsTagDeleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsTagUserUpdatePostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsTagDeleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsUserActionListGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param userId  (required)
     * @param cursor  (optional)
     * @param actionType  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsUserActionListGetCall(String openId, String accessToken, Integer count, String userId, String cursor, Integer actionType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/user/action/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_id", userId));
        if (actionType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("action_type", actionType));

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
    private com.squareup.okhttp.Call enterpriseLeadsUserActionListGetValidateBeforeCall(String openId, String accessToken, Integer count, String userId, String cursor, Integer actionType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsUserActionListGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsUserActionListGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling enterpriseLeadsUserActionListGet(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling enterpriseLeadsUserActionListGet(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsUserActionListGetCall(openId, accessToken, count, userId, cursor, actionType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取意向用户互动记录
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param userId  (required)
     * @param cursor  (optional)
     * @param actionType  (optional)
     * @return EnterpriseLeadsUserActionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsUserActionListResponse enterpriseLeadsUserActionListGet(String openId, String accessToken, Integer count, String userId, String cursor, Integer actionType) throws ApiException {
        ApiResponse<EnterpriseLeadsUserActionListResponse> resp = enterpriseLeadsUserActionListGetWithHttpInfo(openId, accessToken, count, userId, cursor, actionType);
        return resp.getData();
    }

    /**
     * 获取意向用户互动记录
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param userId  (required)
     * @param cursor  (optional)
     * @param actionType  (optional)
     * @return ApiResponse&lt;EnterpriseLeadsUserActionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsUserActionListResponse> enterpriseLeadsUserActionListGetWithHttpInfo(String openId, String accessToken, Integer count, String userId, String cursor, Integer actionType) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsUserActionListGetValidateBeforeCall(openId, accessToken, count, userId, cursor, actionType, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsUserActionListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取意向用户互动记录 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param userId  (required)
     * @param cursor  (optional)
     * @param actionType  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsUserActionListGetAsync(String openId, String accessToken, Integer count, String userId, String cursor, Integer actionType, final ApiCallback<EnterpriseLeadsUserActionListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsUserActionListGetValidateBeforeCall(openId, accessToken, count, userId, cursor, actionType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsUserActionListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsUserDetailGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param userId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsUserDetailGetCall(String openId, String accessToken, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/user/detail/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_id", userId));

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
    private com.squareup.okhttp.Call enterpriseLeadsUserDetailGetValidateBeforeCall(String openId, String accessToken, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsUserDetailGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsUserDetailGet(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling enterpriseLeadsUserDetailGet(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsUserDetailGetCall(openId, accessToken, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取意向用户详情
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param userId  (required)
     * @return EnterpriseLeadsUserDetailResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsUserDetailResponse enterpriseLeadsUserDetailGet(String openId, String accessToken, String userId) throws ApiException {
        ApiResponse<EnterpriseLeadsUserDetailResponse> resp = enterpriseLeadsUserDetailGetWithHttpInfo(openId, accessToken, userId);
        return resp.getData();
    }

    /**
     * 获取意向用户详情
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param userId  (required)
     * @return ApiResponse&lt;EnterpriseLeadsUserDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsUserDetailResponse> enterpriseLeadsUserDetailGetWithHttpInfo(String openId, String accessToken, String userId) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsUserDetailGetValidateBeforeCall(openId, accessToken, userId, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsUserDetailResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取意向用户详情 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param userId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsUserDetailGetAsync(String openId, String accessToken, String userId, final ApiCallback<EnterpriseLeadsUserDetailResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsUserDetailGetValidateBeforeCall(openId, accessToken, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsUserDetailResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for enterpriseLeadsUserListGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param actionType 分类:   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动  (required)
     * @param cursor 分页游标 (optional)
     * @param leadsLevel 用户状态:   * &#x60;-1&#x60; - 没兴趣   * &#x60;0&#x60; - 了解   * &#x60;1&#x60; - 有兴趣   * &#x60;2&#x60; - 有意愿   * &#x60;10&#x60; - 已转化  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsUserListGetCall(String openId, String accessToken, Integer count, Integer startTime, Integer endTime, Integer actionType, Integer cursor, Integer leadsLevel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/enterprise/leads/user/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (leadsLevel != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("leads_level", leadsLevel));
        if (actionType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("action_type", actionType));

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
    private com.squareup.okhttp.Call enterpriseLeadsUserListGetValidateBeforeCall(String openId, String accessToken, Integer count, Integer startTime, Integer endTime, Integer actionType, Integer cursor, Integer leadsLevel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling enterpriseLeadsUserListGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling enterpriseLeadsUserListGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling enterpriseLeadsUserListGet(Async)");
        }
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling enterpriseLeadsUserListGet(Async)");
        }
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling enterpriseLeadsUserListGet(Async)");
        }
        // verify the required parameter 'actionType' is set
        if (actionType == null) {
            throw new ApiException("Missing the required parameter 'actionType' when calling enterpriseLeadsUserListGet(Async)");
        }
        
        com.squareup.okhttp.Call call = enterpriseLeadsUserListGetCall(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取意向用户列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param actionType 分类:   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动  (required)
     * @param cursor 分页游标 (optional)
     * @param leadsLevel 用户状态:   * &#x60;-1&#x60; - 没兴趣   * &#x60;0&#x60; - 了解   * &#x60;1&#x60; - 有兴趣   * &#x60;2&#x60; - 有意愿   * &#x60;10&#x60; - 已转化  (optional)
     * @return EnterpriseLeadsUserListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnterpriseLeadsUserListResponse enterpriseLeadsUserListGet(String openId, String accessToken, Integer count, Integer startTime, Integer endTime, Integer actionType, Integer cursor, Integer leadsLevel) throws ApiException {
        ApiResponse<EnterpriseLeadsUserListResponse> resp = enterpriseLeadsUserListGetWithHttpInfo(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel);
        return resp.getData();
    }

    /**
     * 获取意向用户列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param actionType 分类:   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动  (required)
     * @param cursor 分页游标 (optional)
     * @param leadsLevel 用户状态:   * &#x60;-1&#x60; - 没兴趣   * &#x60;0&#x60; - 了解   * &#x60;1&#x60; - 有兴趣   * &#x60;2&#x60; - 有意愿   * &#x60;10&#x60; - 已转化  (optional)
     * @return ApiResponse&lt;EnterpriseLeadsUserListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnterpriseLeadsUserListResponse> enterpriseLeadsUserListGetWithHttpInfo(String openId, String accessToken, Integer count, Integer startTime, Integer endTime, Integer actionType, Integer cursor, Integer leadsLevel) throws ApiException {
        com.squareup.okhttp.Call call = enterpriseLeadsUserListGetValidateBeforeCall(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel, null, null);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsUserListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取意向用户列表 (asynchronously)
     * * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param actionType 分类:   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动  (required)
     * @param cursor 分页游标 (optional)
     * @param leadsLevel 用户状态:   * &#x60;-1&#x60; - 没兴趣   * &#x60;0&#x60; - 了解   * &#x60;1&#x60; - 有兴趣   * &#x60;2&#x60; - 有意愿   * &#x60;10&#x60; - 已转化  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enterpriseLeadsUserListGetAsync(String openId, String accessToken, Integer count, Integer startTime, Integer endTime, Integer actionType, Integer cursor, Integer leadsLevel, final ApiCallback<EnterpriseLeadsUserListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enterpriseLeadsUserListGetValidateBeforeCall(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnterpriseLeadsUserListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

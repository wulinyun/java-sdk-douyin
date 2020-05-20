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


import java.io.File;
import com.douyin.open.model.ToutiaoVideoCreateBody;
import com.douyin.open.model.ToutiaoVideoCreateResponse;
import com.douyin.open.model.ToutiaoVideoUploadResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToutiaoVideoPublishApi {
    private ApiClient apiClient;

    public ToutiaoVideoPublishApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ToutiaoVideoPublishApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for toutiaoVideoCreatePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call toutiaoVideoCreatePostCall(String openId, String accessToken, ToutiaoVideoCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/toutiao/video/create/";

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
    private com.squareup.okhttp.Call toutiaoVideoCreatePostValidateBeforeCall(String openId, String accessToken, ToutiaoVideoCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling toutiaoVideoCreatePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling toutiaoVideoCreatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = toutiaoVideoCreatePostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建头条视频  注意：重复的video_id不会生成新的视频
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ToutiaoVideoCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ToutiaoVideoCreateResponse toutiaoVideoCreatePost(String openId, String accessToken, ToutiaoVideoCreateBody body) throws ApiException {
        ApiResponse<ToutiaoVideoCreateResponse> resp = toutiaoVideoCreatePostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 创建头条视频  注意：重复的video_id不会生成新的视频
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ToutiaoVideoCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ToutiaoVideoCreateResponse> toutiaoVideoCreatePostWithHttpInfo(String openId, String accessToken, ToutiaoVideoCreateBody body) throws ApiException {
        com.squareup.okhttp.Call call = toutiaoVideoCreatePostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<ToutiaoVideoCreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建头条视频  注意：重复的video_id不会生成新的视频 (asynchronously)
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call toutiaoVideoCreatePostAsync(String openId, String accessToken, ToutiaoVideoCreateBody body, final ApiCallback<ToutiaoVideoCreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = toutiaoVideoCreatePostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ToutiaoVideoCreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for toutiaoVideoUploadPost
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call toutiaoVideoUploadPostCall(File video, String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/toutiao/video/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (video != null)
        localVarFormParams.put("video", video);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call toutiaoVideoUploadPostValidateBeforeCall(File video, String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new ApiException("Missing the required parameter 'video' when calling toutiaoVideoUploadPost(Async)");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling toutiaoVideoUploadPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling toutiaoVideoUploadPost(Async)");
        }
        
        com.squareup.okhttp.Call call = toutiaoVideoUploadPostCall(video, openId, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 上传视频到文件服务器
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return ToutiaoVideoUploadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ToutiaoVideoUploadResponse toutiaoVideoUploadPost(File video, String openId, String accessToken) throws ApiException {
        ApiResponse<ToutiaoVideoUploadResponse> resp = toutiaoVideoUploadPostWithHttpInfo(video, openId, accessToken);
        return resp.getData();
    }

    /**
     * 上传视频到文件服务器
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return ApiResponse&lt;ToutiaoVideoUploadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ToutiaoVideoUploadResponse> toutiaoVideoUploadPostWithHttpInfo(File video, String openId, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = toutiaoVideoUploadPostValidateBeforeCall(video, openId, accessToken, null, null);
        Type localVarReturnType = new TypeToken<ToutiaoVideoUploadResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 上传视频到文件服务器 (asynchronously)
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call toutiaoVideoUploadPostAsync(File video, String openId, String accessToken, final ApiCallback<ToutiaoVideoUploadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = toutiaoVideoUploadPostValidateBeforeCall(video, openId, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ToutiaoVideoUploadResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

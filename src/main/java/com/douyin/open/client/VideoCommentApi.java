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
import com.douyin.open.model.VideoCommentListResponse;
import com.douyin.open.model.VideoCommentReplyBody;
import com.douyin.open.model.VideoCommentTopBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoCommentApi {
    private ApiClient apiClient;

    public VideoCommentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VideoCommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for videoCommentListGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoCommentListGetCall(String openId, String accessToken, Integer count, String itemId, Long cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/video/comment/list/";

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
    private com.squareup.okhttp.Call videoCommentListGetValidateBeforeCall(String openId, String accessToken, Integer count, String itemId, Long cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoCommentListGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoCommentListGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling videoCommentListGet(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling videoCommentListGet(Async)");
        }
        
        com.squareup.okhttp.Call call = videoCommentListGetCall(openId, accessToken, count, itemId, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 评论列表
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @return VideoCommentListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VideoCommentListResponse videoCommentListGet(String openId, String accessToken, Integer count, String itemId, Long cursor) throws ApiException {
        ApiResponse<VideoCommentListResponse> resp = videoCommentListGetWithHttpInfo(openId, accessToken, count, itemId, cursor);
        return resp.getData();
    }

    /**
     * 评论列表
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @return ApiResponse&lt;VideoCommentListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VideoCommentListResponse> videoCommentListGetWithHttpInfo(String openId, String accessToken, Integer count, String itemId, Long cursor) throws ApiException {
        com.squareup.okhttp.Call call = videoCommentListGetValidateBeforeCall(openId, accessToken, count, itemId, cursor, null, null);
        Type localVarReturnType = new TypeToken<VideoCommentListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 评论列表 (asynchronously)
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoCommentListGetAsync(String openId, String accessToken, Integer count, String itemId, Long cursor, final ApiCallback<VideoCommentListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoCommentListGetValidateBeforeCall(openId, accessToken, count, itemId, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VideoCommentListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for videoCommentReplyListGet
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param commentId 评论id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoCommentReplyListGetCall(String openId, String accessToken, Integer count, String itemId, String commentId, Long cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/video/comment/reply/list/";

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
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_id", itemId));
        if (commentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("comment_id", commentId));

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
    private com.squareup.okhttp.Call videoCommentReplyListGetValidateBeforeCall(String openId, String accessToken, Integer count, String itemId, String commentId, Long cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoCommentReplyListGet(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoCommentReplyListGet(Async)");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling videoCommentReplyListGet(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling videoCommentReplyListGet(Async)");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling videoCommentReplyListGet(Async)");
        }
        
        com.squareup.okhttp.Call call = videoCommentReplyListGetCall(openId, accessToken, count, itemId, commentId, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 评论回复列表
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param commentId 评论id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @return VideoCommentListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VideoCommentListResponse videoCommentReplyListGet(String openId, String accessToken, Integer count, String itemId, String commentId, Long cursor) throws ApiException {
        ApiResponse<VideoCommentListResponse> resp = videoCommentReplyListGetWithHttpInfo(openId, accessToken, count, itemId, commentId, cursor);
        return resp.getData();
    }

    /**
     * 评论回复列表
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param commentId 评论id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @return ApiResponse&lt;VideoCommentListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VideoCommentListResponse> videoCommentReplyListGetWithHttpInfo(String openId, String accessToken, Integer count, String itemId, String commentId, Long cursor) throws ApiException {
        com.squareup.okhttp.Call call = videoCommentReplyListGetValidateBeforeCall(openId, accessToken, count, itemId, commentId, cursor, null, null);
        Type localVarReturnType = new TypeToken<VideoCommentListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 评论回复列表 (asynchronously)
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param count 每页数量 (required)
     * @param itemId 视频id (required)
     * @param commentId 评论id (required)
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoCommentReplyListGetAsync(String openId, String accessToken, Integer count, String itemId, String commentId, Long cursor, final ApiCallback<VideoCommentListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoCommentReplyListGetValidateBeforeCall(openId, accessToken, count, itemId, commentId, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VideoCommentListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for videoCommentReplyPost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoCommentReplyPostCall(String openId, String accessToken, VideoCommentReplyBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/video/comment/reply/";

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
    private com.squareup.okhttp.Call videoCommentReplyPostValidateBeforeCall(String openId, String accessToken, VideoCommentReplyBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoCommentReplyPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoCommentReplyPost(Async)");
        }
        
        com.squareup.okhttp.Call call = videoCommentReplyPostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 回复视频评论
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommonResponse videoCommentReplyPost(String openId, String accessToken, VideoCommentReplyBody body) throws ApiException {
        ApiResponse<CommonResponse> resp = videoCommentReplyPostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 回复视频评论
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommonResponse> videoCommentReplyPostWithHttpInfo(String openId, String accessToken, VideoCommentReplyBody body) throws ApiException {
        com.squareup.okhttp.Call call = videoCommentReplyPostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 回复视频评论 (asynchronously)
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoCommentReplyPostAsync(String openId, String accessToken, VideoCommentReplyBody body, final ApiCallback<CommonResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoCommentReplyPostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for videoCommentTopPost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoCommentTopPostCall(String openId, String accessToken, VideoCommentTopBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/video/comment/top/";

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
    private com.squareup.okhttp.Call videoCommentTopPostValidateBeforeCall(String openId, String accessToken, VideoCommentTopBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoCommentTopPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoCommentTopPost(Async)");
        }
        
        com.squareup.okhttp.Call call = videoCommentTopPostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 置顶视频评论(企业号)
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommonResponse videoCommentTopPost(String openId, String accessToken, VideoCommentTopBody body) throws ApiException {
        ApiResponse<CommonResponse> resp = videoCommentTopPostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 置顶视频评论(企业号)
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;CommonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommonResponse> videoCommentTopPostWithHttpInfo(String openId, String accessToken, VideoCommentTopBody body) throws ApiException {
        com.squareup.okhttp.Call call = videoCommentTopPostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 置顶视频评论(企业号) (asynchronously)
     * * Scope: &#x60;video.comment&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoCommentTopPostAsync(String openId, String accessToken, VideoCommentTopBody body, final ApiCallback<CommonResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoCommentTopPostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

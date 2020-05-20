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
import com.douyin.open.model.VideoCreateBody;
import com.douyin.open.model.VideoCreateResponse;
import com.douyin.open.model.VideoPartCompleteResponse;
import com.douyin.open.model.VideoPartInitResponse;
import com.douyin.open.model.VideoPartUploadResponse;
import com.douyin.open.model.VideoUploadResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoPublishApi {
    private ApiClient apiClient;

    public VideoPublishApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VideoPublishApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for videoCreatePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoCreatePostCall(String openId, String accessToken, VideoCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/video/create/";

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
    private com.squareup.okhttp.Call videoCreatePostValidateBeforeCall(String openId, String accessToken, VideoCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoCreatePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoCreatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = videoCreatePostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建抖音视频
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return VideoCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VideoCreateResponse videoCreatePost(String openId, String accessToken, VideoCreateBody body) throws ApiException {
        ApiResponse<VideoCreateResponse> resp = videoCreatePostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 创建抖音视频
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;VideoCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VideoCreateResponse> videoCreatePostWithHttpInfo(String openId, String accessToken, VideoCreateBody body) throws ApiException {
        com.squareup.okhttp.Call call = videoCreatePostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<VideoCreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建抖音视频 (asynchronously)
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoCreatePostAsync(String openId, String accessToken, VideoCreateBody body, final ApiCallback<VideoCreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoCreatePostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VideoCreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for videoPartCompletePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoPartCompletePostCall(String openId, String accessToken, String uploadId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/video/part/complete/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (uploadId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("upload_id", uploadId));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call videoPartCompletePostValidateBeforeCall(String openId, String accessToken, String uploadId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoPartCompletePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoPartCompletePost(Async)");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new ApiException("Missing the required parameter 'uploadId' when calling videoPartCompletePost(Async)");
        }
        
        com.squareup.okhttp.Call call = videoPartCompletePostCall(openId, accessToken, uploadId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 完成上传
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @return VideoPartCompleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VideoPartCompleteResponse videoPartCompletePost(String openId, String accessToken, String uploadId) throws ApiException {
        ApiResponse<VideoPartCompleteResponse> resp = videoPartCompletePostWithHttpInfo(openId, accessToken, uploadId);
        return resp.getData();
    }

    /**
     * 完成上传
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @return ApiResponse&lt;VideoPartCompleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VideoPartCompleteResponse> videoPartCompletePostWithHttpInfo(String openId, String accessToken, String uploadId) throws ApiException {
        com.squareup.okhttp.Call call = videoPartCompletePostValidateBeforeCall(openId, accessToken, uploadId, null, null);
        Type localVarReturnType = new TypeToken<VideoPartCompleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 完成上传 (asynchronously)
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoPartCompletePostAsync(String openId, String accessToken, String uploadId, final ApiCallback<VideoPartCompleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoPartCompletePostValidateBeforeCall(openId, accessToken, uploadId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VideoPartCompleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for videoPartInitPost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoPartInitPostCall(String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/video/part/init/";

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
    private com.squareup.okhttp.Call videoPartInitPostValidateBeforeCall(String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoPartInitPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoPartInitPost(Async)");
        }
        
        com.squareup.okhttp.Call call = videoPartInitPostCall(openId, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 初始化上传
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return VideoPartInitResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VideoPartInitResponse videoPartInitPost(String openId, String accessToken) throws ApiException {
        ApiResponse<VideoPartInitResponse> resp = videoPartInitPostWithHttpInfo(openId, accessToken);
        return resp.getData();
    }

    /**
     * 初始化上传
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return ApiResponse&lt;VideoPartInitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VideoPartInitResponse> videoPartInitPostWithHttpInfo(String openId, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = videoPartInitPostValidateBeforeCall(openId, accessToken, null, null);
        Type localVarReturnType = new TypeToken<VideoPartInitResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 初始化上传 (asynchronously)
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoPartInitPostAsync(String openId, String accessToken, final ApiCallback<VideoPartInitResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoPartInitPostValidateBeforeCall(openId, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VideoPartInitResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for videoPartUploadPost
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @param partNumber 第几个分片，从1开始  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoPartUploadPostCall(File video, String openId, String accessToken, String uploadId, Integer partNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/video/part/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (uploadId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("upload_id", uploadId));
        if (partNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("part_number", partNumber));

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
    private com.squareup.okhttp.Call videoPartUploadPostValidateBeforeCall(File video, String openId, String accessToken, String uploadId, Integer partNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new ApiException("Missing the required parameter 'video' when calling videoPartUploadPost(Async)");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoPartUploadPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoPartUploadPost(Async)");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new ApiException("Missing the required parameter 'uploadId' when calling videoPartUploadPost(Async)");
        }
        // verify the required parameter 'partNumber' is set
        if (partNumber == null) {
            throw new ApiException("Missing the required parameter 'partNumber' when calling videoPartUploadPost(Async)");
        }
        
        com.squareup.okhttp.Call call = videoPartUploadPostCall(video, openId, accessToken, uploadId, partNumber, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 上传视频分片到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @param partNumber 第几个分片，从1开始  (required)
     * @return VideoPartUploadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VideoPartUploadResponse videoPartUploadPost(File video, String openId, String accessToken, String uploadId, Integer partNumber) throws ApiException {
        ApiResponse<VideoPartUploadResponse> resp = videoPartUploadPostWithHttpInfo(video, openId, accessToken, uploadId, partNumber);
        return resp.getData();
    }

    /**
     * 上传视频分片到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @param partNumber 第几个分片，从1开始  (required)
     * @return ApiResponse&lt;VideoPartUploadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VideoPartUploadResponse> videoPartUploadPostWithHttpInfo(File video, String openId, String accessToken, String uploadId, Integer partNumber) throws ApiException {
        com.squareup.okhttp.Call call = videoPartUploadPostValidateBeforeCall(video, openId, accessToken, uploadId, partNumber, null, null);
        Type localVarReturnType = new TypeToken<VideoPartUploadResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 上传视频分片到文件服务器 (asynchronously)
     * * Scope: &#x60;video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param uploadId 分片上传的标记。有限时间为2小时。 (required)
     * @param partNumber 第几个分片，从1开始  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoPartUploadPostAsync(File video, String openId, String accessToken, String uploadId, Integer partNumber, final ApiCallback<VideoPartUploadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoPartUploadPostValidateBeforeCall(video, openId, accessToken, uploadId, partNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VideoPartUploadResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for videoUploadPost
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call videoUploadPostCall(File video, String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/video/upload/";

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
    private com.squareup.okhttp.Call videoUploadPostValidateBeforeCall(File video, String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new ApiException("Missing the required parameter 'video' when calling videoUploadPost(Async)");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling videoUploadPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling videoUploadPost(Async)");
        }
        
        com.squareup.okhttp.Call call = videoUploadPostCall(video, openId, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 上传视频到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return VideoUploadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VideoUploadResponse videoUploadPost(File video, String openId, String accessToken) throws ApiException {
        ApiResponse<VideoUploadResponse> resp = videoUploadPostWithHttpInfo(video, openId, accessToken);
        return resp.getData();
    }

    /**
     * 上传视频到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return ApiResponse&lt;VideoUploadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VideoUploadResponse> videoUploadPostWithHttpInfo(File video, String openId, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = videoUploadPostValidateBeforeCall(video, openId, accessToken, null, null);
        Type localVarReturnType = new TypeToken<VideoUploadResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 上传视频到文件服务器 (asynchronously)
     * * Scope: &#x60;video.create&#x60; 
     * @param video  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call videoUploadPostAsync(File video, String openId, String accessToken, final ApiCallback<VideoUploadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = videoUploadPostValidateBeforeCall(video, openId, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VideoUploadResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

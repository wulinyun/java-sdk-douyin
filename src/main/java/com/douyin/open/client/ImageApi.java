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
import com.douyin.open.model.ImageCreateBody;
import com.douyin.open.model.ImageCreateResponse;
import com.douyin.open.model.ImageUploadResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageApi {
    private ApiClient apiClient;

    public ImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for imageCreatePost
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreatePostCall(String openId, String accessToken, ImageCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/image/create/";

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
    private com.squareup.okhttp.Call imageCreatePostValidateBeforeCall(String openId, String accessToken, ImageCreateBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling imageCreatePost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling imageCreatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = imageCreatePostCall(openId, accessToken, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 发布图片
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ImageCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImageCreateResponse imageCreatePost(String openId, String accessToken, ImageCreateBody body) throws ApiException {
        ApiResponse<ImageCreateResponse> resp = imageCreatePostWithHttpInfo(openId, accessToken, body);
        return resp.getData();
    }

    /**
     * 发布图片
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ImageCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImageCreateResponse> imageCreatePostWithHttpInfo(String openId, String accessToken, ImageCreateBody body) throws ApiException {
        com.squareup.okhttp.Call call = imageCreatePostValidateBeforeCall(openId, accessToken, body, null, null);
        Type localVarReturnType = new TypeToken<ImageCreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 发布图片 (asynchronously)
     * * Scope: &#x60;video.create&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreatePostAsync(String openId, String accessToken, ImageCreateBody body, final ApiCallback<ImageCreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = imageCreatePostValidateBeforeCall(openId, accessToken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImageCreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageUploadPost
     * @param image  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageUploadPostCall(File image, String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/image/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (image != null)
        localVarFormParams.put("image", image);

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
    private com.squareup.okhttp.Call imageUploadPostValidateBeforeCall(File image, String openId, String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'image' is set
        if (image == null) {
            throw new ApiException("Missing the required parameter 'image' when calling imageUploadPost(Async)");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new ApiException("Missing the required parameter 'openId' when calling imageUploadPost(Async)");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling imageUploadPost(Async)");
        }
        
        com.squareup.okhttp.Call call = imageUploadPostCall(image, openId, accessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 上传图片到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * @param image  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return ImageUploadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImageUploadResponse imageUploadPost(File image, String openId, String accessToken) throws ApiException {
        ApiResponse<ImageUploadResponse> resp = imageUploadPostWithHttpInfo(image, openId, accessToken);
        return resp.getData();
    }

    /**
     * 上传图片到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * @param image  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @return ApiResponse&lt;ImageUploadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImageUploadResponse> imageUploadPostWithHttpInfo(File image, String openId, String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = imageUploadPostValidateBeforeCall(image, openId, accessToken, null, null);
        Type localVarReturnType = new TypeToken<ImageUploadResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 上传图片到文件服务器 (asynchronously)
     * * Scope: &#x60;video.create&#x60; 
     * @param image  (required)
     * @param openId 通过/oauth/access_token/获取，用户唯一标志 (required)
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageUploadPostAsync(File image, String openId, String accessToken, final ApiCallback<ImageUploadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = imageUploadPostValidateBeforeCall(image, openId, accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImageUploadResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

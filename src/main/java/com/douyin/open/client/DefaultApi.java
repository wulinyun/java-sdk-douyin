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


import com.douyin.open.model.OauthAccessTokenResponse;
import com.douyin.open.model.OauthClientTokenResponse;
import com.douyin.open.model.OauthRefreshTokenResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for oauthAccessTokenGet
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param code 授权码 (required)
     * @param grantType  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthAccessTokenGetCall(String clientKey, String clientSecret, String code, String grantType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/access_token/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clientKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_key", clientKey));
        if (clientSecret != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_secret", clientSecret));
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("code", code));
        if (grantType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("grant_type", grantType));

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
    private com.squareup.okhttp.Call oauthAccessTokenGetValidateBeforeCall(String clientKey, String clientSecret, String code, String grantType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new ApiException("Missing the required parameter 'clientKey' when calling oauthAccessTokenGet(Async)");
        }
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new ApiException("Missing the required parameter 'clientSecret' when calling oauthAccessTokenGet(Async)");
        }
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling oauthAccessTokenGet(Async)");
        }
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling oauthAccessTokenGet(Async)");
        }
        
        com.squareup.okhttp.Call call = oauthAccessTokenGetCall(clientKey, clientSecret, code, grantType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取access_token
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param code 授权码 (required)
     * @param grantType  (required)
     * @return OauthAccessTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthAccessTokenResponse oauthAccessTokenGet(String clientKey, String clientSecret, String code, String grantType) throws ApiException {
        ApiResponse<OauthAccessTokenResponse> resp = oauthAccessTokenGetWithHttpInfo(clientKey, clientSecret, code, grantType);
        return resp.getData();
    }

    /**
     * 获取access_token
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param code 授权码 (required)
     * @param grantType  (required)
     * @return ApiResponse&lt;OauthAccessTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OauthAccessTokenResponse> oauthAccessTokenGetWithHttpInfo(String clientKey, String clientSecret, String code, String grantType) throws ApiException {
        com.squareup.okhttp.Call call = oauthAccessTokenGetValidateBeforeCall(clientKey, clientSecret, code, grantType, null, null);
        Type localVarReturnType = new TypeToken<OauthAccessTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取access_token (asynchronously)
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param code 授权码 (required)
     * @param grantType  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthAccessTokenGetAsync(String clientKey, String clientSecret, String code, String grantType, final ApiCallback<OauthAccessTokenResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oauthAccessTokenGetValidateBeforeCall(clientKey, clientSecret, code, grantType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OauthAccessTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for oauthAuthorizeGet
     * @param clientKey 应用唯一标识 (required)
     * @param responseType 填写code (required)
     * @param scope 应用授权作用域,多个授权作用域以英文逗号（,）分隔 (required)
     * @param redirectUri 授权成功后的回调地址，必须以http/https开头。 (required)
     * @param state 用于保持请求和回调的状态 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthAuthorizeGetCall(String clientKey, String responseType, String scope, String redirectUri, String state, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/authorize/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clientKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_key", clientKey));
        if (responseType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("response_type", responseType));
        if (scope != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scope", scope));
        if (redirectUri != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("redirect_uri", redirectUri));
        if (state != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("state", state));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call oauthAuthorizeGetValidateBeforeCall(String clientKey, String responseType, String scope, String redirectUri, String state, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new ApiException("Missing the required parameter 'clientKey' when calling oauthAuthorizeGet(Async)");
        }
        // verify the required parameter 'responseType' is set
        if (responseType == null) {
            throw new ApiException("Missing the required parameter 'responseType' when calling oauthAuthorizeGet(Async)");
        }
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling oauthAuthorizeGet(Async)");
        }
        // verify the required parameter 'redirectUri' is set
        if (redirectUri == null) {
            throw new ApiException("Missing the required parameter 'redirectUri' when calling oauthAuthorizeGet(Async)");
        }
        
        com.squareup.okhttp.Call call = oauthAuthorizeGetCall(clientKey, responseType, scope, redirectUri, state, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取授权码(code)
     * 注意该URL不是用来请求的, 需要展示给用户用于扫码。  在抖音APP支持端内唤醒的版本内打开的话会弹出客户端原生授权页面。  使用本接口前提:    1. 首先你需要去官网申请，使你的应用可以使用特定的Scope，具体需要哪些Scope，请查看各接口定义。    2. 其次你需要在本URL的scope字段中填上用户需要授权给你的Scope。    3. 用户授权通过后，你才可以调用相应的接口。 
     * @param clientKey 应用唯一标识 (required)
     * @param responseType 填写code (required)
     * @param scope 应用授权作用域,多个授权作用域以英文逗号（,）分隔 (required)
     * @param redirectUri 授权成功后的回调地址，必须以http/https开头。 (required)
     * @param state 用于保持请求和回调的状态 (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void oauthAuthorizeGet(String clientKey, String responseType, String scope, String redirectUri, String state) throws ApiException {
        oauthAuthorizeGetWithHttpInfo(clientKey, responseType, scope, redirectUri, state);
    }

    /**
     * 获取授权码(code)
     * 注意该URL不是用来请求的, 需要展示给用户用于扫码。  在抖音APP支持端内唤醒的版本内打开的话会弹出客户端原生授权页面。  使用本接口前提:    1. 首先你需要去官网申请，使你的应用可以使用特定的Scope，具体需要哪些Scope，请查看各接口定义。    2. 其次你需要在本URL的scope字段中填上用户需要授权给你的Scope。    3. 用户授权通过后，你才可以调用相应的接口。 
     * @param clientKey 应用唯一标识 (required)
     * @param responseType 填写code (required)
     * @param scope 应用授权作用域,多个授权作用域以英文逗号（,）分隔 (required)
     * @param redirectUri 授权成功后的回调地址，必须以http/https开头。 (required)
     * @param state 用于保持请求和回调的状态 (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> oauthAuthorizeGetWithHttpInfo(String clientKey, String responseType, String scope, String redirectUri, String state) throws ApiException {
        com.squareup.okhttp.Call call = oauthAuthorizeGetValidateBeforeCall(clientKey, responseType, scope, redirectUri, state, null, null);
        return apiClient.execute(call);
    }

    /**
     * 获取授权码(code) (asynchronously)
     * 注意该URL不是用来请求的, 需要展示给用户用于扫码。  在抖音APP支持端内唤醒的版本内打开的话会弹出客户端原生授权页面。  使用本接口前提:    1. 首先你需要去官网申请，使你的应用可以使用特定的Scope，具体需要哪些Scope，请查看各接口定义。    2. 其次你需要在本URL的scope字段中填上用户需要授权给你的Scope。    3. 用户授权通过后，你才可以调用相应的接口。 
     * @param clientKey 应用唯一标识 (required)
     * @param responseType 填写code (required)
     * @param scope 应用授权作用域,多个授权作用域以英文逗号（,）分隔 (required)
     * @param redirectUri 授权成功后的回调地址，必须以http/https开头。 (required)
     * @param state 用于保持请求和回调的状态 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthAuthorizeGetAsync(String clientKey, String responseType, String scope, String redirectUri, String state, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oauthAuthorizeGetValidateBeforeCall(clientKey, responseType, scope, redirectUri, state, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for oauthClientTokenGet
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param grantType  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthClientTokenGetCall(String clientKey, String clientSecret, String grantType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/client_token/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clientKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_key", clientKey));
        if (clientSecret != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_secret", clientSecret));
        if (grantType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("grant_type", grantType));

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
    private com.squareup.okhttp.Call oauthClientTokenGetValidateBeforeCall(String clientKey, String clientSecret, String grantType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new ApiException("Missing the required parameter 'clientKey' when calling oauthClientTokenGet(Async)");
        }
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new ApiException("Missing the required parameter 'clientSecret' when calling oauthClientTokenGet(Async)");
        }
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling oauthClientTokenGet(Async)");
        }
        
        com.squareup.okhttp.Call call = oauthClientTokenGetCall(clientKey, clientSecret, grantType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 生成client_token
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param grantType  (required)
     * @return OauthClientTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthClientTokenResponse oauthClientTokenGet(String clientKey, String clientSecret, String grantType) throws ApiException {
        ApiResponse<OauthClientTokenResponse> resp = oauthClientTokenGetWithHttpInfo(clientKey, clientSecret, grantType);
        return resp.getData();
    }

    /**
     * 生成client_token
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param grantType  (required)
     * @return ApiResponse&lt;OauthClientTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OauthClientTokenResponse> oauthClientTokenGetWithHttpInfo(String clientKey, String clientSecret, String grantType) throws ApiException {
        com.squareup.okhttp.Call call = oauthClientTokenGetValidateBeforeCall(clientKey, clientSecret, grantType, null, null);
        Type localVarReturnType = new TypeToken<OauthClientTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 生成client_token (asynchronously)
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param clientSecret 应用唯一标识对应的密钥 (required)
     * @param grantType  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthClientTokenGetAsync(String clientKey, String clientSecret, String grantType, final ApiCallback<OauthClientTokenResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oauthClientTokenGetValidateBeforeCall(clientKey, clientSecret, grantType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OauthClientTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for oauthRefreshTokenGet
     * @param clientKey 应用唯一标识 (required)
     * @param grantType 填refresh_token (required)
     * @param refreshToken 填写通过access_token获取到的refresh_token参数 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthRefreshTokenGetCall(String clientKey, String grantType, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/refresh_token/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clientKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_key", clientKey));
        if (grantType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("grant_type", grantType));
        if (refreshToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refresh_token", refreshToken));

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
    private com.squareup.okhttp.Call oauthRefreshTokenGetValidateBeforeCall(String clientKey, String grantType, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new ApiException("Missing the required parameter 'clientKey' when calling oauthRefreshTokenGet(Async)");
        }
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling oauthRefreshTokenGet(Async)");
        }
        // verify the required parameter 'refreshToken' is set
        if (refreshToken == null) {
            throw new ApiException("Missing the required parameter 'refreshToken' when calling oauthRefreshTokenGet(Async)");
        }
        
        com.squareup.okhttp.Call call = oauthRefreshTokenGetCall(clientKey, grantType, refreshToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 刷新access_token
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param grantType 填refresh_token (required)
     * @param refreshToken 填写通过access_token获取到的refresh_token参数 (required)
     * @return OauthRefreshTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthRefreshTokenResponse oauthRefreshTokenGet(String clientKey, String grantType, String refreshToken) throws ApiException {
        ApiResponse<OauthRefreshTokenResponse> resp = oauthRefreshTokenGetWithHttpInfo(clientKey, grantType, refreshToken);
        return resp.getData();
    }

    /**
     * 刷新access_token
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param grantType 填refresh_token (required)
     * @param refreshToken 填写通过access_token获取到的refresh_token参数 (required)
     * @return ApiResponse&lt;OauthRefreshTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OauthRefreshTokenResponse> oauthRefreshTokenGetWithHttpInfo(String clientKey, String grantType, String refreshToken) throws ApiException {
        com.squareup.okhttp.Call call = oauthRefreshTokenGetValidateBeforeCall(clientKey, grantType, refreshToken, null, null);
        Type localVarReturnType = new TypeToken<OauthRefreshTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 刷新access_token (asynchronously)
     * 
     * @param clientKey 应用唯一标识 (required)
     * @param grantType 填refresh_token (required)
     * @param refreshToken 填写通过access_token获取到的refresh_token参数 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthRefreshTokenGetAsync(String clientKey, String grantType, String refreshToken, final ApiCallback<OauthRefreshTokenResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oauthRefreshTokenGetValidateBeforeCall(clientKey, grantType, refreshToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OauthRefreshTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

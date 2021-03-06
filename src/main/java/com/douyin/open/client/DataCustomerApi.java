/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


import com.douyin.open.model.DataCustomerBookingResponse;
import com.douyin.open.model.DataCustomerLetterResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCustomerApi {
    private ApiClient apiClient;

    public DataCustomerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataCustomerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for dataCustomerBookingGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataCustomerBookingGetCall(String accessToken, String beginDate, String endDate, String openId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/customer/booking/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (beginDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("begin_date", beginDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));

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
    private com.squareup.okhttp.Call dataCustomerBookingGetValidateBeforeCall(String accessToken, String beginDate, String endDate, String openId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataCustomerBookingGet(Async)");
        }
        // verify the required parameter 'beginDate' is set
        if (beginDate == null) {
            throw new ApiException("Missing the required parameter 'beginDate' when calling dataCustomerBookingGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling dataCustomerBookingGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataCustomerBookingGetCall(accessToken, beginDate, endDate, openId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取用户预约数据情况
     * * Scope: &#x60;data.customer&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @return DataCustomerBookingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataCustomerBookingResponse dataCustomerBookingGet(String accessToken, String beginDate, String endDate, String openId) throws ApiException {
        ApiResponse<DataCustomerBookingResponse> resp = dataCustomerBookingGetWithHttpInfo(accessToken, beginDate, endDate, openId);
        return resp.getData();
    }

    /**
     * 获取用户预约数据情况
     * * Scope: &#x60;data.customer&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @return ApiResponse&lt;DataCustomerBookingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataCustomerBookingResponse> dataCustomerBookingGetWithHttpInfo(String accessToken, String beginDate, String endDate, String openId) throws ApiException {
        com.squareup.okhttp.Call call = dataCustomerBookingGetValidateBeforeCall(accessToken, beginDate, endDate, openId, null, null);
        Type localVarReturnType = new TypeToken<DataCustomerBookingResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取用户预约数据情况 (asynchronously)
     * * Scope: &#x60;data.customer&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataCustomerBookingGetAsync(String accessToken, String beginDate, String endDate, String openId, final ApiCallback<DataCustomerBookingResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataCustomerBookingGetValidateBeforeCall(accessToken, beginDate, endDate, openId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataCustomerBookingResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataCustomerLetterGet
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataCustomerLetterGetCall(String accessToken, String beginDate, String endDate, String openId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/data/customer/letter/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (openId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_id", openId));
        if (beginDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("begin_date", beginDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));

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
    private com.squareup.okhttp.Call dataCustomerLetterGetValidateBeforeCall(String accessToken, String beginDate, String endDate, String openId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling dataCustomerLetterGet(Async)");
        }
        // verify the required parameter 'beginDate' is set
        if (beginDate == null) {
            throw new ApiException("Missing the required parameter 'beginDate' when calling dataCustomerLetterGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling dataCustomerLetterGet(Async)");
        }
        
        com.squareup.okhttp.Call call = dataCustomerLetterGetCall(accessToken, beginDate, endDate, openId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取私信数据信息
     * * Scope: &#x60;data.customer&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @return DataCustomerLetterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataCustomerLetterResponse dataCustomerLetterGet(String accessToken, String beginDate, String endDate, String openId) throws ApiException {
        ApiResponse<DataCustomerLetterResponse> resp = dataCustomerLetterGetWithHttpInfo(accessToken, beginDate, endDate, openId);
        return resp.getData();
    }

    /**
     * 获取私信数据信息
     * * Scope: &#x60;data.customer&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @return ApiResponse&lt;DataCustomerLetterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataCustomerLetterResponse> dataCustomerLetterGetWithHttpInfo(String accessToken, String beginDate, String endDate, String openId) throws ApiException {
        com.squareup.okhttp.Call call = dataCustomerLetterGetValidateBeforeCall(accessToken, beginDate, endDate, openId, null, null);
        Type localVarReturnType = new TypeToken<DataCustomerLetterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取私信数据信息 (asynchronously)
     * * Scope: &#x60;data.customer&#x60; 
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。 (required)
     * @param beginDate 开始日期(2019-01-01) (required)
     * @param endDate 结束日期(2019-01-01) (required)
     * @param openId 如果是client_access_token, 则不需要传open_id。操作用户数据的接口都需要传入open_id。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataCustomerLetterGetAsync(String accessToken, String beginDate, String endDate, String openId, final ApiCallback<DataCustomerLetterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataCustomerLetterGetValidateBeforeCall(accessToken, beginDate, endDate, openId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataCustomerLetterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

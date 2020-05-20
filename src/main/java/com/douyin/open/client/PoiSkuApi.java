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


import com.douyin.open.model.PoiExtHotelSkuResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiSkuApi {
    private ApiClient apiClient;

    public PoiSkuApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PoiSkuApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for poiExtHotelSkuGet
     * @param spuExtId 接入方SPU ID 列表 (required)
     * @param startDate 拉取价格时间区间[start_date, end_date) (required)
     * @param endDate 拉取价格时间区间[start_date, end_date) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelSkuGetCall(List<String> spuExtId, String startDate, String endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/poi/ext/hotel/sku/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spuExtId != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "spu_ext_id", spuExtId));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
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
    private com.squareup.okhttp.Call poiExtHotelSkuGetValidateBeforeCall(List<String> spuExtId, String startDate, String endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'spuExtId' is set
        if (spuExtId == null) {
            throw new ApiException("Missing the required parameter 'spuExtId' when calling poiExtHotelSkuGet(Async)");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling poiExtHotelSkuGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling poiExtHotelSkuGet(Async)");
        }
        
        com.squareup.okhttp.Call call = poiExtHotelSkuGetCall(spuExtId, startDate, endDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * sku拉取(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param spuExtId 接入方SPU ID 列表 (required)
     * @param startDate 拉取价格时间区间[start_date, end_date) (required)
     * @param endDate 拉取价格时间区间[start_date, end_date) (required)
     * @return PoiExtHotelSkuResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PoiExtHotelSkuResponse poiExtHotelSkuGet(List<String> spuExtId, String startDate, String endDate) throws ApiException {
        ApiResponse<PoiExtHotelSkuResponse> resp = poiExtHotelSkuGetWithHttpInfo(spuExtId, startDate, endDate);
        return resp.getData();
    }

    /**
     * sku拉取(该接口由接入方实现)
     * # 该接口由接入方实现 
     * @param spuExtId 接入方SPU ID 列表 (required)
     * @param startDate 拉取价格时间区间[start_date, end_date) (required)
     * @param endDate 拉取价格时间区间[start_date, end_date) (required)
     * @return ApiResponse&lt;PoiExtHotelSkuResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PoiExtHotelSkuResponse> poiExtHotelSkuGetWithHttpInfo(List<String> spuExtId, String startDate, String endDate) throws ApiException {
        com.squareup.okhttp.Call call = poiExtHotelSkuGetValidateBeforeCall(spuExtId, startDate, endDate, null, null);
        Type localVarReturnType = new TypeToken<PoiExtHotelSkuResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * sku拉取(该接口由接入方实现) (asynchronously)
     * # 该接口由接入方实现 
     * @param spuExtId 接入方SPU ID 列表 (required)
     * @param startDate 拉取价格时间区间[start_date, end_date) (required)
     * @param endDate 拉取价格时间区间[start_date, end_date) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call poiExtHotelSkuGetAsync(List<String> spuExtId, String startDate, String endDate, final ApiCallback<PoiExtHotelSkuResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = poiExtHotelSkuGetValidateBeforeCall(spuExtId, startDate, endDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PoiExtHotelSkuResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

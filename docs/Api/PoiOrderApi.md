# PoiOrderApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiExtHotelOrderCancelPost**](PoiOrderApi.md#poiExtHotelOrderCancelPost) | **POST** /poi/ext/hotel/order/cancel/ | 订单退款(该接口由接入方实现)
[**poiExtHotelOrderCommitPost**](PoiOrderApi.md#poiExtHotelOrderCommitPost) | **POST** /poi/ext/hotel/order/commit/ | 下单接口(该接口由接入方实现)
[**poiExtHotelOrderStatusPost**](PoiOrderApi.md#poiExtHotelOrderStatusPost) | **POST** /poi/ext/hotel/order/status/ | 订单状态通知(该接口由接入方实现)
[**poiOrderStatusPost**](PoiOrderApi.md#poiOrderStatusPost) | **POST** /poi/order/status/ | 订单状态同步接口

<a name="poiExtHotelOrderCancelPost"></a>
# **poiExtHotelOrderCancelPost**
> PoiOrderStatusResponse poiExtHotelOrderCancelPost(body)

订单退款(该接口由接入方实现)

# 该接口由接入方实现 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiExtHotelOrderCancelBody body = new PoiExtHotelOrderCancelBody(); // PoiExtHotelOrderCancelBody | 
try {
    PoiOrderStatusResponse result = apiInstance.poiExtHotelOrderCancelPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiExtHotelOrderCancelBody**](PoiExtHotelOrderCancelBody.md)|  | [optional]

### Return type

[**PoiOrderStatusResponse**](PoiOrderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiExtHotelOrderCommitPost"></a>
# **poiExtHotelOrderCommitPost**
> PoiExtHotelOrderCommitResponse2 poiExtHotelOrderCommitPost(body)

下单接口(该接口由接入方实现)

# 该接口由接入方实现 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiExtHotelOrderCommitBody body = new PoiExtHotelOrderCommitBody(); // PoiExtHotelOrderCommitBody | 
try {
    PoiExtHotelOrderCommitResponse2 result = apiInstance.poiExtHotelOrderCommitPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderCommitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiExtHotelOrderCommitBody**](PoiExtHotelOrderCommitBody.md)|  | [optional]

### Return type

[**PoiExtHotelOrderCommitResponse2**](PoiExtHotelOrderCommitResponse2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiExtHotelOrderStatusPost"></a>
# **poiExtHotelOrderStatusPost**
> PoiExtHotelOrderStatusResponse poiExtHotelOrderStatusPost(body)

订单状态通知(该接口由接入方实现)

# 该接口由接入方实现 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiExtHotelOrderStatusBody body = new PoiExtHotelOrderStatusBody(); // PoiExtHotelOrderStatusBody | 
try {
    PoiExtHotelOrderStatusResponse result = apiInstance.poiExtHotelOrderStatusPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiExtHotelOrderStatusBody**](PoiExtHotelOrderStatusBody.md)|  | [optional]

### Return type

[**PoiExtHotelOrderStatusResponse**](PoiExtHotelOrderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiOrderStatusPost"></a>
# **poiOrderStatusPost**
> PoiOrderStatusResponse poiOrderStatusPost(body, accessToken)

订单状态同步接口

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiOrderStatusBody body = new PoiOrderStatusBody(); // PoiOrderStatusBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiOrderStatusResponse result = apiInstance.poiOrderStatusPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiOrderStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiOrderStatusBody**](PoiOrderStatusBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiOrderStatusResponse**](PoiOrderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


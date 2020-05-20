# PoiOrderSyncApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiOrderSyncPost**](PoiOrderSyncApi.md#poiOrderSyncPost) | **POST** /poi/order/sync/ | 订单同步

<a name="poiOrderSyncPost"></a>
# **poiOrderSyncPost**
> PoiOrderSyncResponse1 poiOrderSyncPost(body, accessToken)

订单同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderSyncApi;


PoiOrderSyncApi apiInstance = new PoiOrderSyncApi();
PoiOrderSyncBody body = new PoiOrderSyncBody(); // PoiOrderSyncBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiOrderSyncResponse1 result = apiInstance.poiOrderSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderSyncApi#poiOrderSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiOrderSyncBody**](PoiOrderSyncBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiOrderSyncResponse1**](PoiOrderSyncResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


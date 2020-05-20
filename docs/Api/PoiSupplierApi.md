# PoiSupplierApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiQueryGet**](PoiSupplierApi.md#poiQueryGet) | **GET** /poi/query/ | 获取抖音POI ID
[**poiSupplierQueryGet**](PoiSupplierApi.md#poiSupplierQueryGet) | **GET** /poi/supplier/query/ | 查询店铺
[**poiSupplierSyncPost**](PoiSupplierApi.md#poiSupplierSyncPost) | **POST** /poi/supplier/sync/ | 商铺同步

<a name="poiQueryGet"></a>
# **poiQueryGet**
> PoiQueryResponse poiQueryGet(accessToken, amapId)

获取抖音POI ID

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String amapId = "amapId_example"; // String | 
try {
    PoiQueryResponse result = apiInstance.poiQueryGet(accessToken, amapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **amapId** | **String**|  |

### Return type

[**PoiQueryResponse**](PoiQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiSupplierQueryGet"></a>
# **poiSupplierQueryGet**
> PoiSupplierQueryResponse poiSupplierQueryGet(accessToken, supplierExtId)

查询店铺

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String supplierExtId = "supplierExtId_example"; // String | 
try {
    PoiSupplierQueryResponse result = apiInstance.poiSupplierQueryGet(accessToken, supplierExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **supplierExtId** | **String**|  |

### Return type

[**PoiSupplierQueryResponse**](PoiSupplierQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiSupplierSyncPost"></a>
# **poiSupplierSyncPost**
> PoiSupplierSyncResponse poiSupplierSyncPost(body, accessToken)

商铺同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
PoiSupplierSyncBody body = new PoiSupplierSyncBody(); // PoiSupplierSyncBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSupplierSyncResponse result = apiInstance.poiSupplierSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiSupplierSyncBody**](PoiSupplierSyncBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiSupplierSyncResponse**](PoiSupplierSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


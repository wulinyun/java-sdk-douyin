# PoiSpuApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiSkuSyncPost**](PoiSpuApi.md#poiSkuSyncPost) | **POST** /poi/sku/sync/ | SKU同步
[**poiSpuQueryGet**](PoiSpuApi.md#poiSpuQueryGet) | **GET** /poi/spu/query/ | 查询SPU
[**poiSpuSyncPost**](PoiSpuApi.md#poiSpuSyncPost) | **POST** /poi/spu/sync/ | SPU同步

<a name="poiSkuSyncPost"></a>
# **poiSkuSyncPost**
> PoiSkuSyncResponse poiSkuSyncPost(body, accessToken)

SKU同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
PoiSkuSyncBody body = new PoiSkuSyncBody(); // PoiSkuSyncBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSkuSyncResponse result = apiInstance.poiSkuSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSkuSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiSkuSyncBody**](PoiSkuSyncBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiSkuSyncResponse**](PoiSkuSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiSpuQueryGet"></a>
# **poiSpuQueryGet**
> PoiSpuQueryResponse poiSpuQueryGet(accessToken, spuExtId)

查询SPU

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String spuExtId = "spuExtId_example"; // String | 
try {
    PoiSpuQueryResponse result = apiInstance.poiSpuQueryGet(accessToken, spuExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSpuQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **spuExtId** | **String**|  |

### Return type

[**PoiSpuQueryResponse**](PoiSpuQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiSpuSyncPost"></a>
# **poiSpuSyncPost**
> PoiSpuSyncResponse poiSpuSyncPost(body, accessToken)

SPU同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
PoiSpuSyncBody body = new PoiSpuSyncBody(); // PoiSpuSyncBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSpuSyncResponse result = apiInstance.poiSpuSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSpuSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiSpuSyncBody**](PoiSpuSyncBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiSpuSyncResponse**](PoiSpuSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


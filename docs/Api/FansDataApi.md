# FansDataApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fansDataGet**](FansDataApi.md#fansDataGet) | **GET** /fans/data/ | 获取用户粉丝数据

<a name="fansDataGet"></a>
# **fansDataGet**
> FansDataResponse fansDataGet(openId, accessToken)

获取用户粉丝数据

* Scope: &#x60;fans.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.FansDataApi;


FansDataApi apiInstance = new FansDataApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    FansDataResponse result = apiInstance.fansDataGet(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FansDataApi#fansDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**FansDataResponse**](FansDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


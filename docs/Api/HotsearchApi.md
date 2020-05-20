# HotsearchApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hotsearchSentencesGet**](HotsearchApi.md#hotsearchSentencesGet) | **GET** /hotsearch/sentences/ | 获取实时热点词
[**hotsearchVideosGet**](HotsearchApi.md#hotsearchVideosGet) | **GET** /hotsearch/videos/ | 获取热点词聚合的视频

<a name="hotsearchSentencesGet"></a>
# **hotsearchSentencesGet**
> HotsearchSentencesResponse hotsearchSentencesGet(accessToken)

获取实时热点词

* Scope: &#x60;hotsearch&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    HotsearchSentencesResponse result = apiInstance.hotsearchSentencesGet(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchSentencesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**HotsearchSentencesResponse**](HotsearchSentencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hotsearchVideosGet"></a>
# **hotsearchVideosGet**
> HotsearchVideosResponse hotsearchVideosGet(accessToken, hotSentence)

获取热点词聚合的视频

* Scope: &#x60;hotsearch&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String hotSentence = "hotSentence_example"; // String | 热点词
try {
    HotsearchVideosResponse result = apiInstance.hotsearchVideosGet(accessToken, hotSentence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchVideosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **hotSentence** | **String**| 热点词 |

### Return type

[**HotsearchVideosResponse**](HotsearchVideosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


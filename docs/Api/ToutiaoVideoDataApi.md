# ToutiaoVideoDataApi

All URIs are relative to *https://open.snssdk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**toutiaoVideoDataPost**](ToutiaoVideoDataApi.md#toutiaoVideoDataPost) | **POST** /toutiao/video/data/ | 批量获取视频数据信息

<a name="toutiaoVideoDataPost"></a>
# **toutiaoVideoDataPost**
> ToutiaoVideoDataResponse toutiaoVideoDataPost(body, openId, accessToken)

批量获取视频数据信息

* Scope: &#x60;toutiao.video.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.ToutiaoVideoDataApi;


ToutiaoVideoDataApi apiInstance = new ToutiaoVideoDataApi();
ToutiaoVideoDataBody body = new ToutiaoVideoDataBody(); // ToutiaoVideoDataBody | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ToutiaoVideoDataResponse result = apiInstance.toutiaoVideoDataPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoDataApi#toutiaoVideoDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ToutiaoVideoDataBody**](ToutiaoVideoDataBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ToutiaoVideoDataResponse**](ToutiaoVideoDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


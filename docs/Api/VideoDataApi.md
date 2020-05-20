# VideoDataApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoDataPost**](VideoDataApi.md#videoDataPost) | **POST** /video/data/ | 批量获取视频数据信息

<a name="videoDataPost"></a>
# **videoDataPost**
> VideoDataResponse videoDataPost(body, openId, accessToken)

批量获取视频数据信息

* Scope: &#x60;video.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoDataApi;


VideoDataApi apiInstance = new VideoDataApi();
VideoDataBody body = new VideoDataBody(); // VideoDataBody | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoDataResponse result = apiInstance.videoDataPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoDataApi#videoDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VideoDataBody**](VideoDataBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**VideoDataResponse**](VideoDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


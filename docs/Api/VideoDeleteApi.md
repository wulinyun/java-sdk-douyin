# VideoDeleteApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoDeletePost**](VideoDeleteApi.md#videoDeletePost) | **POST** /video/delete/ | 删除授权用户发布的视频

<a name="videoDeletePost"></a>
# **videoDeletePost**
> VideoDeleteResponse videoDeletePost(openId, accessToken, body)

删除授权用户发布的视频

* Scope: &#x60;video.delete&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoDeleteApi;


VideoDeleteApi apiInstance = new VideoDeleteApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoDeleteBody body = new VideoDeleteBody(); // VideoDeleteBody | 
try {
    VideoDeleteResponse result = apiInstance.videoDeletePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoDeleteApi#videoDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoDeleteBody**](VideoDeleteBody.md)|  | [optional]

### Return type

[**VideoDeleteResponse**](VideoDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


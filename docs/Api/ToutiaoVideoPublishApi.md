# ToutiaoVideoPublishApi

All URIs are relative to *https://open.snssdk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**toutiaoVideoCreatePost**](ToutiaoVideoPublishApi.md#toutiaoVideoCreatePost) | **POST** /toutiao/video/create/ | 创建头条视频  注意：重复的video_id不会生成新的视频
[**toutiaoVideoUploadPost**](ToutiaoVideoPublishApi.md#toutiaoVideoUploadPost) | **POST** /toutiao/video/upload/ | 上传视频到文件服务器

<a name="toutiaoVideoCreatePost"></a>
# **toutiaoVideoCreatePost**
> ToutiaoVideoCreateResponse toutiaoVideoCreatePost(openId, accessToken, body)

创建头条视频  注意：重复的video_id不会生成新的视频

* Scope: &#x60;toutiao.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.ToutiaoVideoPublishApi;


ToutiaoVideoPublishApi apiInstance = new ToutiaoVideoPublishApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
ToutiaoVideoCreateBody body = new ToutiaoVideoCreateBody(); // ToutiaoVideoCreateBody | 
try {
    ToutiaoVideoCreateResponse result = apiInstance.toutiaoVideoCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoPublishApi#toutiaoVideoCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**ToutiaoVideoCreateBody**](ToutiaoVideoCreateBody.md)|  | [optional]

### Return type

[**ToutiaoVideoCreateResponse**](ToutiaoVideoCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="toutiaoVideoUploadPost"></a>
# **toutiaoVideoUploadPost**
> ToutiaoVideoUploadResponse toutiaoVideoUploadPost(video, openId, accessToken)

上传视频到文件服务器

* Scope: &#x60;toutiao.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.ToutiaoVideoPublishApi;


ToutiaoVideoPublishApi apiInstance = new ToutiaoVideoPublishApi();
File video = new File("/path/to/file"); // File | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ToutiaoVideoUploadResponse result = apiInstance.toutiaoVideoUploadPost(video, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoPublishApi#toutiaoVideoUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **video** | **File**|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ToutiaoVideoUploadResponse**](ToutiaoVideoUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


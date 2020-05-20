# VideoPublishApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoCreatePost**](VideoPublishApi.md#videoCreatePost) | **POST** /video/create/ | 创建抖音视频
[**videoPartCompletePost**](VideoPublishApi.md#videoPartCompletePost) | **POST** /video/part/complete/ | 完成上传
[**videoPartInitPost**](VideoPublishApi.md#videoPartInitPost) | **POST** /video/part/init/ | 初始化上传
[**videoPartUploadPost**](VideoPublishApi.md#videoPartUploadPost) | **POST** /video/part/upload/ | 上传视频分片到文件服务器
[**videoUploadPost**](VideoPublishApi.md#videoUploadPost) | **POST** /video/upload/ | 上传视频到文件服务器

<a name="videoCreatePost"></a>
# **videoCreatePost**
> VideoCreateResponse videoCreatePost(openId, accessToken, body)

创建抖音视频

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCreateBody body = new VideoCreateBody(); // VideoCreateBody | 
try {
    VideoCreateResponse result = apiInstance.videoCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoCreateBody**](VideoCreateBody.md)|  | [optional]

### Return type

[**VideoCreateResponse**](VideoCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="videoPartCompletePost"></a>
# **videoPartCompletePost**
> VideoPartCompleteResponse videoPartCompletePost(openId, accessToken, uploadId)

完成上传

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
try {
    VideoPartCompleteResponse result = apiInstance.videoPartCompletePost(openId, accessToken, uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartCompletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **uploadId** | **String**| 分片上传的标记。有限时间为2小时。 |

### Return type

[**VideoPartCompleteResponse**](VideoPartCompleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoPartInitPost"></a>
# **videoPartInitPost**
> VideoPartInitResponse videoPartInitPost(openId, accessToken)

初始化上传

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoPartInitResponse result = apiInstance.videoPartInitPost(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartInitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**VideoPartInitResponse**](VideoPartInitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoPartUploadPost"></a>
# **videoPartUploadPost**
> VideoPartUploadResponse videoPartUploadPost(video, openId, accessToken, uploadId, partNumber)

上传视频分片到文件服务器

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
File video = new File("/path/to/file"); // File | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
Integer partNumber = 56; // Integer | 第几个分片，从1开始 
try {
    VideoPartUploadResponse result = apiInstance.videoPartUploadPost(video, openId, accessToken, uploadId, partNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **video** | **File**|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **uploadId** | **String**| 分片上传的标记。有限时间为2小时。 |
 **partNumber** | **Integer**| 第几个分片，从1开始  |

### Return type

[**VideoPartUploadResponse**](VideoPartUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="videoUploadPost"></a>
# **videoUploadPost**
> VideoUploadResponse videoUploadPost(video, openId, accessToken)

上传视频到文件服务器

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
File video = new File("/path/to/file"); // File | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoUploadResponse result = apiInstance.videoUploadPost(video, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoUploadPost");
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

[**VideoUploadResponse**](VideoUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


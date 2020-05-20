# ImageApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imageCreatePost**](ImageApi.md#imageCreatePost) | **POST** /image/create/ | 发布图片
[**imageUploadPost**](ImageApi.md#imageUploadPost) | **POST** /image/upload/ | 上传图片到文件服务器

<a name="imageCreatePost"></a>
# **imageCreatePost**
> ImageCreateResponse imageCreatePost(openId, accessToken, body)

发布图片

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.ImageApi;


ImageApi apiInstance = new ImageApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
ImageCreateBody body = new ImageCreateBody(); // ImageCreateBody | 
try {
    ImageCreateResponse result = apiInstance.imageCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#imageCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**ImageCreateBody**](ImageCreateBody.md)|  | [optional]

### Return type

[**ImageCreateResponse**](ImageCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="imageUploadPost"></a>
# **imageUploadPost**
> ImageUploadResponse imageUploadPost(image, openId, accessToken)

上传图片到文件服务器

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.ImageApi;


ImageApi apiInstance = new ImageApi();
File image = new File("/path/to/file"); // File | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ImageUploadResponse result = apiInstance.imageUploadPost(image, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#imageUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ImageUploadResponse**](ImageUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


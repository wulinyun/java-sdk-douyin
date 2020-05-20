# VideoCommentApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoCommentListGet**](VideoCommentApi.md#videoCommentListGet) | **GET** /video/comment/list/ | 评论列表
[**videoCommentReplyListGet**](VideoCommentApi.md#videoCommentReplyListGet) | **GET** /video/comment/reply/list/ | 评论回复列表
[**videoCommentReplyPost**](VideoCommentApi.md#videoCommentReplyPost) | **POST** /video/comment/reply/ | 回复视频评论
[**videoCommentTopPost**](VideoCommentApi.md#videoCommentTopPost) | **POST** /video/comment/top/ | 置顶视频评论(企业号)

<a name="videoCommentListGet"></a>
# **videoCommentListGet**
> VideoCommentListResponse videoCommentListGet(openId, accessToken, count, itemId, cursor)

评论列表

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
Integer cursor = 0; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoCommentListResponse result = apiInstance.videoCommentListGet(openId, accessToken, count, itemId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **itemId** | **String**| 视频id |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoCommentListResponse**](VideoCommentListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoCommentReplyListGet"></a>
# **videoCommentReplyListGet**
> VideoCommentListResponse videoCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor)

评论回复列表

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
String commentId = "commentId_example"; // String | 评论id
Integer cursor = 0; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoCommentListResponse result = apiInstance.videoCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentReplyListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **itemId** | **String**| 视频id |
 **commentId** | **String**| 评论id |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoCommentListResponse**](VideoCommentListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoCommentReplyPost"></a>
# **videoCommentReplyPost**
> CommonResponse videoCommentReplyPost(openId, accessToken, body)

回复视频评论

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCommentReplyBody body = new VideoCommentReplyBody(); // VideoCommentReplyBody | 
try {
    CommonResponse result = apiInstance.videoCommentReplyPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentReplyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoCommentReplyBody**](VideoCommentReplyBody.md)|  | [optional]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="videoCommentTopPost"></a>
# **videoCommentTopPost**
> CommonResponse videoCommentTopPost(openId, accessToken, body)

置顶视频评论(企业号)

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCommentTopBody body = new VideoCommentTopBody(); // VideoCommentTopBody | 
try {
    CommonResponse result = apiInstance.videoCommentTopPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentTopPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoCommentTopBody**](VideoCommentTopBody.md)|  | [optional]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# FollowingListApi

All URIs are relative to *https://www.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**followingListGet**](FollowingListApi.md#followingListGet) | **GET** /following/list/ | 获取关注列表

<a name="followingListGet"></a>
# **followingListGet**
> FollowingListResponse followingListGet(openId, accessToken, count, cursor)

获取关注列表

* Scope: &#x60;following.list&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.FollowingListApi;


FollowingListApi apiInstance = new FollowingListApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
Integer cursor = 0; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    FollowingListResponse result = apiInstance.followingListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FollowingListApi#followingListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**FollowingListResponse**](FollowingListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


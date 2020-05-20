# EventStatusApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventStatusListGet**](EventStatusApi.md#eventStatusListGet) | **GET** /event/status/list/ | 获取事件订阅状态
[**eventStatusUpdatePost**](EventStatusApi.md#eventStatusUpdatePost) | **POST** /event/status/update/ | 更新应用推送事件订阅状态

<a name="eventStatusListGet"></a>
# **eventStatusListGet**
> EventStatusListResponse eventStatusListGet(accessToken)

获取事件订阅状态

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EventStatusApi;


EventStatusApi apiInstance = new EventStatusApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    EventStatusListResponse result = apiInstance.eventStatusListGet(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventStatusApi#eventStatusListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**EventStatusListResponse**](EventStatusListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventStatusUpdatePost"></a>
# **eventStatusUpdatePost**
> EventStatusUpdateResponse eventStatusUpdatePost(accessToken, body)

更新应用推送事件订阅状态

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EventStatusApi;


EventStatusApi apiInstance = new EventStatusApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
EventStatusUpdateBody body = new EventStatusUpdateBody(); // EventStatusUpdateBody | 
try {
    EventStatusUpdateResponse result = apiInstance.eventStatusUpdatePost(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventStatusApi#eventStatusUpdatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **body** | [**EventStatusUpdateBody**](EventStatusUpdateBody.md)|  | [optional]

### Return type

[**EventStatusUpdateResponse**](EventStatusUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


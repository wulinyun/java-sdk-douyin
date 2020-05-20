# ImApi

All URIs are relative to *https://www.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imMessageSendPost**](ImApi.md#imMessageSendPost) | **POST** /im/message/send/ | 给抖音用户发送消息

<a name="imMessageSendPost"></a>
# **imMessageSendPost**
> ImMessageSendResponse imMessageSendPost(body, openId, accessToken)

给抖音用户发送消息

* Scope: &#x60;im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.ImApi;


ImApi apiInstance = new ImApi();
ImMessageSendBody body = new ImMessageSendBody(); // ImMessageSendBody | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ImMessageSendResponse result = apiInstance.imMessageSendPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImApi#imMessageSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImMessageSendBody**](ImMessageSendBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ImMessageSendResponse**](ImMessageSendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


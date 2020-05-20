# UserInfoApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthUserinfoGet**](UserInfoApi.md#oauthUserinfoGet) | **GET** /oauth/userinfo/ | 获取用户信息

<a name="oauthUserinfoGet"></a>
# **oauthUserinfoGet**
> OauthUserinfoResponse oauthUserinfoGet(accessToken, openId)

获取用户信息

* Scope: &#x60;user_info&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.UserInfoApi;


UserInfoApi apiInstance = new UserInfoApi();
String accessToken = "accessToken_example"; // String | 
String openId = "openId_example"; // String | 
try {
    OauthUserinfoResponse result = apiInstance.oauthUserinfoGet(accessToken, openId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#oauthUserinfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**|  |
 **openId** | **String**|  |

### Return type

[**OauthUserinfoResponse**](OauthUserinfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


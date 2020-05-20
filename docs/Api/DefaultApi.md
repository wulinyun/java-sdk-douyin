# DefaultApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devtoolMonitorCallPost**](DefaultApi.md#devtoolMonitorCallPost) | **POST** /devtool/monitor/call/ | 获取接口调用监控情况

<a name="devtoolMonitorCallPost"></a>
# **devtoolMonitorCallPost**
> DevtoolMonitorCallResponse devtoolMonitorCallPost(accessToken, timeType, beginTime, endTime, body)

获取接口调用监控情况

* Scope: &#x60;devtool&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String timeType = "timeType_example"; // String | 时间类型
String beginTime = "beginTime_example"; // String | 开始日期(20190101)
String endTime = "endTime_example"; // String | 结束日期(20190101)
DevtoolMonitorCallBody body = new DevtoolMonitorCallBody(); // DevtoolMonitorCallBody | 
try {
    DevtoolMonitorCallResponse result = apiInstance.devtoolMonitorCallPost(accessToken, timeType, beginTime, endTime, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#devtoolMonitorCallPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **timeType** | **String**| 时间类型 | [enum: min5, hour, day]
 **beginTime** | **String**| 开始日期(20190101) |
 **endTime** | **String**| 结束日期(20190101) |
 **body** | [**DevtoolMonitorCallBody**](DevtoolMonitorCallBody.md)|  | [optional]

### Return type

[**DevtoolMonitorCallResponse**](DevtoolMonitorCallResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


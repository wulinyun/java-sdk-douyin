###DefaultApi_devtoolMonitorCallPost
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

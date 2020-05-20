###EventStatusApi_eventStatusListGet
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
###EventStatusApi_eventStatusUpdatePost
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

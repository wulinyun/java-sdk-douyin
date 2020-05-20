###HotsearchApi_hotsearchSentencesGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    HotsearchSentencesResponse result = apiInstance.hotsearchSentencesGet(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchSentencesGet");
    e.printStackTrace();
}
```
###HotsearchApi_hotsearchVideosGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String hotSentence = "hotSentence_example"; // String | 热点词
try {
    HotsearchVideosResponse result = apiInstance.hotsearchVideosGet(accessToken, hotSentence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchVideosGet");
    e.printStackTrace();
}
```

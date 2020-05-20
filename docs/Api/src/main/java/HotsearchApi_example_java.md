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
###HotsearchApi_hotsearchTrendingSentencesGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer count = 10; // Integer | 每页数量
Long cursor = 0L; // Long | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    HotsearchTrendingSentencesResponse result = apiInstance.hotsearchTrendingSentencesGet(accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchTrendingSentencesGet");
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

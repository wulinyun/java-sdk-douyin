###ShareIdApi_shareIdGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.ShareIdApi;


ShareIdApi apiInstance = new ShareIdApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Boolean needCallback = true; // Boolean | 如果需要知道视频分享成功的结果，need_callback设置为true
String sourceStyleId = "sourceStyleId_example"; // String | 多来源样式id（暂未开放）
String defaultHashtag = "defaultHashtag_example"; // String | 追踪分享默认hashtag
String linkParam = "linkParam_example"; // String | 分享来源url附加参数（暂未开放）
try {
    ShareidResponse result = apiInstance.shareIdGet(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareIdApi#shareIdGet");
    e.printStackTrace();
}
```

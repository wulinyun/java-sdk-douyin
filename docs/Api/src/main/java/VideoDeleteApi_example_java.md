###VideoDeleteApi_videoDeletePost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoDeleteApi;


VideoDeleteApi apiInstance = new VideoDeleteApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoDeleteBody body = new VideoDeleteBody(); // VideoDeleteBody | 
try {
    VideoDeleteResponse result = apiInstance.videoDeletePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoDeleteApi#videoDeletePost");
    e.printStackTrace();
}
```

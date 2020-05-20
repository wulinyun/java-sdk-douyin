###VideoCommentApi_videoCommentListGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
Long cursor = 0L; // Long | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoCommentListResponse result = apiInstance.videoCommentListGet(openId, accessToken, count, itemId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentListGet");
    e.printStackTrace();
}
```
###VideoCommentApi_videoCommentReplyListGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
String commentId = "commentId_example"; // String | 评论id
Long cursor = 0L; // Long | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoCommentListResponse result = apiInstance.videoCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentReplyListGet");
    e.printStackTrace();
}
```
###VideoCommentApi_videoCommentReplyPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCommentReplyBody body = new VideoCommentReplyBody(); // VideoCommentReplyBody | 
try {
    CommonResponse result = apiInstance.videoCommentReplyPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentReplyPost");
    e.printStackTrace();
}
```
###VideoCommentApi_videoCommentTopPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCommentTopBody body = new VideoCommentTopBody(); // VideoCommentTopBody | 
try {
    CommonResponse result = apiInstance.videoCommentTopPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentTopPost");
    e.printStackTrace();
}
```

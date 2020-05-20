###VideoPublishApi_videoCreatePost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCreateBody body = new VideoCreateBody(); // VideoCreateBody | 
try {
    VideoCreateResponse result = apiInstance.videoCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoCreatePost");
    e.printStackTrace();
}
```
###VideoPublishApi_videoPartCompletePost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
try {
    VideoPartCompleteResponse result = apiInstance.videoPartCompletePost(openId, accessToken, uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartCompletePost");
    e.printStackTrace();
}
```
###VideoPublishApi_videoPartInitPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoPartInitResponse result = apiInstance.videoPartInitPost(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartInitPost");
    e.printStackTrace();
}
```
###VideoPublishApi_videoPartUploadPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
File video = new File("/path/to/file"); // File | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
Integer partNumber = 56; // Integer | 第几个分片，从1开始 
try {
    VideoPartUploadResponse result = apiInstance.videoPartUploadPost(video, openId, accessToken, uploadId, partNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartUploadPost");
    e.printStackTrace();
}
```
###VideoPublishApi_videoUploadPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
File video = new File("/path/to/file"); // File | 
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoUploadResponse result = apiInstance.videoUploadPost(video, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoUploadPost");
    e.printStackTrace();
}
```

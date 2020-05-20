###SandboxApi_sandboxWebhookEventSendPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.SandboxApi;


SandboxApi apiInstance = new SandboxApi();
SandboxWebhookEventSendBody body = new SandboxWebhookEventSendBody(); // SandboxWebhookEventSendBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    CommonResponse result = apiInstance.sandboxWebhookEventSendPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SandboxApi#sandboxWebhookEventSendPost");
    e.printStackTrace();
}
```

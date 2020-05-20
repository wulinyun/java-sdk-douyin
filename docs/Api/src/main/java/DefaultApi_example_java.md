###DefaultApi_oauthAccessTokenGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String clientSecret = "clientSecret_example"; // String | 应用唯一标识对应的密钥
String code = "code_example"; // String | 授权码
String grantType = "grantType_example"; // String | 
try {
    OauthAccessTokenResponse result = apiInstance.oauthAccessTokenGet(clientKey, clientSecret, code, grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#oauthAccessTokenGet");
    e.printStackTrace();
}
```
###DefaultApi_oauthAuthorizeGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String responseType = "responseType_example"; // String | 填写code
String scope = "scope_example"; // String | 应用授权作用域,多个授权作用域以英文逗号（,）分隔
String redirectUri = "redirectUri_example"; // String | 授权成功后的回调地址，必须以http/https开头。
String state = "state_example"; // String | 用于保持请求和回调的状态
try {
    apiInstance.oauthAuthorizeGet(clientKey, responseType, scope, redirectUri, state);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#oauthAuthorizeGet");
    e.printStackTrace();
}
```
###DefaultApi_oauthClientTokenGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String clientSecret = "clientSecret_example"; // String | 应用唯一标识对应的密钥
String grantType = "grantType_example"; // String | 
try {
    OauthClientTokenResponse result = apiInstance.oauthClientTokenGet(clientKey, clientSecret, grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#oauthClientTokenGet");
    e.printStackTrace();
}
```
###DefaultApi_oauthRefreshTokenGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String grantType = "grantType_example"; // String | 填refresh_token
String refreshToken = "refreshToken_example"; // String | 填写通过access_token获取到的refresh_token参数
try {
    OauthRefreshTokenResponse result = apiInstance.oauthRefreshTokenGet(clientKey, grantType, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#oauthRefreshTokenGet");
    e.printStackTrace();
}
```

###UserInfoApi_oauthUserinfoGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.UserInfoApi;


UserInfoApi apiInstance = new UserInfoApi();
String accessToken = "accessToken_example"; // String | 
String openId = "openId_example"; // String | 
try {
    OauthUserinfoResponse result = apiInstance.oauthUserinfoGet(accessToken, openId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#oauthUserinfoGet");
    e.printStackTrace();
}
```

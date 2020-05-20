###DataExternalUserApi_dataExternalUserCommentGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalUserCommentResponse result = apiInstance.dataExternalUserCommentGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserCommentGet");
    e.printStackTrace();
}
```
###DataExternalUserApi_dataExternalUserFansGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalUserFansResponse result = apiInstance.dataExternalUserFansGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserFansGet");
    e.printStackTrace();
}
```
###DataExternalUserApi_dataExternalUserItemGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalUserItemResponse result = apiInstance.dataExternalUserItemGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserItemGet");
    e.printStackTrace();
}
```
###DataExternalUserApi_dataExternalUserLikeGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalUserLikeResponse result = apiInstance.dataExternalUserLikeGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserLikeGet");
    e.printStackTrace();
}
```
###DataExternalUserApi_dataExternalUserProfileGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalUserProfileResponse result = apiInstance.dataExternalUserProfileGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserProfileGet");
    e.printStackTrace();
}
```
###DataExternalUserApi_dataExternalUserShareGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalUserShareResponse result = apiInstance.dataExternalUserShareGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserShareGet");
    e.printStackTrace();
}
```

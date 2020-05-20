###EnterpriseLeadsApi_enterpriseLeadsTagCreatePost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsTagCreateBody body = new EnterpriseLeadsTagCreateBody(); // EnterpriseLeadsTagCreateBody | 
try {
    EnterpriseLeadsTagCreateResponse result = apiInstance.enterpriseLeadsTagCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagCreatePost");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsTagDeletePost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsTagDeleteBody body = new EnterpriseLeadsTagDeleteBody(); // EnterpriseLeadsTagDeleteBody | 
try {
    EnterpriseLeadsTagDeleteResponse result = apiInstance.enterpriseLeadsTagDeletePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagDeletePost");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsTagListGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标
try {
    EnterpriseLeadsTagListResponse result = apiInstance.enterpriseLeadsTagListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagListGet");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsTagUpdatePost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsTagUpdateBody body = new EnterpriseLeadsTagUpdateBody(); // EnterpriseLeadsTagUpdateBody | 
try {
    EnterpriseLeadsTagCreateResponse result = apiInstance.enterpriseLeadsTagUpdatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagUpdatePost");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsTagUserListGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
Integer tagId = 56; // Integer | 
Integer cursor = 56; // Integer | 分页游标
try {
    EnterpriseLeadsTagUserListResponse result = apiInstance.enterpriseLeadsTagUserListGet(openId, accessToken, count, tagId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagUserListGet");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsTagUserUpdatePost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsTagUserUpdateBody body = new EnterpriseLeadsTagUserUpdateBody(); // EnterpriseLeadsTagUserUpdateBody | 
try {
    EnterpriseLeadsTagDeleteResponse result = apiInstance.enterpriseLeadsTagUserUpdatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagUserUpdatePost");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsUserActionListGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
String userId = "userId_example"; // String | 
String cursor = "cursor_example"; // String | 
Integer actionType = 56; // Integer | 
try {
    EnterpriseLeadsUserActionListResponse result = apiInstance.enterpriseLeadsUserActionListGet(openId, accessToken, count, userId, cursor, actionType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsUserActionListGet");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsUserDetailGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String userId = "userId_example"; // String | 
try {
    EnterpriseLeadsUserDetailResponse result = apiInstance.enterpriseLeadsUserDetailGet(openId, accessToken, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsUserDetailGet");
    e.printStackTrace();
}
```
###EnterpriseLeadsApi_enterpriseLeadsUserListGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 10; // Integer | 每页数量
Integer startTime = 56; // Integer | 
Integer endTime = 56; // Integer | 
Integer actionType = 56; // Integer | 分类:   * `0` - 全部   * `1` - 私信互动   * `2` - 组件互动   * `3` - 主页互动 
Integer cursor = 56; // Integer | 分页游标
Integer leadsLevel = 56; // Integer | 用户状态:   * `-1` - 没兴趣   * `0` - 了解   * `1` - 有兴趣   * `2` - 有意愿   * `10` - 已转化 
try {
    EnterpriseLeadsUserListResponse result = apiInstance.enterpriseLeadsUserListGet(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsUserListGet");
    e.printStackTrace();
}
```

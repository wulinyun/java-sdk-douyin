###DataExternalItemApi_dataExternalItemBaseGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
try {
    DataExternalItemBaseResponse result = apiInstance.dataExternalItemBaseGet(openId, accessToken, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemBaseGet");
    e.printStackTrace();
}
```
###DataExternalItemApi_dataExternalItemCommentGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalItemCommentResponse result = apiInstance.dataExternalItemCommentGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemCommentGet");
    e.printStackTrace();
}
```
###DataExternalItemApi_dataExternalItemLikeGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalItemLikeResponse result = apiInstance.dataExternalItemLikeGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemLikeGet");
    e.printStackTrace();
}
```
###DataExternalItemApi_dataExternalItemPlayGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalItemPlayResponse result = apiInstance.dataExternalItemPlayGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemPlayGet");
    e.printStackTrace();
}
```
###DataExternalItemApi_dataExternalItemShareGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "ba253642-0590-40bc-9bdf-9a1334b94059"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    DataExternalItemShareResponse result = apiInstance.dataExternalItemShareGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemShareGet");
    e.printStackTrace();
}
```

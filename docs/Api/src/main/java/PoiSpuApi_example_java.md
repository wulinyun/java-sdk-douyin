###PoiSpuApi_poiSkuSyncPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
PoiSkuSyncBody body = new PoiSkuSyncBody(); // PoiSkuSyncBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSkuSyncResponse result = apiInstance.poiSkuSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSkuSyncPost");
    e.printStackTrace();
}
```
###PoiSpuApi_poiSpuQueryGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String spuExtId = "spuExtId_example"; // String | 
try {
    PoiSpuQueryResponse result = apiInstance.poiSpuQueryGet(accessToken, spuExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSpuQueryGet");
    e.printStackTrace();
}
```
###PoiSpuApi_poiSpuSyncPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
PoiSpuSyncBody body = new PoiSpuSyncBody(); // PoiSpuSyncBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSpuSyncResponse result = apiInstance.poiSpuSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSpuSyncPost");
    e.printStackTrace();
}
```

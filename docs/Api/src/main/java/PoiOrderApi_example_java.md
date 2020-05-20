###PoiOrderApi_poiExtHotelOrderCancelPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiExtHotelOrderCancelBody body = new PoiExtHotelOrderCancelBody(); // PoiExtHotelOrderCancelBody | 
try {
    PoiExtHotelOrderCancelResponse result = apiInstance.poiExtHotelOrderCancelPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderCancelPost");
    e.printStackTrace();
}
```
###PoiOrderApi_poiExtHotelOrderCommitPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiExtHotelOrderCommitBody body = new PoiExtHotelOrderCommitBody(); // PoiExtHotelOrderCommitBody | 
try {
    PoiExtHotelOrderCommitResponse2 result = apiInstance.poiExtHotelOrderCommitPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderCommitPost");
    e.printStackTrace();
}
```
###PoiOrderApi_poiExtHotelOrderStatusPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiExtHotelOrderStatusBody body = new PoiExtHotelOrderStatusBody(); // PoiExtHotelOrderStatusBody | 
try {
    PoiExtHotelOrderStatusResponse result = apiInstance.poiExtHotelOrderStatusPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderStatusPost");
    e.printStackTrace();
}
```
###PoiOrderApi_poiOrderStatusPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiOrderStatusBody body = new PoiOrderStatusBody(); // PoiOrderStatusBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiOrderStatusResponse result = apiInstance.poiOrderStatusPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiOrderStatusPost");
    e.printStackTrace();
}
```

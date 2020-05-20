###PoiSupplierApi_poiQueryGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String amapId = "amapId_example"; // String | 
try {
    PoiQueryResponse result = apiInstance.poiQueryGet(accessToken, amapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiQueryGet");
    e.printStackTrace();
}
```
###PoiSupplierApi_poiSupplierQueryGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String supplierExtId = "supplierExtId_example"; // String | 
try {
    PoiSupplierQueryResponse result = apiInstance.poiSupplierQueryGet(accessToken, supplierExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierQueryGet");
    e.printStackTrace();
}
```
###PoiSupplierApi_poiSupplierSyncPost
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
PoiSupplierSyncBody body = new PoiSupplierSyncBody(); // PoiSupplierSyncBody | 
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSupplierSyncResponse result = apiInstance.poiSupplierSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierSyncPost");
    e.printStackTrace();
}
```

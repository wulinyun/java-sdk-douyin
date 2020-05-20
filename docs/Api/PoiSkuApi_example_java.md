###PoiSkuApi_poiExtHotelSkuGet
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSkuApi;


PoiSkuApi apiInstance = new PoiSkuApi();
List<String> spuExtId = Arrays.asList("[\"y0001\",\"y0002\"]"); // List<String> | 接入方SPU ID 列表
String startDate = "20191001"; // String | 拉取价格时间区间[start_date, end_date)
String endDate = "20191007"; // String | 拉取价格时间区间[start_date, end_date)
try {
    PoiExtHotelSkuResponse result = apiInstance.poiExtHotelSkuGet(spuExtId, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSkuApi#poiExtHotelSkuGet");
    e.printStackTrace();
}
```

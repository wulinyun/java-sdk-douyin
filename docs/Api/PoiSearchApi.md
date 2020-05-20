# PoiSearchApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiSearchKeywordGet**](PoiSearchApi.md#poiSearchKeywordGet) | **GET** /poi/search/keyword/ | 关键字搜索

<a name="poiSearchKeywordGet"></a>
# **poiSearchKeywordGet**
> PoiSearchKeywordResponse poiSearchKeywordGet(accessToken, count, keyword, cursor, city)

关键字搜索

* Scope: &#x60;poi.search&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.client.PoiSearchApi;


PoiSearchApi apiInstance = new PoiSearchApi();
String accessToken = "clt.943da17996fb5cebfbc70c044c3fc25a57T54DcjT6HNKGqnUdxzy1KcxFnZ"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer count = 10; // Integer | 每页数量
String keyword = "keyword_example"; // String | 查询关键字，例如美食
Integer cursor = 0; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
String city = "city_example"; // String | 查询城市，例如上海、北京
try {
    PoiSearchKeywordResponse result = apiInstance.poiSearchKeywordGet(accessToken, count, keyword, cursor, city);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSearchApi#poiSearchKeywordGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **keyword** | **String**| 查询关键字，例如美食 |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]
 **city** | **String**| 查询城市，例如上海、北京 | [optional]

### Return type

[**PoiSearchKeywordResponse**](PoiSearchKeywordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


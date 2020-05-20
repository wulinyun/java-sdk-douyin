<hr/>

# PoiSearchApi
请求绝对路径： *https://open.douyin.com*
<a name="PoiSearchApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**poiSearchKeywordGet**](#poiSearchKeywordGet) | **GET** /poi/search/keyword/ | 关键字搜索

<a name="poiSearchKeywordGet"></a>
# **poiSearchKeywordGet**
<hr/>

## 接口描述
关键字搜索
* Scope: &#x60;poi.search&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。
 **count** | **Integer**| 每页数量
 **keyword** | **String**| 查询关键字，例如美食
 **cursor** | **Long**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
 **city** | **String**| 查询城市，例如上海、北京

## 请求体
<hr/>







## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSearchApi_poiSearchKeywordGet.code">

## 响应体
<hr/>

<markdown src="./model/PoiSearchKeywordResponse.md" />


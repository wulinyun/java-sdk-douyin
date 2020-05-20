<hr/>

# PoiSkuApi
请求绝对路径： *https://open.douyin.com*
<a name="PoiSkuApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**poiExtHotelSkuGet**](#poiExtHotelSkuGet) | **GET** /poi/ext/hotel/sku/ | sku拉取(该接口由接入方实现)

<a name="poiExtHotelSkuGet"></a>
# **poiExtHotelSkuGet**
<hr/>

## 接口描述
sku拉取(该接口由接入方实现)
# 该接口由接入方实现 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **spuExtId** | [**List&lt;String&gt;**](#String)| 接入方SPU ID 列表
 **startDate** | **String**| 拉取价格时间区间[start_date, end_date)
 **endDate** | **String**| 拉取价格时间区间[start_date, end_date)

## 请求体
<hr/>

<a name="List&lt;String&gt;"></a>
<markdown src="./model/String.md" />



## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSkuApi_poiExtHotelSkuGet.code">

## 响应体
<hr/>

<markdown src="./model/PoiExtHotelSkuResponse.md" />


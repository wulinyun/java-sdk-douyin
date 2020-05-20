<hr/>

# PoiOrderSyncApi
请求绝对路径： *https://open.douyin.com*
<a name="PoiOrderSyncApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**poiOrderSyncPost**](#poiOrderSyncPost) | **POST** /poi/order/sync/ | 订单同步

<a name="poiOrderSyncPost"></a>
# **poiOrderSyncPost**
<hr/>

## 接口描述
订单同步
* Scope: &#x60;poi.product&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiOrderSyncBody**](#PoiOrderSyncBody)| 无
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>

<a name="PoiOrderSyncBody"></a>
<markdown src="./model/PoiOrderSyncBody.md" />


## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiOrderSyncApi_poiOrderSyncPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiOrderSyncResponse1.md" />


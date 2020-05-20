<hr/>

# PoiOrderApi
请求绝对路径： *https://open.douyin.com*
<a name="PoiOrderApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**poiExtHotelOrderCancelPost**](#poiExtHotelOrderCancelPost) | **POST** /poi/ext/hotel/order/cancel/ | 订单退款(该接口由接入方实现)
[**poiExtHotelOrderCommitPost**](#poiExtHotelOrderCommitPost) | **POST** /poi/ext/hotel/order/commit/ | 下单接口(该接口由接入方实现)
[**poiExtHotelOrderStatusPost**](#poiExtHotelOrderStatusPost) | **POST** /poi/ext/hotel/order/status/ | 订单状态通知(该接口由接入方实现)
[**poiOrderStatusPost**](#poiOrderStatusPost) | **POST** /poi/order/status/ | 订单状态同步接口

<a name="poiExtHotelOrderCancelPost"></a>
# **poiExtHotelOrderCancelPost**
<hr/>

## 接口描述
订单退款(该接口由接入方实现)
# 该接口由接入方实现 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiExtHotelOrderCancelBody**](#PoiExtHotelOrderCancelBody)| 无

## 请求体
<hr/>

<a name="PoiExtHotelOrderCancelBody"></a>
<markdown src="./model/PoiExtHotelOrderCancelBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiOrderApi_poiExtHotelOrderCancelPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiOrderStatusResponse.md" />

<a name="poiExtHotelOrderCommitPost"></a>
# **poiExtHotelOrderCommitPost**
<hr/>

## 接口描述
下单接口(该接口由接入方实现)
# 该接口由接入方实现 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiExtHotelOrderCommitBody**](#PoiExtHotelOrderCommitBody)| 无

## 请求体
<hr/>

<a name="PoiExtHotelOrderCommitBody"></a>
<markdown src="./model/PoiExtHotelOrderCommitBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiOrderApi_poiExtHotelOrderCommitPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiExtHotelOrderCommitResponse2.md" />

<a name="poiExtHotelOrderStatusPost"></a>
# **poiExtHotelOrderStatusPost**
<hr/>

## 接口描述
订单状态通知(该接口由接入方实现)
# 该接口由接入方实现 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiExtHotelOrderStatusBody**](#PoiExtHotelOrderStatusBody)| 无

## 请求体
<hr/>

<a name="PoiExtHotelOrderStatusBody"></a>
<markdown src="./model/PoiExtHotelOrderStatusBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiOrderApi_poiExtHotelOrderStatusPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiExtHotelOrderStatusResponse.md" />

<a name="poiOrderStatusPost"></a>
# **poiOrderStatusPost**
<hr/>

## 接口描述
订单状态同步接口
* Scope: &#x60;poi.product&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiOrderStatusBody**](#PoiOrderStatusBody)| 无
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>

<a name="PoiOrderStatusBody"></a>
<markdown src="./model/PoiOrderStatusBody.md" />


## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiOrderApi_poiOrderStatusPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiOrderStatusResponse.md" />


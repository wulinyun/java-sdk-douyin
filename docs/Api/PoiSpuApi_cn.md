<hr/>

# PoiSpuApi
请求绝对路径： *https://open.douyin.com*
<a name="PoiSpuApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**poiSkuSyncPost**](#poiSkuSyncPost) | **POST** /poi/sku/sync/ | SKU同步
[**poiSpuQueryGet**](#poiSpuQueryGet) | **GET** /poi/spu/query/ | 查询SPU
[**poiSpuSyncPost**](#poiSpuSyncPost) | **POST** /poi/spu/sync/ | SPU同步

<a name="poiSkuSyncPost"></a>
# **poiSkuSyncPost**
<hr/>

## 接口描述
SKU同步
* Scope: &#x60;poi.product&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiSkuSyncBody**](#PoiSkuSyncBody)| 无
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>

<a name="PoiSkuSyncBody"></a>
<markdown src="./model/PoiSkuSyncBody.md" />


## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSpuApi_poiSkuSyncPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiSkuSyncResponse.md" />

<a name="poiSpuQueryGet"></a>
# **poiSpuQueryGet**
<hr/>

## 接口描述
查询SPU
* Scope: &#x60;poi.product&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。
 **spuExtId** | **String**| 无

## 请求体
<hr/>




## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSpuApi_poiSpuQueryGet.code">

## 响应体
<hr/>

<markdown src="./model/PoiSpuQueryResponse.md" />

<a name="poiSpuSyncPost"></a>
# **poiSpuSyncPost**
<hr/>

## 接口描述
SPU同步
* Scope: &#x60;poi.product&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiSpuSyncBody**](#PoiSpuSyncBody)| 无
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>

<a name="PoiSpuSyncBody"></a>
<markdown src="./model/PoiSpuSyncBody.md" />


## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSpuApi_poiSpuSyncPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiSpuSyncResponse.md" />


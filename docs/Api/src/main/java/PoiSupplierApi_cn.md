<hr/>

# PoiSupplierApi
请求绝对路径： *https://open.douyin.com*
<a name="PoiSupplierApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**poiQueryGet**](#poiQueryGet) | **GET** /poi/query/ | 获取抖音POI ID
[**poiSupplierQueryGet**](#poiSupplierQueryGet) | **GET** /poi/supplier/query/ | 查询店铺
[**poiSupplierSyncPost**](#poiSupplierSyncPost) | **POST** /poi/supplier/sync/ | 商铺同步

<a name="poiQueryGet"></a>
# **poiQueryGet**
<hr/>

## 接口描述
获取抖音POI ID
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
 **amapId** | **String**| 无

## 请求体
<hr/>




## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSupplierApi_poiQueryGet.code">

## 响应体
<hr/>

<markdown src="./model/PoiQueryResponse.md" />

<a name="poiSupplierQueryGet"></a>
# **poiSupplierQueryGet**
<hr/>

## 接口描述
查询店铺
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
 **supplierExtId** | **String**| 无

## 请求体
<hr/>




## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSupplierApi_poiSupplierQueryGet.code">

## 响应体
<hr/>

<markdown src="./model/PoiSupplierQueryResponse.md" />

<a name="poiSupplierSyncPost"></a>
# **poiSupplierSyncPost**
<hr/>

## 接口描述
商铺同步
* Scope: &#x60;poi.product&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**PoiSupplierSyncBody**](#PoiSupplierSyncBody)| 无
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>

<a name="PoiSupplierSyncBody"></a>
<markdown src="./model/PoiSupplierSyncBody.md" />


## 接口调用样例
<hr/>

<codetabs src="../.codetabs/PoiSupplierApi_poiSupplierSyncPost.code">

## 响应体
<hr/>

<markdown src="./model/PoiSupplierSyncResponse.md" />


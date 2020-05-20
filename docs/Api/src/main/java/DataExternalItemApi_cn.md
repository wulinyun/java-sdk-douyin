<hr/>

# DataExternalItemApi
请求绝对路径： *https://open.douyin.com*
<a name="DataExternalItemApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**dataExternalItemBaseGet**](#dataExternalItemBaseGet) | **GET** /data/external/item/base/ | 获取视频基础数据
[**dataExternalItemCommentGet**](#dataExternalItemCommentGet) | **GET** /data/external/item/comment/ | 获取视频评论数据
[**dataExternalItemLikeGet**](#dataExternalItemLikeGet) | **GET** /data/external/item/like/ | 获取视频点赞数据
[**dataExternalItemPlayGet**](#dataExternalItemPlayGet) | **GET** /data/external/item/play/ | 获取视频播放数据
[**dataExternalItemShareGet**](#dataExternalItemShareGet) | **GET** /data/external/item/share/ | 获取视频分享数据

<a name="dataExternalItemBaseGet"></a>
# **dataExternalItemBaseGet**
<hr/>

## 接口描述
获取视频基础数据
* Scope: &#x60;data.external.item&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalItemApi_dataExternalItemBaseGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalItemBaseResponse.md" />

<a name="dataExternalItemCommentGet"></a>
# **dataExternalItemCommentGet**
<hr/>

## 接口描述
获取视频评论数据
* Scope: &#x60;data.external.item&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>






## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalItemApi_dataExternalItemCommentGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalItemCommentResponse.md" />

<a name="dataExternalItemLikeGet"></a>
# **dataExternalItemLikeGet**
<hr/>

## 接口描述
获取视频点赞数据
* Scope: &#x60;data.external.item&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>






## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalItemApi_dataExternalItemLikeGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalItemLikeResponse.md" />

<a name="dataExternalItemPlayGet"></a>
# **dataExternalItemPlayGet**
<hr/>

## 接口描述
获取视频播放数据
* Scope: &#x60;data.external.item&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>






## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalItemApi_dataExternalItemPlayGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalItemPlayResponse.md" />

<a name="dataExternalItemShareGet"></a>
# **dataExternalItemShareGet**
<hr/>

## 接口描述
获取视频分享数据
* Scope: &#x60;data.external.item&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>






## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalItemApi_dataExternalItemShareGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalItemShareResponse.md" />


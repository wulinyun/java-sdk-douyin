<hr/>

# ShareIdApi
请求绝对路径： *https://open.douyin.com*
<a name="ShareIdApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**shareIdGet**](#shareIdGet) | **GET** /share-id/ | 获取share-id

<a name="shareIdGet"></a>
# **shareIdGet**
<hr/>

## 接口描述
获取share-id
* Scope: &#x60;aweme.share&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。
 **needCallback** | **Boolean**| 无
 **sourceStyleId** | **String**| 多来源样式id（暂未开放）
 **defaultHashtag** | **String**| 追踪分享默认hashtag
 **linkParam** | **String**| 分享来源url附加参数（暂未开放）

## 请求体
<hr/>







## 接口调用样例
<hr/>

<codetabs src="../.codetabs/ShareIdApi_shareIdGet.code">

## 响应体
<hr/>

<markdown src="./model/ShareidResponse.md" />


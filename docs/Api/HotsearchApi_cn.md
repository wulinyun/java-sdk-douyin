<hr/>

# HotsearchApi
请求绝对路径： *https://open.douyin.com*
<a name="HotsearchApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**hotsearchSentencesGet**](#hotsearchSentencesGet) | **GET** /hotsearch/sentences/ | 获取实时热点词
[**hotsearchVideosGet**](#hotsearchVideosGet) | **GET** /hotsearch/videos/ | 获取热点词聚合的视频

<a name="hotsearchSentencesGet"></a>
# **hotsearchSentencesGet**
<hr/>

## 接口描述
获取实时热点词
* Scope: &#x60;hotsearch&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>



## 接口调用样例
<hr/>

<codetabs src="../.codetabs/HotsearchApi_hotsearchSentencesGet.code">

## 响应体
<hr/>

<markdown src="./model/HotsearchSentencesResponse.md" />

<a name="hotsearchVideosGet"></a>
# **hotsearchVideosGet**
<hr/>

## 接口描述
获取热点词聚合的视频
* Scope: &#x60;hotsearch&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。
 **hotSentence** | **String**| 热点词

## 请求体
<hr/>




## 接口调用样例
<hr/>

<codetabs src="../.codetabs/HotsearchApi_hotsearchVideosGet.code">

## 响应体
<hr/>

<markdown src="./model/HotsearchVideosResponse.md" />


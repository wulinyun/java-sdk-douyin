<hr/>

# HotsearchApi
请求绝对路径： *https://open.douyin.com*
<a name="HotsearchApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**hotsearchSentencesGet**](#hotsearchSentencesGet) | **GET** /hotsearch/sentences/ | 获取实时热点词
[**hotsearchTrendingSentencesGet**](#hotsearchTrendingSentencesGet) | **GET** /hotsearch/trending/sentences/ | 获取上升词
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

<a name="hotsearchTrendingSentencesGet"></a>
# **hotsearchTrendingSentencesGet**
<hr/>

## 接口描述
获取上升词
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
 **count** | **Integer**| 每页数量
 **cursor** | **Long**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/HotsearchApi_hotsearchTrendingSentencesGet.code">

## 响应体
<hr/>

<markdown src="./model/HotsearchTrendingSentencesResponse.md" />

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


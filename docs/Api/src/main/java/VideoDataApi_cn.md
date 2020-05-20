<hr/>

# VideoDataApi
请求绝对路径： *https://open.douyin.com*
<a name="VideoDataApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**videoDataPost**](#videoDataPost) | **POST** /video/data/ | 批量获取视频数据信息

<a name="videoDataPost"></a>
# **videoDataPost**
<hr/>

## 接口描述
批量获取视频数据信息
* Scope: &#x60;video.data&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**VideoDataBody**](#VideoDataBody)| 无
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。

## 请求体
<hr/>

<a name="VideoDataBody"></a>
<markdown src="./model/VideoDataBody.md" />



## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoDataApi_videoDataPost.code">

## 响应体
<hr/>

<markdown src="./model/VideoDataResponse.md" />


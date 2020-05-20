<hr/>

# VideoDeleteApi
请求绝对路径： *https://open.douyin.com*
<a name="VideoDeleteApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**videoDeletePost**](#videoDeletePost) | **POST** /video/delete/ | 删除授权用户发布的视频

<a name="videoDeletePost"></a>
# **videoDeletePost**
<hr/>

## 接口描述
删除授权用户发布的视频
* Scope: &#x60;video.delete&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。
 **body** | [**VideoDeleteBody**](#VideoDeleteBody)| 无

## 请求体
<hr/>



<a name="VideoDeleteBody"></a>
<markdown src="./model/VideoDeleteBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoDeleteApi_videoDeletePost.code">

## 响应体
<hr/>

<markdown src="./model/VideoDeleteResponse.md" />


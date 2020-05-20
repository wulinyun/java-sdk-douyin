<hr/>

# ToutiaoVideoDataApi
请求绝对路径： *https://open.snssdk.com*
<a name="ToutiaoVideoDataApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**toutiaoVideoDataPost**](#toutiaoVideoDataPost) | **POST** /toutiao/video/data/ | 批量获取视频数据信息

<a name="toutiaoVideoDataPost"></a>
# **toutiaoVideoDataPost**
<hr/>

## 接口描述
批量获取视频数据信息
* Scope: &#x60;toutiao.video.data&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**ToutiaoVideoDataBody**](#ToutiaoVideoDataBody)| 无
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。

## 请求体
<hr/>

<a name="ToutiaoVideoDataBody"></a>
<markdown src="./model/ToutiaoVideoDataBody.md" />



## 接口调用样例
<hr/>

<codetabs src="../.codetabs/ToutiaoVideoDataApi_toutiaoVideoDataPost.code">

## 响应体
<hr/>

<markdown src="./model/ToutiaoVideoDataResponse.md" />


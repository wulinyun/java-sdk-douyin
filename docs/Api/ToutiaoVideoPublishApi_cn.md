<hr/>

# ToutiaoVideoPublishApi
请求绝对路径： *https://open.snssdk.com*
<a name="ToutiaoVideoPublishApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**toutiaoVideoCreatePost**](#toutiaoVideoCreatePost) | **POST** /toutiao/video/create/ | 创建头条视频  注意：重复的video_id不会生成新的视频
[**toutiaoVideoUploadPost**](#toutiaoVideoUploadPost) | **POST** /toutiao/video/upload/ | 上传视频到文件服务器

<a name="toutiaoVideoCreatePost"></a>
# **toutiaoVideoCreatePost**
<hr/>

## 接口描述
创建头条视频  注意：重复的video_id不会生成新的视频
* Scope: &#x60;toutiao.video.create&#x60; 
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
 **body** | [**ToutiaoVideoCreateBody**](#ToutiaoVideoCreateBody)| 无

## 请求体
<hr/>



<a name="ToutiaoVideoCreateBody"></a>
<markdown src="./model/ToutiaoVideoCreateBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/ToutiaoVideoPublishApi_toutiaoVideoCreatePost.code">

## 响应体
<hr/>

<markdown src="./model/ToutiaoVideoCreateResponse.md" />

<a name="toutiaoVideoUploadPost"></a>
# **toutiaoVideoUploadPost**
<hr/>

## 接口描述
上传视频到文件服务器
* Scope: &#x60;toutiao.video.create&#x60; 
## 请求头
<hr/>

- **Content-Type**: multipart/form-data
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **video** | **File**| 无
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/ToutiaoVideoPublishApi_toutiaoVideoUploadPost.code">

## 响应体
<hr/>

<markdown src="./model/ToutiaoVideoUploadResponse.md" />


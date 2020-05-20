<hr/>

# VideoPublishApi
请求绝对路径： *https://open.douyin.com*
<a name="VideoPublishApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**videoCreatePost**](#videoCreatePost) | **POST** /video/create/ | 创建抖音视频
[**videoPartCompletePost**](#videoPartCompletePost) | **POST** /video/part/complete/ | 完成上传
[**videoPartInitPost**](#videoPartInitPost) | **POST** /video/part/init/ | 初始化上传
[**videoPartUploadPost**](#videoPartUploadPost) | **POST** /video/part/upload/ | 上传视频分片到文件服务器
[**videoUploadPost**](#videoUploadPost) | **POST** /video/upload/ | 上传视频到文件服务器

<a name="videoCreatePost"></a>
# **videoCreatePost**
<hr/>

## 接口描述
创建抖音视频
* Scope: &#x60;video.create&#x60; 
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
 **body** | [**VideoCreateBody**](#VideoCreateBody)| 无

## 请求体
<hr/>



<a name="VideoCreateBody"></a>
<markdown src="./model/VideoCreateBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoPublishApi_videoCreatePost.code">

## 响应体
<hr/>

<markdown src="./model/VideoCreateResponse.md" />

<a name="videoPartCompletePost"></a>
# **videoPartCompletePost**
<hr/>

## 接口描述
完成上传
* Scope: &#x60;video.create&#x60; 
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
 **uploadId** | **String**| 分片上传的标记。有限时间为2小时。

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoPublishApi_videoPartCompletePost.code">

## 响应体
<hr/>

<markdown src="./model/VideoPartCompleteResponse.md" />

<a name="videoPartInitPost"></a>
# **videoPartInitPost**
<hr/>

## 接口描述
初始化上传
* Scope: &#x60;video.create&#x60; 
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

## 请求体
<hr/>




## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoPublishApi_videoPartInitPost.code">

## 响应体
<hr/>

<markdown src="./model/VideoPartInitResponse.md" />

<a name="videoPartUploadPost"></a>
# **videoPartUploadPost**
<hr/>

## 接口描述
上传视频分片到文件服务器
* Scope: &#x60;video.create&#x60; 
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
 **uploadId** | **String**| 分片上传的标记。有限时间为2小时。
 **partNumber** | **Integer**| 第几个分片，从1开始 

## 请求体
<hr/>







## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoPublishApi_videoPartUploadPost.code">

## 响应体
<hr/>

<markdown src="./model/VideoPartUploadResponse.md" />

<a name="videoUploadPost"></a>
# **videoUploadPost**
<hr/>

## 接口描述
上传视频到文件服务器
* Scope: &#x60;video.create&#x60; 
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

<codetabs src="../.codetabs/VideoPublishApi_videoUploadPost.code">

## 响应体
<hr/>

<markdown src="./model/VideoUploadResponse.md" />


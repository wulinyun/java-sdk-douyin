<hr/>

# MediaUploadApi
请求绝对路径： *https://open.douyin.com*
<a name="MediaUploadApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**mediaUploadPost**](#mediaUploadPost) | **POST** /media/upload/ | 上传素材

<a name="mediaUploadPost"></a>
# **mediaUploadPost**
<hr/>

## 接口描述
上传素材
* Scope: &#x60;im&#x60; 
## 请求头
<hr/>

- **Content-Type**: multipart/form-data
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。
 **media** | **File**| 无

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/MediaUploadApi_mediaUploadPost.code">

## 响应体
<hr/>

<markdown src="./model/MediaUploadResponse.md" />


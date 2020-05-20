<hr/>

# ImageApi
请求绝对路径： *https://open.douyin.com*
<a name="ImageApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**imageCreatePost**](#imageCreatePost) | **POST** /image/create/ | 发布图片
[**imageUploadPost**](#imageUploadPost) | **POST** /image/upload/ | 上传图片到文件服务器

<a name="imageCreatePost"></a>
# **imageCreatePost**
<hr/>

## 接口描述
发布图片
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
 **body** | [**ImageCreateBody**](#ImageCreateBody)| 无

## 请求体
<hr/>



<a name="ImageCreateBody"></a>
<markdown src="./model/ImageCreateBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/ImageApi_imageCreatePost.code">

## 响应体
<hr/>

<markdown src="./model/ImageCreateResponse.md" />

<a name="imageUploadPost"></a>
# **imageUploadPost**
<hr/>

## 接口描述
上传图片到文件服务器
* Scope: &#x60;video.create&#x60; 
## 请求头
<hr/>

- **Content-Type**: multipart/form-data
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **image** | **File**| 无
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/ImageApi_imageUploadPost.code">

## 响应体
<hr/>

<markdown src="./model/ImageUploadResponse.md" />


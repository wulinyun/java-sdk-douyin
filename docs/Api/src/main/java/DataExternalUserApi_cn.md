<hr/>

# DataExternalUserApi
请求绝对路径： *https://open.douyin.com*
<a name="DataExternalUserApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**dataExternalUserCommentGet**](#dataExternalUserCommentGet) | **GET** /data/external/user/comment/ | 获取用户评论数
[**dataExternalUserFansGet**](#dataExternalUserFansGet) | **GET** /data/external/user/fans/ | 获取用户粉丝数
[**dataExternalUserItemGet**](#dataExternalUserItemGet) | **GET** /data/external/user/item/ | 获取用户视频情况
[**dataExternalUserLikeGet**](#dataExternalUserLikeGet) | **GET** /data/external/user/like/ | 获取用户点赞数
[**dataExternalUserProfileGet**](#dataExternalUserProfileGet) | **GET** /data/external/user/profile/ | 获取用户主页访问数
[**dataExternalUserShareGet**](#dataExternalUserShareGet) | **GET** /data/external/user/share/ | 获取用户分享数

<a name="dataExternalUserCommentGet"></a>
# **dataExternalUserCommentGet**
<hr/>

## 接口描述
获取用户评论数
* Scope: &#x60;data.external.user&#x60; 
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
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalUserApi_dataExternalUserCommentGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalUserCommentResponse.md" />

<a name="dataExternalUserFansGet"></a>
# **dataExternalUserFansGet**
<hr/>

## 接口描述
获取用户粉丝数
* Scope: &#x60;data.external.user&#x60; 
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
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalUserApi_dataExternalUserFansGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalUserFansResponse.md" />

<a name="dataExternalUserItemGet"></a>
# **dataExternalUserItemGet**
<hr/>

## 接口描述
获取用户视频情况
* Scope: &#x60;data.external.user&#x60; 
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
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalUserApi_dataExternalUserItemGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalUserItemResponse.md" />

<a name="dataExternalUserLikeGet"></a>
# **dataExternalUserLikeGet**
<hr/>

## 接口描述
获取用户点赞数
* Scope: &#x60;data.external.user&#x60; 
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
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalUserApi_dataExternalUserLikeGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalUserLikeResponse.md" />

<a name="dataExternalUserProfileGet"></a>
# **dataExternalUserProfileGet**
<hr/>

## 接口描述
获取用户主页访问数
* Scope: &#x60;data.external.user&#x60; 
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
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalUserApi_dataExternalUserProfileGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalUserProfileResponse.md" />

<a name="dataExternalUserShareGet"></a>
# **dataExternalUserShareGet**
<hr/>

## 接口描述
获取用户分享数
* Scope: &#x60;data.external.user&#x60; 
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
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DataExternalUserApi_dataExternalUserShareGet.code">

## 响应体
<hr/>

<markdown src="./model/DataExternalUserShareResponse.md" />


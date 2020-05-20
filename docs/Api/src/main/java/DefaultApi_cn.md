<hr/>

# DefaultApi
请求绝对路径： *https://open.snssdk.com*
<a name="DefaultApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**oauthAccessTokenGet**](#oauthAccessTokenGet) | **GET** /oauth/access_token/ | 获取access_token
[**oauthAuthorizeGet**](#oauthAuthorizeGet) | **GET** /oauth/authorize/ | 获取授权码(code)
[**oauthClientTokenGet**](#oauthClientTokenGet) | **GET** /oauth/client_token/ | 生成client_token
[**oauthRefreshTokenGet**](#oauthRefreshTokenGet) | **GET** /oauth/refresh_token/ | 刷新access_token

<a name="oauthAccessTokenGet"></a>
# **oauthAccessTokenGet**
<hr/>

## 接口描述
获取access_token
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **clientKey** | **String**| 应用唯一标识
 **clientSecret** | **String**| 应用唯一标识对应的密钥
 **code** | **String**| 授权码
 **grantType** | **String**| 无

## 请求体
<hr/>






## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DefaultApi_oauthAccessTokenGet.code">

## 响应体
<hr/>

<markdown src="./model/OauthAccessTokenResponse.md" />

<a name="oauthAuthorizeGet"></a>
# **oauthAuthorizeGet**
<hr/>

## 接口描述
获取授权码(code)
注意该URL不是用来请求的, 需要展示给用户用于扫码。  在抖音APP支持端内唤醒的版本内打开的话会弹出客户端原生授权页面。  使用本接口前提:    1. 首先你需要去官网申请，使你的应用可以使用特定的Scope，具体需要哪些Scope，请查看各接口定义。    2. 其次你需要在本URL的scope字段中填上用户需要授权给你的Scope。    3. 用户授权通过后，你才可以调用相应的接口。 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: Not defined

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **clientKey** | **String**| 应用唯一标识
 **responseType** | **String**| 填写code
 **scope** | **String**| 应用授权作用域,多个授权作用域以英文逗号（,）分隔
 **redirectUri** | **String**| 授权成功后的回调地址，必须以http/https开头。
 **state** | **String**| 用于保持请求和回调的状态

## 请求体
<hr/>







## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DefaultApi_oauthAuthorizeGet.code">

## 响应体
<hr/>

(empty response body)

<a name="oauthClientTokenGet"></a>
# **oauthClientTokenGet**
<hr/>

## 接口描述
生成client_token
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **clientKey** | **String**| 应用唯一标识
 **clientSecret** | **String**| 应用唯一标识对应的密钥
 **grantType** | **String**| 无

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DefaultApi_oauthClientTokenGet.code">

## 响应体
<hr/>

<markdown src="./model/OauthClientTokenResponse.md" />

<a name="oauthRefreshTokenGet"></a>
# **oauthRefreshTokenGet**
<hr/>

## 接口描述
刷新access_token
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **clientKey** | **String**| 应用唯一标识
 **grantType** | **String**| 填refresh_token
 **refreshToken** | **String**| 填写通过access_token获取到的refresh_token参数

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DefaultApi_oauthRefreshTokenGet.code">

## 响应体
<hr/>

<markdown src="./model/OauthRefreshTokenResponse.md" />


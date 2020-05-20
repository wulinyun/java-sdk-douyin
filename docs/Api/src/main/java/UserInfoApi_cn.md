<hr/>

# UserInfoApi
请求绝对路径： *https://open.douyin.com*
<a name="UserInfoApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**oauthUserinfoGet**](#oauthUserinfoGet) | **GET** /oauth/userinfo/ | 获取用户信息

<a name="oauthUserinfoGet"></a>
# **oauthUserinfoGet**
<hr/>

## 接口描述
获取用户信息
* Scope: &#x60;user_info&#x60; 
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 无
 **openId** | **String**| 无

## 请求体
<hr/>




## 接口调用样例
<hr/>

<codetabs src="../.codetabs/UserInfoApi_oauthUserinfoGet.code">

## 响应体
<hr/>

<markdown src="./model/OauthUserinfoResponse.md" />


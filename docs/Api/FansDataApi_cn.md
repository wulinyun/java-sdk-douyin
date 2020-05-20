<hr/>

# FansDataApi
请求绝对路径： *https://open.douyin.com*
<a name="FansDataApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**fansDataGet**](#fansDataGet) | **GET** /fans/data/ | 获取用户粉丝数据

<a name="fansDataGet"></a>
# **fansDataGet**
<hr/>

## 接口描述
获取用户粉丝数据
* Scope: &#x60;fans.data&#x60; 
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

<codetabs src="../.codetabs/FansDataApi_fansDataGet.code">

## 响应体
<hr/>

<markdown src="./model/FansDataResponse.md" />


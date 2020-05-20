<hr/>

# ImApi
请求绝对路径： *https://www.douyin.com*
<a name="ImApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**imMessageSendPost**](#imMessageSendPost) | **POST** /im/message/send/ | 给抖音用户发送消息

<a name="imMessageSendPost"></a>
# **imMessageSendPost**
<hr/>

## 接口描述
给抖音用户发送消息
* Scope: &#x60;im&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**ImMessageSendBody**](#ImMessageSendBody)| 无
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。

## 请求体
<hr/>

<a name="ImMessageSendBody"></a>
<markdown src="./model/ImMessageSendBody.md" />



## 接口调用样例
<hr/>

<codetabs src="../.codetabs/ImApi_imMessageSendPost.code">

## 响应体
<hr/>

<markdown src="./model/ImMessageSendResponse.md" />


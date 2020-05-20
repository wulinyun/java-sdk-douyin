<hr/>

# SandboxApi
请求绝对路径： *https://open.douyin.com*
<a name="SandboxApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**sandboxWebhookEventSendPost**](#sandboxWebhookEventSendPost) | **POST** /sandbox/webhook/event/send/ | 模拟webhook事件

<a name="sandboxWebhookEventSendPost"></a>
# **sandboxWebhookEventSendPost**
<hr/>

## 接口描述
模拟webhook事件
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **body** | [**SandboxWebhookEventSendBody**](#SandboxWebhookEventSendBody)| 无
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>

<a name="SandboxWebhookEventSendBody"></a>
<markdown src="./model/SandboxWebhookEventSendBody.md" />


## 接口调用样例
<hr/>

<codetabs src="../.codetabs/SandboxApi_sandboxWebhookEventSendPost.code">

## 响应体
<hr/>

<markdown src="./model/CommonResponse.md" />


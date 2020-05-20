<hr/>

# EventStatusApi
请求绝对路径： *https://open.douyin.com*
<a name="EventStatusApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**eventStatusListGet**](#eventStatusListGet) | **GET** /event/status/list/ | 获取事件订阅状态
[**eventStatusUpdatePost**](#eventStatusUpdatePost) | **POST** /event/status/update/ | 更新应用推送事件订阅状态

<a name="eventStatusListGet"></a>
# **eventStatusListGet**
<hr/>

## 接口描述
获取事件订阅状态
## 请求头
<hr/>

- **Content-Type**: Not defined
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。

## 请求体
<hr/>



## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EventStatusApi_eventStatusListGet.code">

## 响应体
<hr/>

<markdown src="./model/EventStatusListResponse.md" />

<a name="eventStatusUpdatePost"></a>
# **eventStatusUpdatePost**
<hr/>

## 接口描述
更新应用推送事件订阅状态
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。
 **body** | [**EventStatusUpdateBody**](#EventStatusUpdateBody)| 无

## 请求体
<hr/>


<a name="EventStatusUpdateBody"></a>
<markdown src="./model/EventStatusUpdateBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EventStatusApi_eventStatusUpdatePost.code">

## 响应体
<hr/>

<markdown src="./model/EventStatusUpdateResponse.md" />


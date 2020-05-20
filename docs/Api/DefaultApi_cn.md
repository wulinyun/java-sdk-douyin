<hr/>

# DefaultApi
请求绝对路径： *https://open.douyin.com*
<a name="DefaultApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**devtoolMonitorCallPost**](#devtoolMonitorCallPost) | **POST** /devtool/monitor/call/ | 获取接口调用监控情况

<a name="devtoolMonitorCallPost"></a>
# **devtoolMonitorCallPost**
<hr/>

## 接口描述
获取接口调用监控情况
* Scope: &#x60;devtool&#x60; 
## 请求头
<hr/>

- **Content-Type**: application/json
- **Accept**: application/json

## 请求参数
<hr/>


Name | Type | Description
------------- | ------------- | ------------- 
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。
 **timeType** | **String**| 时间类型
 **beginTime** | **String**| 开始日期(20190101)
 **endTime** | **String**| 结束日期(20190101)
 **body** | [**DevtoolMonitorCallBody**](#DevtoolMonitorCallBody)| 无

## 请求体
<hr/>





<a name="DevtoolMonitorCallBody"></a>
<markdown src="./model/DevtoolMonitorCallBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/DefaultApi_devtoolMonitorCallPost.code">

## 响应体
<hr/>

<markdown src="./model/DevtoolMonitorCallResponse.md" />


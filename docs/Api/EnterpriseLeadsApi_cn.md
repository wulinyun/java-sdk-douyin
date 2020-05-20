<hr/>

# EnterpriseLeadsApi
请求绝对路径： *https://open.douyin.com*
<a name="EnterpriseLeadsApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**enterpriseLeadsTagCreatePost**](#enterpriseLeadsTagCreatePost) | **POST** /enterprise/leads/tag/create/ | 创建标签
[**enterpriseLeadsTagDeletePost**](#enterpriseLeadsTagDeletePost) | **POST** /enterprise/leads/tag/delete/ | 删除标签
[**enterpriseLeadsTagListGet**](#enterpriseLeadsTagListGet) | **GET** /enterprise/leads/tag/list/ | 获取标签列表
[**enterpriseLeadsTagUpdatePost**](#enterpriseLeadsTagUpdatePost) | **POST** /enterprise/leads/tag/update/ | 编辑标签
[**enterpriseLeadsTagUserListGet**](#enterpriseLeadsTagUserListGet) | **GET** /enterprise/leads/tag/user/list/ | 获取打标签的用户列表
[**enterpriseLeadsTagUserUpdatePost**](#enterpriseLeadsTagUserUpdatePost) | **POST** /enterprise/leads/tag/user/update/ | 给用户设置标签
[**enterpriseLeadsUserActionListGet**](#enterpriseLeadsUserActionListGet) | **GET** /enterprise/leads/user/action/list/ | 获取意向用户互动记录
[**enterpriseLeadsUserDetailGet**](#enterpriseLeadsUserDetailGet) | **GET** /enterprise/leads/user/detail/ | 获取意向用户详情
[**enterpriseLeadsUserListGet**](#enterpriseLeadsUserListGet) | **GET** /enterprise/leads/user/list/ | 获取意向用户列表

<a name="enterpriseLeadsTagCreatePost"></a>
# **enterpriseLeadsTagCreatePost**
<hr/>

## 接口描述
创建标签
* Scope: &#x60;enterprise.data&#x60; * 一个企业号最多创建100个标签 
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
 **body** | [**EnterpriseLeadsTagCreateBody**](#EnterpriseLeadsTagCreateBody)| 无

## 请求体
<hr/>



<a name="EnterpriseLeadsTagCreateBody"></a>
<markdown src="./model/EnterpriseLeadsTagCreateBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsTagCreatePost.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsTagCreateResponse.md" />

<a name="enterpriseLeadsTagDeletePost"></a>
# **enterpriseLeadsTagDeletePost**
<hr/>

## 接口描述
删除标签
* Scope: &#x60;enterprise.data&#x60; 
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
 **body** | [**EnterpriseLeadsTagDeleteBody**](#EnterpriseLeadsTagDeleteBody)| 无

## 请求体
<hr/>



<a name="EnterpriseLeadsTagDeleteBody"></a>
<markdown src="./model/EnterpriseLeadsTagDeleteBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsTagDeletePost.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsTagDeleteResponse.md" />

<a name="enterpriseLeadsTagListGet"></a>
# **enterpriseLeadsTagListGet**
<hr/>

## 接口描述
获取标签列表
* Scope: &#x60;enterprise.data&#x60; 
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
 **count** | **Integer**| 每页数量
 **cursor** | **Integer**| 分页游标

## 请求体
<hr/>






## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsTagListGet.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsTagListResponse.md" />

<a name="enterpriseLeadsTagUpdatePost"></a>
# **enterpriseLeadsTagUpdatePost**
<hr/>

## 接口描述
编辑标签
* Scope: &#x60;enterprise.data&#x60; 
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
 **body** | [**EnterpriseLeadsTagUpdateBody**](#EnterpriseLeadsTagUpdateBody)| 无

## 请求体
<hr/>



<a name="EnterpriseLeadsTagUpdateBody"></a>
<markdown src="./model/EnterpriseLeadsTagUpdateBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsTagUpdatePost.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsTagCreateResponse.md" />

<a name="enterpriseLeadsTagUserListGet"></a>
# **enterpriseLeadsTagUserListGet**
<hr/>

## 接口描述
获取打标签的用户列表
* Scope: &#x60;enterprise.data&#x60; 
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
 **count** | **Integer**| 每页数量
 **tagId** | **Integer**| 无
 **cursor** | **Integer**| 分页游标

## 请求体
<hr/>







## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsTagUserListGet.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsTagUserListResponse.md" />

<a name="enterpriseLeadsTagUserUpdatePost"></a>
# **enterpriseLeadsTagUserUpdatePost**
<hr/>

## 接口描述
给用户设置标签
* Scope: &#x60;enterprise.data&#x60; * 一个用户最多设置5个标签 
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
 **body** | [**EnterpriseLeadsTagUserUpdateBody**](#EnterpriseLeadsTagUserUpdateBody)| 无

## 请求体
<hr/>



<a name="EnterpriseLeadsTagUserUpdateBody"></a>
<markdown src="./model/EnterpriseLeadsTagUserUpdateBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsTagUserUpdatePost.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsTagDeleteResponse.md" />

<a name="enterpriseLeadsUserActionListGet"></a>
# **enterpriseLeadsUserActionListGet**
<hr/>

## 接口描述
获取意向用户互动记录
* Scope: &#x60;enterprise.data&#x60; 
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
 **count** | **Integer**| 每页数量
 **userId** | **String**| 无
 **cursor** | **String**| 无
 **actionType** | **Integer**| 无

## 请求体
<hr/>








## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsUserActionListGet.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsUserActionListResponse.md" />

<a name="enterpriseLeadsUserDetailGet"></a>
# **enterpriseLeadsUserDetailGet**
<hr/>

## 接口描述
获取意向用户详情
* Scope: &#x60;enterprise.data&#x60; 
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
 **userId** | **String**| 无

## 请求体
<hr/>





## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsUserDetailGet.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsUserDetailResponse.md" />

<a name="enterpriseLeadsUserListGet"></a>
# **enterpriseLeadsUserListGet**
<hr/>

## 接口描述
获取意向用户列表
* Scope: &#x60;enterprise.data&#x60; 
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
 **count** | **Integer**| 每页数量
 **startTime** | **Integer**| 无
 **endTime** | **Integer**| 无
 **actionType** | **Integer**| 分类:   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动 
 **cursor** | **Integer**| 分页游标
 **leadsLevel** | **Integer**| 用户状态:   * &#x60;-1&#x60; - 没兴趣   * &#x60;0&#x60; - 了解   * &#x60;1&#x60; - 有兴趣   * &#x60;2&#x60; - 有意愿   * &#x60;10&#x60; - 已转化 

## 请求体
<hr/>










## 接口调用样例
<hr/>

<codetabs src="../.codetabs/EnterpriseLeadsApi_enterpriseLeadsUserListGet.code">

## 响应体
<hr/>

<markdown src="./model/EnterpriseLeadsUserListResponse.md" />


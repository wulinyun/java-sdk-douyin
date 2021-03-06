<hr/>

# FollowingListApi
请求绝对路径： *https://www.douyin.com*
<a name="FollowingListApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**followingListGet**](#followingListGet) | **GET** /following/list/ | 获取关注列表

<a name="followingListGet"></a>
# **followingListGet**
<hr/>

## 接口描述
获取关注列表
* Scope: &#x60;following.list&#x60; 
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
 **cursor** | **Long**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。

## 请求体
<hr/>






## 接口调用样例
<hr/>

<codetabs src="../.codetabs/FollowingListApi_followingListGet.code">

## 响应体
<hr/>

<markdown src="./model/FollowingListResponse.md" />


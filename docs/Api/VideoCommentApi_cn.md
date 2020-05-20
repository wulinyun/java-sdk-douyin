<hr/>

# VideoCommentApi
请求绝对路径： *https://open.douyin.com*
<a name="VideoCommentApi_doc_start"></a>

方法 | 请求 | 描述
------------- | ------------- | -------------
[**videoCommentListGet**](#videoCommentListGet) | **GET** /video/comment/list/ | 评论列表
[**videoCommentReplyListGet**](#videoCommentReplyListGet) | **GET** /video/comment/reply/list/ | 评论回复列表
[**videoCommentReplyPost**](#videoCommentReplyPost) | **POST** /video/comment/reply/ | 回复视频评论
[**videoCommentTopPost**](#videoCommentTopPost) | **POST** /video/comment/top/ | 置顶视频评论(企业号)

<a name="videoCommentListGet"></a>
# **videoCommentListGet**
<hr/>

## 接口描述
评论列表
* Scope: &#x60;video.comment&#x60; 
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
 **itemId** | **String**| 视频id
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。

## 请求体
<hr/>







## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoCommentApi_videoCommentListGet.code">

## 响应体
<hr/>

<markdown src="./model/VideoCommentListResponse.md" />

<a name="videoCommentReplyListGet"></a>
# **videoCommentReplyListGet**
<hr/>

## 接口描述
评论回复列表
* Scope: &#x60;video.comment&#x60; 
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
 **itemId** | **String**| 视频id
 **commentId** | **String**| 评论id
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。

## 请求体
<hr/>








## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoCommentApi_videoCommentReplyListGet.code">

## 响应体
<hr/>

<markdown src="./model/VideoCommentListResponse.md" />

<a name="videoCommentReplyPost"></a>
# **videoCommentReplyPost**
<hr/>

## 接口描述
回复视频评论
* Scope: &#x60;video.comment&#x60; 
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
 **body** | [**VideoCommentReplyBody**](#VideoCommentReplyBody)| 无

## 请求体
<hr/>



<a name="VideoCommentReplyBody"></a>
<markdown src="./model/VideoCommentReplyBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoCommentApi_videoCommentReplyPost.code">

## 响应体
<hr/>

<markdown src="./model/CommonResponse.md" />

<a name="videoCommentTopPost"></a>
# **videoCommentTopPost**
<hr/>

## 接口描述
置顶视频评论(企业号)
* Scope: &#x60;video.comment&#x60; 
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
 **body** | [**VideoCommentTopBody**](#VideoCommentTopBody)| 无

## 请求体
<hr/>



<a name="VideoCommentTopBody"></a>
<markdown src="./model/VideoCommentTopBody.md" />

## 接口调用样例
<hr/>

<codetabs src="../.codetabs/VideoCommentApi_videoCommentTopPost.code">

## 响应体
<hr/>

<markdown src="./model/CommonResponse.md" />


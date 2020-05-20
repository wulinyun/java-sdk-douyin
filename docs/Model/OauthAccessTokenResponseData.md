<a name="OauthAccessTokenResponseData"></a>
## OauthAccessTokenResponseData
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**errorCode** | **Integer** |  |  optional
**description** | **String** |  |  optional
**accessToken** | **String** | 接口调用凭证 |  optional
**expiresIn** | **String** | access_token接口调用凭证超时时间，单位（秒 |  optional
**refreshToken** | **String** | 用户刷新access_token |  optional
**openId** | **String** | 授权用户唯一标识 |  optional
**scope** | **String** | 用户授权的作用域(Scope)，使用逗号（,）分隔，开放平台几乎几乎每个接口都需要特定的Scope。  |  optional
**unionid** | **String** | 当且仅当该网站应用已获得该用户的userinfo授权时，才会出现该字段。 |  optional










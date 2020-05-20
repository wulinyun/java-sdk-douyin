<a name="EnterpriseLeadsUserListResponseData"></a>
## EnterpriseLeadsUserListResponseData
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**errorCode** | **Integer** |  |  required 
**description** | **String** |  |  required 
**cursor** | **Long** |  |  required 
**hasMore** | **Boolean** |  |  required 
**list** | **List&lt;String&gt;** | 用户OPENID (见users) |  optional
**users** | [**List&lt;EnterpriseLeadsUserListResponseDataUsers&gt;**](#EnterpriseLeadsUserListResponseDataUsers) |  |  optional






<markdown src="./EnterpriseLeadsUserListResponseDataUsers.md"/>

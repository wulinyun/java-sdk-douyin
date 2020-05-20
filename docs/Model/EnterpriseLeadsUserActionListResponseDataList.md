<a name="EnterpriseLeadsUserActionListResponseDataList"></a>
## EnterpriseLeadsUserActionListResponseDataList
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**actionType** | [**EnumActionType**](#EnumActionType) | 分类   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动  |  required 
**userId** | **String** |  |  required 
**actionSource** | **String** |  |  optional
**actionFlag** | **Integer** |  |  optional
**createTime** | **Integer** |  |  required 

<a name="EnumActionType"></a>
### Enum: EnumActionType
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3







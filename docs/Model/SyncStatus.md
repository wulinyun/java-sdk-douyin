<a name="SyncStatus"></a>
## SyncStatus
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**lastSyncStatus** | [**EnumLastSyncStatus**](#EnumLastSyncStatus) | 最近一次酒店同步状态, 0 - 未处理; 1 - 通过; 2 - 未通过 |  optional
**failReason** | **String** | 同步失败原因，抖音风控政策问题，该字段无法提供太多信息，目前审核不通过联系抖音运营做进一步处理 |  optional

<a name="EnumLastSyncStatus"></a>
### Enum: EnumLastSyncStatus
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2




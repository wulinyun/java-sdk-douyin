<a name="SpuAttributes4101Response"></a>
## SpuAttributes4101Response
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**schemaType** | [**EnumSchemaType**](#EnumSchemaType) | 链接类型 (1:H5，2:抖音小程序，3:原生小程序) |  optional
**url** | **String** | 详情页链接 |  optional
**platformSource** | [**EnumPlatformSource**](#EnumPlatformSource) | 平台来源枚举（16电商小店） |  optional
**platformName** | **String** | 平台名称 |  optional
**isTest** | **Integer** | 主要用于联调，1-使用测试版的小程序，0或者不填-使用正式版小程序 |  optional

<a name="EnumSchemaType"></a>
### Enum: EnumSchemaType
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

<a name="EnumPlatformSource"></a>
### Enum: EnumPlatformSource
Name | Value
---- | -----
NUMBER_16 | 16







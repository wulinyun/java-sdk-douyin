<a name="PoiSupplierSyncServices"></a>
## PoiSupplierSyncServices
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**serviceType** | [**EnumServiceType**](#EnumServiceType) | 服务类型(201-预约点餐服务, 202-预约订位服务, 203-排队取号服务, 9001-门票预订服务, 9101-团购套餐服务, 9102-领优惠劵服务， 9201-在线预约服务) |  optional
**enable** | [**EnumEnable**](#EnumEnable) | 上线状态(1:上线，2:下线) |  optional
**entry** | [**PoiSupplierSyncEntry**](#PoiSupplierSyncEntry) |  |  optional

<a name="EnumServiceType"></a>
### Enum: EnumServiceType
Name | Value
---- | -----
NUMBER_201 | 201
NUMBER_202 | 202
NUMBER_203 | 203
NUMBER_9001 | 9001
NUMBER_9101 | 9101
NUMBER_9102 | 9102
NUMBER_9201 | 9201

<a name="EnumEnable"></a>
### Enum: EnumEnable
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2



<markdown src="./PoiSupplierSyncEntry.md"/>

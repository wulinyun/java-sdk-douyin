<a name="PoiSpuSyncBody"></a>
## PoiSpuSyncBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**supplierExtId** | **String** | 接入方店铺ID |  required 
**spuExtId** | **String** | 接入方SPU ID |  required 
**spuType** | [**EnumSpuType**](#EnumSpuType) | spu类型号，1-酒店民宿房型，90-景区门票，91-团购券 20 电商实体商品 21 电商虚拟商品 |  optional
**status** | [**OnlineStatus**](#OnlineStatus) |  |  required 
**name** | **String** | SPU名称 |  required 
**order** | **Integer** | SPU展示顺序,降序 |  optional
**description** | **String** | SPU描述 |  optional
**attributes** | [**SpuAttributes**](#SpuAttributes) |  |  required 

<a name="EnumSpuType"></a>
### Enum: EnumSpuType
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_20 | 20
NUMBER_21 | 21
NUMBER_90 | 90
NUMBER_91 | 91




<markdown src="./OnlineStatus.md"/>



<markdown src="./SpuAttributes.md"/>

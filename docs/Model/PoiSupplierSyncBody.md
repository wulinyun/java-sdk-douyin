<a name="PoiSupplierSyncBody"></a>
## PoiSupplierSyncBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**supplierExtId** | **String** | 接入方店铺id |  required 
**type** | [**SupplierType**](#SupplierType) |  |  required 
**poiId** | **String** | 抖音poi id, 三方如果使用高德poi id可以通过/poi/query/接口转换，其它三方poi id走poi匹配功能进行抖音poi id获取 |  required 
**status** | [**OnlineStatus**](#OnlineStatus) |  |  required 
**name** | **String** | 店铺名称 |  required 
**images** | **List&lt;String&gt;** | 店铺图片 |  optional
**contactPhone** | **String** | 联系手机号 |  optional
**contactTel** | **String** | 联系座机号 |  optional
**address** | **String** | 店铺地址 |  optional
**description** | **String** | 店铺介绍(&lt;&#x3D;500字) |  optional
**services** | [**List&lt;PoiSupplierSyncServices&gt;**](#PoiSupplierSyncServices) | 店铺提供的服务列表 |  optional
**attributes** | [**SupplierAttributes**](#SupplierAttributes) |  |  required 


<markdown src="./SupplierType.md"/>

<markdown src="./OnlineStatus.md"/>






<markdown src="./PoiSupplierSyncServices.md"/>
<markdown src="./SupplierAttributes.md"/>

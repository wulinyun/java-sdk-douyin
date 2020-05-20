<a name="ImageCreateBody"></a>
## ImageCreateBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**imageId** | **String** | 通过/image/upload/接口得到。 |  required 
**text** | **String** | 标题，可以带话题。 如title1#话题1 #话题2 注意：话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。  |  optional
**poiId** | **String** | 地理位置id |  optional
**poiName** | **String** | 地理位置名称 |  optional
**microAppId** | **String** | 小程序id |  optional
**microAppTitle** | **String** | 小程序标题 |  optional
**microAppUrl** | **String** | 吊起小程序时的参数 |  optional
**atUsers** | **List&lt;String&gt;** | 如果需要at其他用户。将text中@nickname对应的open_id放到这里。 |  optional










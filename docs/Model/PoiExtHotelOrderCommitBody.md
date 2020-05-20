<a name="PoiExtHotelOrderCommitBody"></a>
## PoiExtHotelOrderCommitBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**orderId** | **String** | 抖音订单号 |  required 
**spuExtId** | **String** | 接入方房型ID |  required 
**status** | **Integer** | 订单支付状态。0 - 未支付, 1 - 已支付 |  required 
**reserveAmount** | **Integer** | 预定数量 |  required 
**customerName** | **String** | 预订人姓名 |  required 
**customerPhone** | **String** | 预订人电话 |  required 
**customerList** | [**List&lt;PoiExtHotelOrderCommitResponse&gt;**](#PoiExtHotelOrderCommitResponse) | 入住人列表 |  optional
**checkIn** | **String** | 入住时间 yyyyMMdd |  required 
**checkOut** | **String** | 离店时间 yyyyMMdd |  required 
**totalPrice** | **Integer** | 总价, 单位人民币分 |  required 
**remark** | **String** | 备注 |  optional
**datePrice** | [**List&lt;PoiExtHotelOrderCommitResponse1&gt;**](#PoiExtHotelOrderCommitResponse1) |  |  optional







<markdown src="./PoiExtHotelOrderCommitResponse.md"/>




<markdown src="./PoiExtHotelOrderCommitResponse1.md"/>

<a name="PoiMiniCouponOrderSyncBody"></a>
## PoiMiniCouponOrderSyncBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**appId** | **String** | 小程序的appid |  required 
**userOpenId** | **String** | 用户的抖音小程序openid |  required 
**extUserId** | **String** | 外部用户Id |  optional
**orderType** | [**CouponOrderType**](#CouponOrderType) |  |  required 
**dateTime** | **Integer** | 发送请求的时间，精确到毫秒 |  required 
**orderDetail** | **String** | 订单的细节，不同的订单业务有不同的结构体，请具体询问业务方字段结构，参考$order_groupon_detail(团购) |  required 
**extShopInfo** | [**ExtShopInfo**](#ExtShopInfo) |  |  required 




<markdown src="./CouponOrderType.md"/>


<markdown src="./ExtShopInfo.md"/>

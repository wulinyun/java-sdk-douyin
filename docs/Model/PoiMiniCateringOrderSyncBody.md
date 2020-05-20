<a name="PoiMiniCateringOrderSyncBody"></a>
## PoiMiniCateringOrderSyncBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**appId** | **String** | 小程序的appid |  required 
**userOpenId** | **String** | 用户的抖音小程序openid |  required 
**extUserId** | **String** | 外部用户Id |  optional
**orderType** | [**CateringOrderType**](#CateringOrderType) |  |  required 
**dateTime** | **Integer** | 发送请求的时间，精确到毫秒 |  required 
**orderDetail** | **String** | 订单的细节，不同的订单业务有不同的结构体，请具体询问业务方字段结构，参考 $order_menu_detail,$order_queue_detail, $order_book_detail |  required 
**extShopInfo** | [**ExtShopInfo**](#ExtShopInfo) |  |  required 




<markdown src="./CateringOrderType.md"/>


<markdown src="./ExtShopInfo.md"/>

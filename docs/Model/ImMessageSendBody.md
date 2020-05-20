<a name="ImMessageSendBody"></a>
## ImMessageSendBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**toUserId** | **String** | 发送消息的接收方openid |  required 
**messageType** | [**EnumMessageType**](#EnumMessageType) | 消息内容格式:   * &#x60;text&#x60; - 文本消息   * &#x60;image&#x60; - 图片消息  |  required 
**content** | **String** | 文本内容 或 素材id |  required 

<a name="EnumMessageType"></a>
### Enum: EnumMessageType
Name | Value
---- | -----
TEXT | &quot;text&quot;
IMAGE | &quot;image&quot;





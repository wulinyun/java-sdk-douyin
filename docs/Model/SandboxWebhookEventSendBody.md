<a name="SandboxWebhookEventSendBody"></a>
## SandboxWebhookEventSendBody
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**eventType** | [**EnumEventType**](#EnumEventType) | 需要mock的事件类型, 开放平台会通过webhook发送一条mock数据给你 |  required 

<a name="EnumEventType"></a>
### Enum: EnumEventType
Name | Value
---- | -----
CREATE_VIDEO | &quot;create_video&quot;
AUTHORIZE | &quot;authorize&quot;
RECEIVE_MSG | &quot;receive_msg&quot;
ENTER_IM | &quot;enter_im&quot;
DIAL_PHONE | &quot;dial_phone&quot;
WEBSITE_CONTACT | &quot;website_contact&quot;
PERSONAL_TAB_CONTACT | &quot;personal_tab_contact&quot;
VERIFY_WEBHOOK | &quot;verify_webhook&quot;



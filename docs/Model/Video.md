<a name="Video"></a>
## Video
### 属性
参数名 | 参数类型 | 参数描述 | 备注
------------ | ------------- | ------------- | -------------
**itemId** | **String** | 视频id |  required 
**title** | **String** | 视频标题 |  required 
**cover** | **String** | 视频封面 |  required 
**isTop** | **Boolean** | 是否置顶 |  required 
**createTime** | **Long** | 视频创建时间戳 |  required 
**isReviewed** | **Boolean** | 表示是否审核结束。审核通过或者失败都会返回true，审核中返回false。 |  required 
**shareUrl** | **String** | 视频播放页面。视频播放页可能会失效，请在观看视频前调用/video/data/获取最新的播放页。 |  required 
**statistics** | [**VideoStatistics**](#VideoStatistics) |  |  required 








<markdown src="./VideoStatistics.md"/>

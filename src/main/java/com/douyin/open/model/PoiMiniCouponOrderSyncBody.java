/*
 * 
 *
 * 
 *
 * 本文件由抖音小开生成，请勿手动更改
 */

package com.douyin.open.model;

import java.util.Objects;
import java.util.Arrays;
import com.douyin.open.model.CouponOrderType;
import com.douyin.open.model.ExtShopInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiMiniCouponOrderSyncBody
 */

public class PoiMiniCouponOrderSyncBody {
  @SerializedName("app_id")
  private String appId = null;

  @SerializedName("user_open_id")
  private String userOpenId = null;

  @SerializedName("ext_user_id")
  private String extUserId = null;

  @SerializedName("order_type")
  private CouponOrderType orderType = null;

  @SerializedName("date_time")
  private Integer dateTime = null;

  @SerializedName("order_detail")
  private String orderDetail = null;

  @SerializedName("ext_shop_info")
  private ExtShopInfo extShopInfo = null;

  public PoiMiniCouponOrderSyncBody appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * 小程序的appid
   * @return appId
  **/
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public PoiMiniCouponOrderSyncBody userOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
    return this;
  }

   /**
   * 用户的抖音小程序openid
   * @return userOpenId
  **/
  public String getUserOpenId() {
    return userOpenId;
  }

  public void setUserOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
  }

  public PoiMiniCouponOrderSyncBody extUserId(String extUserId) {
    this.extUserId = extUserId;
    return this;
  }

   /**
   * 外部用户Id
   * @return extUserId
  **/
  public String getExtUserId() {
    return extUserId;
  }

  public void setExtUserId(String extUserId) {
    this.extUserId = extUserId;
  }

  public PoiMiniCouponOrderSyncBody orderType(CouponOrderType orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  public CouponOrderType getOrderType() {
    return orderType;
  }

  public void setOrderType(CouponOrderType orderType) {
    this.orderType = orderType;
  }

  public PoiMiniCouponOrderSyncBody dateTime(Integer dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * 发送请求的时间，精确到毫秒
   * @return dateTime
  **/
  public Integer getDateTime() {
    return dateTime;
  }

  public void setDateTime(Integer dateTime) {
    this.dateTime = dateTime;
  }

  public PoiMiniCouponOrderSyncBody orderDetail(String orderDetail) {
    this.orderDetail = orderDetail;
    return this;
  }

   /**
   * 订单的细节，不同的订单业务有不同的结构体，请具体询问业务方字段结构，参考$order_groupon_detail(团购)
   * @return orderDetail
  **/
  public String getOrderDetail() {
    return orderDetail;
  }

  public void setOrderDetail(String orderDetail) {
    this.orderDetail = orderDetail;
  }

  public PoiMiniCouponOrderSyncBody extShopInfo(ExtShopInfo extShopInfo) {
    this.extShopInfo = extShopInfo;
    return this;
  }

   /**
   * Get extShopInfo
   * @return extShopInfo
  **/
  public ExtShopInfo getExtShopInfo() {
    return extShopInfo;
  }

  public void setExtShopInfo(ExtShopInfo extShopInfo) {
    this.extShopInfo = extShopInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiMiniCouponOrderSyncBody poiMiniCouponOrderSyncBody = (PoiMiniCouponOrderSyncBody) o;
    return Objects.equals(this.appId, poiMiniCouponOrderSyncBody.appId) &&
        Objects.equals(this.userOpenId, poiMiniCouponOrderSyncBody.userOpenId) &&
        Objects.equals(this.extUserId, poiMiniCouponOrderSyncBody.extUserId) &&
        Objects.equals(this.orderType, poiMiniCouponOrderSyncBody.orderType) &&
        Objects.equals(this.dateTime, poiMiniCouponOrderSyncBody.dateTime) &&
        Objects.equals(this.orderDetail, poiMiniCouponOrderSyncBody.orderDetail) &&
        Objects.equals(this.extShopInfo, poiMiniCouponOrderSyncBody.extShopInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userOpenId, extUserId, orderType, dateTime, orderDetail, extShopInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiMiniCouponOrderSyncBody {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userOpenId: ").append(toIndentedString(userOpenId)).append("\n");
    sb.append("    extUserId: ").append(toIndentedString(extUserId)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    orderDetail: ").append(toIndentedString(orderDetail)).append("\n");
    sb.append("    extShopInfo: ").append(toIndentedString(extShopInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

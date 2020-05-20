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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiExtHotelOrderCancelBody
 */

public class PoiExtHotelOrderCancelBody {
  @SerializedName("supplier_ext_id")
  private String supplierExtId = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("order_ext_id")
  private String orderExtId = null;

  @SerializedName("order_status")
  private Integer orderStatus = null;

  public PoiExtHotelOrderCancelBody supplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
    return this;
  }

   /**
   * 接入方商铺ID
   * @return supplierExtId
  **/
  public String getSupplierExtId() {
    return supplierExtId;
  }

  public void setSupplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
  }

  public PoiExtHotelOrderCancelBody orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * 抖音订单号
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PoiExtHotelOrderCancelBody orderExtId(String orderExtId) {
    this.orderExtId = orderExtId;
    return this;
  }

   /**
   * 接入方订单号
   * @return orderExtId
  **/
  public String getOrderExtId() {
    return orderExtId;
  }

  public void setOrderExtId(String orderExtId) {
    this.orderExtId = orderExtId;
  }

  public PoiExtHotelOrderCancelBody orderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiExtHotelOrderCancelBody poiExtHotelOrderCancelBody = (PoiExtHotelOrderCancelBody) o;
    return Objects.equals(this.supplierExtId, poiExtHotelOrderCancelBody.supplierExtId) &&
        Objects.equals(this.orderId, poiExtHotelOrderCancelBody.orderId) &&
        Objects.equals(this.orderExtId, poiExtHotelOrderCancelBody.orderExtId) &&
        Objects.equals(this.orderStatus, poiExtHotelOrderCancelBody.orderStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierExtId, orderId, orderExtId, orderStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelOrderCancelBody {\n");
    
    sb.append("    supplierExtId: ").append(toIndentedString(supplierExtId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderExtId: ").append(toIndentedString(orderExtId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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

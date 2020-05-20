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
 * PoiExtHotelOrderStatusBody
 */

public class PoiExtHotelOrderStatusBody {
  @SerializedName("supplier_ext_id")
  private String supplierExtId = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("order_ext_id")
  private String orderExtId = null;

  @SerializedName("status")
  private Integer status = null;

  public PoiExtHotelOrderStatusBody supplierExtId(String supplierExtId) {
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

  public PoiExtHotelOrderStatusBody orderId(String orderId) {
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

  public PoiExtHotelOrderStatusBody orderExtId(String orderExtId) {
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

  public PoiExtHotelOrderStatusBody status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 支付状态, 1 - 付款成功;
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiExtHotelOrderStatusBody poiExtHotelOrderStatusBody = (PoiExtHotelOrderStatusBody) o;
    return Objects.equals(this.supplierExtId, poiExtHotelOrderStatusBody.supplierExtId) &&
        Objects.equals(this.orderId, poiExtHotelOrderStatusBody.orderId) &&
        Objects.equals(this.orderExtId, poiExtHotelOrderStatusBody.orderExtId) &&
        Objects.equals(this.status, poiExtHotelOrderStatusBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierExtId, orderId, orderExtId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelOrderStatusBody {\n");
    
    sb.append("    supplierExtId: ").append(toIndentedString(supplierExtId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderExtId: ").append(toIndentedString(orderExtId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

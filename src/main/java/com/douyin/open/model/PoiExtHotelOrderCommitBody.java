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
import com.douyin.open.model.PoiExtHotelOrderCommitResponse;
import com.douyin.open.model.PoiExtHotelOrderCommitResponse1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PoiExtHotelOrderCommitBody
 */

public class PoiExtHotelOrderCommitBody {
  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("spu_ext_id")
  private String spuExtId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("reserve_amount")
  private Integer reserveAmount = null;

  @SerializedName("customer_name")
  private String customerName = null;

  @SerializedName("customer_phone")
  private String customerPhone = null;

  @SerializedName("customer_list")
  private List<PoiExtHotelOrderCommitResponse> customerList = null;

  @SerializedName("check_in")
  private String checkIn = null;

  @SerializedName("check_out")
  private String checkOut = null;

  @SerializedName("total_price")
  private Integer totalPrice = null;

  @SerializedName("remark")
  private String remark = null;

  @SerializedName("date_price")
  private List<PoiExtHotelOrderCommitResponse1> datePrice = null;

  public PoiExtHotelOrderCommitBody orderId(String orderId) {
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

  public PoiExtHotelOrderCommitBody spuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
    return this;
  }

   /**
   * 接入方房型ID
   * @return spuExtId
  **/
  public String getSpuExtId() {
    return spuExtId;
  }

  public void setSpuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
  }

  public PoiExtHotelOrderCommitBody status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 订单支付状态。0 - 未支付, 1 - 已支付
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PoiExtHotelOrderCommitBody reserveAmount(Integer reserveAmount) {
    this.reserveAmount = reserveAmount;
    return this;
  }

   /**
   * 预定数量
   * @return reserveAmount
  **/
  public Integer getReserveAmount() {
    return reserveAmount;
  }

  public void setReserveAmount(Integer reserveAmount) {
    this.reserveAmount = reserveAmount;
  }

  public PoiExtHotelOrderCommitBody customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * 预订人姓名
   * @return customerName
  **/
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public PoiExtHotelOrderCommitBody customerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * 预订人电话
   * @return customerPhone
  **/
  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public PoiExtHotelOrderCommitBody customerList(List<PoiExtHotelOrderCommitResponse> customerList) {
    this.customerList = customerList;
    return this;
  }

  public PoiExtHotelOrderCommitBody addCustomerListItem(PoiExtHotelOrderCommitResponse customerListItem) {
    if (this.customerList == null) {
      this.customerList = new ArrayList<PoiExtHotelOrderCommitResponse>();
    }
    this.customerList.add(customerListItem);
    return this;
  }

   /**
   * 入住人列表
   * @return customerList
  **/
  public List<PoiExtHotelOrderCommitResponse> getCustomerList() {
    return customerList;
  }

  public void setCustomerList(List<PoiExtHotelOrderCommitResponse> customerList) {
    this.customerList = customerList;
  }

  public PoiExtHotelOrderCommitBody checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

   /**
   * 入住时间 yyyyMMdd
   * @return checkIn
  **/
  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }

  public PoiExtHotelOrderCommitBody checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

   /**
   * 离店时间 yyyyMMdd
   * @return checkOut
  **/
  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }

  public PoiExtHotelOrderCommitBody totalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * 总价, 单位人民币分
   * @return totalPrice
  **/
  public Integer getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
  }

  public PoiExtHotelOrderCommitBody remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * 备注
   * @return remark
  **/
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public PoiExtHotelOrderCommitBody datePrice(List<PoiExtHotelOrderCommitResponse1> datePrice) {
    this.datePrice = datePrice;
    return this;
  }

  public PoiExtHotelOrderCommitBody addDatePriceItem(PoiExtHotelOrderCommitResponse1 datePriceItem) {
    if (this.datePrice == null) {
      this.datePrice = new ArrayList<PoiExtHotelOrderCommitResponse1>();
    }
    this.datePrice.add(datePriceItem);
    return this;
  }

   /**
   * Get datePrice
   * @return datePrice
  **/
  public List<PoiExtHotelOrderCommitResponse1> getDatePrice() {
    return datePrice;
  }

  public void setDatePrice(List<PoiExtHotelOrderCommitResponse1> datePrice) {
    this.datePrice = datePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiExtHotelOrderCommitBody poiExtHotelOrderCommitBody = (PoiExtHotelOrderCommitBody) o;
    return Objects.equals(this.orderId, poiExtHotelOrderCommitBody.orderId) &&
        Objects.equals(this.spuExtId, poiExtHotelOrderCommitBody.spuExtId) &&
        Objects.equals(this.status, poiExtHotelOrderCommitBody.status) &&
        Objects.equals(this.reserveAmount, poiExtHotelOrderCommitBody.reserveAmount) &&
        Objects.equals(this.customerName, poiExtHotelOrderCommitBody.customerName) &&
        Objects.equals(this.customerPhone, poiExtHotelOrderCommitBody.customerPhone) &&
        Objects.equals(this.customerList, poiExtHotelOrderCommitBody.customerList) &&
        Objects.equals(this.checkIn, poiExtHotelOrderCommitBody.checkIn) &&
        Objects.equals(this.checkOut, poiExtHotelOrderCommitBody.checkOut) &&
        Objects.equals(this.totalPrice, poiExtHotelOrderCommitBody.totalPrice) &&
        Objects.equals(this.remark, poiExtHotelOrderCommitBody.remark) &&
        Objects.equals(this.datePrice, poiExtHotelOrderCommitBody.datePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, spuExtId, status, reserveAmount, customerName, customerPhone, customerList, checkIn, checkOut, totalPrice, remark, datePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelOrderCommitBody {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    spuExtId: ").append(toIndentedString(spuExtId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reserveAmount: ").append(toIndentedString(reserveAmount)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    customerList: ").append(toIndentedString(customerList)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    datePrice: ").append(toIndentedString(datePrice)).append("\n");
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

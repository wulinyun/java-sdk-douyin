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
import com.douyin.open.model.ExtShopInfo;
import com.douyin.open.model.PoiOrderSyncResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiOrderSyncBody
 */

public class PoiOrderSyncBody {
  @SerializedName("mini_app")
  private PoiOrderSyncResponse miniApp = null;

  /**
   * 订单类型- 201 预约点餐订单, 202 餐厅预定订单, 203 餐厅排队订单, 9001 景区门票订单, 9101 团购券订单, 9201 在线预约订单
   */
  @JsonAdapter(EnumOrderType.Adapter.class)
  public enum EnumOrderType {
    NUMBER_201(201),
    NUMBER_202(202),
    NUMBER_203(203),
    NUMBER_9001(9001),
    NUMBER_9101(9101),
    NUMBER_9201(9201);

    private Integer value;

    EnumOrderType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumOrderType fromValue(String text) {
      for (EnumOrderType b : EnumOrderType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumOrderType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumOrderType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumOrderType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumOrderType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("order_type")
  private EnumOrderType orderType = null;

  @SerializedName("date_time")
  private Integer dateTime = null;

  @SerializedName("order_detail")
  private String orderDetail = null;

  @SerializedName("ext_shop_info")
  private ExtShopInfo extShopInfo = null;

  public PoiOrderSyncBody miniApp(PoiOrderSyncResponse miniApp) {
    this.miniApp = miniApp;
    return this;
  }

   /**
   * Get miniApp
   * @return miniApp
  **/
  public PoiOrderSyncResponse getMiniApp() {
    return miniApp;
  }

  public void setMiniApp(PoiOrderSyncResponse miniApp) {
    this.miniApp = miniApp;
  }

  public PoiOrderSyncBody orderType(EnumOrderType orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * 订单类型- 201 预约点餐订单, 202 餐厅预定订单, 203 餐厅排队订单, 9001 景区门票订单, 9101 团购券订单, 9201 在线预约订单
   * @return orderType
  **/
  public EnumOrderType getOrderType() {
    return orderType;
  }

  public void setOrderType(EnumOrderType orderType) {
    this.orderType = orderType;
  }

  public PoiOrderSyncBody dateTime(Integer dateTime) {
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

  public PoiOrderSyncBody orderDetail(String orderDetail) {
    this.orderDetail = orderDetail;
    return this;
  }

   /**
   * 订单的细节，不同的订单业务有不同的结构体，请具体询问业务方字段结构
   * @return orderDetail
  **/
  public String getOrderDetail() {
    return orderDetail;
  }

  public void setOrderDetail(String orderDetail) {
    this.orderDetail = orderDetail;
  }

  public PoiOrderSyncBody extShopInfo(ExtShopInfo extShopInfo) {
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
    PoiOrderSyncBody poiOrderSyncBody = (PoiOrderSyncBody) o;
    return Objects.equals(this.miniApp, poiOrderSyncBody.miniApp) &&
        Objects.equals(this.orderType, poiOrderSyncBody.orderType) &&
        Objects.equals(this.dateTime, poiOrderSyncBody.dateTime) &&
        Objects.equals(this.orderDetail, poiOrderSyncBody.orderDetail) &&
        Objects.equals(this.extShopInfo, poiOrderSyncBody.extShopInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniApp, orderType, dateTime, orderDetail, extShopInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderSyncBody {\n");
    
    sb.append("    miniApp: ").append(toIndentedString(miniApp)).append("\n");
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

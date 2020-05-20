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
 * PoiExtHotelSkuResponseData
 */

public class PoiExtHotelSkuResponseData {
  @SerializedName("spu_ext_id")
  private String spuExtId = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("stock")
  private Integer stock = null;

  public PoiExtHotelSkuResponseData spuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
    return this;
  }

   /**
   * 接入方SPU ID
   * @return spuExtId
  **/
  public String getSpuExtId() {
    return spuExtId;
  }

  public void setSpuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
  }

  public PoiExtHotelSkuResponseData startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * 价格时间区间[start_date, end_date)
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public PoiExtHotelSkuResponseData endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * 价格时间区间[start_date, end_date)
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public PoiExtHotelSkuResponseData price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 房型价格(人民币分)
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public PoiExtHotelSkuResponseData stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * 库存量
   * @return stock
  **/
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiExtHotelSkuResponseData poiExtHotelSkuResponseData = (PoiExtHotelSkuResponseData) o;
    return Objects.equals(this.spuExtId, poiExtHotelSkuResponseData.spuExtId) &&
        Objects.equals(this.startDate, poiExtHotelSkuResponseData.startDate) &&
        Objects.equals(this.endDate, poiExtHotelSkuResponseData.endDate) &&
        Objects.equals(this.price, poiExtHotelSkuResponseData.price) &&
        Objects.equals(this.stock, poiExtHotelSkuResponseData.stock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spuExtId, startDate, endDate, price, stock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelSkuResponseData {\n");
    
    sb.append("    spuExtId: ").append(toIndentedString(spuExtId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
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

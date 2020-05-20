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
 * PoiExtHotelOrderCommitResponse1
 */

public class PoiExtHotelOrderCommitResponse1 {
  @SerializedName("date")
  private String date = null;

  @SerializedName("date_price")
  private Integer datePrice = null;

  public PoiExtHotelOrderCommitResponse1 date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 入住日期 yyyyMMdd
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PoiExtHotelOrderCommitResponse1 datePrice(Integer datePrice) {
    this.datePrice = datePrice;
    return this;
  }

   /**
   * 入住日价格, 人民币分
   * @return datePrice
  **/
  public Integer getDatePrice() {
    return datePrice;
  }

  public void setDatePrice(Integer datePrice) {
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
    PoiExtHotelOrderCommitResponse1 poiExtHotelOrderCommitResponse1 = (PoiExtHotelOrderCommitResponse1) o;
    return Objects.equals(this.date, poiExtHotelOrderCommitResponse1.date) &&
        Objects.equals(this.datePrice, poiExtHotelOrderCommitResponse1.datePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, datePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelOrderCommitResponse1 {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

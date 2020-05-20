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
 * 出行提示
 */

public class SpuAttributes1211 {
  @SerializedName("check_in_time")
  private String checkInTime = null;

  @SerializedName("check_out_time")
  private String checkOutTime = null;

  @SerializedName("extra")
  private String extra = null;

  public SpuAttributes1211 checkInTime(String checkInTime) {
    this.checkInTime = checkInTime;
    return this;
  }

   /**
   * 入住时间(HH:mm)
   * @return checkInTime
  **/
  public String getCheckInTime() {
    return checkInTime;
  }

  public void setCheckInTime(String checkInTime) {
    this.checkInTime = checkInTime;
  }

  public SpuAttributes1211 checkOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
    return this;
  }

   /**
   * 离店时间(HH:mm)
   * @return checkOutTime
  **/
  public String getCheckOutTime() {
    return checkOutTime;
  }

  public void setCheckOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
  }

  public SpuAttributes1211 extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * 出行提示自定义内容
   * @return extra
  **/
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes1211 spuAttributes1211 = (SpuAttributes1211) o;
    return Objects.equals(this.checkInTime, spuAttributes1211.checkInTime) &&
        Objects.equals(this.checkOutTime, spuAttributes1211.checkOutTime) &&
        Objects.equals(this.extra, spuAttributes1211.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInTime, checkOutTime, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes1211 {\n");
    
    sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
    sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

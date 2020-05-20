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
 * ExternalPoiServiceBase
 */

public class ExternalPoiServiceBase {
  @SerializedName("date")
  private String date = null;

  @SerializedName("exposure_uv")
  private Integer exposureUv = null;

  @SerializedName("click_uv")
  private Integer clickUv = null;

  @SerializedName("success_order_cnt")
  private Integer successOrderCnt = null;

  public ExternalPoiServiceBase date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExternalPoiServiceBase exposureUv(Integer exposureUv) {
    this.exposureUv = exposureUv;
    return this;
  }

   /**
   * 曝光uv
   * @return exposureUv
  **/
  public Integer getExposureUv() {
    return exposureUv;
  }

  public void setExposureUv(Integer exposureUv) {
    this.exposureUv = exposureUv;
  }

  public ExternalPoiServiceBase clickUv(Integer clickUv) {
    this.clickUv = clickUv;
    return this;
  }

   /**
   * 点击uv
   * @return clickUv
  **/
  public Integer getClickUv() {
    return clickUv;
  }

  public void setClickUv(Integer clickUv) {
    this.clickUv = clickUv;
  }

  public ExternalPoiServiceBase successOrderCnt(Integer successOrderCnt) {
    this.successOrderCnt = successOrderCnt;
    return this;
  }

   /**
   * 订房成交次数
   * @return successOrderCnt
  **/
  public Integer getSuccessOrderCnt() {
    return successOrderCnt;
  }

  public void setSuccessOrderCnt(Integer successOrderCnt) {
    this.successOrderCnt = successOrderCnt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPoiServiceBase externalPoiServiceBase = (ExternalPoiServiceBase) o;
    return Objects.equals(this.date, externalPoiServiceBase.date) &&
        Objects.equals(this.exposureUv, externalPoiServiceBase.exposureUv) &&
        Objects.equals(this.clickUv, externalPoiServiceBase.clickUv) &&
        Objects.equals(this.successOrderCnt, externalPoiServiceBase.successOrderCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, exposureUv, clickUv, successOrderCnt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPoiServiceBase {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    exposureUv: ").append(toIndentedString(exposureUv)).append("\n");
    sb.append("    clickUv: ").append(toIndentedString(clickUv)).append("\n");
    sb.append("    successOrderCnt: ").append(toIndentedString(successOrderCnt)).append("\n");
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

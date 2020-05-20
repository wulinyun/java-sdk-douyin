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
 * ExternalPoiBase
 */

public class ExternalPoiBase {
  @SerializedName("date")
  private String date = null;

  @SerializedName("detail_vv")
  private Integer detailVv = null;

  public ExternalPoiBase date(String date) {
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

  public ExternalPoiBase detailVv(Integer detailVv) {
    this.detailVv = detailVv;
    return this;
  }

   /**
   * 详情页pv
   * @return detailVv
  **/
  public Integer getDetailVv() {
    return detailVv;
  }

  public void setDetailVv(Integer detailVv) {
    this.detailVv = detailVv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPoiBase externalPoiBase = (ExternalPoiBase) o;
    return Objects.equals(this.date, externalPoiBase.date) &&
        Objects.equals(this.detailVv, externalPoiBase.detailVv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, detailVv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPoiBase {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    detailVv: ").append(toIndentedString(detailVv)).append("\n");
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

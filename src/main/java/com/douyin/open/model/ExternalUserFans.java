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
 * ExternalUserFans
 */

public class ExternalUserFans {
  @SerializedName("date")
  private String date = null;

  @SerializedName("total_fans")
  private Integer totalFans = null;

  @SerializedName("new_fans")
  private Integer newFans = null;

  public ExternalUserFans date(String date) {
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

  public ExternalUserFans totalFans(Integer totalFans) {
    this.totalFans = totalFans;
    return this;
  }

   /**
   * 每日总粉丝数
   * @return totalFans
  **/
  public Integer getTotalFans() {
    return totalFans;
  }

  public void setTotalFans(Integer totalFans) {
    this.totalFans = totalFans;
  }

  public ExternalUserFans newFans(Integer newFans) {
    this.newFans = newFans;
    return this;
  }

   /**
   * 每天新粉丝数
   * @return newFans
  **/
  public Integer getNewFans() {
    return newFans;
  }

  public void setNewFans(Integer newFans) {
    this.newFans = newFans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUserFans externalUserFans = (ExternalUserFans) o;
    return Objects.equals(this.date, externalUserFans.date) &&
        Objects.equals(this.totalFans, externalUserFans.totalFans) &&
        Objects.equals(this.newFans, externalUserFans.newFans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, totalFans, newFans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUserFans {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalFans: ").append(toIndentedString(totalFans)).append("\n");
    sb.append("    newFans: ").append(toIndentedString(newFans)).append("\n");
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

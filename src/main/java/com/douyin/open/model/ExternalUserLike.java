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
 * ExternalUserLike
 */

public class ExternalUserLike {
  @SerializedName("date")
  private String date = null;

  @SerializedName("new_like")
  private Integer newLike = null;

  public ExternalUserLike date(String date) {
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

  public ExternalUserLike newLike(Integer newLike) {
    this.newLike = newLike;
    return this;
  }

   /**
   * 新增点赞
   * @return newLike
  **/
  public Integer getNewLike() {
    return newLike;
  }

  public void setNewLike(Integer newLike) {
    this.newLike = newLike;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUserLike externalUserLike = (ExternalUserLike) o;
    return Objects.equals(this.date, externalUserLike.date) &&
        Objects.equals(this.newLike, externalUserLike.newLike);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, newLike);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUserLike {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    newLike: ").append(toIndentedString(newLike)).append("\n");
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

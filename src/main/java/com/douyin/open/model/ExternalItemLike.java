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
 * ExternalItemLike
 */

public class ExternalItemLike {
  @SerializedName("date")
  private String date = null;

  @SerializedName("like")
  private Integer like = null;

  public ExternalItemLike date(String date) {
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

  public ExternalItemLike like(Integer like) {
    this.like = like;
    return this;
  }

   /**
   * 每日点赞数
   * @return like
  **/
  public Integer getLike() {
    return like;
  }

  public void setLike(Integer like) {
    this.like = like;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalItemLike externalItemLike = (ExternalItemLike) o;
    return Objects.equals(this.date, externalItemLike.date) &&
        Objects.equals(this.like, externalItemLike.like);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, like);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalItemLike {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
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

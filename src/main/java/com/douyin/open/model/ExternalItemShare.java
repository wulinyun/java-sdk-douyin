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
 * ExternalItemShare
 */

public class ExternalItemShare {
  @SerializedName("date")
  private String date = null;

  @SerializedName("share")
  private Integer share = null;

  public ExternalItemShare date(String date) {
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

  public ExternalItemShare share(Integer share) {
    this.share = share;
    return this;
  }

   /**
   * 每日分享数
   * @return share
  **/
  public Integer getShare() {
    return share;
  }

  public void setShare(Integer share) {
    this.share = share;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalItemShare externalItemShare = (ExternalItemShare) o;
    return Objects.equals(this.date, externalItemShare.date) &&
        Objects.equals(this.share, externalItemShare.share);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, share);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalItemShare {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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

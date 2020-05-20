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
 * ExternalUserItem
 */

public class ExternalUserItem {
  @SerializedName("date")
  private String date = null;

  @SerializedName("new_play")
  private Integer newPlay = null;

  @SerializedName("new_issue")
  private Integer newIssue = null;

  @SerializedName("total_issue")
  private Integer totalIssue = null;

  public ExternalUserItem date(String date) {
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

  public ExternalUserItem newPlay(Integer newPlay) {
    this.newPlay = newPlay;
    return this;
  }

   /**
   * 每天新增视频播放
   * @return newPlay
  **/
  public Integer getNewPlay() {
    return newPlay;
  }

  public void setNewPlay(Integer newPlay) {
    this.newPlay = newPlay;
  }

  public ExternalUserItem newIssue(Integer newIssue) {
    this.newIssue = newIssue;
    return this;
  }

   /**
   * 每日发布内容数
   * @return newIssue
  **/
  public Integer getNewIssue() {
    return newIssue;
  }

  public void setNewIssue(Integer newIssue) {
    this.newIssue = newIssue;
  }

  public ExternalUserItem totalIssue(Integer totalIssue) {
    this.totalIssue = totalIssue;
    return this;
  }

   /**
   * 每日内容总数
   * @return totalIssue
  **/
  public Integer getTotalIssue() {
    return totalIssue;
  }

  public void setTotalIssue(Integer totalIssue) {
    this.totalIssue = totalIssue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUserItem externalUserItem = (ExternalUserItem) o;
    return Objects.equals(this.date, externalUserItem.date) &&
        Objects.equals(this.newPlay, externalUserItem.newPlay) &&
        Objects.equals(this.newIssue, externalUserItem.newIssue) &&
        Objects.equals(this.totalIssue, externalUserItem.totalIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, newPlay, newIssue, totalIssue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUserItem {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    newPlay: ").append(toIndentedString(newPlay)).append("\n");
    sb.append("    newIssue: ").append(toIndentedString(newIssue)).append("\n");
    sb.append("    totalIssue: ").append(toIndentedString(totalIssue)).append("\n");
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

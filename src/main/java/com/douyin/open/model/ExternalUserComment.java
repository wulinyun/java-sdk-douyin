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
 * ExternalUserComment
 */

public class ExternalUserComment {
  @SerializedName("date")
  private String date = null;

  @SerializedName("new_comment")
  private Integer newComment = null;

  public ExternalUserComment date(String date) {
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

  public ExternalUserComment newComment(Integer newComment) {
    this.newComment = newComment;
    return this;
  }

   /**
   * 新增评论
   * @return newComment
  **/
  public Integer getNewComment() {
    return newComment;
  }

  public void setNewComment(Integer newComment) {
    this.newComment = newComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUserComment externalUserComment = (ExternalUserComment) o;
    return Objects.equals(this.date, externalUserComment.date) &&
        Objects.equals(this.newComment, externalUserComment.newComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, newComment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUserComment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    newComment: ").append(toIndentedString(newComment)).append("\n");
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

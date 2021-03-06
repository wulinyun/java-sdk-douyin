/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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
 * DataUserCommentResponseData
 */

public class DataUserCommentResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("total_comment")
  private String totalComment = null;

  @SerializedName("date_new_comment")
  private String dateNewComment = null;

  public DataUserCommentResponseData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public DataUserCommentResponseData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataUserCommentResponseData totalComment(String totalComment) {
    this.totalComment = totalComment;
    return this;
  }

   /**
   * 总评论
   * @return totalComment
  **/
  public String getTotalComment() {
    return totalComment;
  }

  public void setTotalComment(String totalComment) {
    this.totalComment = totalComment;
  }

  public DataUserCommentResponseData dateNewComment(String dateNewComment) {
    this.dateNewComment = dateNewComment;
    return this;
  }

   /**
   * 每天新增评论
   * @return dateNewComment
  **/
  public String getDateNewComment() {
    return dateNewComment;
  }

  public void setDateNewComment(String dateNewComment) {
    this.dateNewComment = dateNewComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataUserCommentResponseData dataUserCommentResponseData = (DataUserCommentResponseData) o;
    return Objects.equals(this.errorCode, dataUserCommentResponseData.errorCode) &&
        Objects.equals(this.description, dataUserCommentResponseData.description) &&
        Objects.equals(this.totalComment, dataUserCommentResponseData.totalComment) &&
        Objects.equals(this.dateNewComment, dataUserCommentResponseData.dateNewComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, totalComment, dateNewComment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataUserCommentResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    totalComment: ").append(toIndentedString(totalComment)).append("\n");
    sb.append("    dateNewComment: ").append(toIndentedString(dateNewComment)).append("\n");
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

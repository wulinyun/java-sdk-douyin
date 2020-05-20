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
import com.douyin.open.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FansListResponseData
 */

public class FansListResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("cursor")
  private Long cursor = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("list")
  private List<User> list = null;

  @SerializedName("total")
  private Integer total = null;

  public FansListResponseData errorCode(Integer errorCode) {
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

  public FansListResponseData description(String description) {
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

  public FansListResponseData cursor(Long cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  public Long getCursor() {
    return cursor;
  }

  public void setCursor(Long cursor) {
    this.cursor = cursor;
  }

  public FansListResponseData hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public FansListResponseData list(List<User> list) {
    this.list = list;
    return this;
  }

  public FansListResponseData addListItem(User listItem) {
    if (this.list == null) {
      this.list = new ArrayList<User>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  public List<User> getList() {
    return list;
  }

  public void setList(List<User> list) {
    this.list = list;
  }

  public FansListResponseData total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * 粉丝总数
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FansListResponseData fansListResponseData = (FansListResponseData) o;
    return Objects.equals(this.errorCode, fansListResponseData.errorCode) &&
        Objects.equals(this.description, fansListResponseData.description) &&
        Objects.equals(this.cursor, fansListResponseData.cursor) &&
        Objects.equals(this.hasMore, fansListResponseData.hasMore) &&
        Objects.equals(this.list, fansListResponseData.list) &&
        Objects.equals(this.total, fansListResponseData.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, cursor, hasMore, list, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FansListResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

/*
 * 企业号意向用户管理
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
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseLeadsTagUserListResponseData
 */

public class EnterpriseLeadsTagUserListResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("cursor")
  private Long cursor = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("list")
  private List<String> list = null;

  public EnterpriseLeadsTagUserListResponseData errorCode(Integer errorCode) {
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

  public EnterpriseLeadsTagUserListResponseData description(String description) {
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

  public EnterpriseLeadsTagUserListResponseData cursor(Long cursor) {
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

  public EnterpriseLeadsTagUserListResponseData hasMore(Boolean hasMore) {
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

  public EnterpriseLeadsTagUserListResponseData list(List<String> list) {
    this.list = list;
    return this;
  }

  public EnterpriseLeadsTagUserListResponseData addListItem(String listItem) {
    if (this.list == null) {
      this.list = new ArrayList<String>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * 用户openid
   * @return list
  **/
  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsTagUserListResponseData enterpriseLeadsTagUserListResponseData = (EnterpriseLeadsTagUserListResponseData) o;
    return Objects.equals(this.errorCode, enterpriseLeadsTagUserListResponseData.errorCode) &&
        Objects.equals(this.description, enterpriseLeadsTagUserListResponseData.description) &&
        Objects.equals(this.cursor, enterpriseLeadsTagUserListResponseData.cursor) &&
        Objects.equals(this.hasMore, enterpriseLeadsTagUserListResponseData.hasMore) &&
        Objects.equals(this.list, enterpriseLeadsTagUserListResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, cursor, hasMore, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsTagUserListResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

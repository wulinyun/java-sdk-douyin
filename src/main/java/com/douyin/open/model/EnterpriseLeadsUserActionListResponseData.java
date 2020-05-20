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
import com.douyin.open.model.EnterpriseLeadsUserActionListResponseDataList;
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
 * EnterpriseLeadsUserActionListResponseData
 */

public class EnterpriseLeadsUserActionListResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("cursor")
  private String cursor = null;

  @SerializedName("list")
  private List<EnterpriseLeadsUserActionListResponseDataList> list = null;

  public EnterpriseLeadsUserActionListResponseData errorCode(Integer errorCode) {
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

  public EnterpriseLeadsUserActionListResponseData description(String description) {
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

  public EnterpriseLeadsUserActionListResponseData hasMore(Boolean hasMore) {
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

  public EnterpriseLeadsUserActionListResponseData cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public EnterpriseLeadsUserActionListResponseData list(List<EnterpriseLeadsUserActionListResponseDataList> list) {
    this.list = list;
    return this;
  }

  public EnterpriseLeadsUserActionListResponseData addListItem(EnterpriseLeadsUserActionListResponseDataList listItem) {
    if (this.list == null) {
      this.list = new ArrayList<EnterpriseLeadsUserActionListResponseDataList>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  public List<EnterpriseLeadsUserActionListResponseDataList> getList() {
    return list;
  }

  public void setList(List<EnterpriseLeadsUserActionListResponseDataList> list) {
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
    EnterpriseLeadsUserActionListResponseData enterpriseLeadsUserActionListResponseData = (EnterpriseLeadsUserActionListResponseData) o;
    return Objects.equals(this.errorCode, enterpriseLeadsUserActionListResponseData.errorCode) &&
        Objects.equals(this.description, enterpriseLeadsUserActionListResponseData.description) &&
        Objects.equals(this.hasMore, enterpriseLeadsUserActionListResponseData.hasMore) &&
        Objects.equals(this.cursor, enterpriseLeadsUserActionListResponseData.cursor) &&
        Objects.equals(this.list, enterpriseLeadsUserActionListResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, hasMore, cursor, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsUserActionListResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

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
import com.douyin.open.model.EnterpriseLeadsUserListResponseDataUsers;
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
 * EnterpriseLeadsUserListResponseData
 */

public class EnterpriseLeadsUserListResponseData {
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

  @SerializedName("users")
  private List<EnterpriseLeadsUserListResponseDataUsers> users = null;

  public EnterpriseLeadsUserListResponseData errorCode(Integer errorCode) {
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

  public EnterpriseLeadsUserListResponseData description(String description) {
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

  public EnterpriseLeadsUserListResponseData cursor(Long cursor) {
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

  public EnterpriseLeadsUserListResponseData hasMore(Boolean hasMore) {
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

  public EnterpriseLeadsUserListResponseData list(List<String> list) {
    this.list = list;
    return this;
  }

  public EnterpriseLeadsUserListResponseData addListItem(String listItem) {
    if (this.list == null) {
      this.list = new ArrayList<String>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * 用户OPENID (见users)
   * @return list
  **/
  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public EnterpriseLeadsUserListResponseData users(List<EnterpriseLeadsUserListResponseDataUsers> users) {
    this.users = users;
    return this;
  }

  public EnterpriseLeadsUserListResponseData addUsersItem(EnterpriseLeadsUserListResponseDataUsers usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<EnterpriseLeadsUserListResponseDataUsers>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  public List<EnterpriseLeadsUserListResponseDataUsers> getUsers() {
    return users;
  }

  public void setUsers(List<EnterpriseLeadsUserListResponseDataUsers> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsUserListResponseData enterpriseLeadsUserListResponseData = (EnterpriseLeadsUserListResponseData) o;
    return Objects.equals(this.errorCode, enterpriseLeadsUserListResponseData.errorCode) &&
        Objects.equals(this.description, enterpriseLeadsUserListResponseData.description) &&
        Objects.equals(this.cursor, enterpriseLeadsUserListResponseData.cursor) &&
        Objects.equals(this.hasMore, enterpriseLeadsUserListResponseData.hasMore) &&
        Objects.equals(this.list, enterpriseLeadsUserListResponseData.list) &&
        Objects.equals(this.users, enterpriseLeadsUserListResponseData.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, cursor, hasMore, list, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsUserListResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

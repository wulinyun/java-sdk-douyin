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
import com.douyin.open.model.StarHotListResponseDataList;
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
 * StarHotListResponseData
 */

public class StarHotListResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hot_list_update_timestamp")
  private Integer hotListUpdateTimestamp = null;

  @SerializedName("hot_list_type")
  private Integer hotListType = null;

  @SerializedName("hot_list_description")
  private String hotListDescription = null;

  @SerializedName("list")
  private List<StarHotListResponseDataList> list = null;

  public StarHotListResponseData errorCode(Integer errorCode) {
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

  public StarHotListResponseData description(String description) {
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

  public StarHotListResponseData hotListUpdateTimestamp(Integer hotListUpdateTimestamp) {
    this.hotListUpdateTimestamp = hotListUpdateTimestamp;
    return this;
  }

   /**
   * 达人热榜更新时间戳
   * @return hotListUpdateTimestamp
  **/
  public Integer getHotListUpdateTimestamp() {
    return hotListUpdateTimestamp;
  }

  public void setHotListUpdateTimestamp(Integer hotListUpdateTimestamp) {
    this.hotListUpdateTimestamp = hotListUpdateTimestamp;
  }

  public StarHotListResponseData hotListType(Integer hotListType) {
    this.hotListType = hotListType;
    return this;
  }

   /**
   * 达人热榜类型
   * @return hotListType
  **/
  public Integer getHotListType() {
    return hotListType;
  }

  public void setHotListType(Integer hotListType) {
    this.hotListType = hotListType;
  }

  public StarHotListResponseData hotListDescription(String hotListDescription) {
    this.hotListDescription = hotListDescription;
    return this;
  }

   /**
   * 热榜类型说明
   * @return hotListDescription
  **/
  public String getHotListDescription() {
    return hotListDescription;
  }

  public void setHotListDescription(String hotListDescription) {
    this.hotListDescription = hotListDescription;
  }

  public StarHotListResponseData list(List<StarHotListResponseDataList> list) {
    this.list = list;
    return this;
  }

  public StarHotListResponseData addListItem(StarHotListResponseDataList listItem) {
    if (this.list == null) {
      this.list = new ArrayList<StarHotListResponseDataList>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  public List<StarHotListResponseDataList> getList() {
    return list;
  }

  public void setList(List<StarHotListResponseDataList> list) {
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
    StarHotListResponseData starHotListResponseData = (StarHotListResponseData) o;
    return Objects.equals(this.errorCode, starHotListResponseData.errorCode) &&
        Objects.equals(this.description, starHotListResponseData.description) &&
        Objects.equals(this.hotListUpdateTimestamp, starHotListResponseData.hotListUpdateTimestamp) &&
        Objects.equals(this.hotListType, starHotListResponseData.hotListType) &&
        Objects.equals(this.hotListDescription, starHotListResponseData.hotListDescription) &&
        Objects.equals(this.list, starHotListResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, hotListUpdateTimestamp, hotListType, hotListDescription, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarHotListResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hotListUpdateTimestamp: ").append(toIndentedString(hotListUpdateTimestamp)).append("\n");
    sb.append("    hotListType: ").append(toIndentedString(hotListType)).append("\n");
    sb.append("    hotListDescription: ").append(toIndentedString(hotListDescription)).append("\n");
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

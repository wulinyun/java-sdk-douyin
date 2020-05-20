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
import com.douyin.open.model.HotSentence;
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
 * HotsearchSentencesResponseData
 */

public class HotsearchSentencesResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("active_time")
  private String activeTime = null;

  @SerializedName("list")
  private List<HotSentence> list = null;

  public HotsearchSentencesResponseData errorCode(Integer errorCode) {
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

  public HotsearchSentencesResponseData description(String description) {
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

  public HotsearchSentencesResponseData activeTime(String activeTime) {
    this.activeTime = activeTime;
    return this;
  }

   /**
   * 刷新时间
   * @return activeTime
  **/
  public String getActiveTime() {
    return activeTime;
  }

  public void setActiveTime(String activeTime) {
    this.activeTime = activeTime;
  }

  public HotsearchSentencesResponseData list(List<HotSentence> list) {
    this.list = list;
    return this;
  }

  public HotsearchSentencesResponseData addListItem(HotSentence listItem) {
    if (this.list == null) {
      this.list = new ArrayList<HotSentence>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * 实时热点词
   * @return list
  **/
  public List<HotSentence> getList() {
    return list;
  }

  public void setList(List<HotSentence> list) {
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
    HotsearchSentencesResponseData hotsearchSentencesResponseData = (HotsearchSentencesResponseData) o;
    return Objects.equals(this.errorCode, hotsearchSentencesResponseData.errorCode) &&
        Objects.equals(this.description, hotsearchSentencesResponseData.description) &&
        Objects.equals(this.activeTime, hotsearchSentencesResponseData.activeTime) &&
        Objects.equals(this.list, hotsearchSentencesResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, activeTime, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotsearchSentencesResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
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

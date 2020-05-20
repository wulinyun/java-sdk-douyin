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
import com.douyin.open.model.TrendingSentence;
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
 * HotsearchTrendingSentencesResponseData
 */

public class HotsearchTrendingSentencesResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("cursor")
  private Long cursor = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("list")
  private List<TrendingSentence> list = null;

  public HotsearchTrendingSentencesResponseData errorCode(Integer errorCode) {
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

  public HotsearchTrendingSentencesResponseData description(String description) {
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

  public HotsearchTrendingSentencesResponseData total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public HotsearchTrendingSentencesResponseData cursor(Long cursor) {
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

  public HotsearchTrendingSentencesResponseData hasMore(Boolean hasMore) {
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

  public HotsearchTrendingSentencesResponseData list(List<TrendingSentence> list) {
    this.list = list;
    return this;
  }

  public HotsearchTrendingSentencesResponseData addListItem(TrendingSentence listItem) {
    if (this.list == null) {
      this.list = new ArrayList<TrendingSentence>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * 实时热点词
   * @return list
  **/
  public List<TrendingSentence> getList() {
    return list;
  }

  public void setList(List<TrendingSentence> list) {
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
    HotsearchTrendingSentencesResponseData hotsearchTrendingSentencesResponseData = (HotsearchTrendingSentencesResponseData) o;
    return Objects.equals(this.errorCode, hotsearchTrendingSentencesResponseData.errorCode) &&
        Objects.equals(this.description, hotsearchTrendingSentencesResponseData.description) &&
        Objects.equals(this.total, hotsearchTrendingSentencesResponseData.total) &&
        Objects.equals(this.cursor, hotsearchTrendingSentencesResponseData.cursor) &&
        Objects.equals(this.hasMore, hotsearchTrendingSentencesResponseData.hasMore) &&
        Objects.equals(this.list, hotsearchTrendingSentencesResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, total, cursor, hasMore, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotsearchTrendingSentencesResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

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
import com.douyin.open.model.Poi;
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
 * PoiSearchKeywordResponseData
 */

public class PoiSearchKeywordResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("cursor")
  private Long cursor = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("pois")
  private List<Poi> pois = null;

  public PoiSearchKeywordResponseData errorCode(Integer errorCode) {
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

  public PoiSearchKeywordResponseData description(String description) {
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

  public PoiSearchKeywordResponseData cursor(Long cursor) {
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

  public PoiSearchKeywordResponseData hasMore(Boolean hasMore) {
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

  public PoiSearchKeywordResponseData pois(List<Poi> pois) {
    this.pois = pois;
    return this;
  }

  public PoiSearchKeywordResponseData addPoisItem(Poi poisItem) {
    if (this.pois == null) {
      this.pois = new ArrayList<Poi>();
    }
    this.pois.add(poisItem);
    return this;
  }

   /**
   * Get pois
   * @return pois
  **/
  public List<Poi> getPois() {
    return pois;
  }

  public void setPois(List<Poi> pois) {
    this.pois = pois;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSearchKeywordResponseData poiSearchKeywordResponseData = (PoiSearchKeywordResponseData) o;
    return Objects.equals(this.errorCode, poiSearchKeywordResponseData.errorCode) &&
        Objects.equals(this.description, poiSearchKeywordResponseData.description) &&
        Objects.equals(this.cursor, poiSearchKeywordResponseData.cursor) &&
        Objects.equals(this.hasMore, poiSearchKeywordResponseData.hasMore) &&
        Objects.equals(this.pois, poiSearchKeywordResponseData.pois);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, cursor, hasMore, pois);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSearchKeywordResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    pois: ").append(toIndentedString(pois)).append("\n");
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

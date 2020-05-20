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
import com.douyin.open.model.PoiExtHotelSkuResponseData;
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
 * PoiExtHotelSkuResponse
 */

public class PoiExtHotelSkuResponse {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("data")
  private List<PoiExtHotelSkuResponseData> data = new ArrayList<PoiExtHotelSkuResponseData>();

  public PoiExtHotelSkuResponse errorCode(Integer errorCode) {
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

  public PoiExtHotelSkuResponse description(String description) {
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

  public PoiExtHotelSkuResponse data(List<PoiExtHotelSkuResponseData> data) {
    this.data = data;
    return this;
  }

  public PoiExtHotelSkuResponse addDataItem(PoiExtHotelSkuResponseData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<PoiExtHotelSkuResponseData> getData() {
    return data;
  }

  public void setData(List<PoiExtHotelSkuResponseData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiExtHotelSkuResponse poiExtHotelSkuResponse = (PoiExtHotelSkuResponse) o;
    return Objects.equals(this.errorCode, poiExtHotelSkuResponse.errorCode) &&
        Objects.equals(this.description, poiExtHotelSkuResponse.description) &&
        Objects.equals(this.data, poiExtHotelSkuResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelSkuResponse {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

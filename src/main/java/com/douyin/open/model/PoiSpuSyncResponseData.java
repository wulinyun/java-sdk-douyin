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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiSpuSyncResponseData
 */

public class PoiSpuSyncResponseData {
  @SerializedName("spu_id")
  private String spuId = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  public PoiSpuSyncResponseData spuId(String spuId) {
    this.spuId = spuId;
    return this;
  }

   /**
   * 抖音平台SPU ID
   * @return spuId
  **/
  public String getSpuId() {
    return spuId;
  }

  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }

  public PoiSpuSyncResponseData errorCode(Integer errorCode) {
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

  public PoiSpuSyncResponseData description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSpuSyncResponseData poiSpuSyncResponseData = (PoiSpuSyncResponseData) o;
    return Objects.equals(this.spuId, poiSpuSyncResponseData.spuId) &&
        Objects.equals(this.errorCode, poiSpuSyncResponseData.errorCode) &&
        Objects.equals(this.description, poiSpuSyncResponseData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spuId, errorCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSpuSyncResponseData {\n");
    
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

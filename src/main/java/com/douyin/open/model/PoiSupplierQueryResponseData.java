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
import com.douyin.open.model.SyncStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiSupplierQueryResponseData
 */

public class PoiSupplierQueryResponseData {
  @SerializedName("sync_status")
  private SyncStatus syncStatus = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  public PoiSupplierQueryResponseData syncStatus(SyncStatus syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  public SyncStatus getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(SyncStatus syncStatus) {
    this.syncStatus = syncStatus;
  }

  public PoiSupplierQueryResponseData errorCode(Integer errorCode) {
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

  public PoiSupplierQueryResponseData description(String description) {
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
    PoiSupplierQueryResponseData poiSupplierQueryResponseData = (PoiSupplierQueryResponseData) o;
    return Objects.equals(this.syncStatus, poiSupplierQueryResponseData.syncStatus) &&
        Objects.equals(this.errorCode, poiSupplierQueryResponseData.errorCode) &&
        Objects.equals(this.description, poiSupplierQueryResponseData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncStatus, errorCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierQueryResponseData {\n");
    
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
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

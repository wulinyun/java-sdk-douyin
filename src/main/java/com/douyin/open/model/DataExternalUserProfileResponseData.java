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
import com.douyin.open.model.ExternalUserProfile;
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
 * DataExternalUserProfileResponseData
 */

public class DataExternalUserProfileResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("result_list")
  private List<ExternalUserProfile> resultList = null;

  public DataExternalUserProfileResponseData errorCode(Integer errorCode) {
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

  public DataExternalUserProfileResponseData description(String description) {
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

  public DataExternalUserProfileResponseData resultList(List<ExternalUserProfile> resultList) {
    this.resultList = resultList;
    return this;
  }

  public DataExternalUserProfileResponseData addResultListItem(ExternalUserProfile resultListItem) {
    if (this.resultList == null) {
      this.resultList = new ArrayList<ExternalUserProfile>();
    }
    this.resultList.add(resultListItem);
    return this;
  }

   /**
   * Get resultList
   * @return resultList
  **/
  public List<ExternalUserProfile> getResultList() {
    return resultList;
  }

  public void setResultList(List<ExternalUserProfile> resultList) {
    this.resultList = resultList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataExternalUserProfileResponseData dataExternalUserProfileResponseData = (DataExternalUserProfileResponseData) o;
    return Objects.equals(this.errorCode, dataExternalUserProfileResponseData.errorCode) &&
        Objects.equals(this.description, dataExternalUserProfileResponseData.description) &&
        Objects.equals(this.resultList, dataExternalUserProfileResponseData.resultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, resultList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataExternalUserProfileResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
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

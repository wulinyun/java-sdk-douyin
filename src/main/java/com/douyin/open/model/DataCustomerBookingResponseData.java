/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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
 * DataCustomerBookingResponseData
 */

public class DataCustomerBookingResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("page_booking_count")
  private String pageBookingCount = null;

  @SerializedName("change_booking_count")
  private String changeBookingCount = null;

  public DataCustomerBookingResponseData errorCode(Integer errorCode) {
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

  public DataCustomerBookingResponseData description(String description) {
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

  public DataCustomerBookingResponseData pageBookingCount(String pageBookingCount) {
    this.pageBookingCount = pageBookingCount;
    return this;
  }

   /**
   * 每天商家页面预约量
   * @return pageBookingCount
  **/
  public String getPageBookingCount() {
    return pageBookingCount;
  }

  public void setPageBookingCount(String pageBookingCount) {
    this.pageBookingCount = pageBookingCount;
  }

  public DataCustomerBookingResponseData changeBookingCount(String changeBookingCount) {
    this.changeBookingCount = changeBookingCount;
    return this;
  }

   /**
   * 每天转化页预约量
   * @return changeBookingCount
  **/
  public String getChangeBookingCount() {
    return changeBookingCount;
  }

  public void setChangeBookingCount(String changeBookingCount) {
    this.changeBookingCount = changeBookingCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataCustomerBookingResponseData dataCustomerBookingResponseData = (DataCustomerBookingResponseData) o;
    return Objects.equals(this.errorCode, dataCustomerBookingResponseData.errorCode) &&
        Objects.equals(this.description, dataCustomerBookingResponseData.description) &&
        Objects.equals(this.pageBookingCount, dataCustomerBookingResponseData.pageBookingCount) &&
        Objects.equals(this.changeBookingCount, dataCustomerBookingResponseData.changeBookingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, pageBookingCount, changeBookingCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataCustomerBookingResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pageBookingCount: ").append(toIndentedString(pageBookingCount)).append("\n");
    sb.append("    changeBookingCount: ").append(toIndentedString(changeBookingCount)).append("\n");
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

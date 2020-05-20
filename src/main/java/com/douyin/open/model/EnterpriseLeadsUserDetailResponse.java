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
import com.douyin.open.model.EnterpriseLeadsUserDetailResponseData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EnterpriseLeadsUserDetailResponse
 */

public class EnterpriseLeadsUserDetailResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("data")
  private EnterpriseLeadsUserDetailResponseData data = null;

  public EnterpriseLeadsUserDetailResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public EnterpriseLeadsUserDetailResponse data(EnterpriseLeadsUserDetailResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public EnterpriseLeadsUserDetailResponseData getData() {
    return data;
  }

  public void setData(EnterpriseLeadsUserDetailResponseData data) {
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
    EnterpriseLeadsUserDetailResponse enterpriseLeadsUserDetailResponse = (EnterpriseLeadsUserDetailResponse) o;
    return Objects.equals(this.message, enterpriseLeadsUserDetailResponse.message) &&
        Objects.equals(this.data, enterpriseLeadsUserDetailResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsUserDetailResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

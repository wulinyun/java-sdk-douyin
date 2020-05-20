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
 * PoiExtHotelOrderCommitResponse2
 */

public class PoiExtHotelOrderCommitResponse2 {
  @SerializedName("order_ext_id")
  private String orderExtId = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  public PoiExtHotelOrderCommitResponse2 orderExtId(String orderExtId) {
    this.orderExtId = orderExtId;
    return this;
  }

   /**
   * 外部订单id
   * @return orderExtId
  **/
  public String getOrderExtId() {
    return orderExtId;
  }

  public void setOrderExtId(String orderExtId) {
    this.orderExtId = orderExtId;
  }

  public PoiExtHotelOrderCommitResponse2 errorCode(Integer errorCode) {
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

  public PoiExtHotelOrderCommitResponse2 description(String description) {
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
    PoiExtHotelOrderCommitResponse2 poiExtHotelOrderCommitResponse2 = (PoiExtHotelOrderCommitResponse2) o;
    return Objects.equals(this.orderExtId, poiExtHotelOrderCommitResponse2.orderExtId) &&
        Objects.equals(this.errorCode, poiExtHotelOrderCommitResponse2.errorCode) &&
        Objects.equals(this.description, poiExtHotelOrderCommitResponse2.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderExtId, errorCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelOrderCommitResponse2 {\n");
    
    sb.append("    orderExtId: ").append(toIndentedString(orderExtId)).append("\n");
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

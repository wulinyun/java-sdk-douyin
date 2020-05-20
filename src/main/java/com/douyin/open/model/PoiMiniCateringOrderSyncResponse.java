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
import com.douyin.open.model.PoiMiniCateringOrderSyncResponseData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiMiniCateringOrderSyncResponse
 */

public class PoiMiniCateringOrderSyncResponse {
  @SerializedName("data")
  private PoiMiniCateringOrderSyncResponseData data = null;

  public PoiMiniCateringOrderSyncResponse data(PoiMiniCateringOrderSyncResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public PoiMiniCateringOrderSyncResponseData getData() {
    return data;
  }

  public void setData(PoiMiniCateringOrderSyncResponseData data) {
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
    PoiMiniCateringOrderSyncResponse poiMiniCateringOrderSyncResponse = (PoiMiniCateringOrderSyncResponse) o;
    return Objects.equals(this.data, poiMiniCateringOrderSyncResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiMiniCateringOrderSyncResponse {\n");
    
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

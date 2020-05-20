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
import com.douyin.open.model.DataExternalPoiServiceBaseResponseData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DataExternalPoiServiceBaseResponse
 */

public class DataExternalPoiServiceBaseResponse {
  @SerializedName("data")
  private DataExternalPoiServiceBaseResponseData data = null;

  public DataExternalPoiServiceBaseResponse data(DataExternalPoiServiceBaseResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public DataExternalPoiServiceBaseResponseData getData() {
    return data;
  }

  public void setData(DataExternalPoiServiceBaseResponseData data) {
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
    DataExternalPoiServiceBaseResponse dataExternalPoiServiceBaseResponse = (DataExternalPoiServiceBaseResponse) o;
    return Objects.equals(this.data, dataExternalPoiServiceBaseResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataExternalPoiServiceBaseResponse {\n");
    
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

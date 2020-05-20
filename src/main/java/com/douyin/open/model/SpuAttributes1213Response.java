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
 * 退订，改签政策
 */

public class SpuAttributes1213Response {
  @SerializedName("type")
  private Integer type = null;

  public SpuAttributes1213Response type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * 退改支持类型; 0 - 不支持退改; 1 - 支持退改 (目前流程里均无退改，前端文案&#x27;预订后若需更改日期或退款，请致电xx&#x27;)
   * @return type
  **/
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes1213Response spuAttributes1213Response = (SpuAttributes1213Response) o;
    return Objects.equals(this.type, spuAttributes1213Response.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes1213Response {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

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
 * FansProfileDistribution
 */

public class FansProfileDistribution {
  @SerializedName("item")
  private String item = null;

  @SerializedName("value")
  private Integer value = null;

  public FansProfileDistribution item(String item) {
    this.item = item;
    return this;
  }

   /**
   * 分布的种类
   * @return item
  **/
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public FansProfileDistribution value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * 分布的数值
   * @return value
  **/
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FansProfileDistribution fansProfileDistribution = (FansProfileDistribution) o;
    return Objects.equals(this.item, fansProfileDistribution.item) &&
        Objects.equals(this.value, fansProfileDistribution.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FansProfileDistribution {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

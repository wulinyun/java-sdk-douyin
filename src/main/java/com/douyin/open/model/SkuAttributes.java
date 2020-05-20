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
 * SKU属性字段
 */

public class SkuAttributes {
  @SerializedName("1301")
  private String _1301 = null;

  public SkuAttributes _1301(String _1301) {
    this._1301 = _1301;
    return this;
  }

   /**
   * 酒店、名宿SKU日期
   * @return _1301
  **/
  public String get1301() {
    return _1301;
  }

  public void set1301(String _1301) {
    this._1301 = _1301;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuAttributes skuAttributes = (SkuAttributes) o;
    return Objects.equals(this._1301, skuAttributes._1301);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1301);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuAttributes {\n");
    
    sb.append("    _1301: ").append(toIndentedString(_1301)).append("\n");
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

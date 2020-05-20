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
import com.douyin.open.model.SupplierAttributes2201Entry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 预约订位服务
 */

public class SupplierAttributes2202 {
  @SerializedName("enable")
  private Integer enable = null;

  @SerializedName("entry")
  private SupplierAttributes2201Entry entry = null;

  public SupplierAttributes2202 enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * 上线状态(1:上线，2:下线)
   * @return enable
  **/
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public SupplierAttributes2202 entry(SupplierAttributes2201Entry entry) {
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  public SupplierAttributes2201Entry getEntry() {
    return entry;
  }

  public void setEntry(SupplierAttributes2201Entry entry) {
    this.entry = entry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierAttributes2202 supplierAttributes2202 = (SupplierAttributes2202) o;
    return Objects.equals(this.enable, supplierAttributes2202.enable) &&
        Objects.equals(this.entry, supplierAttributes2202.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, entry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierAttributes2202 {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
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

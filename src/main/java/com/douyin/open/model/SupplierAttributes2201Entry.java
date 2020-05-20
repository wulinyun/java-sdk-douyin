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
 * 服务入口拼接参数
 */

public class SupplierAttributes2201Entry {
  @SerializedName("entry_type")
  private Integer entryType = null;

  @SerializedName("entry_schema")
  private String entrySchema = null;

  public SupplierAttributes2201Entry entryType(Integer entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * 入口类型(1:H5，2:抖音小程序)
   * @return entryType
  **/
  public Integer getEntryType() {
    return entryType;
  }

  public void setEntryType(Integer entryType) {
    this.entryType = entryType;
  }

  public SupplierAttributes2201Entry entrySchema(String entrySchema) {
    this.entrySchema = entrySchema;
    return this;
  }

   /**
   * 服务跳转链接
   * @return entrySchema
  **/
  public String getEntrySchema() {
    return entrySchema;
  }

  public void setEntrySchema(String entrySchema) {
    this.entrySchema = entrySchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierAttributes2201Entry supplierAttributes2201Entry = (SupplierAttributes2201Entry) o;
    return Objects.equals(this.entryType, supplierAttributes2201Entry.entryType) &&
        Objects.equals(this.entrySchema, supplierAttributes2201Entry.entrySchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryType, entrySchema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierAttributes2201Entry {\n");
    
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    entrySchema: ").append(toIndentedString(entrySchema)).append("\n");
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

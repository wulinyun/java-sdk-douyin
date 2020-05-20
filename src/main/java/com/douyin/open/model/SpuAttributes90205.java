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
import com.douyin.open.model.SpuAttributes90205Response;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * spu跳转入口
 */

public class SpuAttributes90205 {
  /**
   * 入口类型(1:H5，2:抖音小程序)
   */
  @JsonAdapter(EnumEntryType.Adapter.class)
  public enum EnumEntryType {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    EnumEntryType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumEntryType fromValue(String text) {
      for (EnumEntryType b : EnumEntryType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumEntryType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumEntryType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumEntryType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumEntryType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("entry_type")
  private EnumEntryType entryType = null;

  @SerializedName("entry_mini_app")
  private SpuAttributes90205Response entryMiniApp = null;

  public SpuAttributes90205 entryType(EnumEntryType entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * 入口类型(1:H5，2:抖音小程序)
   * @return entryType
  **/
  public EnumEntryType getEntryType() {
    return entryType;
  }

  public void setEntryType(EnumEntryType entryType) {
    this.entryType = entryType;
  }

  public SpuAttributes90205 entryMiniApp(SpuAttributes90205Response entryMiniApp) {
    this.entryMiniApp = entryMiniApp;
    return this;
  }

   /**
   * Get entryMiniApp
   * @return entryMiniApp
  **/
  public SpuAttributes90205Response getEntryMiniApp() {
    return entryMiniApp;
  }

  public void setEntryMiniApp(SpuAttributes90205Response entryMiniApp) {
    this.entryMiniApp = entryMiniApp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes90205 spuAttributes90205 = (SpuAttributes90205) o;
    return Objects.equals(this.entryType, spuAttributes90205.entryType) &&
        Objects.equals(this.entryMiniApp, spuAttributes90205.entryMiniApp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryType, entryMiniApp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes90205 {\n");
    
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    entryMiniApp: ").append(toIndentedString(entryMiniApp)).append("\n");
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

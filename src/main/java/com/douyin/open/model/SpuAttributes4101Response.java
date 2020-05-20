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
 * 详情页链接信息
 */

public class SpuAttributes4101Response {
  /**
   * 链接类型 (1:H5，2:抖音小程序，3:原生小程序)
   */
  @JsonAdapter(EnumSchemaType.Adapter.class)
  public enum EnumSchemaType {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    EnumSchemaType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumSchemaType fromValue(String text) {
      for (EnumSchemaType b : EnumSchemaType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumSchemaType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumSchemaType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumSchemaType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumSchemaType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("schema_type")
  private EnumSchemaType schemaType = null;

  @SerializedName("url")
  private String url = null;

  /**
   * 平台来源枚举（16电商小店）
   */
  @JsonAdapter(EnumPlatformSource.Adapter.class)
  public enum EnumPlatformSource {
    NUMBER_16(16);

    private Integer value;

    EnumPlatformSource(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumPlatformSource fromValue(String text) {
      for (EnumPlatformSource b : EnumPlatformSource.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumPlatformSource> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumPlatformSource enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumPlatformSource read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumPlatformSource.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("platform_source")
  private EnumPlatformSource platformSource = null;

  @SerializedName("platform_name")
  private String platformName = null;

  @SerializedName("is_test")
  private Integer isTest = null;

  public SpuAttributes4101Response schemaType(EnumSchemaType schemaType) {
    this.schemaType = schemaType;
    return this;
  }

   /**
   * 链接类型 (1:H5，2:抖音小程序，3:原生小程序)
   * @return schemaType
  **/
  public EnumSchemaType getSchemaType() {
    return schemaType;
  }

  public void setSchemaType(EnumSchemaType schemaType) {
    this.schemaType = schemaType;
  }

  public SpuAttributes4101Response url(String url) {
    this.url = url;
    return this;
  }

   /**
   * 详情页链接
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SpuAttributes4101Response platformSource(EnumPlatformSource platformSource) {
    this.platformSource = platformSource;
    return this;
  }

   /**
   * 平台来源枚举（16电商小店）
   * @return platformSource
  **/
  public EnumPlatformSource getPlatformSource() {
    return platformSource;
  }

  public void setPlatformSource(EnumPlatformSource platformSource) {
    this.platformSource = platformSource;
  }

  public SpuAttributes4101Response platformName(String platformName) {
    this.platformName = platformName;
    return this;
  }

   /**
   * 平台名称
   * @return platformName
  **/
  public String getPlatformName() {
    return platformName;
  }

  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }

  public SpuAttributes4101Response isTest(Integer isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * 主要用于联调，1-使用测试版的小程序，0或者不填-使用正式版小程序
   * @return isTest
  **/
  public Integer getIsTest() {
    return isTest;
  }

  public void setIsTest(Integer isTest) {
    this.isTest = isTest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes4101Response spuAttributes4101Response = (SpuAttributes4101Response) o;
    return Objects.equals(this.schemaType, spuAttributes4101Response.schemaType) &&
        Objects.equals(this.url, spuAttributes4101Response.url) &&
        Objects.equals(this.platformSource, spuAttributes4101Response.platformSource) &&
        Objects.equals(this.platformName, spuAttributes4101Response.platformName) &&
        Objects.equals(this.isTest, spuAttributes4101Response.isTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaType, url, platformSource, platformName, isTest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes4101Response {\n");
    
    sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    platformSource: ").append(toIndentedString(platformSource)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
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

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
 * 从当前时刻看，最早能被订到的门票时间
 */

public class SpuAttributes90201 {
  /**
   * 时间格式 1-最早可订今日，2-最早可订明日, 3-最早可订MM月dd日, 4-HH:mm前可订当日, 5-需提前x天预订
   */
  @JsonAdapter(EnumTimeType.Adapter.class)
  public enum EnumTimeType {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5);

    private Integer value;

    EnumTimeType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumTimeType fromValue(String text) {
      for (EnumTimeType b : EnumTimeType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumTimeType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumTimeType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumTimeType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumTimeType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("time_type")
  private EnumTimeType timeType = null;

  @SerializedName("time")
  private String time = null;

  public SpuAttributes90201 timeType(EnumTimeType timeType) {
    this.timeType = timeType;
    return this;
  }

   /**
   * 时间格式 1-最早可订今日，2-最早可订明日, 3-最早可订MM月dd日, 4-HH:mm前可订当日, 5-需提前x天预订
   * @return timeType
  **/
  public EnumTimeType getTimeType() {
    return timeType;
  }

  public void setTimeType(EnumTimeType timeType) {
    this.timeType = timeType;
  }

  public SpuAttributes90201 time(String time) {
    this.time = time;
    return this;
  }

   /**
   * time_type为3时该字段必选(yyyyMMdd格式)，time_type为4时该字段必选(HH:mm格式), time_type为5时该字段必选(x格式)
   * @return time
  **/
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes90201 spuAttributes90201 = (SpuAttributes90201) o;
    return Objects.equals(this.timeType, spuAttributes90201.timeType) &&
        Objects.equals(this.time, spuAttributes90201.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeType, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes90201 {\n");
    
    sb.append("    timeType: ").append(toIndentedString(timeType)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

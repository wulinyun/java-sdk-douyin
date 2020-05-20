/*
 * 获取应用推送事件订阅状态
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
 * EventStatus
 */

public class EventStatus {
  @SerializedName("event")
  private String event = null;

  /**
   * 事件订阅状态 * &#x60;0&#x60; - 未订阅 * &#x60;1&#x60; - 已订阅
   */
  @JsonAdapter(EnumStatus.Adapter.class)
  public enum EnumStatus {
    NUMBER_0(0),
    NUMBER_1(1);

    private Integer value;

    EnumStatus(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumStatus fromValue(String text) {
      for (EnumStatus b : EnumStatus.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumStatus> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumStatus enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumStatus read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumStatus.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private EnumStatus status = null;

  public EventStatus event(String event) {
    this.event = event;
    return this;
  }

   /**
   * 推送事件名称
   * @return event
  **/
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public EventStatus status(EnumStatus status) {
    this.status = status;
    return this;
  }

   /**
   * 事件订阅状态 * &#x60;0&#x60; - 未订阅 * &#x60;1&#x60; - 已订阅
   * @return status
  **/
  public EnumStatus getStatus() {
    return status;
  }

  public void setStatus(EnumStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventStatus eventStatus = (EventStatus) o;
    return Objects.equals(this.event, eventStatus.event) &&
        Objects.equals(this.status, eventStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStatus {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

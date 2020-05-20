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
 * SandboxWebhookEventSendBody
 */

public class SandboxWebhookEventSendBody {
  /**
   * 需要mock的事件类型, 开放平台会通过webhook发送一条mock数据给你
   */
  @JsonAdapter(EnumEventType.Adapter.class)
  public enum EnumEventType {
    CREATE_VIDEO("create_video"),
    AUTHORIZE("authorize"),
    RECEIVE_MSG("receive_msg"),
    ENTER_IM("enter_im"),
    DIAL_PHONE("dial_phone"),
    WEBSITE_CONTACT("website_contact"),
    PERSONAL_TAB_CONTACT("personal_tab_contact"),
    VERIFY_WEBHOOK("verify_webhook");

    private String value;

    EnumEventType(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumEventType fromValue(String text) {
      for (EnumEventType b : EnumEventType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumEventType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumEventType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumEventType read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnumEventType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("event_type")
  private EnumEventType eventType = null;

  public SandboxWebhookEventSendBody eventType(EnumEventType eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * 需要mock的事件类型, 开放平台会通过webhook发送一条mock数据给你
   * @return eventType
  **/
  public EnumEventType getEventType() {
    return eventType;
  }

  public void setEventType(EnumEventType eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxWebhookEventSendBody sandboxWebhookEventSendBody = (SandboxWebhookEventSendBody) o;
    return Objects.equals(this.eventType, sandboxWebhookEventSendBody.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxWebhookEventSendBody {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

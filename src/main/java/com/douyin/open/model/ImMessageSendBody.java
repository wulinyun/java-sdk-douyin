/*
 * 发送消息
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
 * ImMessageSendBody
 */

public class ImMessageSendBody {
  @SerializedName("to_user_id")
  private String toUserId = null;

  /**
   * 消息内容格式:   * &#x60;text&#x60; - 文本消息   * &#x60;image&#x60; - 图片消息 
   */
  @JsonAdapter(EnumMessageType.Adapter.class)
  public enum EnumMessageType {
    TEXT("text"),
    IMAGE("image");

    private String value;

    EnumMessageType(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumMessageType fromValue(String text) {
      for (EnumMessageType b : EnumMessageType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumMessageType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumMessageType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumMessageType read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnumMessageType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("message_type")
  private EnumMessageType messageType = null;

  @SerializedName("content")
  private String content = null;

  public ImMessageSendBody toUserId(String toUserId) {
    this.toUserId = toUserId;
    return this;
  }

   /**
   * 发送消息的接收方openid
   * @return toUserId
  **/
  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }

  public ImMessageSendBody messageType(EnumMessageType messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * 消息内容格式:   * &#x60;text&#x60; - 文本消息   * &#x60;image&#x60; - 图片消息 
   * @return messageType
  **/
  public EnumMessageType getMessageType() {
    return messageType;
  }

  public void setMessageType(EnumMessageType messageType) {
    this.messageType = messageType;
  }

  public ImMessageSendBody content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 文本内容 或 素材id
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImMessageSendBody imMessageSendBody = (ImMessageSendBody) o;
    return Objects.equals(this.toUserId, imMessageSendBody.toUserId) &&
        Objects.equals(this.messageType, imMessageSendBody.messageType) &&
        Objects.equals(this.content, imMessageSendBody.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toUserId, messageType, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImMessageSendBody {\n");
    
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

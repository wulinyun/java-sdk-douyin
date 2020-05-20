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
 * ReceiveMsg
 */

public class ReceiveMsg {
  @SerializedName("event")
  private String event = null;

  @SerializedName("from_user_id")
  private String fromUserId = null;

  @SerializedName("to_user_id")
  private String toUserId = null;

  @SerializedName("client_key")
  private String clientKey = null;

  @SerializedName("content")
  private Object content = null;

  public ReceiveMsg event(String event) {
    this.event = event;
    return this;
  }

   /**
   * 事件名为receive_msg
   * @return event
  **/
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public ReceiveMsg fromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
    return this;
  }

   /**
   * 事件发起用户user_id
   * @return fromUserId
  **/
  public String getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
  }

  public ReceiveMsg toUserId(String toUserId) {
    this.toUserId = toUserId;
    return this;
  }

   /**
   * 事件接收用户user_id
   * @return toUserId
  **/
  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }

  public ReceiveMsg clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * 使用应用的client_key
   * @return clientKey
  **/
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public ReceiveMsg content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * 具体见私信事件列表
   * @return content
  **/
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
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
    ReceiveMsg receiveMsg = (ReceiveMsg) o;
    return Objects.equals(this.event, receiveMsg.event) &&
        Objects.equals(this.fromUserId, receiveMsg.fromUserId) &&
        Objects.equals(this.toUserId, receiveMsg.toUserId) &&
        Objects.equals(this.clientKey, receiveMsg.clientKey) &&
        Objects.equals(this.content, receiveMsg.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, fromUserId, toUserId, clientKey, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiveMsg {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
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

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
import com.douyin.open.model.AuthorizeContent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Authorize
 */

public class Authorize {
  @SerializedName("event")
  private String event = null;

  @SerializedName("from_user_id")
  private String fromUserId = null;

  @SerializedName("client_key")
  private String clientKey = null;

  @SerializedName("content")
  private AuthorizeContent content = null;

  public Authorize event(String event) {
    this.event = event;
    return this;
  }

   /**
   * 事件名为authorize
   * @return event
  **/
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public Authorize fromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
    return this;
  }

   /**
   * 授权用户user_id
   * @return fromUserId
  **/
  public String getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
  }

  public Authorize clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * 授权应用的client_key
   * @return clientKey
  **/
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public Authorize content(AuthorizeContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public AuthorizeContent getContent() {
    return content;
  }

  public void setContent(AuthorizeContent content) {
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
    Authorize authorize = (Authorize) o;
    return Objects.equals(this.event, authorize.event) &&
        Objects.equals(this.fromUserId, authorize.fromUserId) &&
        Objects.equals(this.clientKey, authorize.clientKey) &&
        Objects.equals(this.content, authorize.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, fromUserId, clientKey, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorize {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
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

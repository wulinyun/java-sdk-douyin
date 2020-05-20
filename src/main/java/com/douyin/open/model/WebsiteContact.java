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
 * WebsiteContact
 */

public class WebsiteContact {
  @SerializedName("event")
  private String event = null;

  @SerializedName("from_user_id")
  private String fromUserId = null;

  @SerializedName("to_user_id")
  private String toUserId = null;

  @SerializedName("client_key")
  private String clientKey = null;

  public WebsiteContact event(String event) {
    this.event = event;
    return this;
  }

   /**
   * 事件名为website_contact
   * @return event
  **/
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public WebsiteContact fromUserId(String fromUserId) {
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

  public WebsiteContact toUserId(String toUserId) {
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

  public WebsiteContact clientKey(String clientKey) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteContact websiteContact = (WebsiteContact) o;
    return Objects.equals(this.event, websiteContact.event) &&
        Objects.equals(this.fromUserId, websiteContact.fromUserId) &&
        Objects.equals(this.toUserId, websiteContact.toUserId) &&
        Objects.equals(this.clientKey, websiteContact.clientKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, fromUserId, toUserId, clientKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteContact {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
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

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
 * CreateVideoContent
 */

public class CreateVideoContent {
  @SerializedName("item_id")
  private String itemId = null;

  @SerializedName("share_id")
  private String shareId = null;

  public CreateVideoContent itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 创建的视频id
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CreateVideoContent shareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

   /**
   * 标识分享的share_id
   * @return shareId
  **/
  public String getShareId() {
    return shareId;
  }

  public void setShareId(String shareId) {
    this.shareId = shareId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVideoContent createVideoContent = (CreateVideoContent) o;
    return Objects.equals(this.itemId, createVideoContent.itemId) &&
        Objects.equals(this.shareId, createVideoContent.shareId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, shareId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVideoContent {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
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

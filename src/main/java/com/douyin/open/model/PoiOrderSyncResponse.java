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
 * 小程序形式对接抖音时，该字段必传
 */

public class PoiOrderSyncResponse {
  @SerializedName("app_id")
  private String appId = null;

  @SerializedName("user_open_id")
  private String userOpenId = null;

  public PoiOrderSyncResponse appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * 小程序的appid
   * @return appId
  **/
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public PoiOrderSyncResponse userOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
    return this;
  }

   /**
   * 用户的抖音小程序openid
   * @return userOpenId
  **/
  public String getUserOpenId() {
    return userOpenId;
  }

  public void setUserOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiOrderSyncResponse poiOrderSyncResponse = (PoiOrderSyncResponse) o;
    return Objects.equals(this.appId, poiOrderSyncResponse.appId) &&
        Objects.equals(this.userOpenId, poiOrderSyncResponse.userOpenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userOpenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderSyncResponse {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userOpenId: ").append(toIndentedString(userOpenId)).append("\n");
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

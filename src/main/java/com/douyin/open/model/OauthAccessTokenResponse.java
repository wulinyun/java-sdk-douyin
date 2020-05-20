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
import com.douyin.open.model.OauthAccessTokenResponseData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OauthAccessTokenResponse
 */

public class OauthAccessTokenResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("data")
  private OauthAccessTokenResponseData data = null;

  public OauthAccessTokenResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OauthAccessTokenResponse data(OauthAccessTokenResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public OauthAccessTokenResponseData getData() {
    return data;
  }

  public void setData(OauthAccessTokenResponseData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponse oauthAccessTokenResponse = (OauthAccessTokenResponse) o;
    return Objects.equals(this.message, oauthAccessTokenResponse.message) &&
        Objects.equals(this.data, oauthAccessTokenResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

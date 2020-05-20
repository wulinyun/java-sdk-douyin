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
 * OauthClientTokenResponseData
 */

public class OauthClientTokenResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private String expiresIn = null;

  public OauthClientTokenResponseData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public OauthClientTokenResponseData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OauthClientTokenResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * 接口调用凭证
   * @return accessToken
  **/
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthClientTokenResponseData expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * access_token接口调用凭证超时时间，单位（秒
   * @return expiresIn
  **/
  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthClientTokenResponseData oauthClientTokenResponseData = (OauthClientTokenResponseData) o;
    return Objects.equals(this.errorCode, oauthClientTokenResponseData.errorCode) &&
        Objects.equals(this.description, oauthClientTokenResponseData.description) &&
        Objects.equals(this.accessToken, oauthClientTokenResponseData.accessToken) &&
        Objects.equals(this.expiresIn, oauthClientTokenResponseData.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, accessToken, expiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthClientTokenResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

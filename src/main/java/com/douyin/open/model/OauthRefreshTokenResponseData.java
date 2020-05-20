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
 * OauthRefreshTokenResponseData
 */

public class OauthRefreshTokenResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private String expiresIn = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("open_id")
  private String openId = null;

  @SerializedName("scope")
  private String scope = null;

  public OauthRefreshTokenResponseData errorCode(Integer errorCode) {
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

  public OauthRefreshTokenResponseData description(String description) {
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

  public OauthRefreshTokenResponseData accessToken(String accessToken) {
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

  public OauthRefreshTokenResponseData expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 过期时间，单位（秒）
   * @return expiresIn
  **/
  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthRefreshTokenResponseData refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 用户刷新
   * @return refreshToken
  **/
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthRefreshTokenResponseData openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 当前应用下，授权用户唯一标识
   * @return openId
  **/
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public OauthRefreshTokenResponseData scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * 用户授权的作用域
   * @return scope
  **/
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthRefreshTokenResponseData oauthRefreshTokenResponseData = (OauthRefreshTokenResponseData) o;
    return Objects.equals(this.errorCode, oauthRefreshTokenResponseData.errorCode) &&
        Objects.equals(this.description, oauthRefreshTokenResponseData.description) &&
        Objects.equals(this.accessToken, oauthRefreshTokenResponseData.accessToken) &&
        Objects.equals(this.expiresIn, oauthRefreshTokenResponseData.expiresIn) &&
        Objects.equals(this.refreshToken, oauthRefreshTokenResponseData.refreshToken) &&
        Objects.equals(this.openId, oauthRefreshTokenResponseData.openId) &&
        Objects.equals(this.scope, oauthRefreshTokenResponseData.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, accessToken, expiresIn, refreshToken, openId, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthRefreshTokenResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

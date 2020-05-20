/*
 * 企业号信息查询
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.model;

import java.util.Objects;
import java.util.Arrays;
import com.douyin.open.model.TransformModule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseInfoResponseData
 */

public class EnterpriseInfoResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("open_id")
  private String openId = null;

  @SerializedName("unique_id")
  private String uniqueId = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("head_image")
  private String headImage = null;

  @SerializedName("trans_modules")
  private List<TransformModule> transModules = null;

  public EnterpriseInfoResponseData errorCode(Integer errorCode) {
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

  public EnterpriseInfoResponseData description(String description) {
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

  public EnterpriseInfoResponseData openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 用户在当前应用的唯一标识
   * @return openId
  **/
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public EnterpriseInfoResponseData uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * 抖音端上可见uid
   * @return uniqueId
  **/
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public EnterpriseInfoResponseData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public EnterpriseInfoResponseData avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public EnterpriseInfoResponseData signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * 签名
   * @return signature
  **/
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public EnterpriseInfoResponseData headImage(String headImage) {
    this.headImage = headImage;
    return this;
  }

   /**
   * 头图
   * @return headImage
  **/
  public String getHeadImage() {
    return headImage;
  }

  public void setHeadImage(String headImage) {
    this.headImage = headImage;
  }

  public EnterpriseInfoResponseData transModules(List<TransformModule> transModules) {
    this.transModules = transModules;
    return this;
  }

  public EnterpriseInfoResponseData addTransModulesItem(TransformModule transModulesItem) {
    if (this.transModules == null) {
      this.transModules = new ArrayList<TransformModule>();
    }
    this.transModules.add(transModulesItem);
    return this;
  }

   /**
   * Get transModules
   * @return transModules
  **/
  public List<TransformModule> getTransModules() {
    return transModules;
  }

  public void setTransModules(List<TransformModule> transModules) {
    this.transModules = transModules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseInfoResponseData enterpriseInfoResponseData = (EnterpriseInfoResponseData) o;
    return Objects.equals(this.errorCode, enterpriseInfoResponseData.errorCode) &&
        Objects.equals(this.description, enterpriseInfoResponseData.description) &&
        Objects.equals(this.openId, enterpriseInfoResponseData.openId) &&
        Objects.equals(this.uniqueId, enterpriseInfoResponseData.uniqueId) &&
        Objects.equals(this.nickname, enterpriseInfoResponseData.nickname) &&
        Objects.equals(this.avatar, enterpriseInfoResponseData.avatar) &&
        Objects.equals(this.signature, enterpriseInfoResponseData.signature) &&
        Objects.equals(this.headImage, enterpriseInfoResponseData.headImage) &&
        Objects.equals(this.transModules, enterpriseInfoResponseData.transModules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, openId, uniqueId, nickname, avatar, signature, headImage, transModules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseInfoResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    headImage: ").append(toIndentedString(headImage)).append("\n");
    sb.append("    transModules: ").append(toIndentedString(transModules)).append("\n");
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

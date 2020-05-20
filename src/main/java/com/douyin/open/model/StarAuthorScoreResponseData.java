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
 * StarAuthorScoreResponseData
 */

public class StarAuthorScoreResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("update_timestamp")
  private Integer updateTimestamp = null;

  @SerializedName("nick_name")
  private String nickName = null;

  @SerializedName("follower")
  private Integer follower = null;

  @SerializedName("spread_score")
  private Double spreadScore = null;

  @SerializedName("cp_score")
  private Double cpScore = null;

  @SerializedName("growth_score")
  private Double growthScore = null;

  @SerializedName("cooperation_score")
  private Double cooperationScore = null;

  @SerializedName("shop_score")
  private Double shopScore = null;

  @SerializedName("star_score")
  private Double starScore = null;

  public StarAuthorScoreResponseData errorCode(Integer errorCode) {
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

  public StarAuthorScoreResponseData description(String description) {
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

  public StarAuthorScoreResponseData updateTimestamp(Integer updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * 达人指数更新时间戳
   * @return updateTimestamp
  **/
  public Integer getUpdateTimestamp() {
    return updateTimestamp;
  }

  public void setUpdateTimestamp(Integer updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }

  public StarAuthorScoreResponseData nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * 达人昵称
   * @return nickName
  **/
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public StarAuthorScoreResponseData follower(Integer follower) {
    this.follower = follower;
    return this;
  }

   /**
   * 粉丝数
   * @return follower
  **/
  public Integer getFollower() {
    return follower;
  }

  public void setFollower(Integer follower) {
    this.follower = follower;
  }

  public StarAuthorScoreResponseData spreadScore(Double spreadScore) {
    this.spreadScore = spreadScore;
    return this;
  }

   /**
   * 传播指数
   * @return spreadScore
  **/
  public Double getSpreadScore() {
    return spreadScore;
  }

  public void setSpreadScore(Double spreadScore) {
    this.spreadScore = spreadScore;
  }

  public StarAuthorScoreResponseData cpScore(Double cpScore) {
    this.cpScore = cpScore;
    return this;
  }

   /**
   * 性价比指数
   * @return cpScore
  **/
  public Double getCpScore() {
    return cpScore;
  }

  public void setCpScore(Double cpScore) {
    this.cpScore = cpScore;
  }

  public StarAuthorScoreResponseData growthScore(Double growthScore) {
    this.growthScore = growthScore;
    return this;
  }

   /**
   * 涨粉指数
   * @return growthScore
  **/
  public Double getGrowthScore() {
    return growthScore;
  }

  public void setGrowthScore(Double growthScore) {
    this.growthScore = growthScore;
  }

  public StarAuthorScoreResponseData cooperationScore(Double cooperationScore) {
    this.cooperationScore = cooperationScore;
    return this;
  }

   /**
   * 合作指数
   * @return cooperationScore
  **/
  public Double getCooperationScore() {
    return cooperationScore;
  }

  public void setCooperationScore(Double cooperationScore) {
    this.cooperationScore = cooperationScore;
  }

  public StarAuthorScoreResponseData shopScore(Double shopScore) {
    this.shopScore = shopScore;
    return this;
  }

   /**
   * 种草指数
   * @return shopScore
  **/
  public Double getShopScore() {
    return shopScore;
  }

  public void setShopScore(Double shopScore) {
    this.shopScore = shopScore;
  }

  public StarAuthorScoreResponseData starScore(Double starScore) {
    this.starScore = starScore;
    return this;
  }

   /**
   * 星图指数
   * @return starScore
  **/
  public Double getStarScore() {
    return starScore;
  }

  public void setStarScore(Double starScore) {
    this.starScore = starScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarAuthorScoreResponseData starAuthorScoreResponseData = (StarAuthorScoreResponseData) o;
    return Objects.equals(this.errorCode, starAuthorScoreResponseData.errorCode) &&
        Objects.equals(this.description, starAuthorScoreResponseData.description) &&
        Objects.equals(this.updateTimestamp, starAuthorScoreResponseData.updateTimestamp) &&
        Objects.equals(this.nickName, starAuthorScoreResponseData.nickName) &&
        Objects.equals(this.follower, starAuthorScoreResponseData.follower) &&
        Objects.equals(this.spreadScore, starAuthorScoreResponseData.spreadScore) &&
        Objects.equals(this.cpScore, starAuthorScoreResponseData.cpScore) &&
        Objects.equals(this.growthScore, starAuthorScoreResponseData.growthScore) &&
        Objects.equals(this.cooperationScore, starAuthorScoreResponseData.cooperationScore) &&
        Objects.equals(this.shopScore, starAuthorScoreResponseData.shopScore) &&
        Objects.equals(this.starScore, starAuthorScoreResponseData.starScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, updateTimestamp, nickName, follower, spreadScore, cpScore, growthScore, cooperationScore, shopScore, starScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarAuthorScoreResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    follower: ").append(toIndentedString(follower)).append("\n");
    sb.append("    spreadScore: ").append(toIndentedString(spreadScore)).append("\n");
    sb.append("    cpScore: ").append(toIndentedString(cpScore)).append("\n");
    sb.append("    growthScore: ").append(toIndentedString(growthScore)).append("\n");
    sb.append("    cooperationScore: ").append(toIndentedString(cooperationScore)).append("\n");
    sb.append("    shopScore: ").append(toIndentedString(shopScore)).append("\n");
    sb.append("    starScore: ").append(toIndentedString(starScore)).append("\n");
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

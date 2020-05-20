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
 * ExternalUserProfile
 */

public class ExternalUserProfile {
  @SerializedName("date")
  private String date = null;

  @SerializedName("profile_uv")
  private Integer profileUv = null;

  public ExternalUserProfile date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExternalUserProfile profileUv(Integer profileUv) {
    this.profileUv = profileUv;
    return this;
  }

   /**
   * 当日个人主页访问人数
   * @return profileUv
  **/
  public Integer getProfileUv() {
    return profileUv;
  }

  public void setProfileUv(Integer profileUv) {
    this.profileUv = profileUv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUserProfile externalUserProfile = (ExternalUserProfile) o;
    return Objects.equals(this.date, externalUserProfile.date) &&
        Objects.equals(this.profileUv, externalUserProfile.profileUv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, profileUv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUserProfile {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    profileUv: ").append(toIndentedString(profileUv)).append("\n");
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

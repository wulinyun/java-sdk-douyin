/*
 * 
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DataFansPortraitResponseData
 */

public class DataFansPortraitResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("active")
  private String active = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("age")
  private String age = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("device")
  private String device = null;

  @SerializedName("hobby")
  private String hobby = null;

  public DataFansPortraitResponseData errorCode(Integer errorCode) {
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

  public DataFansPortraitResponseData description(String description) {
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

  public DataFansPortraitResponseData active(String active) {
    this.active = active;
    return this;
  }

   /**
   * 粉丝活跃分布
   * @return active
  **/
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public DataFansPortraitResponseData gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 粉丝性别分布
   * @return gender
  **/
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public DataFansPortraitResponseData age(String age) {
    this.age = age;
    return this;
  }

   /**
   * 粉丝年龄分布
   * @return age
  **/
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public DataFansPortraitResponseData region(String region) {
    this.region = region;
    return this;
  }

   /**
   * 粉丝地域分布
   * @return region
  **/
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public DataFansPortraitResponseData device(String device) {
    this.device = device;
    return this;
  }

   /**
   * 粉丝设备分布
   * @return device
  **/
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public DataFansPortraitResponseData hobby(String hobby) {
    this.hobby = hobby;
    return this;
  }

   /**
   * 粉丝兴趣分布
   * @return hobby
  **/
  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFansPortraitResponseData dataFansPortraitResponseData = (DataFansPortraitResponseData) o;
    return Objects.equals(this.errorCode, dataFansPortraitResponseData.errorCode) &&
        Objects.equals(this.description, dataFansPortraitResponseData.description) &&
        Objects.equals(this.active, dataFansPortraitResponseData.active) &&
        Objects.equals(this.gender, dataFansPortraitResponseData.gender) &&
        Objects.equals(this.age, dataFansPortraitResponseData.age) &&
        Objects.equals(this.region, dataFansPortraitResponseData.region) &&
        Objects.equals(this.device, dataFansPortraitResponseData.device) &&
        Objects.equals(this.hobby, dataFansPortraitResponseData.hobby);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, active, gender, age, region, device, hobby);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFansPortraitResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    hobby: ").append(toIndentedString(hobby)).append("\n");
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

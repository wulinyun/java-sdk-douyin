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
 * PoiExtHotelOrderCommitResponse
 */

public class PoiExtHotelOrderCommitResponse {
  @SerializedName("surname")
  private String surname = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("cn_name")
  private String cnName = null;

  public PoiExtHotelOrderCommitResponse surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * 英文姓
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public PoiExtHotelOrderCommitResponse givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * 英文名
   * @return givenName
  **/
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public PoiExtHotelOrderCommitResponse cnName(String cnName) {
    this.cnName = cnName;
    return this;
  }

   /**
   * 中文全称
   * @return cnName
  **/
  public String getCnName() {
    return cnName;
  }

  public void setCnName(String cnName) {
    this.cnName = cnName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiExtHotelOrderCommitResponse poiExtHotelOrderCommitResponse = (PoiExtHotelOrderCommitResponse) o;
    return Objects.equals(this.surname, poiExtHotelOrderCommitResponse.surname) &&
        Objects.equals(this.givenName, poiExtHotelOrderCommitResponse.givenName) &&
        Objects.equals(this.cnName, poiExtHotelOrderCommitResponse.cnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, givenName, cnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelOrderCommitResponse {\n");
    
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
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

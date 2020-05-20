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
import java.math.BigDecimal;
/**
 * PoiQueryResponseData
 */

public class PoiQueryResponseData {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("poi_name")
  private String poiName = null;

  @SerializedName("amap_id")
  private String amapId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  public PoiQueryResponseData poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 抖音POI ID
   * @return poiId
  **/
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public PoiQueryResponseData poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * POI 名称
   * @return poiName
  **/
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public PoiQueryResponseData amapId(String amapId) {
    this.amapId = amapId;
    return this;
  }

   /**
   * 高德POI ID
   * @return amapId
  **/
  public String getAmapId() {
    return amapId;
  }

  public void setAmapId(String amapId) {
    this.amapId = amapId;
  }

  public PoiQueryResponseData address(String address) {
    this.address = address;
    return this;
  }

   /**
   * POI地址
   * @return address
  **/
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PoiQueryResponseData city(String city) {
    this.city = city;
    return this;
  }

   /**
   * POI所在城市
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PoiQueryResponseData latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度
   * @return latitude
  **/
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public PoiQueryResponseData longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度
   * @return longitude
  **/
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public PoiQueryResponseData errorCode(Integer errorCode) {
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

  public PoiQueryResponseData description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiQueryResponseData poiQueryResponseData = (PoiQueryResponseData) o;
    return Objects.equals(this.poiId, poiQueryResponseData.poiId) &&
        Objects.equals(this.poiName, poiQueryResponseData.poiName) &&
        Objects.equals(this.amapId, poiQueryResponseData.amapId) &&
        Objects.equals(this.address, poiQueryResponseData.address) &&
        Objects.equals(this.city, poiQueryResponseData.city) &&
        Objects.equals(this.latitude, poiQueryResponseData.latitude) &&
        Objects.equals(this.longitude, poiQueryResponseData.longitude) &&
        Objects.equals(this.errorCode, poiQueryResponseData.errorCode) &&
        Objects.equals(this.description, poiQueryResponseData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiId, poiName, amapId, address, city, latitude, longitude, errorCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiQueryResponseData {\n");
    
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    amapId: ").append(toIndentedString(amapId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

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
 * Poi
 */

public class Poi {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("poi_name")
  private String poiName = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("province")
  private String province = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("city_code")
  private String cityCode = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("address")
  private String address = null;

  public Poi poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 唯一ID
   * @return poiId
  **/
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public Poi poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * 名称
   * @return poiName
  **/
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public Poi location(String location) {
    this.location = location;
    return this;
  }

   /**
   * 经纬度，格式：X,Y
   * @return location
  **/
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Poi country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 国家
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Poi countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 国家编码
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Poi province(String province) {
    this.province = province;
    return this;
  }

   /**
   * 省份
   * @return province
  **/
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public Poi city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 城市
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Poi cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码
   * @return cityCode
  **/
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public Poi district(String district) {
    this.district = district;
    return this;
  }

   /**
   * 区域名称
   * @return district
  **/
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Poi address(String address) {
    this.address = address;
    return this;
  }

   /**
   * 地址
   * @return address
  **/
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poi poi = (Poi) o;
    return Objects.equals(this.poiId, poi.poiId) &&
        Objects.equals(this.poiName, poi.poiName) &&
        Objects.equals(this.location, poi.location) &&
        Objects.equals(this.country, poi.country) &&
        Objects.equals(this.countryCode, poi.countryCode) &&
        Objects.equals(this.province, poi.province) &&
        Objects.equals(this.city, poi.city) &&
        Objects.equals(this.cityCode, poi.cityCode) &&
        Objects.equals(this.district, poi.district) &&
        Objects.equals(this.address, poi.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiId, poiName, location, country, countryCode, province, city, cityCode, district, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poi {\n");
    
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

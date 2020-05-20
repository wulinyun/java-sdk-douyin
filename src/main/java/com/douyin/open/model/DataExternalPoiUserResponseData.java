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
import com.douyin.open.model.ExternalPoiUser;
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
 * DataExternalPoiUserResponseData
 */

public class DataExternalPoiUserResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("gender_list")
  private List<ExternalPoiUser> genderList = null;

  @SerializedName("age_list")
  private List<ExternalPoiUser> ageList = null;

  @SerializedName("city_list")
  private List<ExternalPoiUser> cityList = null;

  public DataExternalPoiUserResponseData errorCode(Integer errorCode) {
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

  public DataExternalPoiUserResponseData description(String description) {
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

  public DataExternalPoiUserResponseData genderList(List<ExternalPoiUser> genderList) {
    this.genderList = genderList;
    return this;
  }

  public DataExternalPoiUserResponseData addGenderListItem(ExternalPoiUser genderListItem) {
    if (this.genderList == null) {
      this.genderList = new ArrayList<ExternalPoiUser>();
    }
    this.genderList.add(genderListItem);
    return this;
  }

   /**
   * Get genderList
   * @return genderList
  **/
  public List<ExternalPoiUser> getGenderList() {
    return genderList;
  }

  public void setGenderList(List<ExternalPoiUser> genderList) {
    this.genderList = genderList;
  }

  public DataExternalPoiUserResponseData ageList(List<ExternalPoiUser> ageList) {
    this.ageList = ageList;
    return this;
  }

  public DataExternalPoiUserResponseData addAgeListItem(ExternalPoiUser ageListItem) {
    if (this.ageList == null) {
      this.ageList = new ArrayList<ExternalPoiUser>();
    }
    this.ageList.add(ageListItem);
    return this;
  }

   /**
   * Get ageList
   * @return ageList
  **/
  public List<ExternalPoiUser> getAgeList() {
    return ageList;
  }

  public void setAgeList(List<ExternalPoiUser> ageList) {
    this.ageList = ageList;
  }

  public DataExternalPoiUserResponseData cityList(List<ExternalPoiUser> cityList) {
    this.cityList = cityList;
    return this;
  }

  public DataExternalPoiUserResponseData addCityListItem(ExternalPoiUser cityListItem) {
    if (this.cityList == null) {
      this.cityList = new ArrayList<ExternalPoiUser>();
    }
    this.cityList.add(cityListItem);
    return this;
  }

   /**
   * Get cityList
   * @return cityList
  **/
  public List<ExternalPoiUser> getCityList() {
    return cityList;
  }

  public void setCityList(List<ExternalPoiUser> cityList) {
    this.cityList = cityList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataExternalPoiUserResponseData dataExternalPoiUserResponseData = (DataExternalPoiUserResponseData) o;
    return Objects.equals(this.errorCode, dataExternalPoiUserResponseData.errorCode) &&
        Objects.equals(this.description, dataExternalPoiUserResponseData.description) &&
        Objects.equals(this.genderList, dataExternalPoiUserResponseData.genderList) &&
        Objects.equals(this.ageList, dataExternalPoiUserResponseData.ageList) &&
        Objects.equals(this.cityList, dataExternalPoiUserResponseData.cityList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, genderList, ageList, cityList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataExternalPoiUserResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    genderList: ").append(toIndentedString(genderList)).append("\n");
    sb.append("    ageList: ").append(toIndentedString(ageList)).append("\n");
    sb.append("    cityList: ").append(toIndentedString(cityList)).append("\n");
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

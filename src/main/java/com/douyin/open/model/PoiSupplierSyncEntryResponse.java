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
 * 抖音小程序入口参数
 */

public class PoiSupplierSyncEntryResponse {
  @SerializedName("app_id")
  private String appId = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("params")
  private String params = null;

  @SerializedName("is_test")
  private Integer isTest = null;

  public PoiSupplierSyncEntryResponse appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * 小程序的appid
   * @return appId
  **/
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public PoiSupplierSyncEntryResponse path(String path) {
    this.path = path;
    return this;
  }

   /**
   * 服务路径
   * @return path
  **/
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PoiSupplierSyncEntryResponse params(String params) {
    this.params = params;
    return this;
  }

   /**
   * 服务参数json
   * @return params
  **/
  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }

  public PoiSupplierSyncEntryResponse isTest(Integer isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * 主要用于联调，1-使用测试版的小程序，0或者不填-使用正式版小程序
   * @return isTest
  **/
  public Integer getIsTest() {
    return isTest;
  }

  public void setIsTest(Integer isTest) {
    this.isTest = isTest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSyncEntryResponse poiSupplierSyncEntryResponse = (PoiSupplierSyncEntryResponse) o;
    return Objects.equals(this.appId, poiSupplierSyncEntryResponse.appId) &&
        Objects.equals(this.path, poiSupplierSyncEntryResponse.path) &&
        Objects.equals(this.params, poiSupplierSyncEntryResponse.params) &&
        Objects.equals(this.isTest, poiSupplierSyncEntryResponse.isTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, path, params, isTest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSyncEntryResponse {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
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

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
 * CallMetrics
 */

public class CallMetrics {
  @SerializedName("date_time")
  private String dateTime = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("interface")
  private String _interface = null;

  @SerializedName("pv")
  private Integer pv = null;

  public CallMetrics dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * 时间
   * @return dateTime
  **/
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public CallMetrics scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * scope
   * @return scope
  **/
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public CallMetrics _interface(String _interface) {
    this._interface = _interface;
    return this;
  }

   /**
   * 访问链接
   * @return _interface
  **/
  public String getInterface() {
    return _interface;
  }

  public void setInterface(String _interface) {
    this._interface = _interface;
  }

  public CallMetrics pv(Integer pv) {
    this.pv = pv;
    return this;
  }

   /**
   * pv
   * @return pv
  **/
  public Integer getPv() {
    return pv;
  }

  public void setPv(Integer pv) {
    this.pv = pv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallMetrics callMetrics = (CallMetrics) o;
    return Objects.equals(this.dateTime, callMetrics.dateTime) &&
        Objects.equals(this.scope, callMetrics.scope) &&
        Objects.equals(this._interface, callMetrics._interface) &&
        Objects.equals(this.pv, callMetrics.pv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, scope, _interface, pv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallMetrics {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    pv: ").append(toIndentedString(pv)).append("\n");
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

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
import java.util.ArrayList;
import java.util.List;
/**
 * DevtoolMonitorCallBody
 */

public class DevtoolMonitorCallBody {
  @SerializedName("scope_list")
  private List<String> scopeList = null;

  @SerializedName("interface_list")
  private List<String> interfaceList = null;

  public DevtoolMonitorCallBody scopeList(List<String> scopeList) {
    this.scopeList = scopeList;
    return this;
  }

  public DevtoolMonitorCallBody addScopeListItem(String scopeListItem) {
    if (this.scopeList == null) {
      this.scopeList = new ArrayList<String>();
    }
    this.scopeList.add(scopeListItem);
    return this;
  }

   /**
   * scope支持批量查询
   * @return scopeList
  **/
  public List<String> getScopeList() {
    return scopeList;
  }

  public void setScopeList(List<String> scopeList) {
    this.scopeList = scopeList;
  }

  public DevtoolMonitorCallBody interfaceList(List<String> interfaceList) {
    this.interfaceList = interfaceList;
    return this;
  }

  public DevtoolMonitorCallBody addInterfaceListItem(String interfaceListItem) {
    if (this.interfaceList == null) {
      this.interfaceList = new ArrayList<String>();
    }
    this.interfaceList.add(interfaceListItem);
    return this;
  }

   /**
   * 接口支持批量查询
   * @return interfaceList
  **/
  public List<String> getInterfaceList() {
    return interfaceList;
  }

  public void setInterfaceList(List<String> interfaceList) {
    this.interfaceList = interfaceList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevtoolMonitorCallBody devtoolMonitorCallBody = (DevtoolMonitorCallBody) o;
    return Objects.equals(this.scopeList, devtoolMonitorCallBody.scopeList) &&
        Objects.equals(this.interfaceList, devtoolMonitorCallBody.interfaceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeList, interfaceList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevtoolMonitorCallBody {\n");
    
    sb.append("    scopeList: ").append(toIndentedString(scopeList)).append("\n");
    sb.append("    interfaceList: ").append(toIndentedString(interfaceList)).append("\n");
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

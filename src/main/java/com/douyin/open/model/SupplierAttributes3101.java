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
import com.douyin.open.model.NodeStruct;
import com.douyin.open.model.SupplierAttributes3101Facility;
import com.douyin.open.model.SupplierAttributes3101Response;
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
 * 景区须知
 */

public class SupplierAttributes3101 {
  @SerializedName("open_time")
  private String openTime = null;

  @SerializedName("open_time_ext")
  private List<NodeStruct> openTimeExt = null;

  @SerializedName("preferential_policy")
  private List<SupplierAttributes3101Response> preferentialPolicy = null;

  @SerializedName("preferential_policy_ext")
  private List<NodeStruct> preferentialPolicyExt = null;

  @SerializedName("facility")
  private List<SupplierAttributes3101Facility> facility = null;

  @SerializedName("play_intro")
  private List<NodeStruct> playIntro = null;

  @SerializedName("traffic")
  private List<NodeStruct> traffic = null;

  @SerializedName("pet")
  private Integer pet = null;

  @SerializedName("scenic_intro")
  private List<NodeStruct> scenicIntro = null;

  public SupplierAttributes3101 openTime(String openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * 开放时间
   * @return openTime
  **/
  public String getOpenTime() {
    return openTime;
  }

  public void setOpenTime(String openTime) {
    this.openTime = openTime;
  }

  public SupplierAttributes3101 openTimeExt(List<NodeStruct> openTimeExt) {
    this.openTimeExt = openTimeExt;
    return this;
  }

  public SupplierAttributes3101 addOpenTimeExtItem(NodeStruct openTimeExtItem) {
    if (this.openTimeExt == null) {
      this.openTimeExt = new ArrayList<NodeStruct>();
    }
    this.openTimeExt.add(openTimeExtItem);
    return this;
  }

   /**
   * 开放时间-扩展区(不超过200个汉字)
   * @return openTimeExt
  **/
  public List<NodeStruct> getOpenTimeExt() {
    return openTimeExt;
  }

  public void setOpenTimeExt(List<NodeStruct> openTimeExt) {
    this.openTimeExt = openTimeExt;
  }

  public SupplierAttributes3101 preferentialPolicy(List<SupplierAttributes3101Response> preferentialPolicy) {
    this.preferentialPolicy = preferentialPolicy;
    return this;
  }

  public SupplierAttributes3101 addPreferentialPolicyItem(SupplierAttributes3101Response preferentialPolicyItem) {
    if (this.preferentialPolicy == null) {
      this.preferentialPolicy = new ArrayList<SupplierAttributes3101Response>();
    }
    this.preferentialPolicy.add(preferentialPolicyItem);
    return this;
  }

   /**
   * 优待政策(不超过200个汉字)
   * @return preferentialPolicy
  **/
  public List<SupplierAttributes3101Response> getPreferentialPolicy() {
    return preferentialPolicy;
  }

  public void setPreferentialPolicy(List<SupplierAttributes3101Response> preferentialPolicy) {
    this.preferentialPolicy = preferentialPolicy;
  }

  public SupplierAttributes3101 preferentialPolicyExt(List<NodeStruct> preferentialPolicyExt) {
    this.preferentialPolicyExt = preferentialPolicyExt;
    return this;
  }

  public SupplierAttributes3101 addPreferentialPolicyExtItem(NodeStruct preferentialPolicyExtItem) {
    if (this.preferentialPolicyExt == null) {
      this.preferentialPolicyExt = new ArrayList<NodeStruct>();
    }
    this.preferentialPolicyExt.add(preferentialPolicyExtItem);
    return this;
  }

   /**
   * 优待政策-扩展区(不超过1000个汉字)
   * @return preferentialPolicyExt
  **/
  public List<NodeStruct> getPreferentialPolicyExt() {
    return preferentialPolicyExt;
  }

  public void setPreferentialPolicyExt(List<NodeStruct> preferentialPolicyExt) {
    this.preferentialPolicyExt = preferentialPolicyExt;
  }

  public SupplierAttributes3101 facility(List<SupplierAttributes3101Facility> facility) {
    this.facility = facility;
    return this;
  }

  public SupplierAttributes3101 addFacilityItem(SupplierAttributes3101Facility facilityItem) {
    if (this.facility == null) {
      this.facility = new ArrayList<SupplierAttributes3101Facility>();
    }
    this.facility.add(facilityItem);
    return this;
  }

   /**
   * 服务设施列表
   * @return facility
  **/
  public List<SupplierAttributes3101Facility> getFacility() {
    return facility;
  }

  public void setFacility(List<SupplierAttributes3101Facility> facility) {
    this.facility = facility;
  }

  public SupplierAttributes3101 playIntro(List<NodeStruct> playIntro) {
    this.playIntro = playIntro;
    return this;
  }

  public SupplierAttributes3101 addPlayIntroItem(NodeStruct playIntroItem) {
    if (this.playIntro == null) {
      this.playIntro = new ArrayList<NodeStruct>();
    }
    this.playIntro.add(playIntroItem);
    return this;
  }

   /**
   * 玩法介绍(不超过200个汉字)
   * @return playIntro
  **/
  public List<NodeStruct> getPlayIntro() {
    return playIntro;
  }

  public void setPlayIntro(List<NodeStruct> playIntro) {
    this.playIntro = playIntro;
  }

  public SupplierAttributes3101 traffic(List<NodeStruct> traffic) {
    this.traffic = traffic;
    return this;
  }

  public SupplierAttributes3101 addTrafficItem(NodeStruct trafficItem) {
    if (this.traffic == null) {
      this.traffic = new ArrayList<NodeStruct>();
    }
    this.traffic.add(trafficItem);
    return this;
  }

   /**
   * 交通(不超过200个汉字)
   * @return traffic
  **/
  public List<NodeStruct> getTraffic() {
    return traffic;
  }

  public void setTraffic(List<NodeStruct> traffic) {
    this.traffic = traffic;
  }

  public SupplierAttributes3101 pet(Integer pet) {
    this.pet = pet;
    return this;
  }

   /**
   * 宠物携带(1:可携带宠物，2:不可携带宠物)
   * @return pet
  **/
  public Integer getPet() {
    return pet;
  }

  public void setPet(Integer pet) {
    this.pet = pet;
  }

  public SupplierAttributes3101 scenicIntro(List<NodeStruct> scenicIntro) {
    this.scenicIntro = scenicIntro;
    return this;
  }

  public SupplierAttributes3101 addScenicIntroItem(NodeStruct scenicIntroItem) {
    if (this.scenicIntro == null) {
      this.scenicIntro = new ArrayList<NodeStruct>();
    }
    this.scenicIntro.add(scenicIntroItem);
    return this;
  }

   /**
   * 景点介绍(不超过2000个汉字)
   * @return scenicIntro
  **/
  public List<NodeStruct> getScenicIntro() {
    return scenicIntro;
  }

  public void setScenicIntro(List<NodeStruct> scenicIntro) {
    this.scenicIntro = scenicIntro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierAttributes3101 supplierAttributes3101 = (SupplierAttributes3101) o;
    return Objects.equals(this.openTime, supplierAttributes3101.openTime) &&
        Objects.equals(this.openTimeExt, supplierAttributes3101.openTimeExt) &&
        Objects.equals(this.preferentialPolicy, supplierAttributes3101.preferentialPolicy) &&
        Objects.equals(this.preferentialPolicyExt, supplierAttributes3101.preferentialPolicyExt) &&
        Objects.equals(this.facility, supplierAttributes3101.facility) &&
        Objects.equals(this.playIntro, supplierAttributes3101.playIntro) &&
        Objects.equals(this.traffic, supplierAttributes3101.traffic) &&
        Objects.equals(this.pet, supplierAttributes3101.pet) &&
        Objects.equals(this.scenicIntro, supplierAttributes3101.scenicIntro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openTime, openTimeExt, preferentialPolicy, preferentialPolicyExt, facility, playIntro, traffic, pet, scenicIntro);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierAttributes3101 {\n");
    
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    openTimeExt: ").append(toIndentedString(openTimeExt)).append("\n");
    sb.append("    preferentialPolicy: ").append(toIndentedString(preferentialPolicy)).append("\n");
    sb.append("    preferentialPolicyExt: ").append(toIndentedString(preferentialPolicyExt)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    playIntro: ").append(toIndentedString(playIntro)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
    sb.append("    pet: ").append(toIndentedString(pet)).append("\n");
    sb.append("    scenicIntro: ").append(toIndentedString(scenicIntro)).append("\n");
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

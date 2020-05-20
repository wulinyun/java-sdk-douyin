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
import com.douyin.open.model.FansProfileDistribution;
import com.douyin.open.model.FansProfileFlowContribution;
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
 * FansData
 */

public class FansData {
  @SerializedName("all_fans_num")
  private Integer allFansNum = null;

  @SerializedName("gender_distributions")
  private List<FansProfileDistribution> genderDistributions = new ArrayList<FansProfileDistribution>();

  @SerializedName("age_distributions")
  private List<FansProfileDistribution> ageDistributions = new ArrayList<FansProfileDistribution>();

  @SerializedName("geographical_distributions")
  private List<FansProfileDistribution> geographicalDistributions = new ArrayList<FansProfileDistribution>();

  @SerializedName("active_days_distributions")
  private List<FansProfileDistribution> activeDaysDistributions = new ArrayList<FansProfileDistribution>();

  @SerializedName("device_distributions")
  private List<FansProfileDistribution> deviceDistributions = new ArrayList<FansProfileDistribution>();

  @SerializedName("interest_distributions")
  private List<FansProfileDistribution> interestDistributions = new ArrayList<FansProfileDistribution>();

  @SerializedName("flow_contributions")
  private List<FansProfileFlowContribution> flowContributions = new ArrayList<FansProfileFlowContribution>();

  public FansData allFansNum(Integer allFansNum) {
    this.allFansNum = allFansNum;
    return this;
  }

   /**
   * 所有粉丝的数量
   * @return allFansNum
  **/
  public Integer getAllFansNum() {
    return allFansNum;
  }

  public void setAllFansNum(Integer allFansNum) {
    this.allFansNum = allFansNum;
  }

  public FansData genderDistributions(List<FansProfileDistribution> genderDistributions) {
    this.genderDistributions = genderDistributions;
    return this;
  }

  public FansData addGenderDistributionsItem(FansProfileDistribution genderDistributionsItem) {
    this.genderDistributions.add(genderDistributionsItem);
    return this;
  }

   /**
   * 粉丝性别分布 item: [\&quot;1\&quot;,\&quot;2\&quot;] (男:1,女:2)
   * @return genderDistributions
  **/
  public List<FansProfileDistribution> getGenderDistributions() {
    return genderDistributions;
  }

  public void setGenderDistributions(List<FansProfileDistribution> genderDistributions) {
    this.genderDistributions = genderDistributions;
  }

  public FansData ageDistributions(List<FansProfileDistribution> ageDistributions) {
    this.ageDistributions = ageDistributions;
    return this;
  }

  public FansData addAgeDistributionsItem(FansProfileDistribution ageDistributionsItem) {
    this.ageDistributions.add(ageDistributionsItem);
    return this;
  }

   /**
   * 粉丝年龄分布 item: [\&quot;1-11\&quot;, \&quot;12~17\&quot;, \&quot;18-23\&quot;, \&quot;24~29\&quot;, \&quot;30~35\&quot;, \&quot;36-41\&quot;, \&quot;42~50\&quot;, \&quot;50+\&quot;]
   * @return ageDistributions
  **/
  public List<FansProfileDistribution> getAgeDistributions() {
    return ageDistributions;
  }

  public void setAgeDistributions(List<FansProfileDistribution> ageDistributions) {
    this.ageDistributions = ageDistributions;
  }

  public FansData geographicalDistributions(List<FansProfileDistribution> geographicalDistributions) {
    this.geographicalDistributions = geographicalDistributions;
    return this;
  }

  public FansData addGeographicalDistributionsItem(FansProfileDistribution geographicalDistributionsItem) {
    this.geographicalDistributions.add(geographicalDistributionsItem);
    return this;
  }

   /**
   * 粉丝地域分布 item: [\&quot;北京\&quot;,\&quot;福建\&quot;,\&quot;香港\&quot;...]
   * @return geographicalDistributions
  **/
  public List<FansProfileDistribution> getGeographicalDistributions() {
    return geographicalDistributions;
  }

  public void setGeographicalDistributions(List<FansProfileDistribution> geographicalDistributions) {
    this.geographicalDistributions = geographicalDistributions;
  }

  public FansData activeDaysDistributions(List<FansProfileDistribution> activeDaysDistributions) {
    this.activeDaysDistributions = activeDaysDistributions;
    return this;
  }

  public FansData addActiveDaysDistributionsItem(FansProfileDistribution activeDaysDistributionsItem) {
    this.activeDaysDistributions.add(activeDaysDistributionsItem);
    return this;
  }

   /**
   * 粉丝活跃天数分布 item: [\&quot;0-4\&quot;,\&quot;5~8\&quot;,\&quot;9~12\&quot;,\&quot;13~16\&quot;,\&quot;17~20\&quot;,\&quot;20+\&quot;]
   * @return activeDaysDistributions
  **/
  public List<FansProfileDistribution> getActiveDaysDistributions() {
    return activeDaysDistributions;
  }

  public void setActiveDaysDistributions(List<FansProfileDistribution> activeDaysDistributions) {
    this.activeDaysDistributions = activeDaysDistributions;
  }

  public FansData deviceDistributions(List<FansProfileDistribution> deviceDistributions) {
    this.deviceDistributions = deviceDistributions;
    return this;
  }

  public FansData addDeviceDistributionsItem(FansProfileDistribution deviceDistributionsItem) {
    this.deviceDistributions.add(deviceDistributionsItem);
    return this;
  }

   /**
   * 粉丝设备分布 item: [\&quot;苹果\&quot;,\&quot;华为\&quot;,\&quot;三星\&quot;,\&quot;小米\&quot;...]
   * @return deviceDistributions
  **/
  public List<FansProfileDistribution> getDeviceDistributions() {
    return deviceDistributions;
  }

  public void setDeviceDistributions(List<FansProfileDistribution> deviceDistributions) {
    this.deviceDistributions = deviceDistributions;
  }

  public FansData interestDistributions(List<FansProfileDistribution> interestDistributions) {
    this.interestDistributions = interestDistributions;
    return this;
  }

  public FansData addInterestDistributionsItem(FansProfileDistribution interestDistributionsItem) {
    this.interestDistributions.add(interestDistributionsItem);
    return this;
  }

   /**
   * 粉丝兴趣分布 item: [\&quot;生活\&quot;\&quot;,\&quot;美食\&quot;,\&quot;旅行\&quot;...]
   * @return interestDistributions
  **/
  public List<FansProfileDistribution> getInterestDistributions() {
    return interestDistributions;
  }

  public void setInterestDistributions(List<FansProfileDistribution> interestDistributions) {
    this.interestDistributions = interestDistributions;
  }

  public FansData flowContributions(List<FansProfileFlowContribution> flowContributions) {
    this.flowContributions = flowContributions;
    return this;
  }

  public FansData addFlowContributionsItem(FansProfileFlowContribution flowContributionsItem) {
    this.flowContributions.add(flowContributionsItem);
    return this;
  }

   /**
   * 粉丝流量贡献 flow: [\&quot;vv\&quot;,\&quot;like_cnt\&quot;,\&quot;comment_cnt\&quot;,\&quot;share_video_cnt\&quot;]
   * @return flowContributions
  **/
  public List<FansProfileFlowContribution> getFlowContributions() {
    return flowContributions;
  }

  public void setFlowContributions(List<FansProfileFlowContribution> flowContributions) {
    this.flowContributions = flowContributions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FansData fansData = (FansData) o;
    return Objects.equals(this.allFansNum, fansData.allFansNum) &&
        Objects.equals(this.genderDistributions, fansData.genderDistributions) &&
        Objects.equals(this.ageDistributions, fansData.ageDistributions) &&
        Objects.equals(this.geographicalDistributions, fansData.geographicalDistributions) &&
        Objects.equals(this.activeDaysDistributions, fansData.activeDaysDistributions) &&
        Objects.equals(this.deviceDistributions, fansData.deviceDistributions) &&
        Objects.equals(this.interestDistributions, fansData.interestDistributions) &&
        Objects.equals(this.flowContributions, fansData.flowContributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allFansNum, genderDistributions, ageDistributions, geographicalDistributions, activeDaysDistributions, deviceDistributions, interestDistributions, flowContributions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FansData {\n");
    
    sb.append("    allFansNum: ").append(toIndentedString(allFansNum)).append("\n");
    sb.append("    genderDistributions: ").append(toIndentedString(genderDistributions)).append("\n");
    sb.append("    ageDistributions: ").append(toIndentedString(ageDistributions)).append("\n");
    sb.append("    geographicalDistributions: ").append(toIndentedString(geographicalDistributions)).append("\n");
    sb.append("    activeDaysDistributions: ").append(toIndentedString(activeDaysDistributions)).append("\n");
    sb.append("    deviceDistributions: ").append(toIndentedString(deviceDistributions)).append("\n");
    sb.append("    interestDistributions: ").append(toIndentedString(interestDistributions)).append("\n");
    sb.append("    flowContributions: ").append(toIndentedString(flowContributions)).append("\n");
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

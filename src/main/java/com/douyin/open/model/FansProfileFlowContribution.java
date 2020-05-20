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
 * FansProfileFlowContribution
 */

public class FansProfileFlowContribution {
  @SerializedName("flow")
  private String flow = null;

  @SerializedName("fans_sum")
  private Integer fansSum = null;

  @SerializedName("all_sum")
  private Integer allSum = null;

  public FansProfileFlowContribution flow(String flow) {
    this.flow = flow;
    return this;
  }

   /**
   * 流量贡献种类
   * @return flow
  **/
  public String getFlow() {
    return flow;
  }

  public void setFlow(String flow) {
    this.flow = flow;
  }

  public FansProfileFlowContribution fansSum(Integer fansSum) {
    this.fansSum = fansSum;
    return this;
  }

   /**
   * 粉丝流量贡献
   * @return fansSum
  **/
  public Integer getFansSum() {
    return fansSum;
  }

  public void setFansSum(Integer fansSum) {
    this.fansSum = fansSum;
  }

  public FansProfileFlowContribution allSum(Integer allSum) {
    this.allSum = allSum;
    return this;
  }

   /**
   * 总流量贡献
   * @return allSum
  **/
  public Integer getAllSum() {
    return allSum;
  }

  public void setAllSum(Integer allSum) {
    this.allSum = allSum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FansProfileFlowContribution fansProfileFlowContribution = (FansProfileFlowContribution) o;
    return Objects.equals(this.flow, fansProfileFlowContribution.flow) &&
        Objects.equals(this.fansSum, fansProfileFlowContribution.fansSum) &&
        Objects.equals(this.allSum, fansProfileFlowContribution.allSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, fansSum, allSum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FansProfileFlowContribution {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    fansSum: ").append(toIndentedString(fansSum)).append("\n");
    sb.append("    allSum: ").append(toIndentedString(allSum)).append("\n");
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

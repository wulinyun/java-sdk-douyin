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
 * ExternalPoiBillboard
 */

public class ExternalPoiBillboard {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("poi_name")
  private String poiName = null;

  @SerializedName("score")
  private String score = null;

  @SerializedName("rank")
  private Integer rank = null;

  public ExternalPoiBillboard poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * poi id
   * @return poiId
  **/
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public ExternalPoiBillboard poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * poi名称
   * @return poiName
  **/
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public ExternalPoiBillboard score(String score) {
    this.score = score;
    return this;
  }

   /**
   * 得分
   * @return score
  **/
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public ExternalPoiBillboard rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * 排名
   * @return rank
  **/
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPoiBillboard externalPoiBillboard = (ExternalPoiBillboard) o;
    return Objects.equals(this.poiId, externalPoiBillboard.poiId) &&
        Objects.equals(this.poiName, externalPoiBillboard.poiName) &&
        Objects.equals(this.score, externalPoiBillboard.score) &&
        Objects.equals(this.rank, externalPoiBillboard.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiId, poiName, score, rank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPoiBillboard {\n");
    
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

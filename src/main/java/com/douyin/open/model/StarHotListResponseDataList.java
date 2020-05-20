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
 * StarHotListResponseDataList
 */

public class StarHotListResponseDataList {
  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("nick_name")
  private String nickName = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("follower")
  private Integer follower = null;

  @SerializedName("score")
  private Double score = null;

  public StarHotListResponseDataList rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * 热榜排名
   * @return rank
  **/
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public StarHotListResponseDataList nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * 达人昵称
   * @return nickName
  **/
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public StarHotListResponseDataList tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public StarHotListResponseDataList addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public StarHotListResponseDataList follower(Integer follower) {
    this.follower = follower;
    return this;
  }

   /**
   * 粉丝数
   * @return follower
  **/
  public Integer getFollower() {
    return follower;
  }

  public void setFollower(Integer follower) {
    this.follower = follower;
  }

  public StarHotListResponseDataList score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * 热榜类型对应的热榜指数
   * @return score
  **/
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarHotListResponseDataList starHotListResponseDataList = (StarHotListResponseDataList) o;
    return Objects.equals(this.rank, starHotListResponseDataList.rank) &&
        Objects.equals(this.nickName, starHotListResponseDataList.nickName) &&
        Objects.equals(this.tags, starHotListResponseDataList.tags) &&
        Objects.equals(this.follower, starHotListResponseDataList.follower) &&
        Objects.equals(this.score, starHotListResponseDataList.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, nickName, tags, follower, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarHotListResponseDataList {\n");
    
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    follower: ").append(toIndentedString(follower)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

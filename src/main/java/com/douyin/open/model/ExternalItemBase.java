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
 * ExternalItemBase
 */

public class ExternalItemBase {
  @SerializedName("total_play")
  private Integer totalPlay = null;

  @SerializedName("total_like")
  private Integer totalLike = null;

  @SerializedName("total_comment")
  private Integer totalComment = null;

  @SerializedName("total_share")
  private Integer totalShare = null;

  @SerializedName("avg_play_duration")
  private Double avgPlayDuration = null;

  public ExternalItemBase totalPlay(Integer totalPlay) {
    this.totalPlay = totalPlay;
    return this;
  }

   /**
   * 30天播放次数
   * @return totalPlay
  **/
  public Integer getTotalPlay() {
    return totalPlay;
  }

  public void setTotalPlay(Integer totalPlay) {
    this.totalPlay = totalPlay;
  }

  public ExternalItemBase totalLike(Integer totalLike) {
    this.totalLike = totalLike;
    return this;
  }

   /**
   * 30天点赞数
   * @return totalLike
  **/
  public Integer getTotalLike() {
    return totalLike;
  }

  public void setTotalLike(Integer totalLike) {
    this.totalLike = totalLike;
  }

  public ExternalItemBase totalComment(Integer totalComment) {
    this.totalComment = totalComment;
    return this;
  }

   /**
   * 30天评论数
   * @return totalComment
  **/
  public Integer getTotalComment() {
    return totalComment;
  }

  public void setTotalComment(Integer totalComment) {
    this.totalComment = totalComment;
  }

  public ExternalItemBase totalShare(Integer totalShare) {
    this.totalShare = totalShare;
    return this;
  }

   /**
   * 30天分享数
   * @return totalShare
  **/
  public Integer getTotalShare() {
    return totalShare;
  }

  public void setTotalShare(Integer totalShare) {
    this.totalShare = totalShare;
  }

  public ExternalItemBase avgPlayDuration(Double avgPlayDuration) {
    this.avgPlayDuration = avgPlayDuration;
    return this;
  }

   /**
   * 30天平均播放时长
   * @return avgPlayDuration
  **/
  public Double getAvgPlayDuration() {
    return avgPlayDuration;
  }

  public void setAvgPlayDuration(Double avgPlayDuration) {
    this.avgPlayDuration = avgPlayDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalItemBase externalItemBase = (ExternalItemBase) o;
    return Objects.equals(this.totalPlay, externalItemBase.totalPlay) &&
        Objects.equals(this.totalLike, externalItemBase.totalLike) &&
        Objects.equals(this.totalComment, externalItemBase.totalComment) &&
        Objects.equals(this.totalShare, externalItemBase.totalShare) &&
        Objects.equals(this.avgPlayDuration, externalItemBase.avgPlayDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPlay, totalLike, totalComment, totalShare, avgPlayDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalItemBase {\n");
    
    sb.append("    totalPlay: ").append(toIndentedString(totalPlay)).append("\n");
    sb.append("    totalLike: ").append(toIndentedString(totalLike)).append("\n");
    sb.append("    totalComment: ").append(toIndentedString(totalComment)).append("\n");
    sb.append("    totalShare: ").append(toIndentedString(totalShare)).append("\n");
    sb.append("    avgPlayDuration: ").append(toIndentedString(avgPlayDuration)).append("\n");
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

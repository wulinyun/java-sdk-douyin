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
 * 统计数据
 */

public class VideoStatistics {
  @SerializedName("comment_count")
  private Integer commentCount = null;

  @SerializedName("digg_count")
  private Integer diggCount = null;

  @SerializedName("download_count")
  private Integer downloadCount = null;

  @SerializedName("play_count")
  private Integer playCount = null;

  @SerializedName("share_count")
  private Integer shareCount = null;

  @SerializedName("forward_count")
  private Integer forwardCount = null;

  public VideoStatistics commentCount(Integer commentCount) {
    this.commentCount = commentCount;
    return this;
  }

   /**
   * 评论数
   * @return commentCount
  **/
  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }

  public VideoStatistics diggCount(Integer diggCount) {
    this.diggCount = diggCount;
    return this;
  }

   /**
   * 点赞数
   * @return diggCount
  **/
  public Integer getDiggCount() {
    return diggCount;
  }

  public void setDiggCount(Integer diggCount) {
    this.diggCount = diggCount;
  }

  public VideoStatistics downloadCount(Integer downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

   /**
   * 下载数
   * @return downloadCount
  **/
  public Integer getDownloadCount() {
    return downloadCount;
  }

  public void setDownloadCount(Integer downloadCount) {
    this.downloadCount = downloadCount;
  }

  public VideoStatistics playCount(Integer playCount) {
    this.playCount = playCount;
    return this;
  }

   /**
   * 播放数，只有作者本人可见。公开视频设为私密后，播放数也会返回0。
   * @return playCount
  **/
  public Integer getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Integer playCount) {
    this.playCount = playCount;
  }

  public VideoStatistics shareCount(Integer shareCount) {
    this.shareCount = shareCount;
    return this;
  }

   /**
   * 分享数
   * @return shareCount
  **/
  public Integer getShareCount() {
    return shareCount;
  }

  public void setShareCount(Integer shareCount) {
    this.shareCount = shareCount;
  }

  public VideoStatistics forwardCount(Integer forwardCount) {
    this.forwardCount = forwardCount;
    return this;
  }

   /**
   * 转发数
   * @return forwardCount
  **/
  public Integer getForwardCount() {
    return forwardCount;
  }

  public void setForwardCount(Integer forwardCount) {
    this.forwardCount = forwardCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoStatistics videoStatistics = (VideoStatistics) o;
    return Objects.equals(this.commentCount, videoStatistics.commentCount) &&
        Objects.equals(this.diggCount, videoStatistics.diggCount) &&
        Objects.equals(this.downloadCount, videoStatistics.downloadCount) &&
        Objects.equals(this.playCount, videoStatistics.playCount) &&
        Objects.equals(this.shareCount, videoStatistics.shareCount) &&
        Objects.equals(this.forwardCount, videoStatistics.forwardCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentCount, diggCount, downloadCount, playCount, shareCount, forwardCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoStatistics {\n");
    
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    diggCount: ").append(toIndentedString(diggCount)).append("\n");
    sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
    sb.append("    playCount: ").append(toIndentedString(playCount)).append("\n");
    sb.append("    shareCount: ").append(toIndentedString(shareCount)).append("\n");
    sb.append("    forwardCount: ").append(toIndentedString(forwardCount)).append("\n");
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

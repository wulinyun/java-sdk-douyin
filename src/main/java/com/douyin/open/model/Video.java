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
import com.douyin.open.model.VideoStatistics;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Video
 */

public class Video {
  @SerializedName("item_id")
  private String itemId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("cover")
  private String cover = null;

  @SerializedName("is_top")
  private Boolean isTop = null;

  @SerializedName("create_time")
  private Long createTime = null;

  @SerializedName("is_reviewed")
  private Boolean isReviewed = null;

  @SerializedName("share_url")
  private String shareUrl = null;

  @SerializedName("statistics")
  private VideoStatistics statistics = null;

  public Video itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频id
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public Video title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 视频标题
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Video cover(String cover) {
    this.cover = cover;
    return this;
  }

   /**
   * 视频封面
   * @return cover
  **/
  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public Video isTop(Boolean isTop) {
    this.isTop = isTop;
    return this;
  }

   /**
   * 是否置顶
   * @return isTop
  **/
  public Boolean isIsTop() {
    return isTop;
  }

  public void setIsTop(Boolean isTop) {
    this.isTop = isTop;
  }

  public Video createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 视频创建时间戳
   * @return createTime
  **/
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public Video isReviewed(Boolean isReviewed) {
    this.isReviewed = isReviewed;
    return this;
  }

   /**
   * 表示是否审核结束。审核通过或者失败都会返回true，审核中返回false。
   * @return isReviewed
  **/
  public Boolean isIsReviewed() {
    return isReviewed;
  }

  public void setIsReviewed(Boolean isReviewed) {
    this.isReviewed = isReviewed;
  }

  public Video shareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
    return this;
  }

   /**
   * 视频播放页面。视频播放页可能会失效，请在观看视频前调用/video/data/获取最新的播放页。
   * @return shareUrl
  **/
  public String getShareUrl() {
    return shareUrl;
  }

  public void setShareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
  }

  public Video statistics(VideoStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  public VideoStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(VideoStatistics statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.itemId, video.itemId) &&
        Objects.equals(this.title, video.title) &&
        Objects.equals(this.cover, video.cover) &&
        Objects.equals(this.isTop, video.isTop) &&
        Objects.equals(this.createTime, video.createTime) &&
        Objects.equals(this.isReviewed, video.isReviewed) &&
        Objects.equals(this.shareUrl, video.shareUrl) &&
        Objects.equals(this.statistics, video.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, title, cover, isTop, createTime, isReviewed, shareUrl, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    isTop: ").append(toIndentedString(isTop)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    isReviewed: ").append(toIndentedString(isReviewed)).append("\n");
    sb.append("    shareUrl: ").append(toIndentedString(shareUrl)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

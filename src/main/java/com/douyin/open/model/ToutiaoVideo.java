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
import com.douyin.open.model.ToutiaoVideoStatistics;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ToutiaoVideo
 */

public class ToutiaoVideo {
  @SerializedName("item_id")
  private String itemId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("cover")
  private String cover = null;

  @SerializedName("create_time")
  private Long createTime = null;

  @SerializedName("statistics")
  private ToutiaoVideoStatistics statistics = null;

  public ToutiaoVideo itemId(String itemId) {
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

  public ToutiaoVideo title(String title) {
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

  public ToutiaoVideo cover(String cover) {
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

  public ToutiaoVideo createTime(Long createTime) {
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

  public ToutiaoVideo statistics(ToutiaoVideoStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  public ToutiaoVideoStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(ToutiaoVideoStatistics statistics) {
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
    ToutiaoVideo toutiaoVideo = (ToutiaoVideo) o;
    return Objects.equals(this.itemId, toutiaoVideo.itemId) &&
        Objects.equals(this.title, toutiaoVideo.title) &&
        Objects.equals(this.cover, toutiaoVideo.cover) &&
        Objects.equals(this.createTime, toutiaoVideo.createTime) &&
        Objects.equals(this.statistics, toutiaoVideo.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, title, cover, createTime, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToutiaoVideo {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

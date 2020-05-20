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
 * VideoDataResponseDataResponse
 */

public class VideoDataResponseDataResponse {
  @SerializedName("item_id")
  private String itemId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("create_time")
  private Integer createTime = null;

  @SerializedName("digg")
  private Integer digg = null;

  @SerializedName("play")
  private Integer play = null;

  @SerializedName("forward")
  private Integer forward = null;

  @SerializedName("is_reviewed")
  private Boolean isReviewed = null;

  public VideoDataResponseDataResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 抖音视频id
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public VideoDataResponseDataResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 视频文字
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public VideoDataResponseDataResponse createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 视频创建时间戳
   * @return createTime
  **/
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public VideoDataResponseDataResponse digg(Integer digg) {
    this.digg = digg;
    return this;
  }

   /**
   * 点赞数
   * @return digg
  **/
  public Integer getDigg() {
    return digg;
  }

  public void setDigg(Integer digg) {
    this.digg = digg;
  }

  public VideoDataResponseDataResponse play(Integer play) {
    this.play = play;
    return this;
  }

   /**
   * 播放数
   * @return play
  **/
  public Integer getPlay() {
    return play;
  }

  public void setPlay(Integer play) {
    this.play = play;
  }

  public VideoDataResponseDataResponse forward(Integer forward) {
    this.forward = forward;
    return this;
  }

   /**
   * 转发数
   * @return forward
  **/
  public Integer getForward() {
    return forward;
  }

  public void setForward(Integer forward) {
    this.forward = forward;
  }

  public VideoDataResponseDataResponse isReviewed(Boolean isReviewed) {
    this.isReviewed = isReviewed;
    return this;
  }

   /**
   * 是否审核通过
   * @return isReviewed
  **/
  public Boolean isIsReviewed() {
    return isReviewed;
  }

  public void setIsReviewed(Boolean isReviewed) {
    this.isReviewed = isReviewed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoDataResponseDataResponse videoDataResponseDataResponse = (VideoDataResponseDataResponse) o;
    return Objects.equals(this.itemId, videoDataResponseDataResponse.itemId) &&
        Objects.equals(this.title, videoDataResponseDataResponse.title) &&
        Objects.equals(this.createTime, videoDataResponseDataResponse.createTime) &&
        Objects.equals(this.digg, videoDataResponseDataResponse.digg) &&
        Objects.equals(this.play, videoDataResponseDataResponse.play) &&
        Objects.equals(this.forward, videoDataResponseDataResponse.forward) &&
        Objects.equals(this.isReviewed, videoDataResponseDataResponse.isReviewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, title, createTime, digg, play, forward, isReviewed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoDataResponseDataResponse {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    digg: ").append(toIndentedString(digg)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    forward: ").append(toIndentedString(forward)).append("\n");
    sb.append("    isReviewed: ").append(toIndentedString(isReviewed)).append("\n");
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

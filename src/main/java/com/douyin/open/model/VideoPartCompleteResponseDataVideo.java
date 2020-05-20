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
 * VideoPartCompleteResponseDataVideo
 */

public class VideoPartCompleteResponseDataVideo {
  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  public VideoPartCompleteResponseDataVideo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频文件id。
   * @return videoId
  **/
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public VideoPartCompleteResponseDataVideo width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public VideoPartCompleteResponseDataVideo height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoPartCompleteResponseDataVideo videoPartCompleteResponseDataVideo = (VideoPartCompleteResponseDataVideo) o;
    return Objects.equals(this.videoId, videoPartCompleteResponseDataVideo.videoId) &&
        Objects.equals(this.width, videoPartCompleteResponseDataVideo.width) &&
        Objects.equals(this.height, videoPartCompleteResponseDataVideo.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoPartCompleteResponseDataVideo {\n");
    
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

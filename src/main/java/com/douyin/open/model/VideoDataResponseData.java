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
import com.douyin.open.model.Video;
import com.douyin.open.model.VideoDataResponseDataResponse;
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
 * VideoDataResponseData
 */

public class VideoDataResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("video_data")
  private List<VideoDataResponseDataResponse> videoData = new ArrayList<VideoDataResponseDataResponse>();

  @SerializedName("list")
  private List<Video> list = null;

  public VideoDataResponseData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public VideoDataResponseData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VideoDataResponseData videoData(List<VideoDataResponseDataResponse> videoData) {
    this.videoData = videoData;
    return this;
  }

  public VideoDataResponseData addVideoDataItem(VideoDataResponseDataResponse videoDataItem) {
    this.videoData.add(videoDataItem);
    return this;
  }

   /**
   * 见list
   * @return videoData
  **/
  public List<VideoDataResponseDataResponse> getVideoData() {
    return videoData;
  }

  public void setVideoData(List<VideoDataResponseDataResponse> videoData) {
    this.videoData = videoData;
  }

  public VideoDataResponseData list(List<Video> list) {
    this.list = list;
    return this;
  }

  public VideoDataResponseData addListItem(Video listItem) {
    if (this.list == null) {
      this.list = new ArrayList<Video>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  public List<Video> getList() {
    return list;
  }

  public void setList(List<Video> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoDataResponseData videoDataResponseData = (VideoDataResponseData) o;
    return Objects.equals(this.errorCode, videoDataResponseData.errorCode) &&
        Objects.equals(this.description, videoDataResponseData.description) &&
        Objects.equals(this.videoData, videoDataResponseData.videoData) &&
        Objects.equals(this.list, videoDataResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, videoData, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoDataResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    videoData: ").append(toIndentedString(videoData)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

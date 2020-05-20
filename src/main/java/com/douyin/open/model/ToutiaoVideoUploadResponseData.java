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
import com.douyin.open.model.ToutiaoVideoUploadResponseDataVideo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ToutiaoVideoUploadResponseData
 */

public class ToutiaoVideoUploadResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("video")
  private ToutiaoVideoUploadResponseDataVideo video = null;

  public ToutiaoVideoUploadResponseData errorCode(Integer errorCode) {
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

  public ToutiaoVideoUploadResponseData description(String description) {
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

  public ToutiaoVideoUploadResponseData video(ToutiaoVideoUploadResponseDataVideo video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  public ToutiaoVideoUploadResponseDataVideo getVideo() {
    return video;
  }

  public void setVideo(ToutiaoVideoUploadResponseDataVideo video) {
    this.video = video;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToutiaoVideoUploadResponseData toutiaoVideoUploadResponseData = (ToutiaoVideoUploadResponseData) o;
    return Objects.equals(this.errorCode, toutiaoVideoUploadResponseData.errorCode) &&
        Objects.equals(this.description, toutiaoVideoUploadResponseData.description) &&
        Objects.equals(this.video, toutiaoVideoUploadResponseData.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, video);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToutiaoVideoUploadResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

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
import com.douyin.open.model.Extra;
import com.douyin.open.model.VideoUploadResponseData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VideoUploadResponse
 */

public class VideoUploadResponse {
  @SerializedName("data")
  private VideoUploadResponseData data = null;

  @SerializedName("extra")
  private Extra extra = null;

  public VideoUploadResponse data(VideoUploadResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public VideoUploadResponseData getData() {
    return data;
  }

  public void setData(VideoUploadResponseData data) {
    this.data = data;
  }

  public VideoUploadResponse extra(Extra extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  public Extra getExtra() {
    return extra;
  }

  public void setExtra(Extra extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoUploadResponse videoUploadResponse = (VideoUploadResponse) o;
    return Objects.equals(this.data, videoUploadResponse.data) &&
        Objects.equals(this.extra, videoUploadResponse.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoUploadResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

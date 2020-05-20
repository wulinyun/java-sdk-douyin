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
import com.douyin.open.model.VideoCreateResponseData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VideoCreateResponse
 */

public class VideoCreateResponse {
  @SerializedName("data")
  private VideoCreateResponseData data = null;

  @SerializedName("extra")
  private Extra extra = null;

  public VideoCreateResponse data(VideoCreateResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public VideoCreateResponseData getData() {
    return data;
  }

  public void setData(VideoCreateResponseData data) {
    this.data = data;
  }

  public VideoCreateResponse extra(Extra extra) {
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
    VideoCreateResponse videoCreateResponse = (VideoCreateResponse) o;
    return Objects.equals(this.data, videoCreateResponse.data) &&
        Objects.equals(this.extra, videoCreateResponse.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreateResponse {\n");
    
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

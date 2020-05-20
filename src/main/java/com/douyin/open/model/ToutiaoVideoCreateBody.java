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
 * ToutiaoVideoCreateBody
 */

public class ToutiaoVideoCreateBody {
  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("text")
  private String text = null;

  public ToutiaoVideoCreateBody videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * video_id, 通过/toutiao/video/upload/接口得到
   * @return videoId
  **/
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public ToutiaoVideoCreateBody text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 视频标题不要超过30个字符
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToutiaoVideoCreateBody toutiaoVideoCreateBody = (ToutiaoVideoCreateBody) o;
    return Objects.equals(this.videoId, toutiaoVideoCreateBody.videoId) &&
        Objects.equals(this.text, toutiaoVideoCreateBody.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToutiaoVideoCreateBody {\n");
    
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

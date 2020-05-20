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
import java.io.File;
import java.io.IOException;
/**
 * VideoPartUploadBody
 */

public class VideoPartUploadBody {
  @SerializedName("video")
  private File video = null;

  public VideoPartUploadBody video(File video) {
    this.video = video;
    return this;
  }

   /**
   * 视频分片，建议20MB。但不能小于5MB。 
   * @return video
  **/
  public File getVideo() {
    return video;
  }

  public void setVideo(File video) {
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
    VideoPartUploadBody videoPartUploadBody = (VideoPartUploadBody) o;
    return Objects.equals(this.video, videoPartUploadBody.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(video));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoPartUploadBody {\n");
    
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

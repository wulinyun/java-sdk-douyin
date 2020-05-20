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
 * VideoUploadBody
 */

public class VideoUploadBody {
  @SerializedName("video")
  private File video = null;

  public VideoUploadBody video(File video) {
    this.video = video;
    return this;
  }

   /**
   * 视频文件。 注意：    1. multipart/form-data中的Content-Type都必须以\&quot;video/\&quot;开头，如\&quot;video/mp4\&quot;，否则会报错：\&quot;unsupported content type xxx\&quot;。   2. 该Content-Type不是加在Header中，是加在请求体里面：![如图](http://p3.pstatp.com/origin/2dd390008887d044455b9) 
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
    VideoUploadBody videoUploadBody = (VideoUploadBody) o;
    return Objects.equals(this.video, videoUploadBody.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(video));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoUploadBody {\n");
    
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

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
 * MediaUploadBody
 */

public class MediaUploadBody {
  @SerializedName("media")
  private File media = null;

  public MediaUploadBody media(File media) {
    this.media = media;
    return this;
  }

   /**
   * 素材文件
   * @return media
  **/
  public File getMedia() {
    return media;
  }

  public void setMedia(File media) {
    this.media = media;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadBody mediaUploadBody = (MediaUploadBody) o;
    return Objects.equals(this.media, mediaUploadBody.media);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(media));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadBody {\n");
    
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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

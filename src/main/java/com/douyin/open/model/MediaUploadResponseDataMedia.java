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
 * MediaUploadResponseDataMedia
 */

public class MediaUploadResponseDataMedia {
  @SerializedName("media_id")
  private String mediaId = null;

  public MediaUploadResponseDataMedia mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadResponseDataMedia mediaUploadResponseDataMedia = (MediaUploadResponseDataMedia) o;
    return Objects.equals(this.mediaId, mediaUploadResponseDataMedia.mediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadResponseDataMedia {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
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

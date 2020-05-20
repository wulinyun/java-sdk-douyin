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
 * ImageUploadResponseDataImage
 */

public class ImageUploadResponseDataImage {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  public ImageUploadResponseDataImage imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * 图片id
   * @return imageId
  **/
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ImageUploadResponseDataImage width(Integer width) {
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

  public ImageUploadResponseDataImage height(Integer height) {
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
    ImageUploadResponseDataImage imageUploadResponseDataImage = (ImageUploadResponseDataImage) o;
    return Objects.equals(this.imageId, imageUploadResponseDataImage.imageId) &&
        Objects.equals(this.width, imageUploadResponseDataImage.width) &&
        Objects.equals(this.height, imageUploadResponseDataImage.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageUploadResponseDataImage {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

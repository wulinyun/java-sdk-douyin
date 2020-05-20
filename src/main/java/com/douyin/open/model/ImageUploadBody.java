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
 * ImageUploadBody
 */

public class ImageUploadBody {
  @SerializedName("image")
  private File image = null;

  public ImageUploadBody image(File image) {
    this.image = image;
    return this;
  }

   /**
   * 图片
   * @return image
  **/
  public File getImage() {
    return image;
  }

  public void setImage(File image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageUploadBody imageUploadBody = (ImageUploadBody) o;
    return Objects.equals(this.image, imageUploadBody.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(image));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageUploadBody {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

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
import com.douyin.open.model.SpuAttributes1212Breakfast;
import com.douyin.open.model.SpuAttributes1212Response;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 费用政策
 */

public class SpuAttributes1212 {
  @SerializedName("breakfast")
  private SpuAttributes1212Breakfast breakfast = null;

  @SerializedName("extra_bed")
  private SpuAttributes1212Response extraBed = null;

  @SerializedName("extra")
  private String extra = null;

  public SpuAttributes1212 breakfast(SpuAttributes1212Breakfast breakfast) {
    this.breakfast = breakfast;
    return this;
  }

   /**
   * Get breakfast
   * @return breakfast
  **/
  public SpuAttributes1212Breakfast getBreakfast() {
    return breakfast;
  }

  public void setBreakfast(SpuAttributes1212Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public SpuAttributes1212 extraBed(SpuAttributes1212Response extraBed) {
    this.extraBed = extraBed;
    return this;
  }

   /**
   * Get extraBed
   * @return extraBed
  **/
  public SpuAttributes1212Response getExtraBed() {
    return extraBed;
  }

  public void setExtraBed(SpuAttributes1212Response extraBed) {
    this.extraBed = extraBed;
  }

  public SpuAttributes1212 extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * 费用政策自定义内容
   * @return extra
  **/
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
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
    SpuAttributes1212 spuAttributes1212 = (SpuAttributes1212) o;
    return Objects.equals(this.breakfast, spuAttributes1212.breakfast) &&
        Objects.equals(this.extraBed, spuAttributes1212.extraBed) &&
        Objects.equals(this.extra, spuAttributes1212.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakfast, extraBed, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes1212 {\n");
    
    sb.append("    breakfast: ").append(toIndentedString(breakfast)).append("\n");
    sb.append("    extraBed: ").append(toIndentedString(extraBed)).append("\n");
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

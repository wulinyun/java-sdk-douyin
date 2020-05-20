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
import com.douyin.open.model.SpuAttributes1213Response;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 退改政策
 */

public class SpuAttributes1213 {
  @SerializedName("cancel_amend")
  private SpuAttributes1213Response cancelAmend = null;

  @SerializedName("extra")
  private String extra = null;

  public SpuAttributes1213 cancelAmend(SpuAttributes1213Response cancelAmend) {
    this.cancelAmend = cancelAmend;
    return this;
  }

   /**
   * Get cancelAmend
   * @return cancelAmend
  **/
  public SpuAttributes1213Response getCancelAmend() {
    return cancelAmend;
  }

  public void setCancelAmend(SpuAttributes1213Response cancelAmend) {
    this.cancelAmend = cancelAmend;
  }

  public SpuAttributes1213 extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * 退改政策自定义内容
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
    SpuAttributes1213 spuAttributes1213 = (SpuAttributes1213) o;
    return Objects.equals(this.cancelAmend, spuAttributes1213.cancelAmend) &&
        Objects.equals(this.extra, spuAttributes1213.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelAmend, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes1213 {\n");
    
    sb.append("    cancelAmend: ").append(toIndentedString(cancelAmend)).append("\n");
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

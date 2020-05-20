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
 * Extra
 */

public class Extra {
  @SerializedName("log_id")
  private String logId = null;

  @SerializedName("now")
  private Long now = null;

  public Extra logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public Extra now(Long now) {
    this.now = now;
    return this;
  }

   /**
   * Get now
   * @return now
  **/
  public Long getNow() {
    return now;
  }

  public void setNow(Long now) {
    this.now = now;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extra extra = (Extra) o;
    return Objects.equals(this.logId, extra.logId) &&
        Objects.equals(this.now, extra.now);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logId, now);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extra {\n");
    
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
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

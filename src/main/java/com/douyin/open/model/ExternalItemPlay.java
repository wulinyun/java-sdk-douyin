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
 * ExternalItemPlay
 */

public class ExternalItemPlay {
  @SerializedName("date")
  private String date = null;

  @SerializedName("play")
  private Integer play = null;

  public ExternalItemPlay date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExternalItemPlay play(Integer play) {
    this.play = play;
    return this;
  }

   /**
   * 每日播放数
   * @return play
  **/
  public Integer getPlay() {
    return play;
  }

  public void setPlay(Integer play) {
    this.play = play;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalItemPlay externalItemPlay = (ExternalItemPlay) o;
    return Objects.equals(this.date, externalItemPlay.date) &&
        Objects.equals(this.play, externalItemPlay.play);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, play);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalItemPlay {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
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

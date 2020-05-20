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
 * HotSentence
 */

public class HotSentence {
  @SerializedName("hot_level")
  private Integer hotLevel = null;

  @SerializedName("sentence")
  private String sentence = null;

  public HotSentence hotLevel(Integer hotLevel) {
    this.hotLevel = hotLevel;
    return this;
  }

   /**
   * 热度 综合点赞、评论、转发等计算得出
   * @return hotLevel
  **/
  public Integer getHotLevel() {
    return hotLevel;
  }

  public void setHotLevel(Integer hotLevel) {
    this.hotLevel = hotLevel;
  }

  public HotSentence sentence(String sentence) {
    this.sentence = sentence;
    return this;
  }

   /**
   * 热点词
   * @return sentence
  **/
  public String getSentence() {
    return sentence;
  }

  public void setSentence(String sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotSentence hotSentence = (HotSentence) o;
    return Objects.equals(this.hotLevel, hotSentence.hotLevel) &&
        Objects.equals(this.sentence, hotSentence.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotLevel, sentence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotSentence {\n");
    
    sb.append("    hotLevel: ").append(toIndentedString(hotLevel)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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

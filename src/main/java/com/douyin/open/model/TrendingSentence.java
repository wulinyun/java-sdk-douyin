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
 * TrendingSentence
 */

public class TrendingSentence {
  @SerializedName("sentence")
  private String sentence = null;

  @SerializedName("hot_level")
  private Integer hotLevel = null;

  /**
   * 标签:   * &#x60;0&#x60; - 无   * &#x60;1&#x60; - 新   * &#x60;2&#x60; - 推荐   * &#x60;3&#x60; - 热   * &#x60;4&#x60; - 爆   * &#x60;5&#x60; - 首发 
   */
  @JsonAdapter(EnumLabel.Adapter.class)
  public enum EnumLabel {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5);

    private Integer value;

    EnumLabel(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumLabel fromValue(String text) {
      for (EnumLabel b : EnumLabel.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumLabel> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumLabel enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumLabel read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumLabel.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("label")
  private EnumLabel label = null;

  public TrendingSentence sentence(String sentence) {
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

  public TrendingSentence hotLevel(Integer hotLevel) {
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

  public TrendingSentence label(EnumLabel label) {
    this.label = label;
    return this;
  }

   /**
   * 标签:   * &#x60;0&#x60; - 无   * &#x60;1&#x60; - 新   * &#x60;2&#x60; - 推荐   * &#x60;3&#x60; - 热   * &#x60;4&#x60; - 爆   * &#x60;5&#x60; - 首发 
   * @return label
  **/
  public EnumLabel getLabel() {
    return label;
  }

  public void setLabel(EnumLabel label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingSentence trendingSentence = (TrendingSentence) o;
    return Objects.equals(this.sentence, trendingSentence.sentence) &&
        Objects.equals(this.hotLevel, trendingSentence.hotLevel) &&
        Objects.equals(this.label, trendingSentence.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentence, hotLevel, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingSentence {\n");
    
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
    sb.append("    hotLevel: ").append(toIndentedString(hotLevel)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

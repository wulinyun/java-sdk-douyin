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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 富文本处理中的节点类型 1 - text 2 - image 
 */
@JsonAdapter(NodeTypeEnum.Adapter.class)
public enum NodeTypeEnum {
  NUMBER_1(1),
  NUMBER_2(2);

  private Integer value;

  NodeTypeEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NodeTypeEnum fromValue(String text) {
    for (NodeTypeEnum b : NodeTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NodeTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
      // for model enum
      Integer value = jsonReader.nextInteger();
      return NodeTypeEnum.fromValue(String.valueOf(value));
    }
  }
}

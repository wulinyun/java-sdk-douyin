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
 * 在线状态 1 - 在线; 2 - 下线 
 */
@JsonAdapter(OnlineStatus.Adapter.class)
public enum OnlineStatus {
  NUMBER_1(1),
  NUMBER_2(2);

  private Integer value;

  OnlineStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OnlineStatus fromValue(String text) {
    for (OnlineStatus b : OnlineStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OnlineStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OnlineStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OnlineStatus read(final JsonReader jsonReader) throws IOException {
      // for model enum
      Integer value = jsonReader.nextInteger();
      return OnlineStatus.fromValue(String.valueOf(value));
    }
  }
}

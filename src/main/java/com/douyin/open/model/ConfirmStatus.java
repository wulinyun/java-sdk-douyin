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
 * 订单确认状态。0 - 订单确认, 1 - 价格变动, 2 - 库存不足, 3 - 确认中
 */
@JsonAdapter(ConfirmStatus.Adapter.class)
public enum ConfirmStatus {
  NUMBER_0(0),
  NUMBER_1(1),
  NUMBER_2(2),
  NUMBER_3(3);

  private Integer value;

  ConfirmStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConfirmStatus fromValue(String text) {
    for (ConfirmStatus b : ConfirmStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConfirmStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConfirmStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConfirmStatus read(final JsonReader jsonReader) throws IOException {
      // for model enum
      Integer value = jsonReader.nextInteger();
      return ConfirmStatus.fromValue(String.valueOf(value));
    }
  }
}

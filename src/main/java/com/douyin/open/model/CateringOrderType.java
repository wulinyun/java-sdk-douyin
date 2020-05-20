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
 * 订单类型 1 order_menu(预约订餐) 2 order_queue(餐厅排号) 3 order_book(餐厅预定) 
 */
@JsonAdapter(CateringOrderType.Adapter.class)
public enum CateringOrderType {
  MENU("order_menu"),
  QUEUE("order_queue"),
  BOOK("order_book");

  private String value;

  CateringOrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CateringOrderType fromValue(String text) {
    for (CateringOrderType b : CateringOrderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CateringOrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CateringOrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CateringOrderType read(final JsonReader jsonReader) throws IOException {
      // for model enum
      String value = jsonReader.nextString();
      return CateringOrderType.fromValue(String.valueOf(value));
    }
  }
}

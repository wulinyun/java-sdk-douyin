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
 * 订单类型 1 order_groupon(团购) 2、order_tourism(门票) 
 */
@JsonAdapter(CouponOrderType.Adapter.class)
public enum CouponOrderType {
  GROUPON("order_groupon");

  private String value;

  CouponOrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CouponOrderType fromValue(String text) {
    for (CouponOrderType b : CouponOrderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CouponOrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CouponOrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CouponOrderType read(final JsonReader jsonReader) throws IOException {
      // for model enum
      String value = jsonReader.nextString();
      return CouponOrderType.fromValue(String.valueOf(value));
    }
  }
}

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
 * 店铺类型 1 - 酒店民宿 2 - 餐饮 3 - 景区 4 - 电商 5 - 教育 6 - 丽人 7 - 爱车 8 - 亲子 9 - 宠物 10 - 家装 11 - 娱乐场所 12 - 图文快印 
 */
@JsonAdapter(SupplierType.Adapter.class)
public enum SupplierType {
  NUMBER_1(1),
  NUMBER_2(2),
  NUMBER_3(3),
  NUMBER_4(4),
  NUMBER_5(5),
  NUMBER_6(6),
  NUMBER_7(7),
  NUMBER_8(8),
  NUMBER_9(9),
  NUMBER_10(10),
  NUMBER_11(11),
  NUMBER_12(12);

  private Integer value;

  SupplierType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SupplierType fromValue(String text) {
    for (SupplierType b : SupplierType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SupplierType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SupplierType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SupplierType read(final JsonReader jsonReader) throws IOException {
      // for model enum
      Integer value = jsonReader.nextInteger();
      return SupplierType.fromValue(String.valueOf(value));
    }
  }
}

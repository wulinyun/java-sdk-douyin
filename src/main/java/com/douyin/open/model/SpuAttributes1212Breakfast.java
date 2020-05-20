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
 * 加早政策
 */

public class SpuAttributes1212Breakfast {
  /**
   * 加早类型; 0 - 不支持加早; 1 - 早餐; 2 - 自助早餐
   */
  @JsonAdapter(EnumType.Adapter.class)
  public enum EnumType {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    EnumType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumType fromValue(String text) {
      for (EnumType b : EnumType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private EnumType type = null;

  @SerializedName("price")
  private Integer price = null;

  public SpuAttributes1212Breakfast type(EnumType type) {
    this.type = type;
    return this;
  }

   /**
   * 加早类型; 0 - 不支持加早; 1 - 早餐; 2 - 自助早餐
   * @return type
  **/
  public EnumType getType() {
    return type;
  }

  public void setType(EnumType type) {
    this.type = type;
  }

  public SpuAttributes1212Breakfast price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 加早费用/每人，单位人民币分 不支持加早填0
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes1212Breakfast spuAttributes1212Breakfast = (SpuAttributes1212Breakfast) o;
    return Objects.equals(this.type, spuAttributes1212Breakfast.type) &&
        Objects.equals(this.price, spuAttributes1212Breakfast.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes1212Breakfast {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

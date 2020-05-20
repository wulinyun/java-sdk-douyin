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
 * 早餐政策
 */

public class SupplierAttributes1104Breakfast {
  /**
   * 早餐类型。0 - 无早餐, 1 - 早餐, 2 - 自助早餐
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

  public SupplierAttributes1104Breakfast type(EnumType type) {
    this.type = type;
    return this;
  }

   /**
   * 早餐类型。0 - 无早餐, 1 - 早餐, 2 - 自助早餐
   * @return type
  **/
  public EnumType getType() {
    return type;
  }

  public void setType(EnumType type) {
    this.type = type;
  }

  public SupplierAttributes1104Breakfast price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 早餐价格(单位人民币分)
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
    SupplierAttributes1104Breakfast supplierAttributes1104Breakfast = (SupplierAttributes1104Breakfast) o;
    return Objects.equals(this.type, supplierAttributes1104Breakfast.type) &&
        Objects.equals(this.price, supplierAttributes1104Breakfast.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierAttributes1104Breakfast {\n");
    
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

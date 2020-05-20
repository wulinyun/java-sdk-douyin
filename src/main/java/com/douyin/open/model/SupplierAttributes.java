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
import com.douyin.open.model.HotelServiceFacility;
import com.douyin.open.model.SupplierAttributes1104;
import com.douyin.open.model.SupplierAttributes3101;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * 店铺属性字段，编号规则：垂直行业 1xxx-酒店民宿 2xxx-餐饮 3xxx-景区 通用属性-9yxxx
 */

public class SupplierAttributes {
  @SerializedName("1101")
  private List<HotelServiceFacility> _1101 = null;

  @SerializedName("1102")
  private List<HotelServiceFacility> _1102 = null;

  @SerializedName("1103")
  private List<HotelServiceFacility> _1103 = null;

  @SerializedName("1104")
  private SupplierAttributes1104 _1104 = null;

  /**
   * 下单模板。1 - 国内模板, 2 - 海外模板
   */
  @JsonAdapter(Enum1105.Adapter.class)
  public enum Enum1105 {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    Enum1105(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static Enum1105 fromValue(String text) {
      for (Enum1105 b : Enum1105.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<Enum1105> {
      @Override
      public void write(final JsonWriter jsonWriter, final Enum1105 enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Enum1105 read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return Enum1105.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("1105")
  private Enum1105 _1105 = null;

  @SerializedName("3101")
  private SupplierAttributes3101 _3101 = null;

  public SupplierAttributes _1101(List<HotelServiceFacility> _1101) {
    this._1101 = _1101;
    return this;
  }

  public SupplierAttributes add1101Item(HotelServiceFacility _1101Item) {
    if (this._1101 == null) {
      this._1101 = new ArrayList<HotelServiceFacility>();
    }
    this._1101.add(_1101Item);
    return this;
  }

   /**
   * 酒店服务
   * @return _1101
  **/
  public List<HotelServiceFacility> get1101() {
    return _1101;
  }

  public void set1101(List<HotelServiceFacility> _1101) {
    this._1101 = _1101;
  }

  public SupplierAttributes _1102(List<HotelServiceFacility> _1102) {
    this._1102 = _1102;
    return this;
  }

  public SupplierAttributes add1102Item(HotelServiceFacility _1102Item) {
    if (this._1102 == null) {
      this._1102 = new ArrayList<HotelServiceFacility>();
    }
    this._1102.add(_1102Item);
    return this;
  }

   /**
   * 酒店设施
   * @return _1102
  **/
  public List<HotelServiceFacility> get1102() {
    return _1102;
  }

  public void set1102(List<HotelServiceFacility> _1102) {
    this._1102 = _1102;
  }

  public SupplierAttributes _1103(List<HotelServiceFacility> _1103) {
    this._1103 = _1103;
    return this;
  }

  public SupplierAttributes add1103Item(HotelServiceFacility _1103Item) {
    if (this._1103 == null) {
      this._1103 = new ArrayList<HotelServiceFacility>();
    }
    this._1103.add(_1103Item);
    return this;
  }

   /**
   * 酒店特色项目
   * @return _1103
  **/
  public List<HotelServiceFacility> get1103() {
    return _1103;
  }

  public void set1103(List<HotelServiceFacility> _1103) {
    this._1103 = _1103;
  }

  public SupplierAttributes _1104(SupplierAttributes1104 _1104) {
    this._1104 = _1104;
    return this;
  }

   /**
   * Get _1104
   * @return _1104
  **/
  public SupplierAttributes1104 get1104() {
    return _1104;
  }

  public void set1104(SupplierAttributes1104 _1104) {
    this._1104 = _1104;
  }

  public SupplierAttributes _1105(Enum1105 _1105) {
    this._1105 = _1105;
    return this;
  }

   /**
   * 下单模板。1 - 国内模板, 2 - 海外模板
   * @return _1105
  **/
  public Enum1105 get1105() {
    return _1105;
  }

  public void set1105(Enum1105 _1105) {
    this._1105 = _1105;
  }

  public SupplierAttributes _3101(SupplierAttributes3101 _3101) {
    this._3101 = _3101;
    return this;
  }

   /**
   * Get _3101
   * @return _3101
  **/
  public SupplierAttributes3101 get3101() {
    return _3101;
  }

  public void set3101(SupplierAttributes3101 _3101) {
    this._3101 = _3101;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierAttributes supplierAttributes = (SupplierAttributes) o;
    return Objects.equals(this._1101, supplierAttributes._1101) &&
        Objects.equals(this._1102, supplierAttributes._1102) &&
        Objects.equals(this._1103, supplierAttributes._1103) &&
        Objects.equals(this._1104, supplierAttributes._1104) &&
        Objects.equals(this._1105, supplierAttributes._1105) &&
        Objects.equals(this._3101, supplierAttributes._3101);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1101, _1102, _1103, _1104, _1105, _3101);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierAttributes {\n");
    
    sb.append("    _1101: ").append(toIndentedString(_1101)).append("\n");
    sb.append("    _1102: ").append(toIndentedString(_1102)).append("\n");
    sb.append("    _1103: ").append(toIndentedString(_1103)).append("\n");
    sb.append("    _1104: ").append(toIndentedString(_1104)).append("\n");
    sb.append("    _1105: ").append(toIndentedString(_1105)).append("\n");
    sb.append("    _3101: ").append(toIndentedString(_3101)).append("\n");
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

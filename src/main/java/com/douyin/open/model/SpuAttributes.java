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
import com.douyin.open.model.SpuAttributes1201;
import com.douyin.open.model.SpuAttributes1209;
import com.douyin.open.model.SpuAttributes1211;
import com.douyin.open.model.SpuAttributes1212;
import com.douyin.open.model.SpuAttributes1213;
import com.douyin.open.model.SpuAttributes4101;
import com.douyin.open.model.SpuAttributes90201;
import com.douyin.open.model.SpuAttributes90205;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * SPU属性字段
 */

public class SpuAttributes {
  @SerializedName("1201")
  private List<SpuAttributes1201> _1201 = null;

  @SerializedName("1202")
  private String _1202 = null;

  @SerializedName("1203")
  private Integer _1203 = null;

  @SerializedName("1204")
  private BigDecimal _1204 = null;

  @SerializedName("1205")
  private String _1205 = null;

  @SerializedName("1206")
  private List<String> _1206 = null;

  @SerializedName("1207")
  private String _1207 = null;

  @SerializedName("1208")
  private String _1208 = null;

  @SerializedName("1209")
  private SpuAttributes1209 _1209 = null;

  @SerializedName("1210")
  private String _1210 = null;

  @SerializedName("1211")
  private SpuAttributes1211 _1211 = null;

  @SerializedName("1212")
  private SpuAttributes1212 _1212 = null;

  @SerializedName("1213")
  private SpuAttributes1213 _1213 = null;

  /**
   * 早餐; 0 - 无早餐; 1~9 - n份早餐; 10 - 多份早餐
   */
  @JsonAdapter(Enum1214.Adapter.class)
  public enum Enum1214 {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5),
    NUMBER_6(6),
    NUMBER_7(7),
    NUMBER_8(8),
    NUMBER_9(9),
    NUMBER_10(10);

    private Integer value;

    Enum1214(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static Enum1214 fromValue(String text) {
      for (Enum1214 b : Enum1214.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<Enum1214> {
      @Override
      public void write(final JsonWriter jsonWriter, final Enum1214 enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Enum1214 read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return Enum1214.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("1214")
  private Enum1214 _1214 = null;

  @SerializedName("90201")
  private SpuAttributes90201 _90201 = null;

  /**
   * 是否可退 1- 随时退，2-不可退, 3-有条件退
   */
  @JsonAdapter(Enum90202.Adapter.class)
  public enum Enum90202 {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    Enum90202(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static Enum90202 fromValue(String text) {
      for (Enum90202 b : Enum90202.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<Enum90202> {
      @Override
      public void write(final JsonWriter jsonWriter, final Enum90202 enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Enum90202 read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return Enum90202.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("90202")
  private Enum90202 _90202 = null;

  /**
   * 取票信息 1-需要取票 2-无需取票
   */
  @JsonAdapter(Enum90203.Adapter.class)
  public enum Enum90203 {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    Enum90203(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static Enum90203 fromValue(String text) {
      for (Enum90203 b : Enum90203.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<Enum90203> {
      @Override
      public void write(final JsonWriter jsonWriter, final Enum90203 enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Enum90203 read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return Enum90203.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("90203")
  private Enum90203 _90203 = null;

  @SerializedName("90204")
  private Integer _90204 = null;

  @SerializedName("90205")
  private SpuAttributes90205 _90205 = null;

  @SerializedName("4101")
  private SpuAttributes4101 _4101 = null;

  public SpuAttributes _1201(List<SpuAttributes1201> _1201) {
    this._1201 = _1201;
    return this;
  }

  public SpuAttributes add1201Item(SpuAttributes1201 _1201Item) {
    if (this._1201 == null) {
      this._1201 = new ArrayList<SpuAttributes1201>();
    }
    this._1201.add(_1201Item);
    return this;
  }

   /**
   * 设施列表
   * @return _1201
  **/
  public List<SpuAttributes1201> get1201() {
    return _1201;
  }

  public void set1201(List<SpuAttributes1201> _1201) {
    this._1201 = _1201;
  }

  public SpuAttributes _1202(String _1202) {
    this._1202 = _1202;
    return this;
  }

   /**
   * 床型名称
   * @return _1202
  **/
  public String get1202() {
    return _1202;
  }

  public void set1202(String _1202) {
    this._1202 = _1202;
  }

  public SpuAttributes _1203(Integer _1203) {
    this._1203 = _1203;
    return this;
  }

   /**
   * 可住人数
   * @return _1203
  **/
  public Integer get1203() {
    return _1203;
  }

  public void set1203(Integer _1203) {
    this._1203 = _1203;
  }

  public SpuAttributes _1204(BigDecimal _1204) {
    this._1204 = _1204;
    return this;
  }

   /**
   * 面积(平方米)
   * @return _1204
  **/
  public BigDecimal get1204() {
    return _1204;
  }

  public void set1204(BigDecimal _1204) {
    this._1204 = _1204;
  }

  public SpuAttributes _1205(String _1205) {
    this._1205 = _1205;
    return this;
  }

   /**
   * 房型封面图
   * @return _1205
  **/
  public String get1205() {
    return _1205;
  }

  public void set1205(String _1205) {
    this._1205 = _1205;
  }

  public SpuAttributes _1206(List<String> _1206) {
    this._1206 = _1206;
    return this;
  }

  public SpuAttributes add1206Item(String _1206Item) {
    if (this._1206 == null) {
      this._1206 = new ArrayList<String>();
    }
    this._1206.add(_1206Item);
    return this;
  }

   /**
   * 房型相册
   * @return _1206
  **/
  public List<String> get1206() {
    return _1206;
  }

  public void set1206(List<String> _1206) {
    this._1206 = _1206;
  }

  public SpuAttributes _1207(String _1207) {
    this._1207 = _1207;
    return this;
  }

   /**
   * 房型简介
   * @return _1207
  **/
  public String get1207() {
    return _1207;
  }

  public void set1207(String _1207) {
    this._1207 = _1207;
  }

  public SpuAttributes _1208(String _1208) {
    this._1208 = _1208;
    return this;
  }

   /**
   * 相关政策
   * @return _1208
  **/
  public String get1208() {
    return _1208;
  }

  public void set1208(String _1208) {
    this._1208 = _1208;
  }

  public SpuAttributes _1209(SpuAttributes1209 _1209) {
    this._1209 = _1209;
    return this;
  }

   /**
   * Get _1209
   * @return _1209
  **/
  public SpuAttributes1209 get1209() {
    return _1209;
  }

  public void set1209(SpuAttributes1209 _1209) {
    this._1209 = _1209;
  }

  public SpuAttributes _1210(String _1210) {
    this._1210 = _1210;
    return this;
  }

   /**
   * 景观
   * @return _1210
  **/
  public String get1210() {
    return _1210;
  }

  public void set1210(String _1210) {
    this._1210 = _1210;
  }

  public SpuAttributes _1211(SpuAttributes1211 _1211) {
    this._1211 = _1211;
    return this;
  }

   /**
   * Get _1211
   * @return _1211
  **/
  public SpuAttributes1211 get1211() {
    return _1211;
  }

  public void set1211(SpuAttributes1211 _1211) {
    this._1211 = _1211;
  }

  public SpuAttributes _1212(SpuAttributes1212 _1212) {
    this._1212 = _1212;
    return this;
  }

   /**
   * Get _1212
   * @return _1212
  **/
  public SpuAttributes1212 get1212() {
    return _1212;
  }

  public void set1212(SpuAttributes1212 _1212) {
    this._1212 = _1212;
  }

  public SpuAttributes _1213(SpuAttributes1213 _1213) {
    this._1213 = _1213;
    return this;
  }

   /**
   * Get _1213
   * @return _1213
  **/
  public SpuAttributes1213 get1213() {
    return _1213;
  }

  public void set1213(SpuAttributes1213 _1213) {
    this._1213 = _1213;
  }

  public SpuAttributes _1214(Enum1214 _1214) {
    this._1214 = _1214;
    return this;
  }

   /**
   * 早餐; 0 - 无早餐; 1~9 - n份早餐; 10 - 多份早餐
   * @return _1214
  **/
  public Enum1214 get1214() {
    return _1214;
  }

  public void set1214(Enum1214 _1214) {
    this._1214 = _1214;
  }

  public SpuAttributes _90201(SpuAttributes90201 _90201) {
    this._90201 = _90201;
    return this;
  }

   /**
   * Get _90201
   * @return _90201
  **/
  public SpuAttributes90201 get90201() {
    return _90201;
  }

  public void set90201(SpuAttributes90201 _90201) {
    this._90201 = _90201;
  }

  public SpuAttributes _90202(Enum90202 _90202) {
    this._90202 = _90202;
    return this;
  }

   /**
   * 是否可退 1- 随时退，2-不可退, 3-有条件退
   * @return _90202
  **/
  public Enum90202 get90202() {
    return _90202;
  }

  public void set90202(Enum90202 _90202) {
    this._90202 = _90202;
  }

  public SpuAttributes _90203(Enum90203 _90203) {
    this._90203 = _90203;
    return this;
  }

   /**
   * 取票信息 1-需要取票 2-无需取票
   * @return _90203
  **/
  public Enum90203 get90203() {
    return _90203;
  }

  public void set90203(Enum90203 _90203) {
    this._90203 = _90203;
  }

  public SpuAttributes _90204(Integer _90204) {
    this._90204 = _90204;
    return this;
  }

   /**
   * 门票价格(展示最近7日最低价，精确到分)
   * @return _90204
  **/
  public Integer get90204() {
    return _90204;
  }

  public void set90204(Integer _90204) {
    this._90204 = _90204;
  }

  public SpuAttributes _90205(SpuAttributes90205 _90205) {
    this._90205 = _90205;
    return this;
  }

   /**
   * Get _90205
   * @return _90205
  **/
  public SpuAttributes90205 get90205() {
    return _90205;
  }

  public void set90205(SpuAttributes90205 _90205) {
    this._90205 = _90205;
  }

  public SpuAttributes _4101(SpuAttributes4101 _4101) {
    this._4101 = _4101;
    return this;
  }

   /**
   * Get _4101
   * @return _4101
  **/
  public SpuAttributes4101 get4101() {
    return _4101;
  }

  public void set4101(SpuAttributes4101 _4101) {
    this._4101 = _4101;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes spuAttributes = (SpuAttributes) o;
    return Objects.equals(this._1201, spuAttributes._1201) &&
        Objects.equals(this._1202, spuAttributes._1202) &&
        Objects.equals(this._1203, spuAttributes._1203) &&
        Objects.equals(this._1204, spuAttributes._1204) &&
        Objects.equals(this._1205, spuAttributes._1205) &&
        Objects.equals(this._1206, spuAttributes._1206) &&
        Objects.equals(this._1207, spuAttributes._1207) &&
        Objects.equals(this._1208, spuAttributes._1208) &&
        Objects.equals(this._1209, spuAttributes._1209) &&
        Objects.equals(this._1210, spuAttributes._1210) &&
        Objects.equals(this._1211, spuAttributes._1211) &&
        Objects.equals(this._1212, spuAttributes._1212) &&
        Objects.equals(this._1213, spuAttributes._1213) &&
        Objects.equals(this._1214, spuAttributes._1214) &&
        Objects.equals(this._90201, spuAttributes._90201) &&
        Objects.equals(this._90202, spuAttributes._90202) &&
        Objects.equals(this._90203, spuAttributes._90203) &&
        Objects.equals(this._90204, spuAttributes._90204) &&
        Objects.equals(this._90205, spuAttributes._90205) &&
        Objects.equals(this._4101, spuAttributes._4101);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1201, _1202, _1203, _1204, _1205, _1206, _1207, _1208, _1209, _1210, _1211, _1212, _1213, _1214, _90201, _90202, _90203, _90204, _90205, _4101);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes {\n");
    
    sb.append("    _1201: ").append(toIndentedString(_1201)).append("\n");
    sb.append("    _1202: ").append(toIndentedString(_1202)).append("\n");
    sb.append("    _1203: ").append(toIndentedString(_1203)).append("\n");
    sb.append("    _1204: ").append(toIndentedString(_1204)).append("\n");
    sb.append("    _1205: ").append(toIndentedString(_1205)).append("\n");
    sb.append("    _1206: ").append(toIndentedString(_1206)).append("\n");
    sb.append("    _1207: ").append(toIndentedString(_1207)).append("\n");
    sb.append("    _1208: ").append(toIndentedString(_1208)).append("\n");
    sb.append("    _1209: ").append(toIndentedString(_1209)).append("\n");
    sb.append("    _1210: ").append(toIndentedString(_1210)).append("\n");
    sb.append("    _1211: ").append(toIndentedString(_1211)).append("\n");
    sb.append("    _1212: ").append(toIndentedString(_1212)).append("\n");
    sb.append("    _1213: ").append(toIndentedString(_1213)).append("\n");
    sb.append("    _1214: ").append(toIndentedString(_1214)).append("\n");
    sb.append("    _90201: ").append(toIndentedString(_90201)).append("\n");
    sb.append("    _90202: ").append(toIndentedString(_90202)).append("\n");
    sb.append("    _90203: ").append(toIndentedString(_90203)).append("\n");
    sb.append("    _90204: ").append(toIndentedString(_90204)).append("\n");
    sb.append("    _90205: ").append(toIndentedString(_90205)).append("\n");
    sb.append("    _4101: ").append(toIndentedString(_4101)).append("\n");
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

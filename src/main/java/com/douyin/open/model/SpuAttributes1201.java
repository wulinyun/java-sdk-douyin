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
 * SpuAttributes1201
 */

public class SpuAttributes1201 {
  /**
   * 设施ID(目前没用，后期可能涉及到展示设施的icon) 1 - 空调; 2 - 电视; 3 - 阳台; 4 - 窗户; 5 - 独立卫浴; 6 - 浴缸; 7 - 吹风机; 8 - 衣架; 9 - 热水; 10 - 洗衣机; 11 - 基本厨具; 12 - 冰箱; 13 - 免费Wifi; 14 - 电热水壶; 15 - 暖气; 16 - 智能马桶; 17 - 微波炉; 18 - 门禁系统; 19 - 智能门锁; 20 - 私家花园; 21 - 私家泳池; 22 - 观景露台; 23 - 免费停车; 24 - 行李寄存 
   */
  @JsonAdapter(EnumCode.Adapter.class)
  public enum EnumCode {
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
    NUMBER_12(12),
    NUMBER_13(13),
    NUMBER_14(14),
    NUMBER_15(15),
    NUMBER_16(16),
    NUMBER_17(17),
    NUMBER_18(18),
    NUMBER_19(19),
    NUMBER_20(20),
    NUMBER_21(21),
    NUMBER_22(22),
    NUMBER_23(23),
    NUMBER_24(24),
    NUMBER_MINUS_1(-1);

    private Integer value;

    EnumCode(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumCode fromValue(String text) {
      for (EnumCode b : EnumCode.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumCode> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumCode enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumCode read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumCode.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("code")
  private EnumCode code = null;

  @SerializedName("name")
  private String name = null;

  public SpuAttributes1201 code(EnumCode code) {
    this.code = code;
    return this;
  }

   /**
   * 设施ID(目前没用，后期可能涉及到展示设施的icon) 1 - 空调; 2 - 电视; 3 - 阳台; 4 - 窗户; 5 - 独立卫浴; 6 - 浴缸; 7 - 吹风机; 8 - 衣架; 9 - 热水; 10 - 洗衣机; 11 - 基本厨具; 12 - 冰箱; 13 - 免费Wifi; 14 - 电热水壶; 15 - 暖气; 16 - 智能马桶; 17 - 微波炉; 18 - 门禁系统; 19 - 智能门锁; 20 - 私家花园; 21 - 私家泳池; 22 - 观景露台; 23 - 免费停车; 24 - 行李寄存 
   * @return code
  **/
  public EnumCode getCode() {
    return code;
  }

  public void setCode(EnumCode code) {
    this.code = code;
  }

  public SpuAttributes1201 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 设施名称，code ！&#x3D; -1 时展示name,其他情况下展示code对应的名称。长度不超过6字符
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes1201 spuAttributes1201 = (SpuAttributes1201) o;
    return Objects.equals(this.code, spuAttributes1201.code) &&
        Objects.equals(this.name, spuAttributes1201.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes1201 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

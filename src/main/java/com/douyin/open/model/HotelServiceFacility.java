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
 * 酒店服务/设施
 */

public class HotelServiceFacility {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("name")
  private String name = null;

  public HotelServiceFacility code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 设施/服务code, -1代表自定义。1 - 空调; 2 - 电视; 3 - 阳台; 4 - 窗户; 5 - 独立卫浴; 6 - 浴缸; 7 - 吹风机; 8 - 衣架; 9 - 热水; 10 - 洗衣机; 11 - 基本厨具; 12 - 冰箱; 13 - 免费Wifi; 14 - 电热水壶; 15 - 暖气; 16 - 智能马桶; 17 - 微波炉; 18 - 门禁系统; 19 - 智能门锁; 20 - 私家花园; 21 - 私家泳池; 22 - 观景露台; 23 - 免费停车; 24 - 行李寄存;
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public HotelServiceFacility name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 设施/服务名称, code与name不匹配时，code生效。自定义项目不超过5个汉字
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
    HotelServiceFacility hotelServiceFacility = (HotelServiceFacility) o;
    return Objects.equals(this.code, hotelServiceFacility.code) &&
        Objects.equals(this.name, hotelServiceFacility.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelServiceFacility {\n");
    
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

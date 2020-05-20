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
 * 外部商家信息
 */

public class ExtShopInfo {
  @SerializedName("shop_id")
  private String shopId = null;

  @SerializedName("ext_shop_id")
  private String extShopId = null;

  public ExtShopInfo shopId(String shopId) {
    this.shopId = shopId;
    return this;
  }

   /**
   * 抖音商户ID
   * @return shopId
  **/
  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  public ExtShopInfo extShopId(String extShopId) {
    this.extShopId = extShopId;
    return this;
  }

   /**
   * 外部商户ID
   * @return extShopId
  **/
  public String getExtShopId() {
    return extShopId;
  }

  public void setExtShopId(String extShopId) {
    this.extShopId = extShopId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtShopInfo extShopInfo = (ExtShopInfo) o;
    return Objects.equals(this.shopId, extShopInfo.shopId) &&
        Objects.equals(this.extShopId, extShopInfo.extShopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopId, extShopId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtShopInfo {\n");
    
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    extShopId: ").append(toIndentedString(extShopId)).append("\n");
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

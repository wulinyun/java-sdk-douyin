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
import com.douyin.open.model.OnlineStatus;
import com.douyin.open.model.SkuAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiSkuSyncSkus
 */

public class PoiSkuSyncSkus {
  @SerializedName("price")
  private Integer price = null;

  @SerializedName("stock")
  private Integer stock = null;

  @SerializedName("status")
  private OnlineStatus status = null;

  @SerializedName("attributes")
  private SkuAttributes attributes = null;

  public PoiSkuSyncSkus price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 价格(人民币分)
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public PoiSkuSyncSkus stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * 库存数量
   * @return stock
  **/
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public PoiSkuSyncSkus status(OnlineStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public OnlineStatus getStatus() {
    return status;
  }

  public void setStatus(OnlineStatus status) {
    this.status = status;
  }

  public PoiSkuSyncSkus attributes(SkuAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  public SkuAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SkuAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSkuSyncSkus poiSkuSyncSkus = (PoiSkuSyncSkus) o;
    return Objects.equals(this.price, poiSkuSyncSkus.price) &&
        Objects.equals(this.stock, poiSkuSyncSkus.stock) &&
        Objects.equals(this.status, poiSkuSyncSkus.status) &&
        Objects.equals(this.attributes, poiSkuSyncSkus.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, stock, status, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSkuSyncSkus {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

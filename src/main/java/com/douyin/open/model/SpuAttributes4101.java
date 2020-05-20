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
import com.douyin.open.model.SpuAttributes4101Response;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 电商商品
 */

public class SpuAttributes4101 {
  @SerializedName("market_price")
  private Integer marketPrice = null;

  @SerializedName("discount_price")
  private Integer discountPrice = null;

  @SerializedName("img")
  private String img = null;

  @SerializedName("selled_num")
  private Integer selledNum = null;

  @SerializedName("detail_entry")
  private SpuAttributes4101Response detailEntry = null;

  public SpuAttributes4101 marketPrice(Integer marketPrice) {
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * 原价 单位：分
   * @return marketPrice
  **/
  public Integer getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(Integer marketPrice) {
    this.marketPrice = marketPrice;
  }

  public SpuAttributes4101 discountPrice(Integer discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * 售价 单位：分
   * @return discountPrice
  **/
  public Integer getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(Integer discountPrice) {
    this.discountPrice = discountPrice;
  }

  public SpuAttributes4101 img(String img) {
    this.img = img;
    return this;
  }

   /**
   * 商品图片
   * @return img
  **/
  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public SpuAttributes4101 selledNum(Integer selledNum) {
    this.selledNum = selledNum;
    return this;
  }

   /**
   * 销量
   * @return selledNum
  **/
  public Integer getSelledNum() {
    return selledNum;
  }

  public void setSelledNum(Integer selledNum) {
    this.selledNum = selledNum;
  }

  public SpuAttributes4101 detailEntry(SpuAttributes4101Response detailEntry) {
    this.detailEntry = detailEntry;
    return this;
  }

   /**
   * Get detailEntry
   * @return detailEntry
  **/
  public SpuAttributes4101Response getDetailEntry() {
    return detailEntry;
  }

  public void setDetailEntry(SpuAttributes4101Response detailEntry) {
    this.detailEntry = detailEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuAttributes4101 spuAttributes4101 = (SpuAttributes4101) o;
    return Objects.equals(this.marketPrice, spuAttributes4101.marketPrice) &&
        Objects.equals(this.discountPrice, spuAttributes4101.discountPrice) &&
        Objects.equals(this.img, spuAttributes4101.img) &&
        Objects.equals(this.selledNum, spuAttributes4101.selledNum) &&
        Objects.equals(this.detailEntry, spuAttributes4101.detailEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketPrice, discountPrice, img, selledNum, detailEntry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuAttributes4101 {\n");
    
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    selledNum: ").append(toIndentedString(selledNum)).append("\n");
    sb.append("    detailEntry: ").append(toIndentedString(detailEntry)).append("\n");
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

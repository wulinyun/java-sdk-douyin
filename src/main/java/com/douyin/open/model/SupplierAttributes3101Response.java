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
 * SupplierAttributes3101Response
 */

public class SupplierAttributes3101Response {
  @SerializedName("population")
  private String population = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("discount")
  private String discount = null;

  public SupplierAttributes3101Response population(String population) {
    this.population = population;
    return this;
  }

   /**
   * 优待政策-人群(婴儿、儿童、老人、军人、残障人士，不超过30个汉字)
   * @return population
  **/
  public String getPopulation() {
    return population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public SupplierAttributes3101Response condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * 优待政策-适用条件(不超过200个汉字)
   * @return condition
  **/
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public SupplierAttributes3101Response discount(String discount) {
    this.discount = discount;
    return this;
  }

   /**
   * 优待政策-优待内容(免费、优惠、半价)
   * @return discount
  **/
  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierAttributes3101Response supplierAttributes3101Response = (SupplierAttributes3101Response) o;
    return Objects.equals(this.population, supplierAttributes3101Response.population) &&
        Objects.equals(this.condition, supplierAttributes3101Response.condition) &&
        Objects.equals(this.discount, supplierAttributes3101Response.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(population, condition, discount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierAttributes3101Response {\n");
    
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

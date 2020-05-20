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
import com.douyin.open.model.SupplierAttributes1104Breakfast;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 酒店政策
 */

public class SupplierAttributes1104 {
  @SerializedName("check_in_time")
  private String checkInTime = null;

  @SerializedName("check_out_time")
  private String checkOutTime = null;

  @SerializedName("breakfast")
  private SupplierAttributes1104Breakfast breakfast = null;

  @SerializedName("child")
  private String child = null;

  @SerializedName("pet")
  private String pet = null;

  public SupplierAttributes1104 checkInTime(String checkInTime) {
    this.checkInTime = checkInTime;
    return this;
  }

   /**
   * 入住时间(HH:mm)
   * @return checkInTime
  **/
  public String getCheckInTime() {
    return checkInTime;
  }

  public void setCheckInTime(String checkInTime) {
    this.checkInTime = checkInTime;
  }

  public SupplierAttributes1104 checkOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
    return this;
  }

   /**
   * 离店时间(HH:mm)
   * @return checkOutTime
  **/
  public String getCheckOutTime() {
    return checkOutTime;
  }

  public void setCheckOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
  }

  public SupplierAttributes1104 breakfast(SupplierAttributes1104Breakfast breakfast) {
    this.breakfast = breakfast;
    return this;
  }

   /**
   * Get breakfast
   * @return breakfast
  **/
  public SupplierAttributes1104Breakfast getBreakfast() {
    return breakfast;
  }

  public void setBreakfast(SupplierAttributes1104Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public SupplierAttributes1104 child(String child) {
    this.child = child;
    return this;
  }

   /**
   * 儿童政策(&lt;&#x3D;500字)
   * @return child
  **/
  public String getChild() {
    return child;
  }

  public void setChild(String child) {
    this.child = child;
  }

  public SupplierAttributes1104 pet(String pet) {
    this.pet = pet;
    return this;
  }

   /**
   * 宠物政策(&lt;&#x3D;500字)
   * @return pet
  **/
  public String getPet() {
    return pet;
  }

  public void setPet(String pet) {
    this.pet = pet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierAttributes1104 supplierAttributes1104 = (SupplierAttributes1104) o;
    return Objects.equals(this.checkInTime, supplierAttributes1104.checkInTime) &&
        Objects.equals(this.checkOutTime, supplierAttributes1104.checkOutTime) &&
        Objects.equals(this.breakfast, supplierAttributes1104.breakfast) &&
        Objects.equals(this.child, supplierAttributes1104.child) &&
        Objects.equals(this.pet, supplierAttributes1104.pet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInTime, checkOutTime, breakfast, child, pet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierAttributes1104 {\n");
    
    sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
    sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
    sb.append("    breakfast: ").append(toIndentedString(breakfast)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    pet: ").append(toIndentedString(pet)).append("\n");
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

/*
 * 企业号意向用户管理
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
 * EnterpriseLeadsTagDeleteBody
 */

public class EnterpriseLeadsTagDeleteBody {
  @SerializedName("tag_id")
  private Integer tagId = null;

  public EnterpriseLeadsTagDeleteBody tagId(Integer tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * 标签id
   * @return tagId
  **/
  public Integer getTagId() {
    return tagId;
  }

  public void setTagId(Integer tagId) {
    this.tagId = tagId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsTagDeleteBody enterpriseLeadsTagDeleteBody = (EnterpriseLeadsTagDeleteBody) o;
    return Objects.equals(this.tagId, enterpriseLeadsTagDeleteBody.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsTagDeleteBody {\n");
    
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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

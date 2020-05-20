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
 * EnterpriseLeadsTagUpdateBody
 */

public class EnterpriseLeadsTagUpdateBody {
  @SerializedName("tag_name")
  private String tagName = null;

  @SerializedName("tag_id")
  private Integer tagId = null;

  public EnterpriseLeadsTagUpdateBody tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * 标签名称
   * @return tagName
  **/
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public EnterpriseLeadsTagUpdateBody tagId(Integer tagId) {
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
    EnterpriseLeadsTagUpdateBody enterpriseLeadsTagUpdateBody = (EnterpriseLeadsTagUpdateBody) o;
    return Objects.equals(this.tagName, enterpriseLeadsTagUpdateBody.tagName) &&
        Objects.equals(this.tagId, enterpriseLeadsTagUpdateBody.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, tagId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsTagUpdateBody {\n");
    
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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

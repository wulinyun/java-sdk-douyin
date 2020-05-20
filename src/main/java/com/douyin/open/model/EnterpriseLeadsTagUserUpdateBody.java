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
 * EnterpriseLeadsTagUserUpdateBody
 */

public class EnterpriseLeadsTagUserUpdateBody {
  @SerializedName("tag_id")
  private Integer tagId = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("bind")
  private Boolean bind = null;

  public EnterpriseLeadsTagUserUpdateBody tagId(Integer tagId) {
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

  public EnterpriseLeadsTagUserUpdateBody userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户openid
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EnterpriseLeadsTagUserUpdateBody bind(Boolean bind) {
    this.bind = bind;
    return this;
  }

   /**
   * 是否绑定
   * @return bind
  **/
  public Boolean isBind() {
    return bind;
  }

  public void setBind(Boolean bind) {
    this.bind = bind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsTagUserUpdateBody enterpriseLeadsTagUserUpdateBody = (EnterpriseLeadsTagUserUpdateBody) o;
    return Objects.equals(this.tagId, enterpriseLeadsTagUserUpdateBody.tagId) &&
        Objects.equals(this.userId, enterpriseLeadsTagUserUpdateBody.userId) &&
        Objects.equals(this.bind, enterpriseLeadsTagUserUpdateBody.bind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagId, userId, bind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsTagUserUpdateBody {\n");
    
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    bind: ").append(toIndentedString(bind)).append("\n");
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

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
 * EnterpriseLeadsUserActionListResponseDataList
 */

public class EnterpriseLeadsUserActionListResponseDataList {
  /**
   * 分类   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动 
   */
  @JsonAdapter(EnumActionType.Adapter.class)
  public enum EnumActionType {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    EnumActionType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumActionType fromValue(String text) {
      for (EnumActionType b : EnumActionType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumActionType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumActionType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumActionType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumActionType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("action_type")
  private EnumActionType actionType = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("action_source")
  private String actionSource = null;

  @SerializedName("action_flag")
  private Integer actionFlag = null;

  @SerializedName("create_time")
  private Integer createTime = null;

  public EnterpriseLeadsUserActionListResponseDataList actionType(EnumActionType actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * 分类   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动 
   * @return actionType
  **/
  public EnumActionType getActionType() {
    return actionType;
  }

  public void setActionType(EnumActionType actionType) {
    this.actionType = actionType;
  }

  public EnterpriseLeadsUserActionListResponseDataList userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EnterpriseLeadsUserActionListResponseDataList actionSource(String actionSource) {
    this.actionSource = actionSource;
    return this;
  }

   /**
   * Get actionSource
   * @return actionSource
  **/
  public String getActionSource() {
    return actionSource;
  }

  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  public EnterpriseLeadsUserActionListResponseDataList actionFlag(Integer actionFlag) {
    this.actionFlag = actionFlag;
    return this;
  }

   /**
   * Get actionFlag
   * @return actionFlag
  **/
  public Integer getActionFlag() {
    return actionFlag;
  }

  public void setActionFlag(Integer actionFlag) {
    this.actionFlag = actionFlag;
  }

  public EnterpriseLeadsUserActionListResponseDataList createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsUserActionListResponseDataList enterpriseLeadsUserActionListResponseDataList = (EnterpriseLeadsUserActionListResponseDataList) o;
    return Objects.equals(this.actionType, enterpriseLeadsUserActionListResponseDataList.actionType) &&
        Objects.equals(this.userId, enterpriseLeadsUserActionListResponseDataList.userId) &&
        Objects.equals(this.actionSource, enterpriseLeadsUserActionListResponseDataList.actionSource) &&
        Objects.equals(this.actionFlag, enterpriseLeadsUserActionListResponseDataList.actionFlag) &&
        Objects.equals(this.createTime, enterpriseLeadsUserActionListResponseDataList.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, userId, actionSource, actionFlag, createTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsUserActionListResponseDataList {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    actionSource: ").append(toIndentedString(actionSource)).append("\n");
    sb.append("    actionFlag: ").append(toIndentedString(actionFlag)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

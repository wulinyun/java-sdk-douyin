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
import com.douyin.open.model.EnterpriseLeadsUserListResponseDataResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseLeadsUserListResponseDataUsers
 */

public class EnterpriseLeadsUserListResponseDataUsers {
  @SerializedName("open_id")
  private String openId = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("telephone")
  private String telephone = null;

  @SerializedName("wechat")
  private String wechat = null;

  @SerializedName("city")
  private String city = null;

  /**
   * 性别 * &#x60;0&#x60; - 未知 * &#x60;1&#x60; - 男 * &#x60;2&#x60; - 女 
   */
  @JsonAdapter(EnumGender.Adapter.class)
  public enum EnumGender {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    EnumGender(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumGender fromValue(String text) {
      for (EnumGender b : EnumGender.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumGender> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumGender enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumGender read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumGender.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("gender")
  private EnumGender gender = null;

  @SerializedName("age")
  private Integer age = null;

  /**
   * 用户状态 * &#x60;-1&#x60; - 没兴趣 * &#x60;0&#x60; - 了解 * &#x60;1&#x60; - 有兴趣 * &#x60;2&#x60; - 有意愿 * &#x60;10&#x60; - 已转化 
   */
  @JsonAdapter(EnumLeadsLevel.Adapter.class)
  public enum EnumLeadsLevel {
    NUMBER_MINUS_1(-1),
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_10(10);

    private Integer value;

    EnumLeadsLevel(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumLeadsLevel fromValue(String text) {
      for (EnumLeadsLevel b : EnumLeadsLevel.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumLeadsLevel> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumLeadsLevel enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumLeadsLevel read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumLeadsLevel.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("leads_level")
  private EnumLeadsLevel leadsLevel = null;

  @SerializedName("tag_list")
  private List<EnterpriseLeadsUserListResponseDataResponse> tagList = null;

  @SerializedName("is_follow")
  private Boolean isFollow = null;

  public EnterpriseLeadsUserListResponseDataUsers openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 用户在当前应用的唯一标识
   * @return openId
  **/
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public EnterpriseLeadsUserListResponseDataUsers nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public EnterpriseLeadsUserListResponseDataUsers avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public EnterpriseLeadsUserListResponseDataUsers telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public EnterpriseLeadsUserListResponseDataUsers wechat(String wechat) {
    this.wechat = wechat;
    return this;
  }

   /**
   * Get wechat
   * @return wechat
  **/
  public String getWechat() {
    return wechat;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }

  public EnterpriseLeadsUserListResponseDataUsers city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public EnterpriseLeadsUserListResponseDataUsers gender(EnumGender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 性别 * &#x60;0&#x60; - 未知 * &#x60;1&#x60; - 男 * &#x60;2&#x60; - 女 
   * @return gender
  **/
  public EnumGender getGender() {
    return gender;
  }

  public void setGender(EnumGender gender) {
    this.gender = gender;
  }

  public EnterpriseLeadsUserListResponseDataUsers age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public EnterpriseLeadsUserListResponseDataUsers leadsLevel(EnumLeadsLevel leadsLevel) {
    this.leadsLevel = leadsLevel;
    return this;
  }

   /**
   * 用户状态 * &#x60;-1&#x60; - 没兴趣 * &#x60;0&#x60; - 了解 * &#x60;1&#x60; - 有兴趣 * &#x60;2&#x60; - 有意愿 * &#x60;10&#x60; - 已转化 
   * @return leadsLevel
  **/
  public EnumLeadsLevel getLeadsLevel() {
    return leadsLevel;
  }

  public void setLeadsLevel(EnumLeadsLevel leadsLevel) {
    this.leadsLevel = leadsLevel;
  }

  public EnterpriseLeadsUserListResponseDataUsers tagList(List<EnterpriseLeadsUserListResponseDataResponse> tagList) {
    this.tagList = tagList;
    return this;
  }

  public EnterpriseLeadsUserListResponseDataUsers addTagListItem(EnterpriseLeadsUserListResponseDataResponse tagListItem) {
    if (this.tagList == null) {
      this.tagList = new ArrayList<EnterpriseLeadsUserListResponseDataResponse>();
    }
    this.tagList.add(tagListItem);
    return this;
  }

   /**
   * 绑定的标签列表
   * @return tagList
  **/
  public List<EnterpriseLeadsUserListResponseDataResponse> getTagList() {
    return tagList;
  }

  public void setTagList(List<EnterpriseLeadsUserListResponseDataResponse> tagList) {
    this.tagList = tagList;
  }

  public EnterpriseLeadsUserListResponseDataUsers isFollow(Boolean isFollow) {
    this.isFollow = isFollow;
    return this;
  }

   /**
   * 当前指定用户是否已关注本企业号
   * @return isFollow
  **/
  public Boolean isIsFollow() {
    return isFollow;
  }

  public void setIsFollow(Boolean isFollow) {
    this.isFollow = isFollow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsUserListResponseDataUsers enterpriseLeadsUserListResponseDataUsers = (EnterpriseLeadsUserListResponseDataUsers) o;
    return Objects.equals(this.openId, enterpriseLeadsUserListResponseDataUsers.openId) &&
        Objects.equals(this.nickname, enterpriseLeadsUserListResponseDataUsers.nickname) &&
        Objects.equals(this.avatar, enterpriseLeadsUserListResponseDataUsers.avatar) &&
        Objects.equals(this.telephone, enterpriseLeadsUserListResponseDataUsers.telephone) &&
        Objects.equals(this.wechat, enterpriseLeadsUserListResponseDataUsers.wechat) &&
        Objects.equals(this.city, enterpriseLeadsUserListResponseDataUsers.city) &&
        Objects.equals(this.gender, enterpriseLeadsUserListResponseDataUsers.gender) &&
        Objects.equals(this.age, enterpriseLeadsUserListResponseDataUsers.age) &&
        Objects.equals(this.leadsLevel, enterpriseLeadsUserListResponseDataUsers.leadsLevel) &&
        Objects.equals(this.tagList, enterpriseLeadsUserListResponseDataUsers.tagList) &&
        Objects.equals(this.isFollow, enterpriseLeadsUserListResponseDataUsers.isFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openId, nickname, avatar, telephone, wechat, city, gender, age, leadsLevel, tagList, isFollow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsUserListResponseDataUsers {\n");
    
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    wechat: ").append(toIndentedString(wechat)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    leadsLevel: ").append(toIndentedString(leadsLevel)).append("\n");
    sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
    sb.append("    isFollow: ").append(toIndentedString(isFollow)).append("\n");
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

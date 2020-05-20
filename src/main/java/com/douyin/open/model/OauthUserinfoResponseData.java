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
 * OauthUserinfoResponseData
 */

public class OauthUserinfoResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("open_id")
  private String openId = null;

  @SerializedName("union_id")
  private String unionId = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("province")
  private String province = null;

  @SerializedName("country")
  private String country = null;

  /**
   * 性别:   * &#x60;0&#x60; - 未知   * &#x60;1&#x60; - 男性   * &#x60;2&#x60; - 女性 
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

  /**
   * 类型:   * &#x60;EAccountM&#x60; - 普通企业号   * &#x60;EAccountS&#x60; - 认证企业号   * &#x60;EAccountK&#x60; - 品牌企业号 
   */
  @JsonAdapter(EnumEAccountRole.Adapter.class)
  public enum EnumEAccountRole {
    EACCOUNTM("EAccountM"),
    EACCOUNTS("EAccountS"),
    EACCOUNTK("EAccountK");

    private String value;

    EnumEAccountRole(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumEAccountRole fromValue(String text) {
      for (EnumEAccountRole b : EnumEAccountRole.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumEAccountRole> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumEAccountRole enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumEAccountRole read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnumEAccountRole.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("e_account_role")
  private EnumEAccountRole eAccountRole = null;

  public OauthUserinfoResponseData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public OauthUserinfoResponseData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OauthUserinfoResponseData openId(String openId) {
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

  public OauthUserinfoResponseData unionId(String unionId) {
    this.unionId = unionId;
    return this;
  }

   /**
   * 用户在当前开发者账号下的唯一标识（未绑定开发者账号没有该字段）
   * @return unionId
  **/
  public String getUnionId() {
    return unionId;
  }

  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }

  public OauthUserinfoResponseData nickname(String nickname) {
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

  public OauthUserinfoResponseData avatar(String avatar) {
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

  public OauthUserinfoResponseData city(String city) {
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

  public OauthUserinfoResponseData province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public OauthUserinfoResponseData country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OauthUserinfoResponseData gender(EnumGender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 性别:   * &#x60;0&#x60; - 未知   * &#x60;1&#x60; - 男性   * &#x60;2&#x60; - 女性 
   * @return gender
  **/
  public EnumGender getGender() {
    return gender;
  }

  public void setGender(EnumGender gender) {
    this.gender = gender;
  }

  public OauthUserinfoResponseData eAccountRole(EnumEAccountRole eAccountRole) {
    this.eAccountRole = eAccountRole;
    return this;
  }

   /**
   * 类型:   * &#x60;EAccountM&#x60; - 普通企业号   * &#x60;EAccountS&#x60; - 认证企业号   * &#x60;EAccountK&#x60; - 品牌企业号 
   * @return eAccountRole
  **/
  public EnumEAccountRole getEAccountRole() {
    return eAccountRole;
  }

  public void setEAccountRole(EnumEAccountRole eAccountRole) {
    this.eAccountRole = eAccountRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthUserinfoResponseData oauthUserinfoResponseData = (OauthUserinfoResponseData) o;
    return Objects.equals(this.errorCode, oauthUserinfoResponseData.errorCode) &&
        Objects.equals(this.description, oauthUserinfoResponseData.description) &&
        Objects.equals(this.openId, oauthUserinfoResponseData.openId) &&
        Objects.equals(this.unionId, oauthUserinfoResponseData.unionId) &&
        Objects.equals(this.nickname, oauthUserinfoResponseData.nickname) &&
        Objects.equals(this.avatar, oauthUserinfoResponseData.avatar) &&
        Objects.equals(this.city, oauthUserinfoResponseData.city) &&
        Objects.equals(this.province, oauthUserinfoResponseData.province) &&
        Objects.equals(this.country, oauthUserinfoResponseData.country) &&
        Objects.equals(this.gender, oauthUserinfoResponseData.gender) &&
        Objects.equals(this.eAccountRole, oauthUserinfoResponseData.eAccountRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, openId, unionId, nickname, avatar, city, province, country, gender, eAccountRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthUserinfoResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    unionId: ").append(toIndentedString(unionId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    eAccountRole: ").append(toIndentedString(eAccountRole)).append("\n");
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

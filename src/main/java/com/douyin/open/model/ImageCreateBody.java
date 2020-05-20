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
import java.util.ArrayList;
import java.util.List;
/**
 * ImageCreateBody
 */

public class ImageCreateBody {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("poi_name")
  private String poiName = null;

  @SerializedName("micro_app_id")
  private String microAppId = null;

  @SerializedName("micro_app_title")
  private String microAppTitle = null;

  @SerializedName("micro_app_url")
  private String microAppUrl = null;

  @SerializedName("at_users")
  private List<String> atUsers = null;

  public ImageCreateBody imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * 通过/image/upload/接口得到。
   * @return imageId
  **/
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ImageCreateBody text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 标题，可以带话题。 如title1#话题1 #话题2 注意：话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。 
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ImageCreateBody poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 地理位置id
   * @return poiId
  **/
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public ImageCreateBody poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * 地理位置名称
   * @return poiName
  **/
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public ImageCreateBody microAppId(String microAppId) {
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 小程序id
   * @return microAppId
  **/
  public String getMicroAppId() {
    return microAppId;
  }

  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }

  public ImageCreateBody microAppTitle(String microAppTitle) {
    this.microAppTitle = microAppTitle;
    return this;
  }

   /**
   * 小程序标题
   * @return microAppTitle
  **/
  public String getMicroAppTitle() {
    return microAppTitle;
  }

  public void setMicroAppTitle(String microAppTitle) {
    this.microAppTitle = microAppTitle;
  }

  public ImageCreateBody microAppUrl(String microAppUrl) {
    this.microAppUrl = microAppUrl;
    return this;
  }

   /**
   * 吊起小程序时的参数
   * @return microAppUrl
  **/
  public String getMicroAppUrl() {
    return microAppUrl;
  }

  public void setMicroAppUrl(String microAppUrl) {
    this.microAppUrl = microAppUrl;
  }

  public ImageCreateBody atUsers(List<String> atUsers) {
    this.atUsers = atUsers;
    return this;
  }

  public ImageCreateBody addAtUsersItem(String atUsersItem) {
    if (this.atUsers == null) {
      this.atUsers = new ArrayList<String>();
    }
    this.atUsers.add(atUsersItem);
    return this;
  }

   /**
   * 如果需要at其他用户。将text中@nickname对应的open_id放到这里。
   * @return atUsers
  **/
  public List<String> getAtUsers() {
    return atUsers;
  }

  public void setAtUsers(List<String> atUsers) {
    this.atUsers = atUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageCreateBody imageCreateBody = (ImageCreateBody) o;
    return Objects.equals(this.imageId, imageCreateBody.imageId) &&
        Objects.equals(this.text, imageCreateBody.text) &&
        Objects.equals(this.poiId, imageCreateBody.poiId) &&
        Objects.equals(this.poiName, imageCreateBody.poiName) &&
        Objects.equals(this.microAppId, imageCreateBody.microAppId) &&
        Objects.equals(this.microAppTitle, imageCreateBody.microAppTitle) &&
        Objects.equals(this.microAppUrl, imageCreateBody.microAppUrl) &&
        Objects.equals(this.atUsers, imageCreateBody.atUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, text, poiId, poiName, microAppId, microAppTitle, microAppUrl, atUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageCreateBody {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    microAppTitle: ").append(toIndentedString(microAppTitle)).append("\n");
    sb.append("    microAppUrl: ").append(toIndentedString(microAppUrl)).append("\n");
    sb.append("    atUsers: ").append(toIndentedString(atUsers)).append("\n");
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

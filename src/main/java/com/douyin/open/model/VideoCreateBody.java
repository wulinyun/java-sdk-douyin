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
 * VideoCreateBody
 */

public class VideoCreateBody {
  @SerializedName("video_id")
  private String videoId = null;

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

  @SerializedName("article_id")
  private String articleId = null;

  @SerializedName("article_title")
  private String articleTitle = null;

  @SerializedName("cover_tsp")
  private Double coverTsp = null;

  @SerializedName("at_users")
  private List<String> atUsers = null;

  public VideoCreateBody videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * video_id, 通过/video/upload/接口得到。注意每次调用/video/create/都要调用/video/upload/生成新的video_id。
   * @return videoId
  **/
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public VideoCreateBody text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 视频标题， 可以带话题,@用户。 如title1#话题1 #话题2 @openid1  注意：   1. 话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。 
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public VideoCreateBody poiId(String poiId) {
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

  public VideoCreateBody poiName(String poiName) {
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

  public VideoCreateBody microAppId(String microAppId) {
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

  public VideoCreateBody microAppTitle(String microAppTitle) {
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

  public VideoCreateBody microAppUrl(String microAppUrl) {
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

  public VideoCreateBody articleId(String articleId) {
    this.articleId = articleId;
    return this;
  }

   /**
   * 文章ID，暂不开放
   * @return articleId
  **/
  public String getArticleId() {
    return articleId;
  }

  public void setArticleId(String articleId) {
    this.articleId = articleId;
  }

  public VideoCreateBody articleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
    return this;
  }

   /**
   * 文章自定义标题，暂不开放
   * @return articleTitle
  **/
  public String getArticleTitle() {
    return articleTitle;
  }

  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
  }

  public VideoCreateBody coverTsp(Double coverTsp) {
    this.coverTsp = coverTsp;
    return this;
  }

   /**
   * 将传入的指定时间点对应帧设置为视频封面（单位：秒）
   * @return coverTsp
  **/
  public Double getCoverTsp() {
    return coverTsp;
  }

  public void setCoverTsp(Double coverTsp) {
    this.coverTsp = coverTsp;
  }

  public VideoCreateBody atUsers(List<String> atUsers) {
    this.atUsers = atUsers;
    return this;
  }

  public VideoCreateBody addAtUsersItem(String atUsersItem) {
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
    VideoCreateBody videoCreateBody = (VideoCreateBody) o;
    return Objects.equals(this.videoId, videoCreateBody.videoId) &&
        Objects.equals(this.text, videoCreateBody.text) &&
        Objects.equals(this.poiId, videoCreateBody.poiId) &&
        Objects.equals(this.poiName, videoCreateBody.poiName) &&
        Objects.equals(this.microAppId, videoCreateBody.microAppId) &&
        Objects.equals(this.microAppTitle, videoCreateBody.microAppTitle) &&
        Objects.equals(this.microAppUrl, videoCreateBody.microAppUrl) &&
        Objects.equals(this.articleId, videoCreateBody.articleId) &&
        Objects.equals(this.articleTitle, videoCreateBody.articleTitle) &&
        Objects.equals(this.coverTsp, videoCreateBody.coverTsp) &&
        Objects.equals(this.atUsers, videoCreateBody.atUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, text, poiId, poiName, microAppId, microAppTitle, microAppUrl, articleId, articleTitle, coverTsp, atUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreateBody {\n");
    
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    microAppTitle: ").append(toIndentedString(microAppTitle)).append("\n");
    sb.append("    microAppUrl: ").append(toIndentedString(microAppUrl)).append("\n");
    sb.append("    articleId: ").append(toIndentedString(articleId)).append("\n");
    sb.append("    articleTitle: ").append(toIndentedString(articleTitle)).append("\n");
    sb.append("    coverTsp: ").append(toIndentedString(coverTsp)).append("\n");
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

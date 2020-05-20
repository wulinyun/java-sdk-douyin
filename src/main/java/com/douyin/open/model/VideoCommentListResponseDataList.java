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
 * VideoCommentListResponseDataList
 */

public class VideoCommentListResponseDataList {
  @SerializedName("comment_id")
  private String commentId = null;

  @SerializedName("comment_user_id")
  private String commentUserId = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("create_time")
  private Integer createTime = null;

  @SerializedName("top")
  private Boolean top = null;

  @SerializedName("digg_count")
  private Integer diggCount = null;

  @SerializedName("reply_comment_total")
  private Integer replyCommentTotal = null;

  public VideoCommentListResponseDataList commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

   /**
   * Get commentId
   * @return commentId
  **/
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public VideoCommentListResponseDataList commentUserId(String commentUserId) {
    this.commentUserId = commentUserId;
    return this;
  }

   /**
   * Get commentUserId
   * @return commentUserId
  **/
  public String getCommentUserId() {
    return commentUserId;
  }

  public void setCommentUserId(String commentUserId) {
    this.commentUserId = commentUserId;
  }

  public VideoCommentListResponseDataList content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public VideoCommentListResponseDataList createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 时间戳
   * @return createTime
  **/
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public VideoCommentListResponseDataList top(Boolean top) {
    this.top = top;
    return this;
  }

   /**
   * 是否置顶评论
   * @return top
  **/
  public Boolean isTop() {
    return top;
  }

  public void setTop(Boolean top) {
    this.top = top;
  }

  public VideoCommentListResponseDataList diggCount(Integer diggCount) {
    this.diggCount = diggCount;
    return this;
  }

   /**
   * Get diggCount
   * @return diggCount
  **/
  public Integer getDiggCount() {
    return diggCount;
  }

  public void setDiggCount(Integer diggCount) {
    this.diggCount = diggCount;
  }

  public VideoCommentListResponseDataList replyCommentTotal(Integer replyCommentTotal) {
    this.replyCommentTotal = replyCommentTotal;
    return this;
  }

   /**
   * 回复评论数
   * @return replyCommentTotal
  **/
  public Integer getReplyCommentTotal() {
    return replyCommentTotal;
  }

  public void setReplyCommentTotal(Integer replyCommentTotal) {
    this.replyCommentTotal = replyCommentTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCommentListResponseDataList videoCommentListResponseDataList = (VideoCommentListResponseDataList) o;
    return Objects.equals(this.commentId, videoCommentListResponseDataList.commentId) &&
        Objects.equals(this.commentUserId, videoCommentListResponseDataList.commentUserId) &&
        Objects.equals(this.content, videoCommentListResponseDataList.content) &&
        Objects.equals(this.createTime, videoCommentListResponseDataList.createTime) &&
        Objects.equals(this.top, videoCommentListResponseDataList.top) &&
        Objects.equals(this.diggCount, videoCommentListResponseDataList.diggCount) &&
        Objects.equals(this.replyCommentTotal, videoCommentListResponseDataList.replyCommentTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, commentUserId, content, createTime, top, diggCount, replyCommentTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCommentListResponseDataList {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentUserId: ").append(toIndentedString(commentUserId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    diggCount: ").append(toIndentedString(diggCount)).append("\n");
    sb.append("    replyCommentTotal: ").append(toIndentedString(replyCommentTotal)).append("\n");
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

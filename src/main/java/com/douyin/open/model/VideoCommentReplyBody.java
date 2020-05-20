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
 * VideoCommentReplyBody
 */

public class VideoCommentReplyBody {
  @SerializedName("item_id")
  private String itemId = null;

  @SerializedName("comment_id")
  private String commentId = null;

  @SerializedName("content")
  private String content = null;

  public VideoCommentReplyBody itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频id
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public VideoCommentReplyBody commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

   /**
   * 需要回复的评论id
   * @return commentId
  **/
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public VideoCommentReplyBody content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 评论内容
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCommentReplyBody videoCommentReplyBody = (VideoCommentReplyBody) o;
    return Objects.equals(this.itemId, videoCommentReplyBody.itemId) &&
        Objects.equals(this.commentId, videoCommentReplyBody.commentId) &&
        Objects.equals(this.content, videoCommentReplyBody.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, commentId, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCommentReplyBody {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

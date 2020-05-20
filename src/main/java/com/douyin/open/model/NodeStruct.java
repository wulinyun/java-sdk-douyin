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
import com.douyin.open.model.NodeTypeEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 富文本处理中的节点结构
 */

public class NodeStruct {
  @SerializedName("node_type")
  private NodeTypeEnum nodeType = null;

  @SerializedName("content")
  private String content = null;

  public NodeStruct nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  public NodeStruct content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 节点内容
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
    NodeStruct nodeStruct = (NodeStruct) o;
    return Objects.equals(this.nodeType, nodeStruct.nodeType) &&
        Objects.equals(this.content, nodeStruct.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStruct {\n");
    
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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

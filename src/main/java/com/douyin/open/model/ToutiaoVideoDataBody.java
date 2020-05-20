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
 * ToutiaoVideoDataBody
 */

public class ToutiaoVideoDataBody {
  @SerializedName("item_ids")
  private List<String> itemIds = new ArrayList<String>();

  public ToutiaoVideoDataBody itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public ToutiaoVideoDataBody addItemIdsItem(String itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * item_id数组，支持查询授权用户上传的视频。
   * @return itemIds
  **/
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToutiaoVideoDataBody toutiaoVideoDataBody = (ToutiaoVideoDataBody) o;
    return Objects.equals(this.itemIds, toutiaoVideoDataBody.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToutiaoVideoDataBody {\n");
    
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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

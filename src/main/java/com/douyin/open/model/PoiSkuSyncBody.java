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
import com.douyin.open.model.PoiSkuSyncSkus;
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
 * PoiSkuSyncBody
 */

public class PoiSkuSyncBody {
  @SerializedName("spu_ext_id")
  private String spuExtId = null;

  @SerializedName("skus")
  private List<PoiSkuSyncSkus> skus = new ArrayList<PoiSkuSyncSkus>();

  public PoiSkuSyncBody spuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
    return this;
  }

   /**
   * 外部平台SPU ID
   * @return spuExtId
  **/
  public String getSpuExtId() {
    return spuExtId;
  }

  public void setSpuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
  }

  public PoiSkuSyncBody skus(List<PoiSkuSyncSkus> skus) {
    this.skus = skus;
    return this;
  }

  public PoiSkuSyncBody addSkusItem(PoiSkuSyncSkus skusItem) {
    this.skus.add(skusItem);
    return this;
  }

   /**
   * Get skus
   * @return skus
  **/
  public List<PoiSkuSyncSkus> getSkus() {
    return skus;
  }

  public void setSkus(List<PoiSkuSyncSkus> skus) {
    this.skus = skus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSkuSyncBody poiSkuSyncBody = (PoiSkuSyncBody) o;
    return Objects.equals(this.spuExtId, poiSkuSyncBody.spuExtId) &&
        Objects.equals(this.skus, poiSkuSyncBody.skus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spuExtId, skus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSkuSyncBody {\n");
    
    sb.append("    spuExtId: ").append(toIndentedString(spuExtId)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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

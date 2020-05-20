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
import com.douyin.open.model.OnlineStatus;
import com.douyin.open.model.SpuAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoiSpuSyncBody
 */

public class PoiSpuSyncBody {
  @SerializedName("supplier_ext_id")
  private String supplierExtId = null;

  @SerializedName("spu_ext_id")
  private String spuExtId = null;

  /**
   * spu类型号，1-酒店民宿房型，90-景区门票，91-团购券 20 电商实体商品 21 电商虚拟商品
   */
  @JsonAdapter(EnumSpuType.Adapter.class)
  public enum EnumSpuType {
    NUMBER_1(1),
    NUMBER_20(20),
    NUMBER_21(21),
    NUMBER_90(90),
    NUMBER_91(91);

    private Integer value;

    EnumSpuType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumSpuType fromValue(String text) {
      for (EnumSpuType b : EnumSpuType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumSpuType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumSpuType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumSpuType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumSpuType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("spu_type")
  private EnumSpuType spuType = null;

  @SerializedName("status")
  private OnlineStatus status = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("attributes")
  private SpuAttributes attributes = null;

  public PoiSpuSyncBody supplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
    return this;
  }

   /**
   * 接入方店铺ID
   * @return supplierExtId
  **/
  public String getSupplierExtId() {
    return supplierExtId;
  }

  public void setSupplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
  }

  public PoiSpuSyncBody spuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
    return this;
  }

   /**
   * 接入方SPU ID
   * @return spuExtId
  **/
  public String getSpuExtId() {
    return spuExtId;
  }

  public void setSpuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
  }

  public PoiSpuSyncBody spuType(EnumSpuType spuType) {
    this.spuType = spuType;
    return this;
  }

   /**
   * spu类型号，1-酒店民宿房型，90-景区门票，91-团购券 20 电商实体商品 21 电商虚拟商品
   * @return spuType
  **/
  public EnumSpuType getSpuType() {
    return spuType;
  }

  public void setSpuType(EnumSpuType spuType) {
    this.spuType = spuType;
  }

  public PoiSpuSyncBody status(OnlineStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public OnlineStatus getStatus() {
    return status;
  }

  public void setStatus(OnlineStatus status) {
    this.status = status;
  }

  public PoiSpuSyncBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * SPU名称
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PoiSpuSyncBody order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * SPU展示顺序,降序
   * @return order
  **/
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PoiSpuSyncBody description(String description) {
    this.description = description;
    return this;
  }

   /**
   * SPU描述
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PoiSpuSyncBody attributes(SpuAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  public SpuAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SpuAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSpuSyncBody poiSpuSyncBody = (PoiSpuSyncBody) o;
    return Objects.equals(this.supplierExtId, poiSpuSyncBody.supplierExtId) &&
        Objects.equals(this.spuExtId, poiSpuSyncBody.spuExtId) &&
        Objects.equals(this.spuType, poiSpuSyncBody.spuType) &&
        Objects.equals(this.status, poiSpuSyncBody.status) &&
        Objects.equals(this.name, poiSpuSyncBody.name) &&
        Objects.equals(this.order, poiSpuSyncBody.order) &&
        Objects.equals(this.description, poiSpuSyncBody.description) &&
        Objects.equals(this.attributes, poiSpuSyncBody.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierExtId, spuExtId, spuType, status, name, order, description, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSpuSyncBody {\n");
    
    sb.append("    supplierExtId: ").append(toIndentedString(supplierExtId)).append("\n");
    sb.append("    spuExtId: ").append(toIndentedString(spuExtId)).append("\n");
    sb.append("    spuType: ").append(toIndentedString(spuType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

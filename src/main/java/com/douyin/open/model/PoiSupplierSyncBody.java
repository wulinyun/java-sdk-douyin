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
import com.douyin.open.model.PoiSupplierSyncServices;
import com.douyin.open.model.SupplierAttributes;
import com.douyin.open.model.SupplierType;
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
 * PoiSupplierSyncBody
 */

public class PoiSupplierSyncBody {
  @SerializedName("supplier_ext_id")
  private String supplierExtId = null;

  @SerializedName("type")
  private SupplierType type = null;

  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("status")
  private OnlineStatus status = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("images")
  private List<String> images = null;

  @SerializedName("contact_phone")
  private String contactPhone = null;

  @SerializedName("contact_tel")
  private String contactTel = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("services")
  private List<PoiSupplierSyncServices> services = null;

  @SerializedName("attributes")
  private SupplierAttributes attributes = null;

  public PoiSupplierSyncBody supplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
    return this;
  }

   /**
   * 接入方店铺id
   * @return supplierExtId
  **/
  public String getSupplierExtId() {
    return supplierExtId;
  }

  public void setSupplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
  }

  public PoiSupplierSyncBody type(SupplierType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public SupplierType getType() {
    return type;
  }

  public void setType(SupplierType type) {
    this.type = type;
  }

  public PoiSupplierSyncBody poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 抖音poi id, 三方如果使用高德poi id可以通过/poi/query/接口转换，其它三方poi id走poi匹配功能进行抖音poi id获取
   * @return poiId
  **/
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public PoiSupplierSyncBody status(OnlineStatus status) {
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

  public PoiSupplierSyncBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 店铺名称
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PoiSupplierSyncBody images(List<String> images) {
    this.images = images;
    return this;
  }

  public PoiSupplierSyncBody addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<String>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 店铺图片
   * @return images
  **/
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public PoiSupplierSyncBody contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 联系手机号
   * @return contactPhone
  **/
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public PoiSupplierSyncBody contactTel(String contactTel) {
    this.contactTel = contactTel;
    return this;
  }

   /**
   * 联系座机号
   * @return contactTel
  **/
  public String getContactTel() {
    return contactTel;
  }

  public void setContactTel(String contactTel) {
    this.contactTel = contactTel;
  }

  public PoiSupplierSyncBody address(String address) {
    this.address = address;
    return this;
  }

   /**
   * 店铺地址
   * @return address
  **/
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PoiSupplierSyncBody description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 店铺介绍(&lt;&#x3D;500字)
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PoiSupplierSyncBody services(List<PoiSupplierSyncServices> services) {
    this.services = services;
    return this;
  }

  public PoiSupplierSyncBody addServicesItem(PoiSupplierSyncServices servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<PoiSupplierSyncServices>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * 店铺提供的服务列表
   * @return services
  **/
  public List<PoiSupplierSyncServices> getServices() {
    return services;
  }

  public void setServices(List<PoiSupplierSyncServices> services) {
    this.services = services;
  }

  public PoiSupplierSyncBody attributes(SupplierAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  public SupplierAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SupplierAttributes attributes) {
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
    PoiSupplierSyncBody poiSupplierSyncBody = (PoiSupplierSyncBody) o;
    return Objects.equals(this.supplierExtId, poiSupplierSyncBody.supplierExtId) &&
        Objects.equals(this.type, poiSupplierSyncBody.type) &&
        Objects.equals(this.poiId, poiSupplierSyncBody.poiId) &&
        Objects.equals(this.status, poiSupplierSyncBody.status) &&
        Objects.equals(this.name, poiSupplierSyncBody.name) &&
        Objects.equals(this.images, poiSupplierSyncBody.images) &&
        Objects.equals(this.contactPhone, poiSupplierSyncBody.contactPhone) &&
        Objects.equals(this.contactTel, poiSupplierSyncBody.contactTel) &&
        Objects.equals(this.address, poiSupplierSyncBody.address) &&
        Objects.equals(this.description, poiSupplierSyncBody.description) &&
        Objects.equals(this.services, poiSupplierSyncBody.services) &&
        Objects.equals(this.attributes, poiSupplierSyncBody.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierExtId, type, poiId, status, name, images, contactPhone, contactTel, address, description, services, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSyncBody {\n");
    
    sb.append("    supplierExtId: ").append(toIndentedString(supplierExtId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    contactTel: ").append(toIndentedString(contactTel)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

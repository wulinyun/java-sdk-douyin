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
import com.douyin.open.model.PoiSupplierSyncEntry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 服务项
 */

public class PoiSupplierSyncServices {
  /**
   * 服务类型(201-预约点餐服务, 202-预约订位服务, 203-排队取号服务, 9001-门票预订服务, 9101-团购套餐服务, 9102-领优惠劵服务， 9201-在线预约服务)
   */
  @JsonAdapter(EnumServiceType.Adapter.class)
  public enum EnumServiceType {
    NUMBER_201(201),
    NUMBER_202(202),
    NUMBER_203(203),
    NUMBER_9001(9001),
    NUMBER_9101(9101),
    NUMBER_9102(9102),
    NUMBER_9201(9201);

    private Integer value;

    EnumServiceType(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumServiceType fromValue(String text) {
      for (EnumServiceType b : EnumServiceType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumServiceType> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumServiceType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumServiceType read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumServiceType.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("service_type")
  private EnumServiceType serviceType = null;

  /**
   * 上线状态(1:上线，2:下线)
   */
  @JsonAdapter(EnumEnable.Adapter.class)
  public enum EnumEnable {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    EnumEnable(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumEnable fromValue(String text) {
      for (EnumEnable b : EnumEnable.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumEnable> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumEnable enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumEnable read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumEnable.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("enable")
  private EnumEnable enable = null;

  @SerializedName("entry")
  private PoiSupplierSyncEntry entry = null;

  public PoiSupplierSyncServices serviceType(EnumServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * 服务类型(201-预约点餐服务, 202-预约订位服务, 203-排队取号服务, 9001-门票预订服务, 9101-团购套餐服务, 9102-领优惠劵服务， 9201-在线预约服务)
   * @return serviceType
  **/
  public EnumServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(EnumServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public PoiSupplierSyncServices enable(EnumEnable enable) {
    this.enable = enable;
    return this;
  }

   /**
   * 上线状态(1:上线，2:下线)
   * @return enable
  **/
  public EnumEnable getEnable() {
    return enable;
  }

  public void setEnable(EnumEnable enable) {
    this.enable = enable;
  }

  public PoiSupplierSyncServices entry(PoiSupplierSyncEntry entry) {
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  public PoiSupplierSyncEntry getEntry() {
    return entry;
  }

  public void setEntry(PoiSupplierSyncEntry entry) {
    this.entry = entry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSyncServices poiSupplierSyncServices = (PoiSupplierSyncServices) o;
    return Objects.equals(this.serviceType, poiSupplierSyncServices.serviceType) &&
        Objects.equals(this.enable, poiSupplierSyncServices.enable) &&
        Objects.equals(this.entry, poiSupplierSyncServices.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, enable, entry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSyncServices {\n");
    
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
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

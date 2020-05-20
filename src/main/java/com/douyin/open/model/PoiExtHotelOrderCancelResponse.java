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
 * PoiExtHotelOrderCancelResponse
 */

public class PoiExtHotelOrderCancelResponse {
  /**
   * 取消订单确认状态码；0 - 接受取消
   */
  @JsonAdapter(EnumStatus.Adapter.class)
  public enum EnumStatus {
    NUMBER_0(0);

    private Integer value;

    EnumStatus(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumStatus fromValue(String text) {
      for (EnumStatus b : EnumStatus.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumStatus> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumStatus enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumStatus read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumStatus.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private EnumStatus status = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  public PoiExtHotelOrderCancelResponse status(EnumStatus status) {
    this.status = status;
    return this;
  }

   /**
   * 取消订单确认状态码；0 - 接受取消
   * @return status
  **/
  public EnumStatus getStatus() {
    return status;
  }

  public void setStatus(EnumStatus status) {
    this.status = status;
  }

  public PoiExtHotelOrderCancelResponse errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public PoiExtHotelOrderCancelResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiExtHotelOrderCancelResponse poiExtHotelOrderCancelResponse = (PoiExtHotelOrderCancelResponse) o;
    return Objects.equals(this.status, poiExtHotelOrderCancelResponse.status) &&
        Objects.equals(this.errorCode, poiExtHotelOrderCancelResponse.errorCode) &&
        Objects.equals(this.description, poiExtHotelOrderCancelResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiExtHotelOrderCancelResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

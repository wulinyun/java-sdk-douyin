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
 * 数据同步结果
 */

public class SyncStatus {
  /**
   * 最近一次酒店同步状态, 0 - 未处理; 1 - 通过; 2 - 未通过
   */
  @JsonAdapter(EnumLastSyncStatus.Adapter.class)
  public enum EnumLastSyncStatus {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    EnumLastSyncStatus(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumLastSyncStatus fromValue(String text) {
      for (EnumLastSyncStatus b : EnumLastSyncStatus.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumLastSyncStatus> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumLastSyncStatus enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumLastSyncStatus read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return EnumLastSyncStatus.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("last_sync_status")
  private EnumLastSyncStatus lastSyncStatus = null;

  @SerializedName("fail_reason")
  private String failReason = null;

  public SyncStatus lastSyncStatus(EnumLastSyncStatus lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
    return this;
  }

   /**
   * 最近一次酒店同步状态, 0 - 未处理; 1 - 通过; 2 - 未通过
   * @return lastSyncStatus
  **/
  public EnumLastSyncStatus getLastSyncStatus() {
    return lastSyncStatus;
  }

  public void setLastSyncStatus(EnumLastSyncStatus lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
  }

  public SyncStatus failReason(String failReason) {
    this.failReason = failReason;
    return this;
  }

   /**
   * 同步失败原因，抖音风控政策问题，该字段无法提供太多信息，目前审核不通过联系抖音运营做进一步处理
   * @return failReason
  **/
  public String getFailReason() {
    return failReason;
  }

  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncStatus syncStatus = (SyncStatus) o;
    return Objects.equals(this.lastSyncStatus, syncStatus.lastSyncStatus) &&
        Objects.equals(this.failReason, syncStatus.failReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSyncStatus, failReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncStatus {\n");
    
    sb.append("    lastSyncStatus: ").append(toIndentedString(lastSyncStatus)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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

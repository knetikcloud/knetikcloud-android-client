/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Schedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:41:38.777-05:00")
public class Schedule {
  @SerializedName("duration")
  private Integer duration = null;

  /**
   * The unit of time for the duration field
   */
  @JsonAdapter(DurationUnitEnum.Adapter.class)
  public enum DurationUnitEnum {
    MILLISECOND("millisecond"),
    
    SECOND("second"),
    
    MINUTE("minute"),
    
    HOUR("hour"),
    
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    YEAR("year");

    private String value;

    DurationUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DurationUnitEnum fromValue(String text) {
      for (DurationUnitEnum b : DurationUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DurationUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DurationUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DurationUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DurationUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("duration_unit")
  private DurationUnitEnum durationUnit = null;

  /**
   * How often the event is scheduled
   */
  @JsonAdapter(RepeatEnum.Adapter.class)
  public enum RepeatEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY");

    private String value;

    RepeatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepeatEnum fromValue(String text) {
      for (RepeatEnum b : RepeatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RepeatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepeatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepeatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RepeatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("repeat")
  private RepeatEnum repeat = null;

  public Schedule duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the repeatable events
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The duration of the repeatable events")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Schedule durationUnit(DurationUnitEnum durationUnit) {
    this.durationUnit = durationUnit;
    return this;
  }

   /**
   * The unit of time for the duration field
   * @return durationUnit
  **/
  @ApiModelProperty(required = true, value = "The unit of time for the duration field")
  public DurationUnitEnum getDurationUnit() {
    return durationUnit;
  }

  public void setDurationUnit(DurationUnitEnum durationUnit) {
    this.durationUnit = durationUnit;
  }

  public Schedule repeat(RepeatEnum repeat) {
    this.repeat = repeat;
    return this;
  }

   /**
   * How often the event is scheduled
   * @return repeat
  **/
  @ApiModelProperty(required = true, value = "How often the event is scheduled")
  public RepeatEnum getRepeat() {
    return repeat;
  }

  public void setRepeat(RepeatEnum repeat) {
    this.repeat = repeat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.duration, schedule.duration) &&
        Objects.equals(this.durationUnit, schedule.durationUnit) &&
        Objects.equals(this.repeat, schedule.repeat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, durationUnit, repeat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationUnit: ").append(toIndentedString(durationUnit)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
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


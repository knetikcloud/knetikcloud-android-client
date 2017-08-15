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
import com.knetikcloud.model.Behavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TimePeriodUsable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T13:50:30.225-04:00")
public class TimePeriodUsable extends Behavior {
  @SerializedName("max_use")
  private Integer maxUse = null;

  @SerializedName("time_length")
  private Integer timeLength = null;

  @SerializedName("unit_of_time")
  private String unitOfTime = null;

  public TimePeriodUsable maxUse(Integer maxUse) {
    this.maxUse = maxUse;
    return this;
  }

   /**
   * The amount of times it can be used
   * @return maxUse
  **/
  @ApiModelProperty(value = "The amount of times it can be used")
  public Integer getMaxUse() {
    return maxUse;
  }

  public void setMaxUse(Integer maxUse) {
    this.maxUse = maxUse;
  }

  public TimePeriodUsable timeLength(Integer timeLength) {
    this.timeLength = timeLength;
    return this;
  }

   /**
   * The length of time
   * @return timeLength
  **/
  @ApiModelProperty(value = "The length of time")
  public Integer getTimeLength() {
    return timeLength;
  }

  public void setTimeLength(Integer timeLength) {
    this.timeLength = timeLength;
  }

  public TimePeriodUsable unitOfTime(String unitOfTime) {
    this.unitOfTime = unitOfTime;
    return this;
  }

   /**
   * The unit of time
   * @return unitOfTime
  **/
  @ApiModelProperty(value = "The unit of time")
  public String getUnitOfTime() {
    return unitOfTime;
  }

  public void setUnitOfTime(String unitOfTime) {
    this.unitOfTime = unitOfTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriodUsable timePeriodUsable = (TimePeriodUsable) o;
    return Objects.equals(this.maxUse, timePeriodUsable.maxUse) &&
        Objects.equals(this.timeLength, timePeriodUsable.timeLength) &&
        Objects.equals(this.unitOfTime, timePeriodUsable.unitOfTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUse, timeLength, unitOfTime, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriodUsable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxUse: ").append(toIndentedString(maxUse)).append("\n");
    sb.append("    timeLength: ").append(toIndentedString(timeLength)).append("\n");
    sb.append("    unitOfTime: ").append(toIndentedString(unitOfTime)).append("\n");
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


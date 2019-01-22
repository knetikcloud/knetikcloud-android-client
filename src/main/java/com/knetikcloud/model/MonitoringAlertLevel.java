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
 * MonitoringAlertLevel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-22T09:25:50.362-05:00")
public class MonitoringAlertLevel {
  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("name")
  private String name = null;

  public MonitoringAlertLevel duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The number of seconds to wait for a certain duration between first encountering a new expression output vector element and counting an alert as firing for this element.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The number of seconds to wait for a certain duration between first encountering a new expression output vector element and counting an alert as firing for this element.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public MonitoringAlertLevel expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The expression to run. Docs: https://prometheus.io/docs/prometheus/latest/querying/functions/
   * @return expression
  **/
  @ApiModelProperty(required = true, value = "The expression to run. Docs: https://prometheus.io/docs/prometheus/latest/querying/functions/")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public MonitoringAlertLevel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the alert level
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the alert level")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringAlertLevel monitoringAlertLevel = (MonitoringAlertLevel) o;
    return Objects.equals(this.duration, monitoringAlertLevel.duration) &&
        Objects.equals(this.expression, monitoringAlertLevel.expression) &&
        Objects.equals(this.name, monitoringAlertLevel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, expression, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringAlertLevel {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


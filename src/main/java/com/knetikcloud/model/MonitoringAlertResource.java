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
import com.knetikcloud.model.MonitoringAlertLevel;
import com.knetikcloud.model.SimpleReferenceResourcestring;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MonitoringAlertResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T16:40:51.235-05:00")
public class MonitoringAlertResource {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("levels")
  private List<MonitoringAlertLevel> levels = new ArrayList<MonitoringAlertLevel>();

  @SerializedName("metric")
  private SimpleReferenceResourcestring metric = null;

  @SerializedName("name")
  private String name = null;

  public MonitoringAlertResource enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the alert is live and should be evaluated. Default: true
   * @return enabled
  **/
  @ApiModelProperty(example = "false", value = "Whether the alert is live and should be evaluated. Default: true")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public MonitoringAlertResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the alert. Cannot be changed
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the alert. Cannot be changed")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MonitoringAlertResource levels(List<MonitoringAlertLevel> levels) {
    this.levels = levels;
    return this;
  }

  public MonitoringAlertResource addLevelsItem(MonitoringAlertLevel levelsItem) {
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * The levels of alert to raise. Minimum 1 and maximum 10 entries. The alert level will be the one with the last one in the list that is passed its threshold
   * @return levels
  **/
  @ApiModelProperty(required = true, value = "The levels of alert to raise. Minimum 1 and maximum 10 entries. The alert level will be the one with the last one in the list that is passed its threshold")
  public List<MonitoringAlertLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<MonitoringAlertLevel> levels) {
    this.levels = levels;
  }

  public MonitoringAlertResource metric(SimpleReferenceResourcestring metric) {
    this.metric = metric;
    return this;
  }

   /**
   * The id of the metric the alert is monitoring
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "The id of the metric the alert is monitoring")
  public SimpleReferenceResourcestring getMetric() {
    return metric;
  }

  public void setMetric(SimpleReferenceResourcestring metric) {
    this.metric = metric;
  }

  public MonitoringAlertResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the alert, for display purposes
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the alert, for display purposes")
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
    MonitoringAlertResource monitoringAlertResource = (MonitoringAlertResource) o;
    return Objects.equals(this.enabled, monitoringAlertResource.enabled) &&
        Objects.equals(this.id, monitoringAlertResource.id) &&
        Objects.equals(this.levels, monitoringAlertResource.levels) &&
        Objects.equals(this.metric, monitoringAlertResource.metric) &&
        Objects.equals(this.name, monitoringAlertResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, id, levels, metric, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringAlertResource {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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


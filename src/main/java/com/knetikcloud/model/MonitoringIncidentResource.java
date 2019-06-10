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
import com.knetikcloud.model.MonitoringIncidentLevelResource;
import com.knetikcloud.model.SimpleReferenceResourcestring;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MonitoringIncidentResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-10T11:33:32.911-04:00")
public class MonitoringIncidentResource {
  @SerializedName("alert")
  private SimpleReferenceResourcestring alert = null;

  @SerializedName("current_level")
  private String currentLevel = null;

  @SerializedName("end_date")
  private Long endDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("insufficient_data")
  private Boolean insufficientData = null;

  @SerializedName("levels")
  private List<MonitoringIncidentLevelResource> levels = new ArrayList<MonitoringIncidentLevelResource>();

  @SerializedName("merge_value")
  private String mergeValue = null;

  @SerializedName("start_date")
  private Long startDate = null;

  public MonitoringIncidentResource alert(SimpleReferenceResourcestring alert) {
    this.alert = alert;
    return this;
  }

   /**
   * The alert this incident is for
   * @return alert
  **/
  @ApiModelProperty(required = true, value = "The alert this incident is for")
  public SimpleReferenceResourcestring getAlert() {
    return alert;
  }

  public void setAlert(SimpleReferenceResourcestring alert) {
    this.alert = alert;
  }

  public MonitoringIncidentResource currentLevel(String currentLevel) {
    this.currentLevel = currentLevel;
    return this;
  }

   /**
   * The name of the current alert level
   * @return currentLevel
  **/
  @ApiModelProperty(required = true, value = "The name of the current alert level")
  public String getCurrentLevel() {
    return currentLevel;
  }

  public void setCurrentLevel(String currentLevel) {
    this.currentLevel = currentLevel;
  }

  public MonitoringIncidentResource endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The endDate as a unix timestamp in seconds the incident was manually ended. Null if still open
   * @return endDate
  **/
  @ApiModelProperty(value = "The endDate as a unix timestamp in seconds the incident was manually ended. Null if still open")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public MonitoringIncidentResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the incident. Cannot be changed
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the incident. Cannot be changed")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MonitoringIncidentResource insufficientData(Boolean insufficientData) {
    this.insufficientData = insufficientData;
    return this;
  }

   /**
   * Whether the most recent check for any level had too little data to determine status, and alert level missing_data_policy is &#39;missing&#39;
   * @return insufficientData
  **/
  @ApiModelProperty(example = "false", value = "Whether the most recent check for any level had too little data to determine status, and alert level missing_data_policy is 'missing'")
  public Boolean isInsufficientData() {
    return insufficientData;
  }

  public void setInsufficientData(Boolean insufficientData) {
    this.insufficientData = insufficientData;
  }

  public MonitoringIncidentResource levels(List<MonitoringIncidentLevelResource> levels) {
    this.levels = levels;
    return this;
  }

  public MonitoringIncidentResource addLevelsItem(MonitoringIncidentLevelResource levelsItem) {
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * The statuses of each level
   * @return levels
  **/
  @ApiModelProperty(required = true, value = "The statuses of each level")
  public List<MonitoringIncidentLevelResource> getLevels() {
    return levels;
  }

  public void setLevels(List<MonitoringIncidentLevelResource> levels) {
    this.levels = levels;
  }

  public MonitoringIncidentResource mergeValue(String mergeValue) {
    this.mergeValue = mergeValue;
    return this;
  }

   /**
   * The value of the merge_label from the alert
   * @return mergeValue
  **/
  @ApiModelProperty(value = "The value of the merge_label from the alert")
  public String getMergeValue() {
    return mergeValue;
  }

  public void setMergeValue(String mergeValue) {
    this.mergeValue = mergeValue;
  }

  public MonitoringIncidentResource startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The startDate as a unix timestamp in seconds the incident first started
   * @return startDate
  **/
  @ApiModelProperty(value = "The startDate as a unix timestamp in seconds the incident first started")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringIncidentResource monitoringIncidentResource = (MonitoringIncidentResource) o;
    return Objects.equals(this.alert, monitoringIncidentResource.alert) &&
        Objects.equals(this.currentLevel, monitoringIncidentResource.currentLevel) &&
        Objects.equals(this.endDate, monitoringIncidentResource.endDate) &&
        Objects.equals(this.id, monitoringIncidentResource.id) &&
        Objects.equals(this.insufficientData, monitoringIncidentResource.insufficientData) &&
        Objects.equals(this.levels, monitoringIncidentResource.levels) &&
        Objects.equals(this.mergeValue, monitoringIncidentResource.mergeValue) &&
        Objects.equals(this.startDate, monitoringIncidentResource.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, currentLevel, endDate, id, insufficientData, levels, mergeValue, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringIncidentResource {\n");
    
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    currentLevel: ").append(toIndentedString(currentLevel)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insufficientData: ").append(toIndentedString(insufficientData)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    mergeValue: ").append(toIndentedString(mergeValue)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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


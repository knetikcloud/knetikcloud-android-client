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
import com.knetikcloud.model.BreRuleLog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BreEventLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:01.795-05:00")
public class BreEventLog {
  @SerializedName("age")
  private Long age = null;

  @SerializedName("customer")
  private String customer = null;

  @SerializedName("event_expansion_duration")
  private Long eventExpansionDuration = null;

  @SerializedName("event_id")
  private String eventId = null;

  @SerializedName("event_logging_duration")
  private Long eventLoggingDuration = null;

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("event_received_date")
  private Long eventReceivedDate = null;

  @SerializedName("event_start_date")
  private Long eventStartDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("parameters")
  private Object parameters = null;

  @SerializedName("rules")
  private List<BreRuleLog> rules = null;

  @SerializedName("runtime")
  private Long runtime = null;

   /**
   * The difference between received and handlded in ms
   * @return age
  **/
  @ApiModelProperty(value = "The difference between received and handlded in ms")
  public Long getAge() {
    return age;
  }

   /**
   * The customer
   * @return customer
  **/
  @ApiModelProperty(value = "The customer")
  public String getCustomer() {
    return customer;
  }

   /**
   * The time it took to expand the event parameters
   * @return eventExpansionDuration
  **/
  @ApiModelProperty(value = "The time it took to expand the event parameters")
  public Long getEventExpansionDuration() {
    return eventExpansionDuration;
  }

   /**
   * The event id
   * @return eventId
  **/
  @ApiModelProperty(value = "The event id")
  public String getEventId() {
    return eventId;
  }

   /**
   * The time it took to log the event in IO
   * @return eventLoggingDuration
  **/
  @ApiModelProperty(value = "The time it took to log the event in IO")
  public Long getEventLoggingDuration() {
    return eventLoggingDuration;
  }

   /**
   * The event name
   * @return eventName
  **/
  @ApiModelProperty(value = "The event name")
  public String getEventName() {
    return eventName;
  }

   /**
   * The date the event was fired
   * @return eventReceivedDate
  **/
  @ApiModelProperty(value = "The date the event was fired")
  public Long getEventReceivedDate() {
    return eventReceivedDate;
  }

   /**
   * The date the event was handled
   * @return eventStartDate
  **/
  @ApiModelProperty(value = "The date the event was handled")
  public Long getEventStartDate() {
    return eventStartDate;
  }

   /**
   * The id
   * @return id
  **/
  @ApiModelProperty(value = "The id")
  public String getId() {
    return id;
  }

  public BreEventLog parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The event paramters
   * @return parameters
  **/
  @ApiModelProperty(value = "The event paramters")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public BreEventLog rules(List<BreRuleLog> rules) {
    this.rules = rules;
    return this;
  }

  public BreEventLog addRulesItem(BreRuleLog rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<BreRuleLog>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The rules
   * @return rules
  **/
  @ApiModelProperty(value = "The rules")
  public List<BreRuleLog> getRules() {
    return rules;
  }

  public void setRules(List<BreRuleLog> rules) {
    this.rules = rules;
  }

   /**
   * The time it took to run all the rules for that event
   * @return runtime
  **/
  @ApiModelProperty(value = "The time it took to run all the rules for that event")
  public Long getRuntime() {
    return runtime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreEventLog breEventLog = (BreEventLog) o;
    return Objects.equals(this.age, breEventLog.age) &&
        Objects.equals(this.customer, breEventLog.customer) &&
        Objects.equals(this.eventExpansionDuration, breEventLog.eventExpansionDuration) &&
        Objects.equals(this.eventId, breEventLog.eventId) &&
        Objects.equals(this.eventLoggingDuration, breEventLog.eventLoggingDuration) &&
        Objects.equals(this.eventName, breEventLog.eventName) &&
        Objects.equals(this.eventReceivedDate, breEventLog.eventReceivedDate) &&
        Objects.equals(this.eventStartDate, breEventLog.eventStartDate) &&
        Objects.equals(this.id, breEventLog.id) &&
        Objects.equals(this.parameters, breEventLog.parameters) &&
        Objects.equals(this.rules, breEventLog.rules) &&
        Objects.equals(this.runtime, breEventLog.runtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, customer, eventExpansionDuration, eventId, eventLoggingDuration, eventName, eventReceivedDate, eventStartDate, id, parameters, rules, runtime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreEventLog {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    eventExpansionDuration: ").append(toIndentedString(eventExpansionDuration)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventLoggingDuration: ").append(toIndentedString(eventLoggingDuration)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventReceivedDate: ").append(toIndentedString(eventReceivedDate)).append("\n");
    sb.append("    eventStartDate: ").append(toIndentedString(eventStartDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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


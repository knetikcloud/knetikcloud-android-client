/**
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

import com.knetikcloud.model.BreRuleLog;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BreEventLog {
  
  @SerializedName("customer")
  private String customer = null;
  @SerializedName("event_id")
  private String eventId = null;
  @SerializedName("event_name")
  private String eventName = null;
  @SerializedName("event_start_date")
  private Long eventStartDate = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("parameters")
  private Object parameters = null;
  @SerializedName("rules")
  private List<BreRuleLog> rules = null;

  /**
   * The customer of the BRE event log
   **/
  @ApiModelProperty(value = "The customer of the BRE event log")
  public String getCustomer() {
    return customer;
  }
  public void setCustomer(String customer) {
    this.customer = customer;
  }

  /**
   * The event id of the BRE event log
   **/
  @ApiModelProperty(value = "The event id of the BRE event log")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event name of the BRE event log
   **/
  @ApiModelProperty(value = "The event name of the BRE event log")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * The event start date of the BRE event log
   **/
  @ApiModelProperty(value = "The event start date of the BRE event log")
  public Long getEventStartDate() {
    return eventStartDate;
  }
  public void setEventStartDate(Long eventStartDate) {
    this.eventStartDate = eventStartDate;
  }

  /**
   * The id of the BRE event log
   **/
  @ApiModelProperty(value = "The id of the BRE event log")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The event paramters of the BRE event log
   **/
  @ApiModelProperty(value = "The event paramters of the BRE event log")
  public Object getParameters() {
    return parameters;
  }
  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  /**
   * The rules of the BRE event log
   **/
  @ApiModelProperty(value = "The rules of the BRE event log")
  public List<BreRuleLog> getRules() {
    return rules;
  }
  public void setRules(List<BreRuleLog> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreEventLog breEventLog = (BreEventLog) o;
    return (this.customer == null ? breEventLog.customer == null : this.customer.equals(breEventLog.customer)) &&
        (this.eventId == null ? breEventLog.eventId == null : this.eventId.equals(breEventLog.eventId)) &&
        (this.eventName == null ? breEventLog.eventName == null : this.eventName.equals(breEventLog.eventName)) &&
        (this.eventStartDate == null ? breEventLog.eventStartDate == null : this.eventStartDate.equals(breEventLog.eventStartDate)) &&
        (this.id == null ? breEventLog.id == null : this.id.equals(breEventLog.id)) &&
        (this.parameters == null ? breEventLog.parameters == null : this.parameters.equals(breEventLog.parameters)) &&
        (this.rules == null ? breEventLog.rules == null : this.rules.equals(breEventLog.rules));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.customer == null ? 0: this.customer.hashCode());
    result = 31 * result + (this.eventId == null ? 0: this.eventId.hashCode());
    result = 31 * result + (this.eventName == null ? 0: this.eventName.hashCode());
    result = 31 * result + (this.eventStartDate == null ? 0: this.eventStartDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.parameters == null ? 0: this.parameters.hashCode());
    result = 31 * result + (this.rules == null ? 0: this.rules.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreEventLog {\n");
    
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  eventId: ").append(eventId).append("\n");
    sb.append("  eventName: ").append(eventName).append("\n");
    sb.append("  eventStartDate: ").append(eventStartDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  parameters: ").append(parameters).append("\n");
    sb.append("  rules: ").append(rules).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

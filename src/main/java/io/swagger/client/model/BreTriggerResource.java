/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.BreTriggerParameterDefinition;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BreTriggerResource {
  
  public enum CategoryEnum {
     achievement,  behavior,  comment,  disposition,  entitlement,  friends,  fulfillment,  gamification,  inventory,  invoice,  media,  scheduler,  store,  subscription,  user,  wallet,  custom,  challenge,  activity,  campaign,  event, 
  };
  @SerializedName("category")
  private CategoryEnum category = null;
  @SerializedName("event_name")
  private String eventName = null;
  @SerializedName("parameters")
  private List<BreTriggerParameterDefinition> parameters = null;
  @SerializedName("system_trigger")
  private Boolean systemTrigger = null;
  @SerializedName("trigger_description")
  private String triggerDescription = null;
  @SerializedName("trigger_name")
  private String triggerName = null;

  /**
   * The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom'
   **/
  @ApiModelProperty(value = "The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom'")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  /**
   * The unique name for the event. This serves as the unique identifier. Cannot be changed after creation
   **/
  @ApiModelProperty(required = true, value = "The unique name for the event. This serves as the unique identifier. Cannot be changed after creation")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * A list af parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types
   **/
  @ApiModelProperty(value = "A list af parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types")
  public List<BreTriggerParameterDefinition> getParameters() {
    return parameters;
  }
  public void setParameters(List<BreTriggerParameterDefinition> parameters) {
    this.parameters = parameters;
  }

  /**
   * Where this trigger came from. System triggers cannot be removed or updated
   **/
  @ApiModelProperty(value = "Where this trigger came from. System triggers cannot be removed or updated")
  public Boolean getSystemTrigger() {
    return systemTrigger;
  }
  public void setSystemTrigger(Boolean systemTrigger) {
    this.systemTrigger = systemTrigger;
  }

  /**
   * A description of the trigger
   **/
  @ApiModelProperty(required = true, value = "A description of the trigger")
  public String getTriggerDescription() {
    return triggerDescription;
  }
  public void setTriggerDescription(String triggerDescription) {
    this.triggerDescription = triggerDescription;
  }

  /**
   * A human readable name for this trigger
   **/
  @ApiModelProperty(required = true, value = "A human readable name for this trigger")
  public String getTriggerName() {
    return triggerName;
  }
  public void setTriggerName(String triggerName) {
    this.triggerName = triggerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreTriggerResource breTriggerResource = (BreTriggerResource) o;
    return (this.category == null ? breTriggerResource.category == null : this.category.equals(breTriggerResource.category)) &&
        (this.eventName == null ? breTriggerResource.eventName == null : this.eventName.equals(breTriggerResource.eventName)) &&
        (this.parameters == null ? breTriggerResource.parameters == null : this.parameters.equals(breTriggerResource.parameters)) &&
        (this.systemTrigger == null ? breTriggerResource.systemTrigger == null : this.systemTrigger.equals(breTriggerResource.systemTrigger)) &&
        (this.triggerDescription == null ? breTriggerResource.triggerDescription == null : this.triggerDescription.equals(breTriggerResource.triggerDescription)) &&
        (this.triggerName == null ? breTriggerResource.triggerName == null : this.triggerName.equals(breTriggerResource.triggerName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.eventName == null ? 0: this.eventName.hashCode());
    result = 31 * result + (this.parameters == null ? 0: this.parameters.hashCode());
    result = 31 * result + (this.systemTrigger == null ? 0: this.systemTrigger.hashCode());
    result = 31 * result + (this.triggerDescription == null ? 0: this.triggerDescription.hashCode());
    result = 31 * result + (this.triggerName == null ? 0: this.triggerName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreTriggerResource {\n");
    
    sb.append("  category: ").append(category).append("\n");
    sb.append("  eventName: ").append(eventName).append("\n");
    sb.append("  parameters: ").append(parameters).append("\n");
    sb.append("  systemTrigger: ").append(systemTrigger).append("\n");
    sb.append("  triggerDescription: ").append(triggerDescription).append("\n");
    sb.append("  triggerName: ").append(triggerName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

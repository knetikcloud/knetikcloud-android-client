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
import com.knetikcloud.model.BreTriggerParameterDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BreTriggerResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-18T14:10:20.820-05:00")
public class BreTriggerResource {
  /**
   * The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category &#39;custom&#39;
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    ACHIEVEMENT("achievement"),
    
    BEHAVIOR("behavior"),
    
    COMMENT("comment"),
    
    DISPOSITION("disposition"),
    
    DEVICE("device"),
    
    ENTITLEMENT("entitlement"),
    
    FRIENDS("friends"),
    
    FULFILLMENT("fulfillment"),
    
    GAMIFICATION("gamification"),
    
    INVENTORY("inventory"),
    
    INVOICE("invoice"),
    
    MEDIA("media"),
    
    SCHEDULER("scheduler"),
    
    STORE("store"),
    
    SUBSCRIPTION("subscription"),
    
    USER("user"),
    
    WALLET("wallet"),
    
    CUSTOM("custom"),
    
    CHALLENGE("challenge"),
    
    ACTIVITY("activity"),
    
    CAMPAIGN("campaign"),
    
    EVENT("event"),
    
    MONITORING("monitoring"),
    
    VERIFICATION("verification");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("parameters")
  private List<BreTriggerParameterDefinition> parameters = null;

  @SerializedName("system_trigger")
  private Boolean systemTrigger = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("trigger_description")
  private String triggerDescription = null;

  @SerializedName("trigger_name")
  private String triggerName = null;

   /**
   * The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category &#39;custom&#39;
   * @return category
  **/
  @ApiModelProperty(value = "The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom'")
  public CategoryEnum getCategory() {
    return category;
  }

  public BreTriggerResource eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The unique name for the event. This serves as the unique identifier. Cannot be changed after creation
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "The unique name for the event. This serves as the unique identifier. Cannot be changed after creation")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public BreTriggerResource parameters(List<BreTriggerParameterDefinition> parameters) {
    this.parameters = parameters;
    return this;
  }

  public BreTriggerResource addParametersItem(BreTriggerParameterDefinition parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<BreTriggerParameterDefinition>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * A list of parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types
   * @return parameters
  **/
  @ApiModelProperty(value = "A list of parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types")
  public List<BreTriggerParameterDefinition> getParameters() {
    return parameters;
  }

  public void setParameters(List<BreTriggerParameterDefinition> parameters) {
    this.parameters = parameters;
  }

   /**
   * Where this trigger came from. System triggers cannot be removed or updated
   * @return systemTrigger
  **/
  @ApiModelProperty(example = "false", value = "Where this trigger came from. System triggers cannot be removed or updated")
  public Boolean isSystemTrigger() {
    return systemTrigger;
  }

  public BreTriggerResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public BreTriggerResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for filtering
   * @return tags
  **/
  @ApiModelProperty(value = "A list of tags for filtering")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public BreTriggerResource triggerDescription(String triggerDescription) {
    this.triggerDescription = triggerDescription;
    return this;
  }

   /**
   * A description of the trigger
   * @return triggerDescription
  **/
  @ApiModelProperty(required = true, value = "A description of the trigger")
  public String getTriggerDescription() {
    return triggerDescription;
  }

  public void setTriggerDescription(String triggerDescription) {
    this.triggerDescription = triggerDescription;
  }

  public BreTriggerResource triggerName(String triggerName) {
    this.triggerName = triggerName;
    return this;
  }

   /**
   * A human readable name for this trigger
   * @return triggerName
  **/
  @ApiModelProperty(required = true, value = "A human readable name for this trigger")
  public String getTriggerName() {
    return triggerName;
  }

  public void setTriggerName(String triggerName) {
    this.triggerName = triggerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreTriggerResource breTriggerResource = (BreTriggerResource) o;
    return Objects.equals(this.category, breTriggerResource.category) &&
        Objects.equals(this.eventName, breTriggerResource.eventName) &&
        Objects.equals(this.parameters, breTriggerResource.parameters) &&
        Objects.equals(this.systemTrigger, breTriggerResource.systemTrigger) &&
        Objects.equals(this.tags, breTriggerResource.tags) &&
        Objects.equals(this.triggerDescription, breTriggerResource.triggerDescription) &&
        Objects.equals(this.triggerName, breTriggerResource.triggerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, eventName, parameters, systemTrigger, tags, triggerDescription, triggerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreTriggerResource {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    systemTrigger: ").append(toIndentedString(systemTrigger)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    triggerDescription: ").append(toIndentedString(triggerDescription)).append("\n");
    sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
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


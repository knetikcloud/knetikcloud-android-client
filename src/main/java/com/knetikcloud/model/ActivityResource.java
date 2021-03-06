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
import com.knetikcloud.model.ActivityEntitlementResource;
import com.knetikcloud.model.AvailableSettingResource;
import com.knetikcloud.model.CoreActivitySettings;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.RewardSetResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents an activity that can be parameterized and tracked through metrics (scores, etc)
 */
@ApiModel(description = "Represents an activity that can be parameterized and tracked through metrics (scores, etc)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:01.795-05:00")
public class ActivityResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("core_settings")
  private CoreActivitySettings coreSettings = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("entitlements")
  private List<ActivityEntitlementResource> entitlements = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("launch")
  private String launch = null;

  @SerializedName("leaderboard_strategy")
  private String leaderboardStrategy = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("reward_set")
  private RewardSetResource rewardSet = null;

  @SerializedName("settings")
  private List<AvailableSettingResource> settings = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("template")
  private Boolean template = null;

  @SerializedName("template_id")
  private String templateId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public ActivityResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public ActivityResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties keyed on the property name. Used to further describe an activity. While settings will vary from one activity occurrence (a game) to another, additional properties are shared by all the occurrences of this activity. Ex: Activity Logo, Disclaimer, Greeting, etc. Validated against template if one exists for activities
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties keyed on the property name. Used to further describe an activity. While settings will vary from one activity occurrence (a game) to another, additional properties are shared by all the occurrences of this activity. Ex: Activity Logo, Disclaimer, Greeting, etc. Validated against template if one exists for activities")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public ActivityResource coreSettings(CoreActivitySettings coreSettings) {
    this.coreSettings = coreSettings;
    return this;
  }

   /**
   * Defines core settings about the activity that affect how it can be created/played by users.
   * @return coreSettings
  **/
  @ApiModelProperty(value = "Defines core settings about the activity that affect how it can be created/played by users.")
  public CoreActivitySettings getCoreSettings() {
    return coreSettings;
  }

  public void setCoreSettings(CoreActivitySettings coreSettings) {
    this.coreSettings = coreSettings;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public ActivityResource entitlements(List<ActivityEntitlementResource> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public ActivityResource addEntitlementsItem(ActivityEntitlementResource entitlementsItem) {
    if (this.entitlements == null) {
      this.entitlements = new ArrayList<ActivityEntitlementResource>();
    }
    this.entitlements.add(entitlementsItem);
    return this;
  }

   /**
   * The list of items that can be used for entitlement (wager amounts/etc)
   * @return entitlements
  **/
  @ApiModelProperty(value = "The list of items that can be used for entitlement (wager amounts/etc)")
  public List<ActivityEntitlementResource> getEntitlements() {
    return entitlements;
  }

  public void setEntitlements(List<ActivityEntitlementResource> entitlements) {
    this.entitlements = entitlements;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public ActivityResource launch(String launch) {
    this.launch = launch;
    return this;
  }

   /**
   * Details about how to launch the activity
   * @return launch
  **/
  @ApiModelProperty(value = "Details about how to launch the activity")
  public String getLaunch() {
    return launch;
  }

  public void setLaunch(String launch) {
    this.launch = launch;
  }

  public ActivityResource leaderboardStrategy(String leaderboardStrategy) {
    this.leaderboardStrategy = leaderboardStrategy;
    return this;
  }

   /**
   * The strategy for calculating the leaderboard. No strategy means no leaderboard for the top level context. Value MUST come from the list of available strategies from the Leaderboard Service
   * @return leaderboardStrategy
  **/
  @ApiModelProperty(value = "The strategy for calculating the leaderboard. No strategy means no leaderboard for the top level context. Value MUST come from the list of available strategies from the Leaderboard Service")
  public String getLeaderboardStrategy() {
    return leaderboardStrategy;
  }

  public void setLeaderboardStrategy(String leaderboardStrategy) {
    this.leaderboardStrategy = leaderboardStrategy;
  }

  public ActivityResource longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return longDescription
  **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public ActivityResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user friendly name of that resource
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActivityResource rewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
    return this;
  }

   /**
   * The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing
   * @return rewardSet
  **/
  @ApiModelProperty(value = "The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing")
  public RewardSetResource getRewardSet() {
    return rewardSet;
  }

  public void setRewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
  }

  public ActivityResource settings(List<AvailableSettingResource> settings) {
    this.settings = settings;
    return this;
  }

  public ActivityResource addSettingsItem(AvailableSettingResource settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<AvailableSettingResource>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Define what parameters are required/available to start and run an activity. For example: Difficulty, Number of Questions, Character name, Avatar, Duration, etc. Not populated when getting listing
   * @return settings
  **/
  @ApiModelProperty(value = "Define what parameters are required/available to start and run an activity. For example: Difficulty, Number of Questions, Character name, Avatar, Duration, etc. Not populated when getting listing")
  public List<AvailableSettingResource> getSettings() {
    return settings;
  }

  public void setSettings(List<AvailableSettingResource> settings) {
    this.settings = settings;
  }

  public ActivityResource shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return shortDescription
  **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public ActivityResource template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * Whether this activity is a template for other activities. Default: false
   * @return template
  **/
  @ApiModelProperty(example = "false", value = "Whether this activity is a template for other activities. Default: false")
  public Boolean isTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
  }

  public ActivityResource templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * An activity template this activity is validated against (private). May be null and no validation of additional_properties will be done
   * @return templateId
  **/
  @ApiModelProperty(value = "An activity template this activity is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public ActivityResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the activity
   * @return type
  **/
  @ApiModelProperty(value = "The type of the activity")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ActivityResource uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * The unique key (for static reference in code) of the activity
   * @return uniqueKey
  **/
  @ApiModelProperty(value = "The unique key (for static reference in code) of the activity")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityResource activityResource = (ActivityResource) o;
    return Objects.equals(this.additionalProperties, activityResource.additionalProperties) &&
        Objects.equals(this.coreSettings, activityResource.coreSettings) &&
        Objects.equals(this.createdDate, activityResource.createdDate) &&
        Objects.equals(this.entitlements, activityResource.entitlements) &&
        Objects.equals(this.id, activityResource.id) &&
        Objects.equals(this.launch, activityResource.launch) &&
        Objects.equals(this.leaderboardStrategy, activityResource.leaderboardStrategy) &&
        Objects.equals(this.longDescription, activityResource.longDescription) &&
        Objects.equals(this.name, activityResource.name) &&
        Objects.equals(this.rewardSet, activityResource.rewardSet) &&
        Objects.equals(this.settings, activityResource.settings) &&
        Objects.equals(this.shortDescription, activityResource.shortDescription) &&
        Objects.equals(this.template, activityResource.template) &&
        Objects.equals(this.templateId, activityResource.templateId) &&
        Objects.equals(this.type, activityResource.type) &&
        Objects.equals(this.uniqueKey, activityResource.uniqueKey) &&
        Objects.equals(this.updatedDate, activityResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, coreSettings, createdDate, entitlements, id, launch, leaderboardStrategy, longDescription, name, rewardSet, settings, shortDescription, template, templateId, type, uniqueKey, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    coreSettings: ").append(toIndentedString(coreSettings)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    launch: ").append(toIndentedString(launch)).append("\n");
    sb.append("    leaderboardStrategy: ").append(toIndentedString(leaderboardStrategy)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rewardSet: ").append(toIndentedString(rewardSet)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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


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
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-09T14:18:22.878-05:00")
public class GroupResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("member_count")
  private Integer memberCount = null;

  @SerializedName("message_of_the_day")
  private String messageOfTheDay = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("sub_member_count")
  private Integer subMemberCount = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("unique_name")
  private String uniqueName = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public GroupResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public GroupResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

   /**
   * The date the group was created as a unix timestamp
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the group was created as a unix timestamp")
  public Long getCreatedDate() {
    return createdDate;
  }

  public GroupResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the group
   * @return description
  **/
  @ApiModelProperty(value = "A description of the group")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The number of users in the group
   * @return memberCount
  **/
  @ApiModelProperty(value = "The number of users in the group")
  public Integer getMemberCount() {
    return memberCount;
  }

  public GroupResource messageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
    return this;
  }

   /**
   * A message of the day for members of the group
   * @return messageOfTheDay
  **/
  @ApiModelProperty(value = "A message of the day for members of the group")
  public String getMessageOfTheDay() {
    return messageOfTheDay;
  }

  public void setMessageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
  }

  public GroupResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the group. Max 50 characters
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the group. Max 50 characters")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupResource parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The unique name of another group that this group is a subset of
   * @return parent
  **/
  @ApiModelProperty(value = "The unique name of another group that this group is a subset of")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public GroupResource status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the group. Max size 50
   * @return status
  **/
  @ApiModelProperty(value = "The status of the group. Max size 50")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * The number of users in child groups
   * @return subMemberCount
  **/
  @ApiModelProperty(value = "The number of users in child groups")
  public Integer getSubMemberCount() {
    return subMemberCount;
  }

  public GroupResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GroupResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags for search
   * @return tags
  **/
  @ApiModelProperty(value = "Tags for search")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public GroupResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A group template this group is validated against. May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A group template this group is validated against. May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public GroupResource uniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created. Default: random UUID
   * @return uniqueName
  **/
  @ApiModelProperty(value = "Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created. Default: random UUID")
  public String getUniqueName() {
    return uniqueName;
  }

  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }

   /**
   * The date the group&#39;s info was last updated as a unix timestamp
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the group's info was last updated as a unix timestamp")
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
    GroupResource groupResource = (GroupResource) o;
    return Objects.equals(this.additionalProperties, groupResource.additionalProperties) &&
        Objects.equals(this.createdDate, groupResource.createdDate) &&
        Objects.equals(this.description, groupResource.description) &&
        Objects.equals(this.memberCount, groupResource.memberCount) &&
        Objects.equals(this.messageOfTheDay, groupResource.messageOfTheDay) &&
        Objects.equals(this.name, groupResource.name) &&
        Objects.equals(this.parent, groupResource.parent) &&
        Objects.equals(this.status, groupResource.status) &&
        Objects.equals(this.subMemberCount, groupResource.subMemberCount) &&
        Objects.equals(this.tags, groupResource.tags) &&
        Objects.equals(this.template, groupResource.template) &&
        Objects.equals(this.uniqueName, groupResource.uniqueName) &&
        Objects.equals(this.updatedDate, groupResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, createdDate, description, memberCount, messageOfTheDay, name, parent, status, subMemberCount, tags, template, uniqueName, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    messageOfTheDay: ").append(toIndentedString(messageOfTheDay)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subMemberCount: ").append(toIndentedString(subMemberCount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
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


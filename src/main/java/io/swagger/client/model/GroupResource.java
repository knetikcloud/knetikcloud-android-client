/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GroupResource {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
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
  public enum StatusEnum {
     open,  closed, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("sub_member_count")
  private Integer subMemberCount = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("unique_name")
  private String uniqueName = null;

  /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * A description of the group. Max 250 characters
   **/
  @ApiModelProperty(value = "A description of the group. Max 250 characters")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The number of users in the group
   **/
  @ApiModelProperty(value = "The number of users in the group")
  public Integer getMemberCount() {
    return memberCount;
  }
  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  /**
   * A message of the day for members of the group
   **/
  @ApiModelProperty(value = "A message of the day for members of the group")
  public String getMessageOfTheDay() {
    return messageOfTheDay;
  }
  public void setMessageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
  }

  /**
   * The name of the group. Max 50 characters
   **/
  @ApiModelProperty(required = true, value = "The name of the group. Max 50 characters")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The unique name of another group that this group is a subset of
   **/
  @ApiModelProperty(value = "The unique name of another group that this group is a subset of")
  public String getParent() {
    return parent;
  }
  public void setParent(String parent) {
    this.parent = parent;
  }

  /**
   * The status which describes whether other users can freely join the group or not
   **/
  @ApiModelProperty(required = true, value = "The status which describes whether other users can freely join the group or not")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The number of users in child groups
   **/
  @ApiModelProperty(value = "The number of users in child groups")
  public Integer getSubMemberCount() {
    return subMemberCount;
  }
  public void setSubMemberCount(Integer subMemberCount) {
    this.subMemberCount = subMemberCount;
  }

  /**
   * A group template this group is validated against. May be null and no validation of additional_properties will be done
   **/
  @ApiModelProperty(value = "A group template this group is validated against. May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created
   **/
  @ApiModelProperty(required = true, value = "Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created")
  public String getUniqueName() {
    return uniqueName;
  }
  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupResource groupResource = (GroupResource) o;
    return (this.additionalProperties == null ? groupResource.additionalProperties == null : this.additionalProperties.equals(groupResource.additionalProperties)) &&
        (this.description == null ? groupResource.description == null : this.description.equals(groupResource.description)) &&
        (this.memberCount == null ? groupResource.memberCount == null : this.memberCount.equals(groupResource.memberCount)) &&
        (this.messageOfTheDay == null ? groupResource.messageOfTheDay == null : this.messageOfTheDay.equals(groupResource.messageOfTheDay)) &&
        (this.name == null ? groupResource.name == null : this.name.equals(groupResource.name)) &&
        (this.parent == null ? groupResource.parent == null : this.parent.equals(groupResource.parent)) &&
        (this.status == null ? groupResource.status == null : this.status.equals(groupResource.status)) &&
        (this.subMemberCount == null ? groupResource.subMemberCount == null : this.subMemberCount.equals(groupResource.subMemberCount)) &&
        (this.template == null ? groupResource.template == null : this.template.equals(groupResource.template)) &&
        (this.uniqueName == null ? groupResource.uniqueName == null : this.uniqueName.equals(groupResource.uniqueName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.memberCount == null ? 0: this.memberCount.hashCode());
    result = 31 * result + (this.messageOfTheDay == null ? 0: this.messageOfTheDay.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.parent == null ? 0: this.parent.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.subMemberCount == null ? 0: this.subMemberCount.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.uniqueName == null ? 0: this.uniqueName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupResource {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  memberCount: ").append(memberCount).append("\n");
    sb.append("  messageOfTheDay: ").append(messageOfTheDay).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  parent: ").append(parent).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  subMemberCount: ").append(subMemberCount).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  uniqueName: ").append(uniqueName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

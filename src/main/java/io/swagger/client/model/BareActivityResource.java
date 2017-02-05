/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BareActivityResource {
  
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("launch")
  private String launch = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("template")
  private Boolean template = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("unique_key")
  private String uniqueKey = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * The date/time this resource was created in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The unique ID for that resource
   **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Details about how to launch the activity
   **/
  @ApiModelProperty(value = "Details about how to launch the activity")
  public String getLaunch() {
    return launch;
  }
  public void setLaunch(String launch) {
    this.launch = launch;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * The user friendly name of that resource
   **/
  @ApiModelProperty(required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * Whether this activity is a template for other activities. Default: false
   **/
  @ApiModelProperty(value = "Whether this activity is a template for other activities. Default: false")
  public Boolean getTemplate() {
    return template;
  }
  public void setTemplate(Boolean template) {
    this.template = template;
  }

  /**
   * The type of the activity
   **/
  @ApiModelProperty(required = true, value = "The type of the activity")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The unique key (for static reference in code) of the activity
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
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BareActivityResource bareActivityResource = (BareActivityResource) o;
    return (this.createdDate == null ? bareActivityResource.createdDate == null : this.createdDate.equals(bareActivityResource.createdDate)) &&
        (this.id == null ? bareActivityResource.id == null : this.id.equals(bareActivityResource.id)) &&
        (this.launch == null ? bareActivityResource.launch == null : this.launch.equals(bareActivityResource.launch)) &&
        (this.longDescription == null ? bareActivityResource.longDescription == null : this.longDescription.equals(bareActivityResource.longDescription)) &&
        (this.name == null ? bareActivityResource.name == null : this.name.equals(bareActivityResource.name)) &&
        (this.shortDescription == null ? bareActivityResource.shortDescription == null : this.shortDescription.equals(bareActivityResource.shortDescription)) &&
        (this.template == null ? bareActivityResource.template == null : this.template.equals(bareActivityResource.template)) &&
        (this.type == null ? bareActivityResource.type == null : this.type.equals(bareActivityResource.type)) &&
        (this.uniqueKey == null ? bareActivityResource.uniqueKey == null : this.uniqueKey.equals(bareActivityResource.uniqueKey)) &&
        (this.updatedDate == null ? bareActivityResource.updatedDate == null : this.updatedDate.equals(bareActivityResource.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.launch == null ? 0: this.launch.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.uniqueKey == null ? 0: this.uniqueKey.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BareActivityResource {\n");
    
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  launch: ").append(launch).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  uniqueKey: ").append(uniqueKey).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

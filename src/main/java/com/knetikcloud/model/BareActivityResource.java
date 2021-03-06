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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BareActivityResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:01.795-05:00")
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
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public BareActivityResource launch(String launch) {
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

  public BareActivityResource longDescription(String longDescription) {
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

  public BareActivityResource name(String name) {
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

  public BareActivityResource shortDescription(String shortDescription) {
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

  public BareActivityResource template(Boolean template) {
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

  public BareActivityResource type(String type) {
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

  public BareActivityResource uniqueKey(String uniqueKey) {
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
    BareActivityResource bareActivityResource = (BareActivityResource) o;
    return Objects.equals(this.createdDate, bareActivityResource.createdDate) &&
        Objects.equals(this.id, bareActivityResource.id) &&
        Objects.equals(this.launch, bareActivityResource.launch) &&
        Objects.equals(this.longDescription, bareActivityResource.longDescription) &&
        Objects.equals(this.name, bareActivityResource.name) &&
        Objects.equals(this.shortDescription, bareActivityResource.shortDescription) &&
        Objects.equals(this.template, bareActivityResource.template) &&
        Objects.equals(this.type, bareActivityResource.type) &&
        Objects.equals(this.uniqueKey, bareActivityResource.uniqueKey) &&
        Objects.equals(this.updatedDate, bareActivityResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, id, launch, longDescription, name, shortDescription, template, type, uniqueKey, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BareActivityResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    launch: ").append(toIndentedString(launch)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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


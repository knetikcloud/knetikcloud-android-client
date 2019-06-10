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
 * BreTriggerParameterDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-10T16:27:41.909-04:00")
public class BreTriggerParameterDefinition {
  @SerializedName("implicit")
  private Boolean implicit = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("optional")
  private Boolean optional = null;

  @SerializedName("type")
  private String type = null;

   /**
   * Whether this parameter is implicitely derived from another. Internal use only.
   * @return implicit
  **/
  @ApiModelProperty(example = "false", value = "Whether this parameter is implicitely derived from another. Internal use only.")
  public Boolean isImplicit() {
    return implicit;
  }

  public BreTriggerParameterDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the parameter. This is used as the unique identifier of this parameter
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the parameter. This is used as the unique identifier of this parameter")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BreTriggerParameterDefinition optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Whether this parameter can be left off when firing the event. Default false
   * @return optional
  **/
  @ApiModelProperty(example = "false", value = "Whether this parameter can be left off when firing the event. Default false")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public BreTriggerParameterDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The variable type of this parameter. See Bre Variables endpoint for list
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The variable type of this parameter. See Bre Variables endpoint for list")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreTriggerParameterDefinition breTriggerParameterDefinition = (BreTriggerParameterDefinition) o;
    return Objects.equals(this.implicit, breTriggerParameterDefinition.implicit) &&
        Objects.equals(this.name, breTriggerParameterDefinition.name) &&
        Objects.equals(this.optional, breTriggerParameterDefinition.optional) &&
        Objects.equals(this.type, breTriggerParameterDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(implicit, name, optional, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreTriggerParameterDefinition {\n");
    
    sb.append("    implicit: ").append(toIndentedString(implicit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


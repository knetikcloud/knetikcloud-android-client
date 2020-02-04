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
 * ActionVariableResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:24.234-05:00")
public class ActionVariableResource {
  @SerializedName("name")
  private String name = null;

  @SerializedName("optional")
  private Boolean optional = null;

  @SerializedName("type")
  private String type = null;

  public ActionVariableResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the variable
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the variable")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActionVariableResource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Whether this variable is optional and can be left out/null
   * @return optional
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether this variable is optional and can be left out/null")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public ActionVariableResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the variable (see variable type endpoint for list)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the variable (see variable type endpoint for list)")
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
    ActionVariableResource actionVariableResource = (ActionVariableResource) o;
    return Objects.equals(this.name, actionVariableResource.name) &&
        Objects.equals(this.optional, actionVariableResource.optional) &&
        Objects.equals(this.type, actionVariableResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionVariableResource {\n");
    
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


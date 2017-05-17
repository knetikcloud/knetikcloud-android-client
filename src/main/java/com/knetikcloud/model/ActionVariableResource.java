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

package com.knetikcloud.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ActionVariableResource {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("optional")
  private Boolean optional = null;
  @SerializedName("type")
  private String type = null;

  /**
   * The name of the variable
   **/
  @ApiModelProperty(required = true, value = "The name of the variable")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether this variable is optional and can be left out/null
   **/
  @ApiModelProperty(required = true, value = "Whether this variable is optional and can be left out/null")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  /**
   * The type of the variable (see variable type endpoint for list)
   **/
  @ApiModelProperty(required = true, value = "The type of the variable (see variable type endpoint for list)")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionVariableResource actionVariableResource = (ActionVariableResource) o;
    return (this.name == null ? actionVariableResource.name == null : this.name.equals(actionVariableResource.name)) &&
        (this.optional == null ? actionVariableResource.optional == null : this.optional.equals(actionVariableResource.optional)) &&
        (this.type == null ? actionVariableResource.type == null : this.type.equals(actionVariableResource.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.optional == null ? 0: this.optional.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionVariableResource {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

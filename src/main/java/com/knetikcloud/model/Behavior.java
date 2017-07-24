/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Behavior {
  
  @SerializedName("description")
  private String description = null;
  @SerializedName("type_hint")
  private String typeHint = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Used for polymorphic type recognition and thus must match an expected type with additional properties
   **/
  @ApiModelProperty(value = "Used for polymorphic type recognition and thus must match an expected type with additional properties")
  public String getTypeHint() {
    return typeHint;
  }
  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Behavior behavior = (Behavior) o;
    return (this.description == null ? behavior.description == null : this.description.equals(behavior.description)) &&
        (this.typeHint == null ? behavior.typeHint == null : this.typeHint.equals(behavior.typeHint));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Behavior {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

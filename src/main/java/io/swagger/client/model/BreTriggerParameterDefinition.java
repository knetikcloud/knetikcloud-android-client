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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BreTriggerParameterDefinition {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("type")
  private String type = null;

  /**
   * The name of the parameter. This is used as the unique identifier of this parameter
   **/
  @ApiModelProperty(required = true, value = "The name of the parameter. This is used as the unique identifier of this parameter")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The variable type of this parameter. See Bre Variables endpoint for list
   **/
  @ApiModelProperty(required = true, value = "The variable type of this parameter. See Bre Variables endpoint for list")
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
    BreTriggerParameterDefinition breTriggerParameterDefinition = (BreTriggerParameterDefinition) o;
    return (this.name == null ? breTriggerParameterDefinition.name == null : this.name.equals(breTriggerParameterDefinition.name)) &&
        (this.type == null ? breTriggerParameterDefinition.type == null : this.type.equals(breTriggerParameterDefinition.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreTriggerParameterDefinition {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

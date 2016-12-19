/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.Behavior;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ItemBehaviorDefinitionResource {
  
  @SerializedName("behavior")
  private Behavior behavior = null;
  @SerializedName("modifiable")
  private Boolean modifiable = null;
  @SerializedName("required")
  private Boolean required = null;

  /**
   * The default version of the behavior
   **/
  @ApiModelProperty(required = true, value = "The default version of the behavior")
  public Behavior getBehavior() {
    return behavior;
  }
  public void setBehavior(Behavior behavior) {
    this.behavior = behavior;
  }

  /**
   * Whether the behavior's values can be modified
   **/
  @ApiModelProperty(required = true, value = "Whether the behavior's values can be modified")
  public Boolean getModifiable() {
    return modifiable;
  }
  public void setModifiable(Boolean modifiable) {
    this.modifiable = modifiable;
  }

  /**
   * Whether the behavior can be removed
   **/
  @ApiModelProperty(required = true, value = "Whether the behavior can be removed")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBehaviorDefinitionResource itemBehaviorDefinitionResource = (ItemBehaviorDefinitionResource) o;
    return (this.behavior == null ? itemBehaviorDefinitionResource.behavior == null : this.behavior.equals(itemBehaviorDefinitionResource.behavior)) &&
        (this.modifiable == null ? itemBehaviorDefinitionResource.modifiable == null : this.modifiable.equals(itemBehaviorDefinitionResource.modifiable)) &&
        (this.required == null ? itemBehaviorDefinitionResource.required == null : this.required.equals(itemBehaviorDefinitionResource.required));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.behavior == null ? 0: this.behavior.hashCode());
    result = 31 * result + (this.modifiable == null ? 0: this.modifiable.hashCode());
    result = 31 * result + (this.required == null ? 0: this.required.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBehaviorDefinitionResource {\n");
    
    sb.append("  behavior: ").append(behavior).append("\n");
    sb.append("  modifiable: ").append(modifiable).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import io.swagger.client.model.Behavior;
import io.swagger.client.model.PropertyDefinitionResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BehaviorDefinitionResource {
  
  @SerializedName("description")
  private String description = null;
  @SerializedName("prerequisite_behaviors")
  private List<Behavior> prerequisiteBehaviors = null;
  @SerializedName("properties")
  private List<PropertyDefinitionResource> properties = null;
  @SerializedName("type_hint")
  private String typeHint = null;

  /**
   * Description of the behavior
   **/
  @ApiModelProperty(value = "Description of the behavior")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Pre-requisite behaviors that an item must have in order to also have this behavior
   **/
  @ApiModelProperty(value = "Pre-requisite behaviors that an item must have in order to also have this behavior")
  public List<Behavior> getPrerequisiteBehaviors() {
    return prerequisiteBehaviors;
  }
  public void setPrerequisiteBehaviors(List<Behavior> prerequisiteBehaviors) {
    this.prerequisiteBehaviors = prerequisiteBehaviors;
  }

  /**
   * Configurable properties of the behavior
   **/
  @ApiModelProperty(required = true, value = "Configurable properties of the behavior")
  public List<PropertyDefinitionResource> getProperties() {
    return properties;
  }
  public void setProperties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
  }

  /**
   * The behavior type
   **/
  @ApiModelProperty(required = true, value = "The behavior type")
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
    BehaviorDefinitionResource behaviorDefinitionResource = (BehaviorDefinitionResource) o;
    return (this.description == null ? behaviorDefinitionResource.description == null : this.description.equals(behaviorDefinitionResource.description)) &&
        (this.prerequisiteBehaviors == null ? behaviorDefinitionResource.prerequisiteBehaviors == null : this.prerequisiteBehaviors.equals(behaviorDefinitionResource.prerequisiteBehaviors)) &&
        (this.properties == null ? behaviorDefinitionResource.properties == null : this.properties.equals(behaviorDefinitionResource.properties)) &&
        (this.typeHint == null ? behaviorDefinitionResource.typeHint == null : this.typeHint.equals(behaviorDefinitionResource.typeHint));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.prerequisiteBehaviors == null ? 0: this.prerequisiteBehaviors.hashCode());
    result = 31 * result + (this.properties == null ? 0: this.properties.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehaviorDefinitionResource {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  prerequisiteBehaviors: ").append(prerequisiteBehaviors).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

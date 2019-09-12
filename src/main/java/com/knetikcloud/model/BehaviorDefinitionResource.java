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
import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.PropertyFieldResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BehaviorDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T16:33:10.036-04:00")
public class BehaviorDefinitionResource {
  @SerializedName("description")
  private String description = null;

  @SerializedName("prerequisite_behaviors")
  private List<Behavior> prerequisiteBehaviors = null;

  @SerializedName("properties")
  private List<PropertyFieldResource> properties = new ArrayList<PropertyFieldResource>();

  @SerializedName("type_hint")
  private String typeHint = null;

  public BehaviorDefinitionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the behavior
   * @return description
  **/
  @ApiModelProperty(value = "Description of the behavior")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BehaviorDefinitionResource prerequisiteBehaviors(List<Behavior> prerequisiteBehaviors) {
    this.prerequisiteBehaviors = prerequisiteBehaviors;
    return this;
  }

  public BehaviorDefinitionResource addPrerequisiteBehaviorsItem(Behavior prerequisiteBehaviorsItem) {
    if (this.prerequisiteBehaviors == null) {
      this.prerequisiteBehaviors = new ArrayList<Behavior>();
    }
    this.prerequisiteBehaviors.add(prerequisiteBehaviorsItem);
    return this;
  }

   /**
   * Pre-requisite behaviors that an item must have in order to also have this behavior
   * @return prerequisiteBehaviors
  **/
  @ApiModelProperty(value = "Pre-requisite behaviors that an item must have in order to also have this behavior")
  public List<Behavior> getPrerequisiteBehaviors() {
    return prerequisiteBehaviors;
  }

  public void setPrerequisiteBehaviors(List<Behavior> prerequisiteBehaviors) {
    this.prerequisiteBehaviors = prerequisiteBehaviors;
  }

  public BehaviorDefinitionResource properties(List<PropertyFieldResource> properties) {
    this.properties = properties;
    return this;
  }

  public BehaviorDefinitionResource addPropertiesItem(PropertyFieldResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Configurable properties of the behavior
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "Configurable properties of the behavior")
  public List<PropertyFieldResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyFieldResource> properties) {
    this.properties = properties;
  }

  public BehaviorDefinitionResource typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The behavior type
   * @return typeHint
  **/
  @ApiModelProperty(required = true, value = "The behavior type")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BehaviorDefinitionResource behaviorDefinitionResource = (BehaviorDefinitionResource) o;
    return Objects.equals(this.description, behaviorDefinitionResource.description) &&
        Objects.equals(this.prerequisiteBehaviors, behaviorDefinitionResource.prerequisiteBehaviors) &&
        Objects.equals(this.properties, behaviorDefinitionResource.properties) &&
        Objects.equals(this.typeHint, behaviorDefinitionResource.typeHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, prerequisiteBehaviors, properties, typeHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehaviorDefinitionResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    prerequisiteBehaviors: ").append(toIndentedString(prerequisiteBehaviors)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
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


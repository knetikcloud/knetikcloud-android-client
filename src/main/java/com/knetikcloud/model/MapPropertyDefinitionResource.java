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
import com.knetikcloud.model.PropertyDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MapPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:16:46.445-04:00")
public class MapPropertyDefinitionResource extends PropertyDefinitionResource {
  @SerializedName("allow_additional")
  private Boolean allowAdditional = null;

  @SerializedName("properties")
  private List<PropertyDefinitionResource> properties = null;

  public MapPropertyDefinitionResource allowAdditional(Boolean allowAdditional) {
    this.allowAdditional = allowAdditional;
    return this;
  }

   /**
   * Whether to allow additional properties beyond those specified or not
   * @return allowAdditional
  **/
  @ApiModelProperty(example = "false", value = "Whether to allow additional properties beyond those specified or not")
  public Boolean isAllowAdditional() {
    return allowAdditional;
  }

  public void setAllowAdditional(Boolean allowAdditional) {
    this.allowAdditional = allowAdditional;
  }

  public MapPropertyDefinitionResource properties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
    return this;
  }

  public MapPropertyDefinitionResource addPropertiesItem(PropertyDefinitionResource propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<PropertyDefinitionResource>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * If provided, a list of property definitions for each map entry
   * @return properties
  **/
  @ApiModelProperty(value = "If provided, a list of property definitions for each map entry")
  public List<PropertyDefinitionResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapPropertyDefinitionResource mapPropertyDefinitionResource = (MapPropertyDefinitionResource) o;
    return Objects.equals(this.allowAdditional, mapPropertyDefinitionResource.allowAdditional) &&
        Objects.equals(this.properties, mapPropertyDefinitionResource.properties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAdditional, properties, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowAdditional: ").append(toIndentedString(allowAdditional)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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


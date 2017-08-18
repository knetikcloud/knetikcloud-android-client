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
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BreCategoryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-17T22:16:04.815-04:00")
public class BreCategoryResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("template")
  private String template = null;

  public BreCategoryResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public BreCategoryResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

   /**
   * The name of the category. Serves as the unique id
   * @return name
  **/
  @ApiModelProperty(value = "The name of the category. Serves as the unique id")
  public String getName() {
    return name;
  }

  public BreCategoryResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A template this BRE category is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A template this BRE category is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreCategoryResource breCategoryResource = (BreCategoryResource) o;
    return Objects.equals(this.additionalProperties, breCategoryResource.additionalProperties) &&
        Objects.equals(this.name, breCategoryResource.name) &&
        Objects.equals(this.template, breCategoryResource.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, name, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreCategoryResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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


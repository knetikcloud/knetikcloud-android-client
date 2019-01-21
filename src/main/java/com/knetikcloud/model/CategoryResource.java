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
 * CategoryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T15:40:11.397-05:00")
public class CategoryResource {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("template")
  private String template = null;

  public CategoryResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the category is currently active. If not, it and its questions will be filtered out.
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the category is currently active. If not, it and its questions will be filtered out.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CategoryResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public CategoryResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
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

  public CategoryResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for this category
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for this category")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CategoryResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this category. Cannot be blank
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this category. Cannot be blank")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A category template this category is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A category template this category is validated against (private). May be null and no validation of additional_properties will be done")
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
    CategoryResource categoryResource = (CategoryResource) o;
    return Objects.equals(this.active, categoryResource.active) &&
        Objects.equals(this.additionalProperties, categoryResource.additionalProperties) &&
        Objects.equals(this.id, categoryResource.id) &&
        Objects.equals(this.name, categoryResource.name) &&
        Objects.equals(this.template, categoryResource.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalProperties, id, name, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


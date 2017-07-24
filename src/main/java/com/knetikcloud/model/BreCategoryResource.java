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

import com.knetikcloud.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BreCategoryResource {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("template")
  private String template = null;

  /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
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
   **/
  @ApiModelProperty(value = "The name of the category. Serves as the unique id")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A template this BRE category is validated against (private). May be null and no validation of additional_properties will be done
   **/
  @ApiModelProperty(value = "A template this BRE category is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreCategoryResource breCategoryResource = (BreCategoryResource) o;
    return (this.additionalProperties == null ? breCategoryResource.additionalProperties == null : this.additionalProperties.equals(breCategoryResource.additionalProperties)) &&
        (this.name == null ? breCategoryResource.name == null : this.name.equals(breCategoryResource.name)) &&
        (this.template == null ? breCategoryResource.template == null : this.template.equals(breCategoryResource.template));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreCategoryResource {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
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

  /**
   * Whether the category is currently active. If not, it and its questions will be filtered out.
   **/
  @ApiModelProperty(value = "Whether the category is currently active. If not, it and its questions will be filtered out.")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

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
   * The unique ID for this category
   **/
  @ApiModelProperty(value = "The unique ID for this category")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of this category. Cannot be blank
   **/
  @ApiModelProperty(required = true, value = "The name of this category. Cannot be blank")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A category template this category is validated against (private). May be null and no validation of additional_properties will be done
   **/
  @ApiModelProperty(value = "A category template this category is validated against (private). May be null and no validation of additional_properties will be done")
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
    CategoryResource categoryResource = (CategoryResource) o;
    return (this.active == null ? categoryResource.active == null : this.active.equals(categoryResource.active)) &&
        (this.additionalProperties == null ? categoryResource.additionalProperties == null : this.additionalProperties.equals(categoryResource.additionalProperties)) &&
        (this.id == null ? categoryResource.id == null : this.id.equals(categoryResource.id)) &&
        (this.name == null ? categoryResource.name == null : this.name.equals(categoryResource.name)) &&
        (this.template == null ? categoryResource.template == null : this.template.equals(categoryResource.template));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResource {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import com.knetikcloud.model.PropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TextPropertyDefinitionResource extends PropertyDefinitionResource {
  
  @SerializedName("field_list")
  private PropertyFieldListResource fieldList = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("required")
  private Boolean required = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("max_length")
  private Integer maxLength = null;

  /**
   * A list of the fields on both the property definition and property of this type
   **/
  @ApiModelProperty(value = "A list of the fields on both the property definition and property of this type")
  public PropertyFieldListResource getFieldList() {
    return fieldList;
  }
  public void setFieldList(PropertyFieldListResource fieldList) {
    this.fieldList = fieldList;
  }

  /**
   * The name of the property
   **/
  @ApiModelProperty(required = true, value = "The name of the property")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether the property is required
   **/
  @ApiModelProperty(required = true, value = "Whether the property is required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.
   **/
  @ApiModelProperty(required = true, value = "The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * If provided, the maximum length of the text
   **/
  @ApiModelProperty(value = "If provided, the maximum length of the text")
  public Integer getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextPropertyDefinitionResource textPropertyDefinitionResource = (TextPropertyDefinitionResource) o;
    return (this.fieldList == null ? textPropertyDefinitionResource.fieldList == null : this.fieldList.equals(textPropertyDefinitionResource.fieldList)) &&
        (this.name == null ? textPropertyDefinitionResource.name == null : this.name.equals(textPropertyDefinitionResource.name)) &&
        (this.required == null ? textPropertyDefinitionResource.required == null : this.required.equals(textPropertyDefinitionResource.required)) &&
        (this.type == null ? textPropertyDefinitionResource.type == null : this.type.equals(textPropertyDefinitionResource.type)) &&
        (this.maxLength == null ? textPropertyDefinitionResource.maxLength == null : this.maxLength.equals(textPropertyDefinitionResource.maxLength));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fieldList == null ? 0: this.fieldList.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.required == null ? 0: this.required.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.maxLength == null ? 0: this.maxLength.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextPropertyDefinitionResource {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  fieldList: ").append(fieldList).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  maxLength: ").append(maxLength).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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
public class LongPropertyDefinitionResource extends PropertyDefinitionResource {
  
  @SerializedName("field_list")
  private PropertyFieldListResource fieldList = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("required")
  private Boolean required = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("max")
  private Long max = null;
  @SerializedName("min")
  private Long min = null;

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
   * If provided, the maximum value
   **/
  @ApiModelProperty(value = "If provided, the maximum value")
  public Long getMax() {
    return max;
  }
  public void setMax(Long max) {
    this.max = max;
  }

  /**
   * If provided, the minimum value
   **/
  @ApiModelProperty(value = "If provided, the minimum value")
  public Long getMin() {
    return min;
  }
  public void setMin(Long min) {
    this.min = min;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongPropertyDefinitionResource longPropertyDefinitionResource = (LongPropertyDefinitionResource) o;
    return (this.fieldList == null ? longPropertyDefinitionResource.fieldList == null : this.fieldList.equals(longPropertyDefinitionResource.fieldList)) &&
        (this.name == null ? longPropertyDefinitionResource.name == null : this.name.equals(longPropertyDefinitionResource.name)) &&
        (this.required == null ? longPropertyDefinitionResource.required == null : this.required.equals(longPropertyDefinitionResource.required)) &&
        (this.type == null ? longPropertyDefinitionResource.type == null : this.type.equals(longPropertyDefinitionResource.type)) &&
        (this.max == null ? longPropertyDefinitionResource.max == null : this.max.equals(longPropertyDefinitionResource.max)) &&
        (this.min == null ? longPropertyDefinitionResource.min == null : this.min.equals(longPropertyDefinitionResource.min));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fieldList == null ? 0: this.fieldList.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.required == null ? 0: this.required.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.max == null ? 0: this.max.hashCode());
    result = 31 * result + (this.min == null ? 0: this.min.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongPropertyDefinitionResource {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  fieldList: ").append(fieldList).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("  min: ").append(min).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

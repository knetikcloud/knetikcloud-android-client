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

package com.knetikcloud.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ConstantResource {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("value")
  private Object value = null;
  @SerializedName("value_type")
  private String valueType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstantResource constantResource = (ConstantResource) o;
    return (this.type == null ? constantResource.type == null : this.type.equals(constantResource.type)) &&
        (this.value == null ? constantResource.value == null : this.value.equals(constantResource.value)) &&
        (this.valueType == null ? constantResource.valueType == null : this.valueType.equals(constantResource.valueType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.valueType == null ? 0: this.valueType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstantResource {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  valueType: ").append(valueType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
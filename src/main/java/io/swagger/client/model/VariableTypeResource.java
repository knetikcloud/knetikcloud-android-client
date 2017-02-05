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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class VariableTypeResource {
  
  public enum BaseEnum {
     NUMBER,  INTEGER,  STRING,  DATE,  BOOLEAN, 
  };
  @SerializedName("base")
  private BaseEnum base = null;
  @SerializedName("name")
  private String name = null;

  /**
   * The base class of the type
   **/
  @ApiModelProperty(required = true, value = "The base class of the type")
  public BaseEnum getBase() {
    return base;
  }
  public void setBase(BaseEnum base) {
    this.base = base;
  }

  /**
   * The name of the variable type. Used as the unique id
   **/
  @ApiModelProperty(required = true, value = "The name of the variable type. Used as the unique id")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableTypeResource variableTypeResource = (VariableTypeResource) o;
    return (this.base == null ? variableTypeResource.base == null : this.base.equals(variableTypeResource.base)) &&
        (this.name == null ? variableTypeResource.name == null : this.name.equals(variableTypeResource.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.base == null ? 0: this.base.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableTypeResource {\n");
    
    sb.append("  base: ").append(base).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

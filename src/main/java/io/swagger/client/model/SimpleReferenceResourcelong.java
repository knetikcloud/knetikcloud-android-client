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
public class SimpleReferenceResourcelong {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("name")
  private String name = null;

  /**
   * The id of the referenced object
   **/
  @ApiModelProperty(required = true, value = "The id of the referenced object")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The name of the referenced object
   **/
  @ApiModelProperty(value = "The name of the referenced object")
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
    SimpleReferenceResourcelong simpleReferenceResourcelong = (SimpleReferenceResourcelong) o;
    return (this.id == null ? simpleReferenceResourcelong.id == null : this.id.equals(simpleReferenceResourcelong.id)) &&
        (this.name == null ? simpleReferenceResourcelong.name == null : this.name.equals(simpleReferenceResourcelong.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleReferenceResourcelong {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

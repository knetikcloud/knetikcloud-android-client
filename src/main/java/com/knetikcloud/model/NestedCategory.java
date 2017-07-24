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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class NestedCategory {
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;

  /**
   * Whether the category is active
   **/
  @ApiModelProperty(value = "Whether the category is active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * The id of the category
   **/
  @ApiModelProperty(required = true, value = "The id of the category")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the category
   **/
  @ApiModelProperty(value = "The name of the category")
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
    NestedCategory nestedCategory = (NestedCategory) o;
    return (this.active == null ? nestedCategory.active == null : this.active.equals(nestedCategory.active)) &&
        (this.id == null ? nestedCategory.id == null : this.id.equals(nestedCategory.id)) &&
        (this.name == null ? nestedCategory.name == null : this.name.equals(nestedCategory.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedCategory {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

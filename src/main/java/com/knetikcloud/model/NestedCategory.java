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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NestedCategory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class NestedCategory {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

   /**
   * Whether the category is active
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the category is active")
  public Boolean isActive() {
    return active;
  }

  public NestedCategory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the category
   * @return id
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
   * @return name
  **/
  @ApiModelProperty(value = "The name of the category")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedCategory nestedCategory = (NestedCategory) o;
    return Objects.equals(this.active, nestedCategory.active) &&
        Objects.equals(this.id, nestedCategory.id) &&
        Objects.equals(this.name, nestedCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedCategory {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


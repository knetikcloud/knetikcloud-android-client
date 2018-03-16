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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SimpleReferenceResourceint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T15:25:08.809-04:00")
public class SimpleReferenceResourceint {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public SimpleReferenceResourceint id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the referenced object
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the referenced object")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

   /**
   * The name of the referenced object
   * @return name
  **/
  @ApiModelProperty(value = "The name of the referenced object")
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
    SimpleReferenceResourceint simpleReferenceResourceint = (SimpleReferenceResourceint) o;
    return Objects.equals(this.id, simpleReferenceResourceint.id) &&
        Objects.equals(this.name, simpleReferenceResourceint.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleReferenceResourceint {\n");
    
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


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
 * ArgumentResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:24.234-05:00")
public class ArgumentResource {
  @SerializedName("force_softness")
  private Boolean forceSoftness = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public ArgumentResource forceSoftness(Boolean forceSoftness) {
    this.forceSoftness = forceSoftness;
    return this;
  }

   /**
   * Get forceSoftness
   * @return forceSoftness
  **/
  @ApiModelProperty(value = "")
  public Boolean isForceSoftness() {
    return forceSoftness;
  }

  public void setForceSoftness(Boolean forceSoftness) {
    this.forceSoftness = forceSoftness;
  }

  public ArgumentResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArgumentResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArgumentResource argumentResource = (ArgumentResource) o;
    return Objects.equals(this.forceSoftness, argumentResource.forceSoftness) &&
        Objects.equals(this.name, argumentResource.name) &&
        Objects.equals(this.type, argumentResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceSoftness, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArgumentResource {\n");
    
    sb.append("    forceSoftness: ").append(toIndentedString(forceSoftness)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


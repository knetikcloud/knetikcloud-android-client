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
 * InnerQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T15:40:11.397-05:00")
public class InnerQuery {
  @SerializedName("bool")
  private Object bool = null;

  public InnerQuery bool(Object bool) {
    this.bool = bool;
    return this;
  }

   /**
   * The &#39;bool&#39; body of an elastic search query. Will be augmented to enforce security.
   * @return bool
  **/
  @ApiModelProperty(required = true, value = "The 'bool' body of an elastic search query. Will be augmented to enforce security.")
  public Object getBool() {
    return bool;
  }

  public void setBool(Object bool) {
    this.bool = bool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerQuery innerQuery = (InnerQuery) o;
    return Objects.equals(this.bool, innerQuery.bool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bool);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerQuery {\n");
    
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
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


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
import com.knetikcloud.model.PropertyDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DoublePropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-22T09:25:50.362-05:00")
public class DoublePropertyDefinitionResource extends PropertyDefinitionResource {
  @SerializedName("max")
  private Double max = null;

  @SerializedName("min")
  private Double min = null;

  public DoublePropertyDefinitionResource max(Double max) {
    this.max = max;
    return this;
  }

   /**
   * If provided, the maximum value
   * @return max
  **/
  @ApiModelProperty(value = "If provided, the maximum value")
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public DoublePropertyDefinitionResource min(Double min) {
    this.min = min;
    return this;
  }

   /**
   * If provided, the minimum value
   * @return min
  **/
  @ApiModelProperty(value = "If provided, the minimum value")
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoublePropertyDefinitionResource doublePropertyDefinitionResource = (DoublePropertyDefinitionResource) o;
    return Objects.equals(this.max, doublePropertyDefinitionResource.max) &&
        Objects.equals(this.min, doublePropertyDefinitionResource.min) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoublePropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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


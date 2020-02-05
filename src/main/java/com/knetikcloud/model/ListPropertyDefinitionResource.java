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
 * ListPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:01.795-05:00")
public class ListPropertyDefinitionResource extends PropertyDefinitionResource {
  @SerializedName("max_count")
  private Integer maxCount = null;

  @SerializedName("min_count")
  private Integer minCount = null;

  @SerializedName("value_definition")
  private PropertyDefinitionResource valueDefinition = null;

  public ListPropertyDefinitionResource maxCount(Integer maxCount) {
    this.maxCount = maxCount;
    return this;
  }

   /**
   * If provided, the maximum number of files in the group
   * @return maxCount
  **/
  @ApiModelProperty(value = "If provided, the maximum number of files in the group")
  public Integer getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
  }

  public ListPropertyDefinitionResource minCount(Integer minCount) {
    this.minCount = minCount;
    return this;
  }

   /**
   * If provided, the minimum number of files in the group
   * @return minCount
  **/
  @ApiModelProperty(value = "If provided, the minimum number of files in the group")
  public Integer getMinCount() {
    return minCount;
  }

  public void setMinCount(Integer minCount) {
    this.minCount = minCount;
  }

  public ListPropertyDefinitionResource valueDefinition(PropertyDefinitionResource valueDefinition) {
    this.valueDefinition = valueDefinition;
    return this;
  }

   /**
   * If provided, a property definition for validating values within list
   * @return valueDefinition
  **/
  @ApiModelProperty(value = "If provided, a property definition for validating values within list")
  public PropertyDefinitionResource getValueDefinition() {
    return valueDefinition;
  }

  public void setValueDefinition(PropertyDefinitionResource valueDefinition) {
    this.valueDefinition = valueDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPropertyDefinitionResource listPropertyDefinitionResource = (ListPropertyDefinitionResource) o;
    return Objects.equals(this.maxCount, listPropertyDefinitionResource.maxCount) &&
        Objects.equals(this.minCount, listPropertyDefinitionResource.minCount) &&
        Objects.equals(this.valueDefinition, listPropertyDefinitionResource.valueDefinition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCount, minCount, valueDefinition, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
    sb.append("    valueDefinition: ").append(toIndentedString(valueDefinition)).append("\n");
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


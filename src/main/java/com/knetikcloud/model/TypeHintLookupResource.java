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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Expressions are instructions for the rule engine to resolve certain values. For example instead of &#x60;user 1&#x60; it&#39;d state &#x60;user provided by the event&#x60;. Full list and definitions available at GET /bre/expressions.
 */
@ApiModel(description = "Expressions are instructions for the rule engine to resolve certain values. For example instead of `user 1` it'd state `user provided by the event`. Full list and definitions available at GET /bre/expressions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T13:50:49.584-04:00")
public class TypeHintLookupResource {
  @SerializedName("definition")
  private String definition = null;

  @SerializedName("lookup_key")
  private ExpressionResource lookupKey = null;

  @SerializedName("required_key_type")
  private String requiredKeyType = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value_type")
  private String valueType = null;

  public TypeHintLookupResource definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public TypeHintLookupResource lookupKey(ExpressionResource lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

   /**
   * Get lookupKey
   * @return lookupKey
  **/
  @ApiModelProperty(value = "")
  public ExpressionResource getLookupKey() {
    return lookupKey;
  }

  public void setLookupKey(ExpressionResource lookupKey) {
    this.lookupKey = lookupKey;
  }

  public TypeHintLookupResource requiredKeyType(String requiredKeyType) {
    this.requiredKeyType = requiredKeyType;
    return this;
  }

   /**
   * Get requiredKeyType
   * @return requiredKeyType
  **/
  @ApiModelProperty(value = "")
  public String getRequiredKeyType() {
    return requiredKeyType;
  }

  public void setRequiredKeyType(String requiredKeyType) {
    this.requiredKeyType = requiredKeyType;
  }

  public TypeHintLookupResource type(String type) {
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

  public TypeHintLookupResource valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @ApiModelProperty(value = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHintLookupResource typeHintLookupResource = (TypeHintLookupResource) o;
    return Objects.equals(this.definition, typeHintLookupResource.definition) &&
        Objects.equals(this.lookupKey, typeHintLookupResource.lookupKey) &&
        Objects.equals(this.requiredKeyType, typeHintLookupResource.requiredKeyType) &&
        Objects.equals(this.type, typeHintLookupResource.type) &&
        Objects.equals(this.valueType, typeHintLookupResource.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, lookupKey, requiredKeyType, type, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHintLookupResource {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    lookupKey: ").append(toIndentedString(lookupKey)).append("\n");
    sb.append("    requiredKeyType: ").append(toIndentedString(requiredKeyType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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


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
 * FormattedTextPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:46:55.685-04:00")
public class FormattedTextPropertyDefinitionResource extends PropertyDefinitionResource {
  @SerializedName("max_length")
  private Integer maxLength = null;

  public FormattedTextPropertyDefinitionResource maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * If provided, the maximum length of the text
   * @return maxLength
  **/
  @ApiModelProperty(value = "If provided, the maximum length of the text")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormattedTextPropertyDefinitionResource formattedTextPropertyDefinitionResource = (FormattedTextPropertyDefinitionResource) o;
    return Objects.equals(this.maxLength, formattedTextPropertyDefinitionResource.maxLength) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormattedTextPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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


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
import com.knetikcloud.model.FileGroupPropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AudioGroupPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:41:38.777-05:00")
public class AudioGroupPropertyDefinitionResource extends FileGroupPropertyDefinitionResource {
  @SerializedName("max_length")
  private Integer maxLength = null;

  @SerializedName("min_length")
  private Integer minLength = null;

  public AudioGroupPropertyDefinitionResource maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * If provided, the maximum length of the audio
   * @return maxLength
  **/
  @ApiModelProperty(value = "If provided, the maximum length of the audio")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public AudioGroupPropertyDefinitionResource minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * If provided, the minimum length of the audio
   * @return minLength
  **/
  @ApiModelProperty(value = "If provided, the minimum length of the audio")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioGroupPropertyDefinitionResource audioGroupPropertyDefinitionResource = (AudioGroupPropertyDefinitionResource) o;
    return Objects.equals(this.maxLength, audioGroupPropertyDefinitionResource.maxLength) &&
        Objects.equals(this.minLength, audioGroupPropertyDefinitionResource.minLength) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, minLength, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioGroupPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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


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
 * ImagePropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T10:17:25.583-04:00")
public class ImagePropertyDefinitionResource extends PropertyDefinitionResource {
  @SerializedName("file_type")
  private String fileType = null;

  @SerializedName("max_height")
  private Integer maxHeight = null;

  @SerializedName("max_width")
  private Integer maxWidth = null;

  @SerializedName("min_height")
  private Integer minHeight = null;

  @SerializedName("min_width")
  private Integer minWidth = null;

  public ImagePropertyDefinitionResource fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * If provided, a file type that the property must match
   * @return fileType
  **/
  @ApiModelProperty(value = "If provided, a file type that the property must match")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public ImagePropertyDefinitionResource maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * If provided, the maximum height of the image
   * @return maxHeight
  **/
  @ApiModelProperty(value = "If provided, the maximum height of the image")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  public ImagePropertyDefinitionResource maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * If provided, the maximum width of the image
   * @return maxWidth
  **/
  @ApiModelProperty(value = "If provided, the maximum width of the image")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public ImagePropertyDefinitionResource minHeight(Integer minHeight) {
    this.minHeight = minHeight;
    return this;
  }

   /**
   * If provided, the minimum height of the image
   * @return minHeight
  **/
  @ApiModelProperty(value = "If provided, the minimum height of the image")
  public Integer getMinHeight() {
    return minHeight;
  }

  public void setMinHeight(Integer minHeight) {
    this.minHeight = minHeight;
  }

  public ImagePropertyDefinitionResource minWidth(Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

   /**
   * If provided, the minimum width of the image
   * @return minWidth
  **/
  @ApiModelProperty(value = "If provided, the minimum width of the image")
  public Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Integer minWidth) {
    this.minWidth = minWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagePropertyDefinitionResource imagePropertyDefinitionResource = (ImagePropertyDefinitionResource) o;
    return Objects.equals(this.fileType, imagePropertyDefinitionResource.fileType) &&
        Objects.equals(this.maxHeight, imagePropertyDefinitionResource.maxHeight) &&
        Objects.equals(this.maxWidth, imagePropertyDefinitionResource.maxWidth) &&
        Objects.equals(this.minHeight, imagePropertyDefinitionResource.minHeight) &&
        Objects.equals(this.minWidth, imagePropertyDefinitionResource.minWidth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, maxHeight, maxWidth, minHeight, minWidth, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagePropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
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


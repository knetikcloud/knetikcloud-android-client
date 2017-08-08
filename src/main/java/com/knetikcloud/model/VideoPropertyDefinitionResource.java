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
import com.knetikcloud.model.PropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VideoPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class VideoPropertyDefinitionResource extends PropertyDefinitionResource {
  @JsonProperty("file_type")
  private String fileType = null;

  @JsonProperty("max_height")
  private Integer maxHeight = null;

  @JsonProperty("max_length")
  private Integer maxLength = null;

  @JsonProperty("max_width")
  private Integer maxWidth = null;

  @JsonProperty("min_height")
  private Integer minHeight = null;

  @JsonProperty("min_length")
  private Integer minLength = null;

  @JsonProperty("min_width")
  private Integer minWidth = null;

  public VideoPropertyDefinitionResource fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * If provided, a file type that teh property must match
   * @return fileType
  **/
  @ApiModelProperty(value = "If provided, a file type that teh property must match")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public VideoPropertyDefinitionResource maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * If provided, the maximum height of the video
   * @return maxHeight
  **/
  @ApiModelProperty(value = "If provided, the maximum height of the video")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  public VideoPropertyDefinitionResource maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * If provided, the maximum length of the video
   * @return maxLength
  **/
  @ApiModelProperty(value = "If provided, the maximum length of the video")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public VideoPropertyDefinitionResource maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * If provided, the maximum width of the video
   * @return maxWidth
  **/
  @ApiModelProperty(value = "If provided, the maximum width of the video")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public VideoPropertyDefinitionResource minHeight(Integer minHeight) {
    this.minHeight = minHeight;
    return this;
  }

   /**
   * If provided, the minimum height of the video
   * @return minHeight
  **/
  @ApiModelProperty(value = "If provided, the minimum height of the video")
  public Integer getMinHeight() {
    return minHeight;
  }

  public void setMinHeight(Integer minHeight) {
    this.minHeight = minHeight;
  }

  public VideoPropertyDefinitionResource minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * If provided, the minimum length of the video
   * @return minLength
  **/
  @ApiModelProperty(value = "If provided, the minimum length of the video")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public VideoPropertyDefinitionResource minWidth(Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

   /**
   * If provided, the minimum width of the video
   * @return minWidth
  **/
  @ApiModelProperty(value = "If provided, the minimum width of the video")
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
    VideoPropertyDefinitionResource videoPropertyDefinitionResource = (VideoPropertyDefinitionResource) o;
    return Objects.equals(this.fileType, videoPropertyDefinitionResource.fileType) &&
        Objects.equals(this.maxHeight, videoPropertyDefinitionResource.maxHeight) &&
        Objects.equals(this.maxLength, videoPropertyDefinitionResource.maxLength) &&
        Objects.equals(this.maxWidth, videoPropertyDefinitionResource.maxWidth) &&
        Objects.equals(this.minHeight, videoPropertyDefinitionResource.minHeight) &&
        Objects.equals(this.minLength, videoPropertyDefinitionResource.minLength) &&
        Objects.equals(this.minWidth, videoPropertyDefinitionResource.minWidth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, maxHeight, maxLength, maxWidth, minHeight, minLength, minWidth, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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


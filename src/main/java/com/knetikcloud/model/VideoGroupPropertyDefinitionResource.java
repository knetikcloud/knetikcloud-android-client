/**
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

import com.knetikcloud.model.FileGroupPropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class VideoGroupPropertyDefinitionResource extends FileGroupPropertyDefinitionResource {
  
  @SerializedName("field_list")
  private PropertyFieldListResource fieldList = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("required")
  private Boolean required = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("file_type")
  private String fileType = null;
  @SerializedName("max_count")
  private Integer maxCount = null;
  @SerializedName("max_file_size")
  private Long maxFileSize = null;
  @SerializedName("min_count")
  private Integer minCount = null;
  @SerializedName("max_height")
  private Integer maxHeight = null;
  @SerializedName("max_length")
  private Integer maxLength = null;
  @SerializedName("max_width")
  private Integer maxWidth = null;
  @SerializedName("min_height")
  private Integer minHeight = null;
  @SerializedName("min_length")
  private Integer minLength = null;
  @SerializedName("min_width")
  private Integer minWidth = null;

  /**
   * A list of the fields on both the property definition and property of this type
   **/
  @ApiModelProperty(value = "A list of the fields on both the property definition and property of this type")
  public PropertyFieldListResource getFieldList() {
    return fieldList;
  }
  public void setFieldList(PropertyFieldListResource fieldList) {
    this.fieldList = fieldList;
  }

  /**
   * The name of the property
   **/
  @ApiModelProperty(required = true, value = "The name of the property")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether the property is required
   **/
  @ApiModelProperty(required = true, value = "Whether the property is required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.
   **/
  @ApiModelProperty(required = true, value = "The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * If provided, a file type that the property must match
   **/
  @ApiModelProperty(value = "If provided, a file type that the property must match")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  /**
   * If provided, the maximum number of files in the group
   **/
  @ApiModelProperty(value = "If provided, the maximum number of files in the group")
  public Integer getMaxCount() {
    return maxCount;
  }
  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
  }

  /**
   * If provided, the maximum allowed size per file in bytes
   **/
  @ApiModelProperty(value = "If provided, the maximum allowed size per file in bytes")
  public Long getMaxFileSize() {
    return maxFileSize;
  }
  public void setMaxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  /**
   * If provided, the minimum number of files in the group
   **/
  @ApiModelProperty(value = "If provided, the minimum number of files in the group")
  public Integer getMinCount() {
    return minCount;
  }
  public void setMinCount(Integer minCount) {
    this.minCount = minCount;
  }

  /**
   * If provided, the maximum height of each video
   **/
  @ApiModelProperty(value = "If provided, the maximum height of each video")
  public Integer getMaxHeight() {
    return maxHeight;
  }
  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  /**
   * If provided, the maximum length of each video
   **/
  @ApiModelProperty(value = "If provided, the maximum length of each video")
  public Integer getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  /**
   * If provided, the maximum width of each video
   **/
  @ApiModelProperty(value = "If provided, the maximum width of each video")
  public Integer getMaxWidth() {
    return maxWidth;
  }
  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   * If provided, the minimum height of each video
   **/
  @ApiModelProperty(value = "If provided, the minimum height of each video")
  public Integer getMinHeight() {
    return minHeight;
  }
  public void setMinHeight(Integer minHeight) {
    this.minHeight = minHeight;
  }

  /**
   * If provided, the minimum length of each video
   **/
  @ApiModelProperty(value = "If provided, the minimum length of each video")
  public Integer getMinLength() {
    return minLength;
  }
  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  /**
   * If provided, the minimum width of each video
   **/
  @ApiModelProperty(value = "If provided, the minimum width of each video")
  public Integer getMinWidth() {
    return minWidth;
  }
  public void setMinWidth(Integer minWidth) {
    this.minWidth = minWidth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoGroupPropertyDefinitionResource videoGroupPropertyDefinitionResource = (VideoGroupPropertyDefinitionResource) o;
    return (this.fieldList == null ? videoGroupPropertyDefinitionResource.fieldList == null : this.fieldList.equals(videoGroupPropertyDefinitionResource.fieldList)) &&
        (this.name == null ? videoGroupPropertyDefinitionResource.name == null : this.name.equals(videoGroupPropertyDefinitionResource.name)) &&
        (this.required == null ? videoGroupPropertyDefinitionResource.required == null : this.required.equals(videoGroupPropertyDefinitionResource.required)) &&
        (this.type == null ? videoGroupPropertyDefinitionResource.type == null : this.type.equals(videoGroupPropertyDefinitionResource.type)) &&
        (this.fileType == null ? videoGroupPropertyDefinitionResource.fileType == null : this.fileType.equals(videoGroupPropertyDefinitionResource.fileType)) &&
        (this.maxCount == null ? videoGroupPropertyDefinitionResource.maxCount == null : this.maxCount.equals(videoGroupPropertyDefinitionResource.maxCount)) &&
        (this.maxFileSize == null ? videoGroupPropertyDefinitionResource.maxFileSize == null : this.maxFileSize.equals(videoGroupPropertyDefinitionResource.maxFileSize)) &&
        (this.minCount == null ? videoGroupPropertyDefinitionResource.minCount == null : this.minCount.equals(videoGroupPropertyDefinitionResource.minCount)) &&
        (this.maxHeight == null ? videoGroupPropertyDefinitionResource.maxHeight == null : this.maxHeight.equals(videoGroupPropertyDefinitionResource.maxHeight)) &&
        (this.maxLength == null ? videoGroupPropertyDefinitionResource.maxLength == null : this.maxLength.equals(videoGroupPropertyDefinitionResource.maxLength)) &&
        (this.maxWidth == null ? videoGroupPropertyDefinitionResource.maxWidth == null : this.maxWidth.equals(videoGroupPropertyDefinitionResource.maxWidth)) &&
        (this.minHeight == null ? videoGroupPropertyDefinitionResource.minHeight == null : this.minHeight.equals(videoGroupPropertyDefinitionResource.minHeight)) &&
        (this.minLength == null ? videoGroupPropertyDefinitionResource.minLength == null : this.minLength.equals(videoGroupPropertyDefinitionResource.minLength)) &&
        (this.minWidth == null ? videoGroupPropertyDefinitionResource.minWidth == null : this.minWidth.equals(videoGroupPropertyDefinitionResource.minWidth));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fieldList == null ? 0: this.fieldList.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.required == null ? 0: this.required.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.fileType == null ? 0: this.fileType.hashCode());
    result = 31 * result + (this.maxCount == null ? 0: this.maxCount.hashCode());
    result = 31 * result + (this.maxFileSize == null ? 0: this.maxFileSize.hashCode());
    result = 31 * result + (this.minCount == null ? 0: this.minCount.hashCode());
    result = 31 * result + (this.maxHeight == null ? 0: this.maxHeight.hashCode());
    result = 31 * result + (this.maxLength == null ? 0: this.maxLength.hashCode());
    result = 31 * result + (this.maxWidth == null ? 0: this.maxWidth.hashCode());
    result = 31 * result + (this.minHeight == null ? 0: this.minHeight.hashCode());
    result = 31 * result + (this.minLength == null ? 0: this.minLength.hashCode());
    result = 31 * result + (this.minWidth == null ? 0: this.minWidth.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoGroupPropertyDefinitionResource {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  fieldList: ").append(fieldList).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  fileType: ").append(fileType).append("\n");
    sb.append("  maxCount: ").append(maxCount).append("\n");
    sb.append("  maxFileSize: ").append(maxFileSize).append("\n");
    sb.append("  minCount: ").append(minCount).append("\n");
    sb.append("  maxHeight: ").append(maxHeight).append("\n");
    sb.append("  maxLength: ").append(maxLength).append("\n");
    sb.append("  maxWidth: ").append(maxWidth).append("\n");
    sb.append("  minHeight: ").append(minHeight).append("\n");
    sb.append("  minLength: ").append(minLength).append("\n");
    sb.append("  minWidth: ").append(minWidth).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

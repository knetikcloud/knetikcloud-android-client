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

import com.knetikcloud.model.PropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ImagePropertyDefinitionResource extends PropertyDefinitionResource {
  
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
  @SerializedName("max_height")
  private Integer maxHeight = null;
  @SerializedName("max_width")
  private Integer maxWidth = null;
  @SerializedName("min_height")
  private Integer minHeight = null;
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
   * If provided, the maximum height of the image
   **/
  @ApiModelProperty(value = "If provided, the maximum height of the image")
  public Integer getMaxHeight() {
    return maxHeight;
  }
  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  /**
   * If provided, the maximum width of the image
   **/
  @ApiModelProperty(value = "If provided, the maximum width of the image")
  public Integer getMaxWidth() {
    return maxWidth;
  }
  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   * If provided, the minimum height of the image
   **/
  @ApiModelProperty(value = "If provided, the minimum height of the image")
  public Integer getMinHeight() {
    return minHeight;
  }
  public void setMinHeight(Integer minHeight) {
    this.minHeight = minHeight;
  }

  /**
   * If provided, the minimum width of the image
   **/
  @ApiModelProperty(value = "If provided, the minimum width of the image")
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
    ImagePropertyDefinitionResource imagePropertyDefinitionResource = (ImagePropertyDefinitionResource) o;
    return (this.fieldList == null ? imagePropertyDefinitionResource.fieldList == null : this.fieldList.equals(imagePropertyDefinitionResource.fieldList)) &&
        (this.name == null ? imagePropertyDefinitionResource.name == null : this.name.equals(imagePropertyDefinitionResource.name)) &&
        (this.required == null ? imagePropertyDefinitionResource.required == null : this.required.equals(imagePropertyDefinitionResource.required)) &&
        (this.type == null ? imagePropertyDefinitionResource.type == null : this.type.equals(imagePropertyDefinitionResource.type)) &&
        (this.fileType == null ? imagePropertyDefinitionResource.fileType == null : this.fileType.equals(imagePropertyDefinitionResource.fileType)) &&
        (this.maxHeight == null ? imagePropertyDefinitionResource.maxHeight == null : this.maxHeight.equals(imagePropertyDefinitionResource.maxHeight)) &&
        (this.maxWidth == null ? imagePropertyDefinitionResource.maxWidth == null : this.maxWidth.equals(imagePropertyDefinitionResource.maxWidth)) &&
        (this.minHeight == null ? imagePropertyDefinitionResource.minHeight == null : this.minHeight.equals(imagePropertyDefinitionResource.minHeight)) &&
        (this.minWidth == null ? imagePropertyDefinitionResource.minWidth == null : this.minWidth.equals(imagePropertyDefinitionResource.minWidth));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fieldList == null ? 0: this.fieldList.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.required == null ? 0: this.required.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.fileType == null ? 0: this.fileType.hashCode());
    result = 31 * result + (this.maxHeight == null ? 0: this.maxHeight.hashCode());
    result = 31 * result + (this.maxWidth == null ? 0: this.maxWidth.hashCode());
    result = 31 * result + (this.minHeight == null ? 0: this.minHeight.hashCode());
    result = 31 * result + (this.minWidth == null ? 0: this.minWidth.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagePropertyDefinitionResource {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  fieldList: ").append(fieldList).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  fileType: ").append(fileType).append("\n");
    sb.append("  maxHeight: ").append(maxHeight).append("\n");
    sb.append("  maxWidth: ").append(maxWidth).append("\n");
    sb.append("  minHeight: ").append(minHeight).append("\n");
    sb.append("  minWidth: ").append(minWidth).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

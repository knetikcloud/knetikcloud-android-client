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
public class FileGroupPropertyDefinitionResource extends PropertyDefinitionResource {
  
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGroupPropertyDefinitionResource fileGroupPropertyDefinitionResource = (FileGroupPropertyDefinitionResource) o;
    return (this.fieldList == null ? fileGroupPropertyDefinitionResource.fieldList == null : this.fieldList.equals(fileGroupPropertyDefinitionResource.fieldList)) &&
        (this.name == null ? fileGroupPropertyDefinitionResource.name == null : this.name.equals(fileGroupPropertyDefinitionResource.name)) &&
        (this.required == null ? fileGroupPropertyDefinitionResource.required == null : this.required.equals(fileGroupPropertyDefinitionResource.required)) &&
        (this.type == null ? fileGroupPropertyDefinitionResource.type == null : this.type.equals(fileGroupPropertyDefinitionResource.type)) &&
        (this.fileType == null ? fileGroupPropertyDefinitionResource.fileType == null : this.fileType.equals(fileGroupPropertyDefinitionResource.fileType)) &&
        (this.maxCount == null ? fileGroupPropertyDefinitionResource.maxCount == null : this.maxCount.equals(fileGroupPropertyDefinitionResource.maxCount)) &&
        (this.maxFileSize == null ? fileGroupPropertyDefinitionResource.maxFileSize == null : this.maxFileSize.equals(fileGroupPropertyDefinitionResource.maxFileSize)) &&
        (this.minCount == null ? fileGroupPropertyDefinitionResource.minCount == null : this.minCount.equals(fileGroupPropertyDefinitionResource.minCount));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGroupPropertyDefinitionResource {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  fieldList: ").append(fieldList).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  fileType: ").append(fileType).append("\n");
    sb.append("  maxCount: ").append(maxCount).append("\n");
    sb.append("  maxFileSize: ").append(maxFileSize).append("\n");
    sb.append("  minCount: ").append(minCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import com.knetikcloud.model.FileProperty;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ImageProperty extends FileProperty {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("crc")
  private String crc = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("file_type")
  private String fileType = null;
  @SerializedName("url")
  private String url = null;

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
   * A crc value for file integrity verification
   **/
  @ApiModelProperty(value = "A crc value for file integrity verification")
  public String getCrc() {
    return crc;
  }
  public void setCrc(String crc) {
    this.crc = crc;
  }

  /**
   * A description of the file
   **/
  @ApiModelProperty(value = "A description of the file")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The type of file such as txt, mp3, mov or csv
   **/
  @ApiModelProperty(value = "The type of file such as txt, mp3, mov or csv")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  /**
   * The url of the file
   **/
  @ApiModelProperty(value = "The url of the file")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageProperty imageProperty = (ImageProperty) o;
    return (this.type == null ? imageProperty.type == null : this.type.equals(imageProperty.type)) &&
        (this.crc == null ? imageProperty.crc == null : this.crc.equals(imageProperty.crc)) &&
        (this.description == null ? imageProperty.description == null : this.description.equals(imageProperty.description)) &&
        (this.fileType == null ? imageProperty.fileType == null : this.fileType.equals(imageProperty.fileType)) &&
        (this.url == null ? imageProperty.url == null : this.url.equals(imageProperty.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.crc == null ? 0: this.crc.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.fileType == null ? 0: this.fileType.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageProperty {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  crc: ").append(crc).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  fileType: ").append(fileType).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

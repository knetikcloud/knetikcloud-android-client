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

import com.knetikcloud.model.FileGroupProperty;
import com.knetikcloud.model.FileProperty;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AudioGroupProperty extends FileGroupProperty {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("files")
  private List<FileProperty> files = null;

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
   * The list of files
   **/
  @ApiModelProperty(value = "The list of files")
  public List<FileProperty> getFiles() {
    return files;
  }
  public void setFiles(List<FileProperty> files) {
    this.files = files;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioGroupProperty audioGroupProperty = (AudioGroupProperty) o;
    return (this.type == null ? audioGroupProperty.type == null : this.type.equals(audioGroupProperty.type)) &&
        (this.files == null ? audioGroupProperty.files == null : this.files.equals(audioGroupProperty.files));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.files == null ? 0: this.files.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioGroupProperty {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  files: ").append(files).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

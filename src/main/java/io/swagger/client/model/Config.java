/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Config {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("public_read")
  private Boolean publicRead = null;
  @SerializedName("value")
  private String value = null;

  /**
   * The name of the config
   **/
  @ApiModelProperty(required = true, value = "The name of the config")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether the config is public for viewing. True means that it can be publicly viewed by all. Default: false
   **/
  @ApiModelProperty(value = "Whether the config is public for viewing. True means that it can be publicly viewed by all. Default: false")
  public Boolean getPublicRead() {
    return publicRead;
  }
  public void setPublicRead(Boolean publicRead) {
    this.publicRead = publicRead;
  }

  /**
   * The value of the config
   **/
  @ApiModelProperty(value = "The value of the config")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return (this.name == null ? config.name == null : this.name.equals(config.name)) &&
        (this.publicRead == null ? config.publicRead == null : this.publicRead.equals(config.publicRead)) &&
        (this.value == null ? config.value == null : this.value.equals(config.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.publicRead == null ? 0: this.publicRead.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  publicRead: ").append(publicRead).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
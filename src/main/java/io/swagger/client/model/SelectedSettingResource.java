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
public class SelectedSettingResource {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("key_name")
  private String keyName = null;
  @SerializedName("value")
  private String value = null;
  @SerializedName("value_name")
  private String valueName = null;

  /**
   * The unique ID for the setting
   **/
  @ApiModelProperty(required = true, value = "The unique ID for the setting")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The textual name of the setting
   **/
  @ApiModelProperty(required = true, value = "The textual name of the setting")
  public String getKeyName() {
    return keyName;
  }
  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  /**
   * The unique ID for the option. Must match one of the options from this setting in the activity, if not part of a challenge
   **/
  @ApiModelProperty(required = true, value = "The unique ID for the option. Must match one of the options from this setting in the activity, if not part of a challenge")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The textual name of the option
   **/
  @ApiModelProperty(required = true, value = "The textual name of the option")
  public String getValueName() {
    return valueName;
  }
  public void setValueName(String valueName) {
    this.valueName = valueName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectedSettingResource selectedSettingResource = (SelectedSettingResource) o;
    return (this.key == null ? selectedSettingResource.key == null : this.key.equals(selectedSettingResource.key)) &&
        (this.keyName == null ? selectedSettingResource.keyName == null : this.keyName.equals(selectedSettingResource.keyName)) &&
        (this.value == null ? selectedSettingResource.value == null : this.value.equals(selectedSettingResource.value)) &&
        (this.valueName == null ? selectedSettingResource.valueName == null : this.valueName.equals(selectedSettingResource.valueName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.key == null ? 0: this.key.hashCode());
    result = 31 * result + (this.keyName == null ? 0: this.keyName.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.valueName == null ? 0: this.valueName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedSettingResource {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  keyName: ").append(keyName).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  valueName: ").append(valueName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

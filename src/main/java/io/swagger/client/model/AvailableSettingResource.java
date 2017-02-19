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

import io.swagger.client.model.SettingOption;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AvailableSettingResource {
  
  @SerializedName("advanced_option")
  private Boolean advancedOption = null;
  @SerializedName("default_value")
  private String defaultValue = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("key")
  private String key = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("options")
  private List<SettingOption> options = null;

  /**
   * Whether the setting is advanced. Default: false
   **/
  @ApiModelProperty(value = "Whether the setting is advanced. Default: false")
  public Boolean getAdvancedOption() {
    return advancedOption;
  }
  public void setAdvancedOption(Boolean advancedOption) {
    this.advancedOption = advancedOption;
  }

  /**
   * The value of the default option (must be in options array)
   **/
  @ApiModelProperty(required = true, value = "The value of the default option (must be in options array)")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * The description of the setting
   **/
  @ApiModelProperty(value = "The description of the setting")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The set of options available for this setting
   **/
  @ApiModelProperty(required = true, value = "The set of options available for this setting")
  public List<SettingOption> getOptions() {
    return options;
  }
  public void setOptions(List<SettingOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableSettingResource availableSettingResource = (AvailableSettingResource) o;
    return (this.advancedOption == null ? availableSettingResource.advancedOption == null : this.advancedOption.equals(availableSettingResource.advancedOption)) &&
        (this.defaultValue == null ? availableSettingResource.defaultValue == null : this.defaultValue.equals(availableSettingResource.defaultValue)) &&
        (this.description == null ? availableSettingResource.description == null : this.description.equals(availableSettingResource.description)) &&
        (this.key == null ? availableSettingResource.key == null : this.key.equals(availableSettingResource.key)) &&
        (this.name == null ? availableSettingResource.name == null : this.name.equals(availableSettingResource.name)) &&
        (this.options == null ? availableSettingResource.options == null : this.options.equals(availableSettingResource.options));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.advancedOption == null ? 0: this.advancedOption.hashCode());
    result = 31 * result + (this.defaultValue == null ? 0: this.defaultValue.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.key == null ? 0: this.key.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.options == null ? 0: this.options.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableSettingResource {\n");
    
    sb.append("  advancedOption: ").append(advancedOption).append("\n");
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  options: ").append(options).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

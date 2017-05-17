/*
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


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * SelectedSettingResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class SelectedSettingResource implements Parcelable {
  @SerializedName("key")
  private String key = null;

  @SerializedName("key_name")
  private String keyName = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("value_name")
  private String valueName = null;

  public SelectedSettingResource key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The unique ID for the setting
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique ID for the setting")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SelectedSettingResource keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * The textual name of the setting
   * @return keyName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The textual name of the setting")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public SelectedSettingResource value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The unique ID for the option. Must match one of the options from this setting in the activity, if not part of a challenge
   * @return value
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique ID for the option. Must match one of the options from this setting in the activity, if not part of a challenge")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SelectedSettingResource valueName(String valueName) {
    this.valueName = valueName;
    return this;
  }

   /**
   * The textual name of the option
   * @return valueName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The textual name of the option")
  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectedSettingResource selectedSettingResource = (SelectedSettingResource) o;
    return Objects.equals(this.key, selectedSettingResource.key) &&
        Objects.equals(this.keyName, selectedSettingResource.keyName) &&
        Objects.equals(this.value, selectedSettingResource.value) &&
        Objects.equals(this.valueName, selectedSettingResource.valueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, keyName, value, valueName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedSettingResource {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
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
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(key);

    out.writeValue(keyName);

    out.writeValue(value);

    out.writeValue(valueName);
  }

  public SelectedSettingResource() {
    super();
  }

  SelectedSettingResource(Parcel in) {
    
    key = (String)in.readValue(null);
    keyName = (String)in.readValue(null);
    value = (String)in.readValue(null);
    valueName = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SelectedSettingResource> CREATOR = new Parcelable.Creator<SelectedSettingResource>() {
    public SelectedSettingResource createFromParcel(Parcel in) {
      return new SelectedSettingResource(in);
    }
    public SelectedSettingResource[] newArray(int size) {
      return new SelectedSettingResource[size];
    }
  };
}


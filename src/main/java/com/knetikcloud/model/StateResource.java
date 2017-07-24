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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class StateResource {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("country_code_iso3")
  private String countryCodeIso3 = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("name")
  private String name = null;

  /**
   * The code of the state
   **/
  @ApiModelProperty(value = "The code of the state")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The iso3 of the country this state is in
   **/
  @ApiModelProperty(value = "The iso3 of the country this state is in")
  public String getCountryCodeIso3() {
    return countryCodeIso3;
  }
  public void setCountryCodeIso3(String countryCodeIso3) {
    this.countryCodeIso3 = countryCodeIso3;
  }

  /**
   * The unique ID for the state
   **/
  @ApiModelProperty(value = "The unique ID for the state")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name of the state
   **/
  @ApiModelProperty(value = "The name of the state")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateResource stateResource = (StateResource) o;
    return (this.code == null ? stateResource.code == null : this.code.equals(stateResource.code)) &&
        (this.countryCodeIso3 == null ? stateResource.countryCodeIso3 == null : this.countryCodeIso3.equals(stateResource.countryCodeIso3)) &&
        (this.id == null ? stateResource.id == null : this.id.equals(stateResource.id)) &&
        (this.name == null ? stateResource.name == null : this.name.equals(stateResource.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.countryCodeIso3 == null ? 0: this.countryCodeIso3.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateResource {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  countryCodeIso3: ").append(countryCodeIso3).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

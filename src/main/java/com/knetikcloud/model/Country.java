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
public class Country {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("iso2")
  private String iso2 = null;
  @SerializedName("iso3")
  private String iso3 = null;
  @SerializedName("name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIso2() {
    return iso2;
  }
  public void setIso2(String iso2) {
    this.iso2 = iso2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIso3() {
    return iso3;
  }
  public void setIso3(String iso3) {
    this.iso3 = iso3;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    Country country = (Country) o;
    return (this.id == null ? country.id == null : this.id.equals(country.id)) &&
        (this.iso2 == null ? country.iso2 == null : this.iso2.equals(country.iso2)) &&
        (this.iso3 == null ? country.iso3 == null : this.iso3.equals(country.iso3)) &&
        (this.name == null ? country.name == null : this.name.equals(country.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.iso2 == null ? 0: this.iso2.hashCode());
    result = 31 * result + (this.iso3 == null ? 0: this.iso3.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  iso2: ").append(iso2).append("\n");
    sb.append("  iso3: ").append(iso3).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

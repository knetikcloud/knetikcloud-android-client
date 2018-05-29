/*
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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.knetikcloud.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SampleCountriesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T13:50:44.564-04:00")
public class SampleCountriesResponse {
  @SerializedName("vendor_id1")
  private List<Country> vendorId1 = null;

  @SerializedName("vendor_id2")
  private List<Country> vendorId2 = null;

  public SampleCountriesResponse vendorId1(List<Country> vendorId1) {
    this.vendorId1 = vendorId1;
    return this;
  }

  public SampleCountriesResponse addVendorId1Item(Country vendorId1Item) {
    if (this.vendorId1 == null) {
      this.vendorId1 = new ArrayList<Country>();
    }
    this.vendorId1.add(vendorId1Item);
    return this;
  }

   /**
   * Get vendorId1
   * @return vendorId1
  **/
  @ApiModelProperty(value = "")
  public List<Country> getVendorId1() {
    return vendorId1;
  }

  public void setVendorId1(List<Country> vendorId1) {
    this.vendorId1 = vendorId1;
  }

  public SampleCountriesResponse vendorId2(List<Country> vendorId2) {
    this.vendorId2 = vendorId2;
    return this;
  }

  public SampleCountriesResponse addVendorId2Item(Country vendorId2Item) {
    if (this.vendorId2 == null) {
      this.vendorId2 = new ArrayList<Country>();
    }
    this.vendorId2.add(vendorId2Item);
    return this;
  }

   /**
   * Get vendorId2
   * @return vendorId2
  **/
  @ApiModelProperty(value = "")
  public List<Country> getVendorId2() {
    return vendorId2;
  }

  public void setVendorId2(List<Country> vendorId2) {
    this.vendorId2 = vendorId2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleCountriesResponse sampleCountriesResponse = (SampleCountriesResponse) o;
    return Objects.equals(this.vendorId1, sampleCountriesResponse.vendorId1) &&
        Objects.equals(this.vendorId2, sampleCountriesResponse.vendorId2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId1, vendorId2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleCountriesResponse {\n");
    
    sb.append("    vendorId1: ").append(toIndentedString(vendorId1)).append("\n");
    sb.append("    vendorId2: ").append(toIndentedString(vendorId2)).append("\n");
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

}


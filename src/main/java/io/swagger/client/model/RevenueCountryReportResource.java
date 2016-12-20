/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
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
public class RevenueCountryReportResource {
  
  @SerializedName("country")
  private String country = null;
  @SerializedName("revenue")
  private Double revenue = null;
  @SerializedName("volume")
  private Long volume = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getRevenue() {
    return revenue;
  }
  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getVolume() {
    return volume;
  }
  public void setVolume(Long volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueCountryReportResource revenueCountryReportResource = (RevenueCountryReportResource) o;
    return (this.country == null ? revenueCountryReportResource.country == null : this.country.equals(revenueCountryReportResource.country)) &&
        (this.revenue == null ? revenueCountryReportResource.revenue == null : this.revenue.equals(revenueCountryReportResource.revenue)) &&
        (this.volume == null ? revenueCountryReportResource.volume == null : this.volume.equals(revenueCountryReportResource.volume));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.revenue == null ? 0: this.revenue.hashCode());
    result = 31 * result + (this.volume == null ? 0: this.volume.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueCountryReportResource {\n");
    
    sb.append("  country: ").append(country).append("\n");
    sb.append("  revenue: ").append(revenue).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

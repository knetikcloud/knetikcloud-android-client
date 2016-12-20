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
public class RevenueReportResource {
  
  @SerializedName("customer_count")
  private Long customerCount = null;
  @SerializedName("sale_count")
  private Long saleCount = null;
  @SerializedName("sales_average")
  private Double salesAverage = null;
  @SerializedName("sales_total")
  private Double salesTotal = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCustomerCount() {
    return customerCount;
  }
  public void setCustomerCount(Long customerCount) {
    this.customerCount = customerCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getSaleCount() {
    return saleCount;
  }
  public void setSaleCount(Long saleCount) {
    this.saleCount = saleCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSalesAverage() {
    return salesAverage;
  }
  public void setSalesAverage(Double salesAverage) {
    this.salesAverage = salesAverage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSalesTotal() {
    return salesTotal;
  }
  public void setSalesTotal(Double salesTotal) {
    this.salesTotal = salesTotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueReportResource revenueReportResource = (RevenueReportResource) o;
    return (this.customerCount == null ? revenueReportResource.customerCount == null : this.customerCount.equals(revenueReportResource.customerCount)) &&
        (this.saleCount == null ? revenueReportResource.saleCount == null : this.saleCount.equals(revenueReportResource.saleCount)) &&
        (this.salesAverage == null ? revenueReportResource.salesAverage == null : this.salesAverage.equals(revenueReportResource.salesAverage)) &&
        (this.salesTotal == null ? revenueReportResource.salesTotal == null : this.salesTotal.equals(revenueReportResource.salesTotal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.customerCount == null ? 0: this.customerCount.hashCode());
    result = 31 * result + (this.saleCount == null ? 0: this.saleCount.hashCode());
    result = 31 * result + (this.salesAverage == null ? 0: this.salesAverage.hashCode());
    result = 31 * result + (this.salesTotal == null ? 0: this.salesTotal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueReportResource {\n");
    
    sb.append("  customerCount: ").append(customerCount).append("\n");
    sb.append("  saleCount: ").append(saleCount).append("\n");
    sb.append("  salesAverage: ").append(salesAverage).append("\n");
    sb.append("  salesTotal: ").append(salesTotal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
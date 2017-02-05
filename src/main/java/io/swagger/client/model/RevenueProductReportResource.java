/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
public class RevenueProductReportResource {
  
  @SerializedName("item_id")
  private Integer itemId = null;
  @SerializedName("item_name")
  private String itemName = null;
  @SerializedName("revenue")
  private Double revenue = null;
  @SerializedName("volume")
  private Long volume = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getItemId() {
    return itemId;
  }
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
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
    RevenueProductReportResource revenueProductReportResource = (RevenueProductReportResource) o;
    return (this.itemId == null ? revenueProductReportResource.itemId == null : this.itemId.equals(revenueProductReportResource.itemId)) &&
        (this.itemName == null ? revenueProductReportResource.itemName == null : this.itemName.equals(revenueProductReportResource.itemName)) &&
        (this.revenue == null ? revenueProductReportResource.revenue == null : this.revenue.equals(revenueProductReportResource.revenue)) &&
        (this.volume == null ? revenueProductReportResource.volume == null : this.volume.equals(revenueProductReportResource.volume));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    result = 31 * result + (this.itemName == null ? 0: this.itemName.hashCode());
    result = 31 * result + (this.revenue == null ? 0: this.revenue.hashCode());
    result = 31 * result + (this.volume == null ? 0: this.volume.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueProductReportResource {\n");
    
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("  itemName: ").append(itemName).append("\n");
    sb.append("  revenue: ").append(revenue).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

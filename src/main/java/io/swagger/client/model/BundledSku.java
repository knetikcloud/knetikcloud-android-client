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
public class BundledSku {
  
  @SerializedName("price_override")
  private Double priceOverride = null;
  @SerializedName("quantity")
  private Integer quantity = null;
  @SerializedName("sku")
  private String sku = null;

  /**
   * The amount this item will cost inside the bundle instead of its regular price
   **/
  @ApiModelProperty(value = "The amount this item will cost inside the bundle instead of its regular price")
  public Double getPriceOverride() {
    return priceOverride;
  }
  public void setPriceOverride(Double priceOverride) {
    this.priceOverride = priceOverride;
  }

  /**
   * The quantity of this item within the bundle
   **/
  @ApiModelProperty(required = true, value = "The quantity of this item within the bundle")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The stock keeping unit (SKU) for an item included in the bundle
   **/
  @ApiModelProperty(required = true, value = "The stock keeping unit (SKU) for an item included in the bundle")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledSku bundledSku = (BundledSku) o;
    return (this.priceOverride == null ? bundledSku.priceOverride == null : this.priceOverride.equals(bundledSku.priceOverride)) &&
        (this.quantity == null ? bundledSku.quantity == null : this.quantity.equals(bundledSku.quantity)) &&
        (this.sku == null ? bundledSku.sku == null : this.sku.equals(bundledSku.sku));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.priceOverride == null ? 0: this.priceOverride.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledSku {\n");
    
    sb.append("  priceOverride: ").append(priceOverride).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

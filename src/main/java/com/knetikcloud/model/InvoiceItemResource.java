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
public class InvoiceItemResource {
  
  @SerializedName("bundle_sku")
  private String bundleSku = null;
  @SerializedName("current_fulfillment_status")
  private String currentFulfillmentStatus = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("invoice_id")
  private Integer invoiceId = null;
  @SerializedName("item_id")
  private Integer itemId = null;
  @SerializedName("item_name")
  private String itemName = null;
  @SerializedName("original_total_price")
  private Double originalTotalPrice = null;
  @SerializedName("original_unit_price")
  private Double originalUnitPrice = null;
  @SerializedName("qty")
  private Integer qty = null;
  @SerializedName("sale_name")
  private String saleName = null;
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("sku_description")
  private String skuDescription = null;
  @SerializedName("system_price")
  private Double systemPrice = null;
  @SerializedName("total_price")
  private Double totalPrice = null;
  @SerializedName("type_hint")
  private String typeHint = null;
  @SerializedName("unit_price")
  private Double unitPrice = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBundleSku() {
    return bundleSku;
  }
  public void setBundleSku(String bundleSku) {
    this.bundleSku = bundleSku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrentFulfillmentStatus() {
    return currentFulfillmentStatus;
  }
  public void setCurrentFulfillmentStatus(String currentFulfillmentStatus) {
    this.currentFulfillmentStatus = currentFulfillmentStatus;
  }

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
  public Integer getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

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
  public Double getOriginalTotalPrice() {
    return originalTotalPrice;
  }
  public void setOriginalTotalPrice(Double originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getOriginalUnitPrice() {
    return originalUnitPrice;
  }
  public void setOriginalUnitPrice(Double originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getQty() {
    return qty;
  }
  public void setQty(Integer qty) {
    this.qty = qty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSaleName() {
    return saleName;
  }
  public void setSaleName(String saleName) {
    this.saleName = saleName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSkuDescription() {
    return skuDescription;
  }
  public void setSkuDescription(String skuDescription) {
    this.skuDescription = skuDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSystemPrice() {
    return systemPrice;
  }
  public void setSystemPrice(Double systemPrice) {
    this.systemPrice = systemPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTotalPrice() {
    return totalPrice;
  }
  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTypeHint() {
    return typeHint;
  }
  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItemResource invoiceItemResource = (InvoiceItemResource) o;
    return (this.bundleSku == null ? invoiceItemResource.bundleSku == null : this.bundleSku.equals(invoiceItemResource.bundleSku)) &&
        (this.currentFulfillmentStatus == null ? invoiceItemResource.currentFulfillmentStatus == null : this.currentFulfillmentStatus.equals(invoiceItemResource.currentFulfillmentStatus)) &&
        (this.id == null ? invoiceItemResource.id == null : this.id.equals(invoiceItemResource.id)) &&
        (this.invoiceId == null ? invoiceItemResource.invoiceId == null : this.invoiceId.equals(invoiceItemResource.invoiceId)) &&
        (this.itemId == null ? invoiceItemResource.itemId == null : this.itemId.equals(invoiceItemResource.itemId)) &&
        (this.itemName == null ? invoiceItemResource.itemName == null : this.itemName.equals(invoiceItemResource.itemName)) &&
        (this.originalTotalPrice == null ? invoiceItemResource.originalTotalPrice == null : this.originalTotalPrice.equals(invoiceItemResource.originalTotalPrice)) &&
        (this.originalUnitPrice == null ? invoiceItemResource.originalUnitPrice == null : this.originalUnitPrice.equals(invoiceItemResource.originalUnitPrice)) &&
        (this.qty == null ? invoiceItemResource.qty == null : this.qty.equals(invoiceItemResource.qty)) &&
        (this.saleName == null ? invoiceItemResource.saleName == null : this.saleName.equals(invoiceItemResource.saleName)) &&
        (this.sku == null ? invoiceItemResource.sku == null : this.sku.equals(invoiceItemResource.sku)) &&
        (this.skuDescription == null ? invoiceItemResource.skuDescription == null : this.skuDescription.equals(invoiceItemResource.skuDescription)) &&
        (this.systemPrice == null ? invoiceItemResource.systemPrice == null : this.systemPrice.equals(invoiceItemResource.systemPrice)) &&
        (this.totalPrice == null ? invoiceItemResource.totalPrice == null : this.totalPrice.equals(invoiceItemResource.totalPrice)) &&
        (this.typeHint == null ? invoiceItemResource.typeHint == null : this.typeHint.equals(invoiceItemResource.typeHint)) &&
        (this.unitPrice == null ? invoiceItemResource.unitPrice == null : this.unitPrice.equals(invoiceItemResource.unitPrice));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bundleSku == null ? 0: this.bundleSku.hashCode());
    result = 31 * result + (this.currentFulfillmentStatus == null ? 0: this.currentFulfillmentStatus.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.invoiceId == null ? 0: this.invoiceId.hashCode());
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    result = 31 * result + (this.itemName == null ? 0: this.itemName.hashCode());
    result = 31 * result + (this.originalTotalPrice == null ? 0: this.originalTotalPrice.hashCode());
    result = 31 * result + (this.originalUnitPrice == null ? 0: this.originalUnitPrice.hashCode());
    result = 31 * result + (this.qty == null ? 0: this.qty.hashCode());
    result = 31 * result + (this.saleName == null ? 0: this.saleName.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.skuDescription == null ? 0: this.skuDescription.hashCode());
    result = 31 * result + (this.systemPrice == null ? 0: this.systemPrice.hashCode());
    result = 31 * result + (this.totalPrice == null ? 0: this.totalPrice.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    result = 31 * result + (this.unitPrice == null ? 0: this.unitPrice.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItemResource {\n");
    
    sb.append("  bundleSku: ").append(bundleSku).append("\n");
    sb.append("  currentFulfillmentStatus: ").append(currentFulfillmentStatus).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("  itemName: ").append(itemName).append("\n");
    sb.append("  originalTotalPrice: ").append(originalTotalPrice).append("\n");
    sb.append("  originalUnitPrice: ").append(originalUnitPrice).append("\n");
    sb.append("  qty: ").append(qty).append("\n");
    sb.append("  saleName: ").append(saleName).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  skuDescription: ").append(skuDescription).append("\n");
    sb.append("  systemPrice: ").append(systemPrice).append("\n");
    sb.append("  totalPrice: ").append(totalPrice).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("  unitPrice: ").append(unitPrice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

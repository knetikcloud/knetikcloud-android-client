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
import com.knetikcloud.model.Discount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InvoiceItemResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:07:11.101-04:00")
public class InvoiceItemResource {
  @SerializedName("bundle_sku")
  private String bundleSku = null;

  @SerializedName("current_fulfillment_status")
  private String currentFulfillmentStatus = null;

  @SerializedName("discount")
  private Discount discount = null;

  @SerializedName("gift_target")
  private Integer giftTarget = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("item_id")
  private Integer itemId = null;

  @SerializedName("item_name")
  private String itemName = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("original_total_price")
  private BigDecimal originalTotalPrice = null;

  @SerializedName("original_unit_price")
  private BigDecimal originalUnitPrice = null;

  @SerializedName("qty")
  private Integer qty = null;

  @SerializedName("sale_name")
  private String saleName = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("sku_description")
  private String skuDescription = null;

  @SerializedName("system_price")
  private BigDecimal systemPrice = null;

  @SerializedName("total_price")
  private BigDecimal totalPrice = null;

  @SerializedName("type_hint")
  private String typeHint = null;

  @SerializedName("unit_price")
  private BigDecimal unitPrice = null;

  public InvoiceItemResource bundleSku(String bundleSku) {
    this.bundleSku = bundleSku;
    return this;
  }

   /**
   * Get bundleSku
   * @return bundleSku
  **/
  @ApiModelProperty(value = "")
  public String getBundleSku() {
    return bundleSku;
  }

  public void setBundleSku(String bundleSku) {
    this.bundleSku = bundleSku;
  }

  public InvoiceItemResource currentFulfillmentStatus(String currentFulfillmentStatus) {
    this.currentFulfillmentStatus = currentFulfillmentStatus;
    return this;
  }

   /**
   * Get currentFulfillmentStatus
   * @return currentFulfillmentStatus
  **/
  @ApiModelProperty(value = "")
  public String getCurrentFulfillmentStatus() {
    return currentFulfillmentStatus;
  }

  public void setCurrentFulfillmentStatus(String currentFulfillmentStatus) {
    this.currentFulfillmentStatus = currentFulfillmentStatus;
  }

  public InvoiceItemResource discount(Discount discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public InvoiceItemResource giftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
    return this;
  }

   /**
   * Get giftTarget
   * @return giftTarget
  **/
  @ApiModelProperty(value = "")
  public Integer getGiftTarget() {
    return giftTarget;
  }

  public void setGiftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
  }

  public InvoiceItemResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InvoiceItemResource invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @ApiModelProperty(value = "")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public InvoiceItemResource itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public InvoiceItemResource itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @ApiModelProperty(value = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public InvoiceItemResource notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public InvoiceItemResource originalTotalPrice(BigDecimal originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
    return this;
  }

   /**
   * Get originalTotalPrice
   * @return originalTotalPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOriginalTotalPrice() {
    return originalTotalPrice;
  }

  public void setOriginalTotalPrice(BigDecimal originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
  }

  public InvoiceItemResource originalUnitPrice(BigDecimal originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
    return this;
  }

   /**
   * Get originalUnitPrice
   * @return originalUnitPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(BigDecimal originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  public InvoiceItemResource qty(Integer qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public InvoiceItemResource saleName(String saleName) {
    this.saleName = saleName;
    return this;
  }

   /**
   * Get saleName
   * @return saleName
  **/
  @ApiModelProperty(value = "")
  public String getSaleName() {
    return saleName;
  }

  public void setSaleName(String saleName) {
    this.saleName = saleName;
  }

  public InvoiceItemResource sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public InvoiceItemResource skuDescription(String skuDescription) {
    this.skuDescription = skuDescription;
    return this;
  }

   /**
   * Get skuDescription
   * @return skuDescription
  **/
  @ApiModelProperty(value = "")
  public String getSkuDescription() {
    return skuDescription;
  }

  public void setSkuDescription(String skuDescription) {
    this.skuDescription = skuDescription;
  }

  public InvoiceItemResource systemPrice(BigDecimal systemPrice) {
    this.systemPrice = systemPrice;
    return this;
  }

   /**
   * Get systemPrice
   * @return systemPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSystemPrice() {
    return systemPrice;
  }

  public void setSystemPrice(BigDecimal systemPrice) {
    this.systemPrice = systemPrice;
  }

  public InvoiceItemResource totalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }

  public InvoiceItemResource typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * Get typeHint
   * @return typeHint
  **/
  @ApiModelProperty(value = "")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public InvoiceItemResource unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItemResource invoiceItemResource = (InvoiceItemResource) o;
    return Objects.equals(this.bundleSku, invoiceItemResource.bundleSku) &&
        Objects.equals(this.currentFulfillmentStatus, invoiceItemResource.currentFulfillmentStatus) &&
        Objects.equals(this.discount, invoiceItemResource.discount) &&
        Objects.equals(this.giftTarget, invoiceItemResource.giftTarget) &&
        Objects.equals(this.id, invoiceItemResource.id) &&
        Objects.equals(this.invoiceId, invoiceItemResource.invoiceId) &&
        Objects.equals(this.itemId, invoiceItemResource.itemId) &&
        Objects.equals(this.itemName, invoiceItemResource.itemName) &&
        Objects.equals(this.notes, invoiceItemResource.notes) &&
        Objects.equals(this.originalTotalPrice, invoiceItemResource.originalTotalPrice) &&
        Objects.equals(this.originalUnitPrice, invoiceItemResource.originalUnitPrice) &&
        Objects.equals(this.qty, invoiceItemResource.qty) &&
        Objects.equals(this.saleName, invoiceItemResource.saleName) &&
        Objects.equals(this.sku, invoiceItemResource.sku) &&
        Objects.equals(this.skuDescription, invoiceItemResource.skuDescription) &&
        Objects.equals(this.systemPrice, invoiceItemResource.systemPrice) &&
        Objects.equals(this.totalPrice, invoiceItemResource.totalPrice) &&
        Objects.equals(this.typeHint, invoiceItemResource.typeHint) &&
        Objects.equals(this.unitPrice, invoiceItemResource.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleSku, currentFulfillmentStatus, discount, giftTarget, id, invoiceId, itemId, itemName, notes, originalTotalPrice, originalUnitPrice, qty, saleName, sku, skuDescription, systemPrice, totalPrice, typeHint, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItemResource {\n");
    
    sb.append("    bundleSku: ").append(toIndentedString(bundleSku)).append("\n");
    sb.append("    currentFulfillmentStatus: ").append(toIndentedString(currentFulfillmentStatus)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    giftTarget: ").append(toIndentedString(giftTarget)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    originalTotalPrice: ").append(toIndentedString(originalTotalPrice)).append("\n");
    sb.append("    originalUnitPrice: ").append(toIndentedString(originalUnitPrice)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    saleName: ").append(toIndentedString(saleName)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    skuDescription: ").append(toIndentedString(skuDescription)).append("\n");
    sb.append("    systemPrice: ").append(toIndentedString(systemPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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


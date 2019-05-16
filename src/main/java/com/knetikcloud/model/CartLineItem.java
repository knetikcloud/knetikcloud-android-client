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
import java.util.ArrayList;
import java.util.List;

/**
 * CartLineItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:07:11.101-04:00")
public class CartLineItem {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("discount")
  private Discount discount = null;

  @SerializedName("gift_target")
  private Integer giftTarget = null;

  @SerializedName("line_total")
  private BigDecimal lineTotal = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("original_line_total")
  private BigDecimal originalLineTotal = null;

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

  @SerializedName("store_item_id")
  private Integer storeItemId = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("thumb_url")
  private String thumbUrl = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("unit_price")
  private BigDecimal unitPrice = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  public CartLineItem currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CartLineItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CartLineItem discount(Discount discount) {
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

  public CartLineItem giftTarget(Integer giftTarget) {
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

  public CartLineItem lineTotal(BigDecimal lineTotal) {
    this.lineTotal = lineTotal;
    return this;
  }

   /**
   * Get lineTotal
   * @return lineTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLineTotal() {
    return lineTotal;
  }

  public void setLineTotal(BigDecimal lineTotal) {
    this.lineTotal = lineTotal;
  }

  public CartLineItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CartLineItem notes(String notes) {
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

  public CartLineItem originalLineTotal(BigDecimal originalLineTotal) {
    this.originalLineTotal = originalLineTotal;
    return this;
  }

   /**
   * Get originalLineTotal
   * @return originalLineTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOriginalLineTotal() {
    return originalLineTotal;
  }

  public void setOriginalLineTotal(BigDecimal originalLineTotal) {
    this.originalLineTotal = originalLineTotal;
  }

  public CartLineItem originalUnitPrice(BigDecimal originalUnitPrice) {
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

  public CartLineItem qty(Integer qty) {
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

  public CartLineItem saleName(String saleName) {
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

  public CartLineItem sku(String sku) {
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

  public CartLineItem skuDescription(String skuDescription) {
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

  public CartLineItem storeItemId(Integer storeItemId) {
    this.storeItemId = storeItemId;
    return this;
  }

   /**
   * Get storeItemId
   * @return storeItemId
  **/
  @ApiModelProperty(value = "")
  public Integer getStoreItemId() {
    return storeItemId;
  }

  public void setStoreItemId(Integer storeItemId) {
    this.storeItemId = storeItemId;
  }

  public CartLineItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CartLineItem addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CartLineItem thumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
    return this;
  }

   /**
   * Get thumbUrl
   * @return thumbUrl
  **/
  @ApiModelProperty(value = "")
  public String getThumbUrl() {
    return thumbUrl;
  }

  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }

  public CartLineItem uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * Get uniqueKey
   * @return uniqueKey
  **/
  @ApiModelProperty(value = "")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public CartLineItem unitPrice(BigDecimal unitPrice) {
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

  public CartLineItem vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(value = "")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public CartLineItem vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(value = "")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartLineItem cartLineItem = (CartLineItem) o;
    return Objects.equals(this.currencyCode, cartLineItem.currencyCode) &&
        Objects.equals(this.description, cartLineItem.description) &&
        Objects.equals(this.discount, cartLineItem.discount) &&
        Objects.equals(this.giftTarget, cartLineItem.giftTarget) &&
        Objects.equals(this.lineTotal, cartLineItem.lineTotal) &&
        Objects.equals(this.name, cartLineItem.name) &&
        Objects.equals(this.notes, cartLineItem.notes) &&
        Objects.equals(this.originalLineTotal, cartLineItem.originalLineTotal) &&
        Objects.equals(this.originalUnitPrice, cartLineItem.originalUnitPrice) &&
        Objects.equals(this.qty, cartLineItem.qty) &&
        Objects.equals(this.saleName, cartLineItem.saleName) &&
        Objects.equals(this.sku, cartLineItem.sku) &&
        Objects.equals(this.skuDescription, cartLineItem.skuDescription) &&
        Objects.equals(this.storeItemId, cartLineItem.storeItemId) &&
        Objects.equals(this.tags, cartLineItem.tags) &&
        Objects.equals(this.thumbUrl, cartLineItem.thumbUrl) &&
        Objects.equals(this.uniqueKey, cartLineItem.uniqueKey) &&
        Objects.equals(this.unitPrice, cartLineItem.unitPrice) &&
        Objects.equals(this.vendorId, cartLineItem.vendorId) &&
        Objects.equals(this.vendorName, cartLineItem.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, description, discount, giftTarget, lineTotal, name, notes, originalLineTotal, originalUnitPrice, qty, saleName, sku, skuDescription, storeItemId, tags, thumbUrl, uniqueKey, unitPrice, vendorId, vendorName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartLineItem {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    giftTarget: ").append(toIndentedString(giftTarget)).append("\n");
    sb.append("    lineTotal: ").append(toIndentedString(lineTotal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    originalLineTotal: ").append(toIndentedString(originalLineTotal)).append("\n");
    sb.append("    originalUnitPrice: ").append(toIndentedString(originalUnitPrice)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    saleName: ").append(toIndentedString(saleName)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    skuDescription: ").append(toIndentedString(skuDescription)).append("\n");
    sb.append("    storeItemId: ").append(toIndentedString(storeItemId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbUrl: ").append(toIndentedString(thumbUrl)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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


/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
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
public class CatalogSale {
  
  @SerializedName("currency_code")
  private String currencyCode = null;
  public enum DiscountTypeEnum {
     value,  percentage, 
  };
  @SerializedName("discount_type")
  private DiscountTypeEnum discountType = null;
  @SerializedName("discount_value")
  private Double discountValue = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("item")
  private Integer item = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("sale_end_date")
  private Long saleEndDate = null;
  @SerializedName("sale_start_date")
  private Long saleStartDate = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("tag")
  private String tag = null;
  @SerializedName("vendor")
  private Integer vendor = null;

  /**
   * The iso3 code for the currency for this discountValue.  The sku purchased will have to match for it this sale to apply
   **/
  @ApiModelProperty(required = true, value = "The iso3 code for the currency for this discountValue.  The sku purchased will have to match for it this sale to apply")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The way in which the price is reduced. 'value' means subtracting directly, 'percentage' means subtracting by the price times the discountValue (1.0 == 100%)
   **/
  @ApiModelProperty(required = true, value = "The way in which the price is reduced. 'value' means subtracting directly, 'percentage' means subtracting by the price times the discountValue (1.0 == 100%)")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }
  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  /**
   * The amount deducted from the price, in the same currencyCode as the item
   **/
  @ApiModelProperty(value = "The amount deducted from the price, in the same currencyCode as the item")
  public Double getDiscountValue() {
    return discountValue;
  }
  public void setDiscountValue(Double discountValue) {
    this.discountValue = discountValue;
  }

  /**
   * The id of the sale
   **/
  @ApiModelProperty(value = "The id of the sale")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The id of the item this sale applies to.  Leave null to use other filters
   **/
  @ApiModelProperty(value = "The id of the item this sale applies to.  Leave null to use other filters")
  public Integer getItem() {
    return item;
  }
  public void setItem(Integer item) {
    this.item = item;
  }

  /**
   * The long description of the sale
   **/
  @ApiModelProperty(value = "The long description of the sale")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * The name of the sale.  Max 40 characters
   **/
  @ApiModelProperty(required = true, value = "The name of the sale.  Max 40 characters")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The date the sale ends, null for never.  Unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date the sale ends, null for never.  Unix timestamp in seconds")
  public Long getSaleEndDate() {
    return saleEndDate;
  }
  public void setSaleEndDate(Long saleEndDate) {
    this.saleEndDate = saleEndDate;
  }

  /**
   * The date the sale begins.  Unix timestamp in seconds
   **/
  @ApiModelProperty(required = true, value = "The date the sale begins.  Unix timestamp in seconds")
  public Long getSaleStartDate() {
    return saleStartDate;
  }
  public void setSaleStartDate(Long saleStartDate) {
    this.saleStartDate = saleStartDate;
  }

  /**
   * The short description of the sale.  Max 140 characters
   **/
  @ApiModelProperty(value = "The short description of the sale.  Max 140 characters")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * The tag this sale applies to.  Leave null to skip this filter (applies to all tags)
   **/
  @ApiModelProperty(value = "The tag this sale applies to.  Leave null to skip this filter (applies to all tags)")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * The id of the vendor this sale applies to.  Leave null to skip this filter (applies to all vendors)
   **/
  @ApiModelProperty(value = "The id of the vendor this sale applies to.  Leave null to skip this filter (applies to all vendors)")
  public Integer getVendor() {
    return vendor;
  }
  public void setVendor(Integer vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogSale catalogSale = (CatalogSale) o;
    return (this.currencyCode == null ? catalogSale.currencyCode == null : this.currencyCode.equals(catalogSale.currencyCode)) &&
        (this.discountType == null ? catalogSale.discountType == null : this.discountType.equals(catalogSale.discountType)) &&
        (this.discountValue == null ? catalogSale.discountValue == null : this.discountValue.equals(catalogSale.discountValue)) &&
        (this.id == null ? catalogSale.id == null : this.id.equals(catalogSale.id)) &&
        (this.item == null ? catalogSale.item == null : this.item.equals(catalogSale.item)) &&
        (this.longDescription == null ? catalogSale.longDescription == null : this.longDescription.equals(catalogSale.longDescription)) &&
        (this.name == null ? catalogSale.name == null : this.name.equals(catalogSale.name)) &&
        (this.saleEndDate == null ? catalogSale.saleEndDate == null : this.saleEndDate.equals(catalogSale.saleEndDate)) &&
        (this.saleStartDate == null ? catalogSale.saleStartDate == null : this.saleStartDate.equals(catalogSale.saleStartDate)) &&
        (this.shortDescription == null ? catalogSale.shortDescription == null : this.shortDescription.equals(catalogSale.shortDescription)) &&
        (this.tag == null ? catalogSale.tag == null : this.tag.equals(catalogSale.tag)) &&
        (this.vendor == null ? catalogSale.vendor == null : this.vendor.equals(catalogSale.vendor));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currencyCode == null ? 0: this.currencyCode.hashCode());
    result = 31 * result + (this.discountType == null ? 0: this.discountType.hashCode());
    result = 31 * result + (this.discountValue == null ? 0: this.discountValue.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.item == null ? 0: this.item.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.saleEndDate == null ? 0: this.saleEndDate.hashCode());
    result = 31 * result + (this.saleStartDate == null ? 0: this.saleStartDate.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.tag == null ? 0: this.tag.hashCode());
    result = 31 * result + (this.vendor == null ? 0: this.vendor.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogSale {\n");
    
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  discountType: ").append(discountType).append("\n");
    sb.append("  discountValue: ").append(discountValue).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  item: ").append(item).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  saleEndDate: ").append(saleEndDate).append("\n");
    sb.append("  saleStartDate: ").append(saleStartDate).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  tag: ").append(tag).append("\n");
    sb.append("  vendor: ").append(vendor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

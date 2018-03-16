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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * RefundRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T11:20:39.188-04:00")
public class RefundRequest {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("bundle_sku")
  private String bundleSku = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("sku")
  private String sku = null;

  public RefundRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount to refund. If left off, will refund the remaining balance of the transaction or specific item balance (if SKU provided), whichever is less.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount to refund. If left off, will refund the remaining balance of the transaction or specific item balance (if SKU provided), whichever is less.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public RefundRequest bundleSku(String bundleSku) {
    this.bundleSku = bundleSku;
    return this;
  }

   /**
   * The SKU of a bundle item from the invoice that the target item is within.
   * @return bundleSku
  **/
  @ApiModelProperty(value = "The SKU of a bundle item from the invoice that the target item is within.")
  public String getBundleSku() {
    return bundleSku;
  }

  public void setBundleSku(String bundleSku) {
    this.bundleSku = bundleSku;
  }

  public RefundRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes about or reason for the refund
   * @return notes
  **/
  @ApiModelProperty(required = true, value = "Notes about or reason for the refund")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public RefundRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The SKU of a specific item from the invoice to refund. Affects the maximum refund amount (not to exceed the price of this item times quantity on invoice). Transaction must be tied to an invoice if used.
   * @return sku
  **/
  @ApiModelProperty(value = "The SKU of a specific item from the invoice to refund. Affects the maximum refund amount (not to exceed the price of this item times quantity on invoice). Transaction must be tied to an invoice if used.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRequest refundRequest = (RefundRequest) o;
    return Objects.equals(this.amount, refundRequest.amount) &&
        Objects.equals(this.bundleSku, refundRequest.bundleSku) &&
        Objects.equals(this.notes, refundRequest.notes) &&
        Objects.equals(this.sku, refundRequest.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bundleSku, notes, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bundleSku: ").append(toIndentedString(bundleSku)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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


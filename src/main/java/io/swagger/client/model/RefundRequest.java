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
public class RefundRequest {
  
  @SerializedName("amount")
  private Double amount = null;
  @SerializedName("notes")
  private String notes = null;
  @SerializedName("sku")
  private String sku = null;

  /**
   * The amount to refund. If left off, will refund the remaining balance of the transaction or specific item balance (if SKU provided), whichever is less.
   **/
  @ApiModelProperty(value = "The amount to refund. If left off, will refund the remaining balance of the transaction or specific item balance (if SKU provided), whichever is less.")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * Notes about or reason for the refund
   **/
  @ApiModelProperty(required = true, value = "Notes about or reason for the refund")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * The SKU of a specific item from the invoice to refund. Affects the maximum refund amount (not to exceed the price of this item times quantity on invoice). Transaction must be tied to an invoice if used.
   **/
  @ApiModelProperty(value = "The SKU of a specific item from the invoice to refund. Affects the maximum refund amount (not to exceed the price of this item times quantity on invoice). Transaction must be tied to an invoice if used.")
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
    RefundRequest refundRequest = (RefundRequest) o;
    return (this.amount == null ? refundRequest.amount == null : this.amount.equals(refundRequest.amount)) &&
        (this.notes == null ? refundRequest.notes == null : this.notes.equals(refundRequest.notes)) &&
        (this.sku == null ? refundRequest.sku == null : this.sku.equals(refundRequest.sku));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

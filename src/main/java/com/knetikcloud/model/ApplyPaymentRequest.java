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

package com.knetikcloud.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ApplyPaymentRequest {
  
  @SerializedName("invoice_id")
  private Integer invoiceId = null;
  @SerializedName("receipt")
  private String receipt = null;
  @SerializedName("transaction_id")
  private String transactionId = null;

  /**
   * The id of the local invoice being paid.
   **/
  @ApiModelProperty(required = true, value = "The id of the local invoice being paid.")
  public Integer getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * The encoded receipt string from Apple's services.
   **/
  @ApiModelProperty(required = true, value = "The encoded receipt string from Apple's services.")
  public String getReceipt() {
    return receipt;
  }
  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }

  /**
   * The id of the specific transaction from Apple's services.
   **/
  @ApiModelProperty(required = true, value = "The id of the specific transaction from Apple's services.")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyPaymentRequest applyPaymentRequest = (ApplyPaymentRequest) o;
    return (this.invoiceId == null ? applyPaymentRequest.invoiceId == null : this.invoiceId.equals(applyPaymentRequest.invoiceId)) &&
        (this.receipt == null ? applyPaymentRequest.receipt == null : this.receipt.equals(applyPaymentRequest.receipt)) &&
        (this.transactionId == null ? applyPaymentRequest.transactionId == null : this.transactionId.equals(applyPaymentRequest.transactionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.invoiceId == null ? 0: this.invoiceId.hashCode());
    result = 31 * result + (this.receipt == null ? 0: this.receipt.hashCode());
    result = 31 * result + (this.transactionId == null ? 0: this.transactionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyPaymentRequest {\n");
    
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("  receipt: ").append(receipt).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
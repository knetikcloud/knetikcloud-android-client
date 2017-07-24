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
public class FinalizePayPalPaymentRequest {
  
  @SerializedName("invoice_id")
  private Integer invoiceId = null;
  @SerializedName("payer_id")
  private String payerId = null;
  @SerializedName("token")
  private String token = null;

  /**
   * The ID of the invoice that is being paid. Must match the invoice sent in originally
   **/
  @ApiModelProperty(required = true, value = "The ID of the invoice that is being paid. Must match the invoice sent in originally")
  public Integer getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * The ID of the payer that PayPal returned with the user at the return URL
   **/
  @ApiModelProperty(required = true, value = "The ID of the payer that PayPal returned with the user at the return URL")
  public String getPayerId() {
    return payerId;
  }
  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  /**
   * The token that PayPal returned with the user in the return URL
   **/
  @ApiModelProperty(required = true, value = "The token that PayPal returned with the user in the return URL")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalizePayPalPaymentRequest finalizePayPalPaymentRequest = (FinalizePayPalPaymentRequest) o;
    return (this.invoiceId == null ? finalizePayPalPaymentRequest.invoiceId == null : this.invoiceId.equals(finalizePayPalPaymentRequest.invoiceId)) &&
        (this.payerId == null ? finalizePayPalPaymentRequest.payerId == null : this.payerId.equals(finalizePayPalPaymentRequest.payerId)) &&
        (this.token == null ? finalizePayPalPaymentRequest.token == null : this.token.equals(finalizePayPalPaymentRequest.token));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.invoiceId == null ? 0: this.invoiceId.hashCode());
    result = 31 * result + (this.payerId == null ? 0: this.payerId.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizePayPalPaymentRequest {\n");
    
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("  payerId: ").append(payerId).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

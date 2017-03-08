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
public class InvoicePaymentStatusRequest {
  
  @SerializedName("payment_method_id")
  private Integer paymentMethodId = null;
  @SerializedName("status")
  private String status = null;

  /**
   * If included, will set the payment method used on the invoice
   **/
  @ApiModelProperty(value = "If included, will set the payment method used on the invoice")
  public Integer getPaymentMethodId() {
    return paymentMethodId;
  }
  public void setPaymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  /**
   * The new status for the invoice. Additional options may be available based on configuration.  Allowable values: 'new', 'paid', 'hold', 'canceled', 'payment failed', 'partial refund', 'refund'
   **/
  @ApiModelProperty(required = true, value = "The new status for the invoice. Additional options may be available based on configuration.  Allowable values: 'new', 'paid', 'hold', 'canceled', 'payment failed', 'partial refund', 'refund'")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePaymentStatusRequest invoicePaymentStatusRequest = (InvoicePaymentStatusRequest) o;
    return (this.paymentMethodId == null ? invoicePaymentStatusRequest.paymentMethodId == null : this.paymentMethodId.equals(invoicePaymentStatusRequest.paymentMethodId)) &&
        (this.status == null ? invoicePaymentStatusRequest.status == null : this.status.equals(invoicePaymentStatusRequest.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.paymentMethodId == null ? 0: this.paymentMethodId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePaymentStatusRequest {\n");
    
    sb.append("  paymentMethodId: ").append(paymentMethodId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

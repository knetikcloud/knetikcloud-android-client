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

/**
 * InvoicePaymentStatusRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-31T16:19:51.285-05:00")
public class InvoicePaymentStatusRequest {
  @SerializedName("payment_method_id")
  private Integer paymentMethodId = null;

  @SerializedName("status")
  private String status = null;

  public InvoicePaymentStatusRequest paymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * If included, will set the payment method used on the invoice
   * @return paymentMethodId
  **/
  @ApiModelProperty(value = "If included, will set the payment method used on the invoice")
  public Integer getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public InvoicePaymentStatusRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The new status for the invoice. Additional options may be available based on configuration.  Allowable values: &#39;new&#39;, &#39;paid&#39;, &#39;hold&#39;, &#39;canceled&#39;, &#39;payment failed&#39;, &#39;partial refund&#39;, &#39;refund&#39;
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The new status for the invoice. Additional options may be available based on configuration.  Allowable values: 'new', 'paid', 'hold', 'canceled', 'payment failed', 'partial refund', 'refund'")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePaymentStatusRequest invoicePaymentStatusRequest = (InvoicePaymentStatusRequest) o;
    return Objects.equals(this.paymentMethodId, invoicePaymentStatusRequest.paymentMethodId) &&
        Objects.equals(this.status, invoicePaymentStatusRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePaymentStatusRequest {\n");
    
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


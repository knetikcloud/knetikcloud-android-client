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
 * StripePaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T11:20:39.188-04:00")
public class StripePaymentRequest {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("token")
  private String token = null;

  public StripePaymentRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount to pay, if not the full remaining balance (leave out to pay in full, but be careful no other partial payment has been started)
   * @return amount
  **/
  @ApiModelProperty(value = "The amount to pay, if not the full remaining balance (leave out to pay in full, but be careful no other partial payment has been started)")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public StripePaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of the invoice to pay
   * @return invoiceId
  **/
  @ApiModelProperty(required = true, value = "The id of the invoice to pay")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public StripePaymentRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * A token from Stripe to identify payment info to be tied to the customer
   * @return token
  **/
  @ApiModelProperty(required = true, value = "A token from Stripe to identify payment info to be tied to the customer")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripePaymentRequest stripePaymentRequest = (StripePaymentRequest) o;
    return Objects.equals(this.amount, stripePaymentRequest.amount) &&
        Objects.equals(this.invoiceId, stripePaymentRequest.invoiceId) &&
        Objects.equals(this.token, stripePaymentRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, invoiceId, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripePaymentRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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


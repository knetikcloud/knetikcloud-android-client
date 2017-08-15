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
 * CreatePayPalPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T13:50:30.225-04:00")
public class CreatePayPalPaymentRequest {
  @SerializedName("cancel_url")
  private String cancelUrl = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  public CreatePayPalPaymentRequest cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * The endpoint URL to which PayPal should forward the user to if they cancel the checkout process
   * @return cancelUrl
  **/
  @ApiModelProperty(required = true, value = "The endpoint URL to which PayPal should forward the user to if they cancel the checkout process")
  public String getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public CreatePayPalPaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The ID of an invoice to pay
   * @return invoiceId
  **/
  @ApiModelProperty(required = true, value = "The ID of an invoice to pay")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public CreatePayPalPaymentRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The endpoint URL to which PayPal should forward the user after they accept. This endpoint will receive information needed for the next step
   * @return returnUrl
  **/
  @ApiModelProperty(required = true, value = "The endpoint URL to which PayPal should forward the user after they accept. This endpoint will receive information needed for the next step")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePayPalPaymentRequest createPayPalPaymentRequest = (CreatePayPalPaymentRequest) o;
    return Objects.equals(this.cancelUrl, createPayPalPaymentRequest.cancelUrl) &&
        Objects.equals(this.invoiceId, createPayPalPaymentRequest.invoiceId) &&
        Objects.equals(this.returnUrl, createPayPalPaymentRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelUrl, invoiceId, returnUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePayPalPaymentRequest {\n");
    
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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


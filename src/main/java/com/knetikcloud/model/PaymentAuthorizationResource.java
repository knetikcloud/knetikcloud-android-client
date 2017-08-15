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
import com.knetikcloud.model.SimpleReferenceResourceint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentAuthorizationResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T13:50:30.225-04:00")
public class PaymentAuthorizationResource {
  @SerializedName("captured")
  private Boolean captured = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("details")
  private Object details = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice")
  private Integer invoice = null;

  @SerializedName("payment_type")
  private SimpleReferenceResourceint paymentType = null;

   /**
   * Whether this authorization has been captured
   * @return captured
  **/
  @ApiModelProperty(example = "false", value = "Whether this authorization has been captured")
  public Boolean isCaptured() {
    return captured;
  }

   /**
   * The date this authorization was received, unix timestamp in seconds
   * @return created
  **/
  @ApiModelProperty(value = "The date this authorization was received, unix timestamp in seconds")
  public Long getCreated() {
    return created;
  }

  public PaymentAuthorizationResource details(Object details) {
    this.details = details;
    return this;
  }

   /**
   * The details for this authorization. Format dependent on payment provider
   * @return details
  **/
  @ApiModelProperty(value = "The details for this authorization. Format dependent on payment provider")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

   /**
   * The id of the authorization
   * @return id
  **/
  @ApiModelProperty(value = "The id of the authorization")
  public Integer getId() {
    return id;
  }

  public PaymentAuthorizationResource invoice(Integer invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * The invoice this authorization is intended to pay
   * @return invoice
  **/
  @ApiModelProperty(value = "The invoice this authorization is intended to pay")
  public Integer getInvoice() {
    return invoice;
  }

  public void setInvoice(Integer invoice) {
    this.invoice = invoice;
  }

  public PaymentAuthorizationResource paymentType(SimpleReferenceResourceint paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The payment type (which provider) this payment is through
   * @return paymentType
  **/
  @ApiModelProperty(required = true, value = "The payment type (which provider) this payment is through")
  public SimpleReferenceResourceint getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(SimpleReferenceResourceint paymentType) {
    this.paymentType = paymentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAuthorizationResource paymentAuthorizationResource = (PaymentAuthorizationResource) o;
    return Objects.equals(this.captured, paymentAuthorizationResource.captured) &&
        Objects.equals(this.created, paymentAuthorizationResource.created) &&
        Objects.equals(this.details, paymentAuthorizationResource.details) &&
        Objects.equals(this.id, paymentAuthorizationResource.id) &&
        Objects.equals(this.invoice, paymentAuthorizationResource.invoice) &&
        Objects.equals(this.paymentType, paymentAuthorizationResource.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captured, created, details, id, invoice, paymentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAuthorizationResource {\n");
    
    sb.append("    captured: ").append(toIndentedString(captured)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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


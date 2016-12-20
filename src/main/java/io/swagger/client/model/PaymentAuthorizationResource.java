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

import io.swagger.client.model.SimpleReferenceResourceint;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
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
   **/
  @ApiModelProperty(value = "Whether this authorization has been captured")
  public Boolean getCaptured() {
    return captured;
  }
  public void setCaptured(Boolean captured) {
    this.captured = captured;
  }

  /**
   * The date this authorization was received, unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date this authorization was received, unix timestamp in seconds")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * The details for this authorization. Format dependent on payment provider
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
   **/
  @ApiModelProperty(value = "The id of the authorization")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The invoice this authorization is intended to pay
   **/
  @ApiModelProperty(value = "The invoice this authorization is intended to pay")
  public Integer getInvoice() {
    return invoice;
  }
  public void setInvoice(Integer invoice) {
    this.invoice = invoice;
  }

  /**
   * The payment type (which provider) this payment is through
   **/
  @ApiModelProperty(required = true, value = "The payment type (which provider) this payment is through")
  public SimpleReferenceResourceint getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(SimpleReferenceResourceint paymentType) {
    this.paymentType = paymentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAuthorizationResource paymentAuthorizationResource = (PaymentAuthorizationResource) o;
    return (this.captured == null ? paymentAuthorizationResource.captured == null : this.captured.equals(paymentAuthorizationResource.captured)) &&
        (this.created == null ? paymentAuthorizationResource.created == null : this.created.equals(paymentAuthorizationResource.created)) &&
        (this.details == null ? paymentAuthorizationResource.details == null : this.details.equals(paymentAuthorizationResource.details)) &&
        (this.id == null ? paymentAuthorizationResource.id == null : this.id.equals(paymentAuthorizationResource.id)) &&
        (this.invoice == null ? paymentAuthorizationResource.invoice == null : this.invoice.equals(paymentAuthorizationResource.invoice)) &&
        (this.paymentType == null ? paymentAuthorizationResource.paymentType == null : this.paymentType.equals(paymentAuthorizationResource.paymentType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.captured == null ? 0: this.captured.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.invoice == null ? 0: this.invoice.hashCode());
    result = 31 * result + (this.paymentType == null ? 0: this.paymentType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAuthorizationResource {\n");
    
    sb.append("  captured: ").append(captured).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  invoice: ").append(invoice).append("\n");
    sb.append("  paymentType: ").append(paymentType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

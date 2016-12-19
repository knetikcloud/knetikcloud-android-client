/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
public class StripePaymentRequest {
  
  @SerializedName("invoice_id")
  private Integer invoiceId = null;
  @SerializedName("token")
  private String token = null;

  /**
   * The id of the invoice to pay
   **/
  @ApiModelProperty(required = true, value = "The id of the invoice to pay")
  public Integer getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * A token from Stripe to identify payment info to be tied to the customer
   **/
  @ApiModelProperty(required = true, value = "A token from Stripe to identify payment info to be tied to the customer")
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
    StripePaymentRequest stripePaymentRequest = (StripePaymentRequest) o;
    return (this.invoiceId == null ? stripePaymentRequest.invoiceId == null : this.invoiceId.equals(stripePaymentRequest.invoiceId)) &&
        (this.token == null ? stripePaymentRequest.token == null : this.token.equals(stripePaymentRequest.token));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.invoiceId == null ? 0: this.invoiceId.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripePaymentRequest {\n");
    
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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
public class WalletAlterRequest {
  
  @SerializedName("delta")
  private Double delta = null;
  @SerializedName("invoice_id")
  private Integer invoiceId = null;
  @SerializedName("reason")
  private String reason = null;
  @SerializedName("type")
  private String type = null;

  /**
   * The amount of currency to add/remove. positive to add, negative to remove
   **/
  @ApiModelProperty(required = true, value = "The amount of currency to add/remove. positive to add, negative to remove")
  public Double getDelta() {
    return delta;
  }
  public void setDelta(Double delta) {
    this.delta = delta;
  }

  /**
   * The id of an invoice to attribute the transaction to
   **/
  @ApiModelProperty(value = "The id of an invoice to attribute the transaction to")
  public Integer getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * The admin entered or system generated reason
   **/
  @ApiModelProperty(required = true, value = "The admin entered or system generated reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The transaction type to allow for search/etc
   **/
  @ApiModelProperty(value = "The transaction type to allow for search/etc")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletAlterRequest walletAlterRequest = (WalletAlterRequest) o;
    return (this.delta == null ? walletAlterRequest.delta == null : this.delta.equals(walletAlterRequest.delta)) &&
        (this.invoiceId == null ? walletAlterRequest.invoiceId == null : this.invoiceId.equals(walletAlterRequest.invoiceId)) &&
        (this.reason == null ? walletAlterRequest.reason == null : this.reason.equals(walletAlterRequest.reason)) &&
        (this.type == null ? walletAlterRequest.type == null : this.type.equals(walletAlterRequest.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.delta == null ? 0: this.delta.hashCode());
    result = 31 * result + (this.invoiceId == null ? 0: this.invoiceId.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletAlterRequest {\n");
    
    sb.append("  delta: ").append(delta).append("\n");
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

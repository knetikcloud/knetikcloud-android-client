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
public class TransactionResource {
  
  @SerializedName("create_date")
  private Long createDate = null;
  @SerializedName("currency_code")
  private String currencyCode = null;
  @SerializedName("details")
  private String details = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("invoice_id")
  private Integer invoiceId = null;
  @SerializedName("is_refunded")
  private Boolean isRefunded = null;
  @SerializedName("response")
  private String response = null;
  public enum SourceEnum {
     digital,  physical, 
  };
  @SerializedName("source")
  private SourceEnum source = null;
  @SerializedName("successful")
  private Boolean successful = null;
  @SerializedName("transaction_id")
  private String transactionId = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("type_hint")
  private String typeHint = null;
  @SerializedName("value")
  private Double value = null;

  /**
   * The unix timestamp in seconds of the transaction
   **/
  @ApiModelProperty(value = "The unix timestamp in seconds of the transaction")
  public Long getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }

  /**
   * The code of the currency for the transaction
   **/
  @ApiModelProperty(value = "The code of the currency for the transaction")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The specific details of the transaction, such as a message from the admin that created it
   **/
  @ApiModelProperty(value = "The specific details of the transaction, such as a message from the admin that created it")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * The id of the transaction
   **/
  @ApiModelProperty(value = "The id of the transaction")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The id of the invoice that spawned the transaction, if any
   **/
  @ApiModelProperty(value = "The id of the invoice that spawned the transaction, if any")
  public Integer getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * Whether the transaction has been refunded
   **/
  @ApiModelProperty(value = "Whether the transaction has been refunded")
  public Boolean getIsRefunded() {
    return isRefunded;
  }
  public void setIsRefunded(Boolean isRefunded) {
    this.isRefunded = isRefunded;
  }

  /**
   * The response
   **/
  @ApiModelProperty(value = "The response")
  public String getResponse() {
    return response;
  }
  public void setResponse(String response) {
    this.response = response;
  }

  /**
   * The root source of the transaction
   **/
  @ApiModelProperty(value = "The root source of the transaction")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }

  /**
   * If the transaction was successful
   **/
  @ApiModelProperty(value = "If the transaction was successful")
  public Boolean getSuccessful() {
    return successful;
  }
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  /**
   * The payment gateway (external) transaction ID
   **/
  @ApiModelProperty(value = "The payment gateway (external) transaction ID")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The general type of the transaction
   **/
  @ApiModelProperty(value = "The general type of the transaction")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The table name of the subclass
   **/
  @ApiModelProperty(value = "The table name of the subclass")
  public String getTypeHint() {
    return typeHint;
  }
  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  /**
   * The amount of the transaction, positive if a gain, negative if an expenditure
   **/
  @ApiModelProperty(value = "The amount of the transaction, positive if a gain, negative if an expenditure")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResource transactionResource = (TransactionResource) o;
    return (this.createDate == null ? transactionResource.createDate == null : this.createDate.equals(transactionResource.createDate)) &&
        (this.currencyCode == null ? transactionResource.currencyCode == null : this.currencyCode.equals(transactionResource.currencyCode)) &&
        (this.details == null ? transactionResource.details == null : this.details.equals(transactionResource.details)) &&
        (this.id == null ? transactionResource.id == null : this.id.equals(transactionResource.id)) &&
        (this.invoiceId == null ? transactionResource.invoiceId == null : this.invoiceId.equals(transactionResource.invoiceId)) &&
        (this.isRefunded == null ? transactionResource.isRefunded == null : this.isRefunded.equals(transactionResource.isRefunded)) &&
        (this.response == null ? transactionResource.response == null : this.response.equals(transactionResource.response)) &&
        (this.source == null ? transactionResource.source == null : this.source.equals(transactionResource.source)) &&
        (this.successful == null ? transactionResource.successful == null : this.successful.equals(transactionResource.successful)) &&
        (this.transactionId == null ? transactionResource.transactionId == null : this.transactionId.equals(transactionResource.transactionId)) &&
        (this.type == null ? transactionResource.type == null : this.type.equals(transactionResource.type)) &&
        (this.typeHint == null ? transactionResource.typeHint == null : this.typeHint.equals(transactionResource.typeHint)) &&
        (this.value == null ? transactionResource.value == null : this.value.equals(transactionResource.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.createDate == null ? 0: this.createDate.hashCode());
    result = 31 * result + (this.currencyCode == null ? 0: this.currencyCode.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.invoiceId == null ? 0: this.invoiceId.hashCode());
    result = 31 * result + (this.isRefunded == null ? 0: this.isRefunded.hashCode());
    result = 31 * result + (this.response == null ? 0: this.response.hashCode());
    result = 31 * result + (this.source == null ? 0: this.source.hashCode());
    result = 31 * result + (this.successful == null ? 0: this.successful.hashCode());
    result = 31 * result + (this.transactionId == null ? 0: this.transactionId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResource {\n");
    
    sb.append("  createDate: ").append(createDate).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("  isRefunded: ").append(isRefunded).append("\n");
    sb.append("  response: ").append(response).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  successful: ").append(successful).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

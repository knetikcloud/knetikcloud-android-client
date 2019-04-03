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
 * InvoiceLogEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T13:20:56.767-04:00")
public class InvoiceLogEntry {
  @SerializedName("date")
  private Long date = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("type")
  private String type = null;

  public InvoiceLogEntry date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * The date this event occurred as a unix timestamp in seconds
   * @return date
  **/
  @ApiModelProperty(value = "The date this event occurred as a unix timestamp in seconds")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public InvoiceLogEntry invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The ID of the invoice
   * @return invoiceId
  **/
  @ApiModelProperty(value = "The ID of the invoice")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public InvoiceLogEntry message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A message describing the event
   * @return message
  **/
  @ApiModelProperty(value = "A message describing the event")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InvoiceLogEntry type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of event
   * @return type
  **/
  @ApiModelProperty(value = "The type of event")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceLogEntry invoiceLogEntry = (InvoiceLogEntry) o;
    return Objects.equals(this.date, invoiceLogEntry.date) &&
        Objects.equals(this.invoiceId, invoiceLogEntry.invoiceId) &&
        Objects.equals(this.message, invoiceLogEntry.message) &&
        Objects.equals(this.type, invoiceLogEntry.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, invoiceId, message, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceLogEntry {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


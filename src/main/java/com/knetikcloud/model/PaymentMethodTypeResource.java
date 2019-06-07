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
 * PaymentMethodTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:46:55.685-04:00")
public class PaymentMethodTypeResource {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice_processing_hours")
  private Integer invoiceProcessingHours = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("supports_capture")
  private Boolean supportsCapture = null;

  @SerializedName("supports_partial")
  private Boolean supportsPartial = null;

  @SerializedName("supports_rebill")
  private Boolean supportsRebill = null;

  @SerializedName("supports_refunds")
  private Boolean supportsRefunds = null;

  public PaymentMethodTypeResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the payment method type
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the payment method type")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PaymentMethodTypeResource invoiceProcessingHours(Integer invoiceProcessingHours) {
    this.invoiceProcessingHours = invoiceProcessingHours;
    return this;
  }

   /**
   * The maximum timelimit in hours for an invoice in the processing status while waiting on this payment method type. Defaults to the global config invoice.processing_expiration_hours if null
   * @return invoiceProcessingHours
  **/
  @ApiModelProperty(value = "The maximum timelimit in hours for an invoice in the processing status while waiting on this payment method type. Defaults to the global config invoice.processing_expiration_hours if null")
  public Integer getInvoiceProcessingHours() {
    return invoiceProcessingHours;
  }

  public void setInvoiceProcessingHours(Integer invoiceProcessingHours) {
    this.invoiceProcessingHours = invoiceProcessingHours;
  }

  public PaymentMethodTypeResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the payment method type
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the payment method type")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentMethodTypeResource supportsCapture(Boolean supportsCapture) {
    this.supportsCapture = supportsCapture;
    return this;
  }

   /**
   * Whether the payment handler supports the authorize and capture flow
   * @return supportsCapture
  **/
  @ApiModelProperty(example = "false", value = "Whether the payment handler supports the authorize and capture flow")
  public Boolean isSupportsCapture() {
    return supportsCapture;
  }

  public void setSupportsCapture(Boolean supportsCapture) {
    this.supportsCapture = supportsCapture;
  }

  public PaymentMethodTypeResource supportsPartial(Boolean supportsPartial) {
    this.supportsPartial = supportsPartial;
    return this;
  }

   /**
   * Whether the payment handler supports paying for part of an invoice, rather than the full grand_total
   * @return supportsPartial
  **/
  @ApiModelProperty(example = "false", value = "Whether the payment handler supports paying for part of an invoice, rather than the full grand_total")
  public Boolean isSupportsPartial() {
    return supportsPartial;
  }

  public void setSupportsPartial(Boolean supportsPartial) {
    this.supportsPartial = supportsPartial;
  }

  public PaymentMethodTypeResource supportsRebill(Boolean supportsRebill) {
    this.supportsRebill = supportsRebill;
    return this;
  }

   /**
   * Whether the payment handler supports rebilling the method later (for saved payments or subscriptions)
   * @return supportsRebill
  **/
  @ApiModelProperty(example = "false", value = "Whether the payment handler supports rebilling the method later (for saved payments or subscriptions)")
  public Boolean isSupportsRebill() {
    return supportsRebill;
  }

  public void setSupportsRebill(Boolean supportsRebill) {
    this.supportsRebill = supportsRebill;
  }

  public PaymentMethodTypeResource supportsRefunds(Boolean supportsRefunds) {
    this.supportsRefunds = supportsRefunds;
    return this;
  }

   /**
   * Whether the payment handler supports refunding
   * @return supportsRefunds
  **/
  @ApiModelProperty(example = "false", value = "Whether the payment handler supports refunding")
  public Boolean isSupportsRefunds() {
    return supportsRefunds;
  }

  public void setSupportsRefunds(Boolean supportsRefunds) {
    this.supportsRefunds = supportsRefunds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodTypeResource paymentMethodTypeResource = (PaymentMethodTypeResource) o;
    return Objects.equals(this.id, paymentMethodTypeResource.id) &&
        Objects.equals(this.invoiceProcessingHours, paymentMethodTypeResource.invoiceProcessingHours) &&
        Objects.equals(this.name, paymentMethodTypeResource.name) &&
        Objects.equals(this.supportsCapture, paymentMethodTypeResource.supportsCapture) &&
        Objects.equals(this.supportsPartial, paymentMethodTypeResource.supportsPartial) &&
        Objects.equals(this.supportsRebill, paymentMethodTypeResource.supportsRebill) &&
        Objects.equals(this.supportsRefunds, paymentMethodTypeResource.supportsRefunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceProcessingHours, name, supportsCapture, supportsPartial, supportsRebill, supportsRefunds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodTypeResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceProcessingHours: ").append(toIndentedString(invoiceProcessingHours)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportsCapture: ").append(toIndentedString(supportsCapture)).append("\n");
    sb.append("    supportsPartial: ").append(toIndentedString(supportsPartial)).append("\n");
    sb.append("    supportsRebill: ").append(toIndentedString(supportsRebill)).append("\n");
    sb.append("    supportsRefunds: ").append(toIndentedString(supportsRefunds)).append("\n");
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


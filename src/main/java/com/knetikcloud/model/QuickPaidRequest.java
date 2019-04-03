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
 * QuickPaidRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T13:50:49.584-04:00")
public class QuickPaidRequest {
  @SerializedName("gift_target")
  private Integer giftTarget = null;

  @SerializedName("item_notes")
  private String itemNotes = null;

  @SerializedName("paid_amount")
  private BigDecimal paidAmount = null;

  @SerializedName("price_override")
  private BigDecimal priceOverride = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("transaction_details")
  private String transactionDetails = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public QuickPaidRequest giftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
    return this;
  }

   /**
   * An optional target user to give the item to as a gift
   * @return giftTarget
  **/
  @ApiModelProperty(required = true, value = "An optional target user to give the item to as a gift")
  public Integer getGiftTarget() {
    return giftTarget;
  }

  public void setGiftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
  }

  public QuickPaidRequest itemNotes(String itemNotes) {
    this.itemNotes = itemNotes;
    return this;
  }

   /**
   * An optional note to add to the item
   * @return itemNotes
  **/
  @ApiModelProperty(value = "An optional note to add to the item")
  public String getItemNotes() {
    return itemNotes;
  }

  public void setItemNotes(String itemNotes) {
    this.itemNotes = itemNotes;
  }

  public QuickPaidRequest paidAmount(BigDecimal paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * The amount already paid. Must match final price to complete purchase. Minimum 0
   * @return paidAmount
  **/
  @ApiModelProperty(required = true, value = "The amount already paid. Must match final price to complete purchase. Minimum 0")
  public BigDecimal getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(BigDecimal paidAmount) {
    this.paidAmount = paidAmount;
  }

  public QuickPaidRequest priceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
    return this;
  }

   /**
   * Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0
   * @return priceOverride
  **/
  @ApiModelProperty(value = "Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0")
  public BigDecimal getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
  }

  public QuickPaidRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * SKU of item being purchased
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "SKU of item being purchased")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public QuickPaidRequest transactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

   /**
   * Transaction details
   * @return transactionDetails
  **/
  @ApiModelProperty(value = "Transaction details")
  public String getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public QuickPaidRequest transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Transaction type
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "Transaction type")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public QuickPaidRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user making the purchase. If null, currently logged in user will be used.
   * @return userId
  **/
  @ApiModelProperty(value = "ID of the user making the purchase. If null, currently logged in user will be used.")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickPaidRequest quickPaidRequest = (QuickPaidRequest) o;
    return Objects.equals(this.giftTarget, quickPaidRequest.giftTarget) &&
        Objects.equals(this.itemNotes, quickPaidRequest.itemNotes) &&
        Objects.equals(this.paidAmount, quickPaidRequest.paidAmount) &&
        Objects.equals(this.priceOverride, quickPaidRequest.priceOverride) &&
        Objects.equals(this.sku, quickPaidRequest.sku) &&
        Objects.equals(this.transactionDetails, quickPaidRequest.transactionDetails) &&
        Objects.equals(this.transactionType, quickPaidRequest.transactionType) &&
        Objects.equals(this.userId, quickPaidRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftTarget, itemNotes, paidAmount, priceOverride, sku, transactionDetails, transactionType, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickPaidRequest {\n");
    
    sb.append("    giftTarget: ").append(toIndentedString(giftTarget)).append("\n");
    sb.append("    itemNotes: ").append(toIndentedString(itemNotes)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    priceOverride: ").append(toIndentedString(priceOverride)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

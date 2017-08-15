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
 * SubscriptionPriceOverrideRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T13:12:56.036-04:00")
public class SubscriptionPriceOverrideRequest {
  @SerializedName("new_price")
  private Double newPrice = null;

  @SerializedName("reason")
  private String reason = null;

  public SubscriptionPriceOverrideRequest newPrice(Double newPrice) {
    this.newPrice = newPrice;
    return this;
  }

   /**
   * The recurring price that has been set to override the base price. Null if not overriding
   * @return newPrice
  **/
  @ApiModelProperty(value = "The recurring price that has been set to override the base price. Null if not overriding")
  public Double getNewPrice() {
    return newPrice;
  }

  public void setNewPrice(Double newPrice) {
    this.newPrice = newPrice;
  }

  public SubscriptionPriceOverrideRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * An explanation for the reason the price is being overridden
   * @return reason
  **/
  @ApiModelProperty(value = "An explanation for the reason the price is being overridden")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPriceOverrideRequest subscriptionPriceOverrideRequest = (SubscriptionPriceOverrideRequest) o;
    return Objects.equals(this.newPrice, subscriptionPriceOverrideRequest.newPrice) &&
        Objects.equals(this.reason, subscriptionPriceOverrideRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPrice, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPriceOverrideRequest {\n");
    
    sb.append("    newPrice: ").append(toIndentedString(newPrice)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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


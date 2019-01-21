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
 * PayBySavedMethodRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T16:40:51.235-05:00")
public class PayBySavedMethodRequest {
  @SerializedName("payment_method")
  private Integer paymentMethod = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public PayBySavedMethodRequest paymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The id of the payment method to use. Must belong to the caller, be public or have PAYMENTS_ADMIN permission
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "The id of the payment method to use. Must belong to the caller, be public or have PAYMENTS_ADMIN permission")
  public Integer getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PayBySavedMethodRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of a user to bill. Must have PAYMENTS_ADMIN permission
   * @return userId
  **/
  @ApiModelProperty(value = "The id of a user to bill. Must have PAYMENTS_ADMIN permission")
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
    PayBySavedMethodRequest payBySavedMethodRequest = (PayBySavedMethodRequest) o;
    return Objects.equals(this.paymentMethod, payBySavedMethodRequest.paymentMethod) &&
        Objects.equals(this.userId, payBySavedMethodRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayBySavedMethodRequest {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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


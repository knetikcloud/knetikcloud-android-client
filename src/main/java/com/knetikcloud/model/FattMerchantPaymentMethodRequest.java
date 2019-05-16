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
import com.knetikcloud.model.FattMerchantPaymentMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FattMerchantPaymentMethodRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:16:46.445-04:00")
public class FattMerchantPaymentMethodRequest {
  @SerializedName("method")
  private FattMerchantPaymentMethod method = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public FattMerchantPaymentMethodRequest method(FattMerchantPaymentMethod method) {
    this.method = method;
    return this;
  }

   /**
   * The FattMerchant payment method being created/updated
   * @return method
  **/
  @ApiModelProperty(required = true, value = "The FattMerchant payment method being created/updated")
  public FattMerchantPaymentMethod getMethod() {
    return method;
  }

  public void setMethod(FattMerchantPaymentMethod method) {
    this.method = method;
  }

  public FattMerchantPaymentMethodRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the JSAPI user for whom the payment method is being created/updated. If ID is not that of the currently logged in user, FATMMERCHANT_ADMIN privilege is required. If ID is null, will use the currently logged in user&#39;s ID.
   * @return userId
  **/
  @ApiModelProperty(value = "ID of the JSAPI user for whom the payment method is being created/updated. If ID is not that of the currently logged in user, FATMMERCHANT_ADMIN privilege is required. If ID is null, will use the currently logged in user's ID.")
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
    FattMerchantPaymentMethodRequest fattMerchantPaymentMethodRequest = (FattMerchantPaymentMethodRequest) o;
    return Objects.equals(this.method, fattMerchantPaymentMethodRequest.method) &&
        Objects.equals(this.userId, fattMerchantPaymentMethodRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FattMerchantPaymentMethodRequest {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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


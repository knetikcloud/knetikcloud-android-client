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
 * InvoiceCreateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T13:34:39.715-04:00")
public class InvoiceCreateRequest {
  @SerializedName("cart_guid")
  private String cartGuid = null;

  public InvoiceCreateRequest cartGuid(String cartGuid) {
    this.cartGuid = cartGuid;
    return this;
  }

   /**
   * The guid of a cart to create a new invoice for
   * @return cartGuid
  **/
  @ApiModelProperty(required = true, value = "The guid of a cart to create a new invoice for")
  public String getCartGuid() {
    return cartGuid;
  }

  public void setCartGuid(String cartGuid) {
    this.cartGuid = cartGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceCreateRequest invoiceCreateRequest = (InvoiceCreateRequest) o;
    return Objects.equals(this.cartGuid, invoiceCreateRequest.cartGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceCreateRequest {\n");
    
    sb.append("    cartGuid: ").append(toIndentedString(cartGuid)).append("\n");
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


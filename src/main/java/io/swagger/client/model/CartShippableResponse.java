/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
public class CartShippableResponse {
  
  @SerializedName("cart_id")
  private Integer cartId = null;
  @SerializedName("shippable")
  private Boolean shippable = null;

  /**
   * The id of the cart
   **/
  @ApiModelProperty(value = "The id of the cart")
  public Integer getCartId() {
    return cartId;
  }
  public void setCartId(Integer cartId) {
    this.cartId = cartId;
  }

  /**
   * Whether the item is shippable
   **/
  @ApiModelProperty(value = "Whether the item is shippable")
  public Boolean getShippable() {
    return shippable;
  }
  public void setShippable(Boolean shippable) {
    this.shippable = shippable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartShippableResponse cartShippableResponse = (CartShippableResponse) o;
    return (this.cartId == null ? cartShippableResponse.cartId == null : this.cartId.equals(cartShippableResponse.cartId)) &&
        (this.shippable == null ? cartShippableResponse.shippable == null : this.shippable.equals(cartShippableResponse.shippable));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cartId == null ? 0: this.cartId.hashCode());
    result = 31 * result + (this.shippable == null ? 0: this.shippable.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartShippableResponse {\n");
    
    sb.append("  cartId: ").append(cartId).append("\n");
    sb.append("  shippable: ").append(shippable).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

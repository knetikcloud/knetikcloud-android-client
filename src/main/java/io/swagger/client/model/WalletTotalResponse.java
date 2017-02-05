/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
public class WalletTotalResponse {
  
  @SerializedName("currency_code")
  private String currencyCode = null;
  @SerializedName("total")
  private Double total = null;

  /**
   * The currency code
   **/
  @ApiModelProperty(value = "The currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The sum of all wallets in the system for this currency
   **/
  @ApiModelProperty(value = "The sum of all wallets in the system for this currency")
  public Double getTotal() {
    return total;
  }
  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTotalResponse walletTotalResponse = (WalletTotalResponse) o;
    return (this.currencyCode == null ? walletTotalResponse.currencyCode == null : this.currencyCode.equals(walletTotalResponse.currencyCode)) &&
        (this.total == null ? walletTotalResponse.total == null : this.total.equals(walletTotalResponse.total));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currencyCode == null ? 0: this.currencyCode.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTotalResponse {\n");
    
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

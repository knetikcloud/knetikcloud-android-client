/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GooglePaymentRequest {
  
  @SerializedName("json_payload")
  private String jsonPayload = null;
  @SerializedName("signature")
  private String signature = null;

  /**
   * The json payload exactly as sent from Google
   **/
  @ApiModelProperty(required = true, value = "The json payload exactly as sent from Google")
  public String getJsonPayload() {
    return jsonPayload;
  }
  public void setJsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
  }

  /**
   * The signature from Google to verify the payload
   **/
  @ApiModelProperty(required = true, value = "The signature from Google to verify the payload")
  public String getSignature() {
    return signature;
  }
  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePaymentRequest googlePaymentRequest = (GooglePaymentRequest) o;
    return (this.jsonPayload == null ? googlePaymentRequest.jsonPayload == null : this.jsonPayload.equals(googlePaymentRequest.jsonPayload)) &&
        (this.signature == null ? googlePaymentRequest.signature == null : this.signature.equals(googlePaymentRequest.signature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.jsonPayload == null ? 0: this.jsonPayload.hashCode());
    result = 31 * result + (this.signature == null ? 0: this.signature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePaymentRequest {\n");
    
    sb.append("  jsonPayload: ").append(jsonPayload).append("\n");
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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
public class EntitlementGrantRequest {
  
  @SerializedName("entitlement_id")
  private Integer entitlementId = null;

  /**
   * The ID of the entitlement item to grant
   **/
  @ApiModelProperty(required = true, value = "The ID of the entitlement item to grant")
  public Integer getEntitlementId() {
    return entitlementId;
  }
  public void setEntitlementId(Integer entitlementId) {
    this.entitlementId = entitlementId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementGrantRequest entitlementGrantRequest = (EntitlementGrantRequest) o;
    return (this.entitlementId == null ? entitlementGrantRequest.entitlementId == null : this.entitlementId.equals(entitlementGrantRequest.entitlementId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entitlementId == null ? 0: this.entitlementId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementGrantRequest {\n");
    
    sb.append("  entitlementId: ").append(entitlementId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
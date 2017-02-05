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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TokenDetailsResource {
  
  @SerializedName("roles")
  private List<String> roles = null;
  @SerializedName("user_id")
  private Integer userId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRoles() {
    return roles;
  }
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenDetailsResource tokenDetailsResource = (TokenDetailsResource) o;
    return (this.roles == null ? tokenDetailsResource.roles == null : this.roles.equals(tokenDetailsResource.roles)) &&
        (this.userId == null ? tokenDetailsResource.userId == null : this.userId.equals(tokenDetailsResource.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.roles == null ? 0: this.roles.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDetailsResource {\n");
    
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

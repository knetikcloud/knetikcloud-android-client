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
public class FacebookToken {
  
  @SerializedName("access_token")
  private String accessToken = null;

  /**
   * A valid access token from facebook. See facebook documention for how to obtain one.
   **/
  @ApiModelProperty(required = true, value = "A valid access token from facebook. See facebook documention for how to obtain one.")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacebookToken facebookToken = (FacebookToken) o;
    return (this.accessToken == null ? facebookToken.accessToken == null : this.accessToken.equals(facebookToken.accessToken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accessToken == null ? 0: this.accessToken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookToken {\n");
    
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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
public class OauthAccessTokenResource {
  
  @SerializedName("client_id")
  private String clientId = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("username")
  private String username = null;

  /**
   * The key of the client assosciated with the token
   **/
  @ApiModelProperty(value = "The key of the client assosciated with the token")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * The token.  Not shown in list view
   **/
  @ApiModelProperty(value = "The token.  Not shown in list view")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * The username of the user associated with the token
   **/
  @ApiModelProperty(value = "The username of the user associated with the token")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResource oauthAccessTokenResource = (OauthAccessTokenResource) o;
    return (this.clientId == null ? oauthAccessTokenResource.clientId == null : this.clientId.equals(oauthAccessTokenResource.clientId)) &&
        (this.token == null ? oauthAccessTokenResource.token == null : this.token.equals(oauthAccessTokenResource.token)) &&
        (this.username == null ? oauthAccessTokenResource.username == null : this.username.equals(oauthAccessTokenResource.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResource {\n");
    
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

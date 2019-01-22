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
 * OAuth2Resource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-22T09:25:50.362-05:00")
public class OAuth2Resource {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private String expiresIn = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("token_type")
  private String tokenType = null;

   /**
   * The access token issued by the authorization server
   * @return accessToken
  **/
  @ApiModelProperty(value = "The access token issued by the authorization server")
  public String getAccessToken() {
    return accessToken;
  }

   /**
   * The lifetime in seconds of the access token
   * @return expiresIn
  **/
  @ApiModelProperty(value = "The lifetime in seconds of the access token")
  public String getExpiresIn() {
    return expiresIn;
  }

   /**
   * The refresh token issued by the authorization server
   * @return refreshToken
  **/
  @ApiModelProperty(value = "The refresh token issued by the authorization server")
  public String getRefreshToken() {
    return refreshToken;
  }

   /**
   * The scope of the access token. Currently these values can be ignored, as security defaults to roles and permissions
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of the access token. Currently these values can be ignored, as security defaults to roles and permissions")
  public String getScope() {
    return scope;
  }

   /**
   * The type of the token issued
   * @return tokenType
  **/
  @ApiModelProperty(value = "The type of the token issued")
  public String getTokenType() {
    return tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Resource oauth2Resource = (OAuth2Resource) o;
    return Objects.equals(this.accessToken, oauth2Resource.accessToken) &&
        Objects.equals(this.expiresIn, oauth2Resource.expiresIn) &&
        Objects.equals(this.refreshToken, oauth2Resource.refreshToken) &&
        Objects.equals(this.scope, oauth2Resource.scope) &&
        Objects.equals(this.tokenType, oauth2Resource.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshToken, scope, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Resource {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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


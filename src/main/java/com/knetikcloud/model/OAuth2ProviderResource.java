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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OAuth2ProviderResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-05T08:45:52.063-04:00")
public class OAuth2ProviderResource {
  /**
   * The grant type chosen when creating your client with the provider. Typically authorization_code for maximum security.
   */
  @JsonAdapter(AuthorizationGrantTypeEnum.Adapter.class)
  public enum AuthorizationGrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    IMPLICIT("implicit");

    private String value;

    AuthorizationGrantTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorizationGrantTypeEnum fromValue(String text) {
      for (AuthorizationGrantTypeEnum b : AuthorizationGrantTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthorizationGrantTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorizationGrantTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorizationGrantTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthorizationGrantTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authorization_grant_type")
  private AuthorizationGrantTypeEnum authorizationGrantType = null;

  @SerializedName("authorization_uri")
  private String authorizationUri = null;

  /**
   * The method used by the provider to capture the credentials. See the provider&#39;s documentation for details
   */
  @JsonAdapter(ClientAuthenticationMethodEnum.Adapter.class)
  public enum ClientAuthenticationMethodEnum {
    BASIC("basic"),
    
    POST("post");

    private String value;

    ClientAuthenticationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClientAuthenticationMethodEnum fromValue(String text) {
      for (ClientAuthenticationMethodEnum b : ClientAuthenticationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ClientAuthenticationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClientAuthenticationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClientAuthenticationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClientAuthenticationMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("client_authentication_method")
  private ClientAuthenticationMethodEnum clientAuthenticationMethod = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("client_name")
  private String clientName = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("jwk_set_uri")
  private String jwkSetUri = null;

  @SerializedName("oidc_compliant")
  private Boolean oidcCompliant = null;

  @SerializedName("provider_details")
  private Map<String, String> providerDetails = null;

  @SerializedName("provider_id")
  private String providerId = null;

  @SerializedName("scopes")
  private String scopes = null;

  @SerializedName("token_uri")
  private String tokenUri = null;

  @SerializedName("user_info_endpoint_uri")
  private String userInfoEndpointUri = null;

  @SerializedName("user_info_endpoint_user_name_attribute_name")
  private String userInfoEndpointUserNameAttributeName = null;

  public OAuth2ProviderResource authorizationGrantType(AuthorizationGrantTypeEnum authorizationGrantType) {
    this.authorizationGrantType = authorizationGrantType;
    return this;
  }

   /**
   * The grant type chosen when creating your client with the provider. Typically authorization_code for maximum security.
   * @return authorizationGrantType
  **/
  @ApiModelProperty(value = "The grant type chosen when creating your client with the provider. Typically authorization_code for maximum security.")
  public AuthorizationGrantTypeEnum getAuthorizationGrantType() {
    return authorizationGrantType;
  }

  public void setAuthorizationGrantType(AuthorizationGrantTypeEnum authorizationGrantType) {
    this.authorizationGrantType = authorizationGrantType;
  }

  public OAuth2ProviderResource authorizationUri(String authorizationUri) {
    this.authorizationUri = authorizationUri;
    return this;
  }

   /**
   * The provider&#39;s sign-in page URL. Typically something like oauth/authorize
   * @return authorizationUri
  **/
  @ApiModelProperty(value = "The provider's sign-in page URL. Typically something like oauth/authorize")
  public String getAuthorizationUri() {
    return authorizationUri;
  }

  public void setAuthorizationUri(String authorizationUri) {
    this.authorizationUri = authorizationUri;
  }

  public OAuth2ProviderResource clientAuthenticationMethod(ClientAuthenticationMethodEnum clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
    return this;
  }

   /**
   * The method used by the provider to capture the credentials. See the provider&#39;s documentation for details
   * @return clientAuthenticationMethod
  **/
  @ApiModelProperty(value = "The method used by the provider to capture the credentials. See the provider's documentation for details")
  public ClientAuthenticationMethodEnum getClientAuthenticationMethod() {
    return clientAuthenticationMethod;
  }

  public void setClientAuthenticationMethod(ClientAuthenticationMethodEnum clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
  }

  public OAuth2ProviderResource clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The oauth client ID from the provider. This is used to exchange codes for tokens.
   * @return clientId
  **/
  @ApiModelProperty(value = "The oauth client ID from the provider. This is used to exchange codes for tokens.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuth2ProviderResource clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * The user-friendly name of this provider
   * @return clientName
  **/
  @ApiModelProperty(value = "The user-friendly name of this provider")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public OAuth2ProviderResource clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The oauth client secret from the provider. This is used to exchange codes for tokens.
   * @return clientSecret
  **/
  @ApiModelProperty(value = "The oauth client secret from the provider. This is used to exchange codes for tokens.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OAuth2ProviderResource color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Applied to the sign-in button.  EX: #FF0033
   * @return color
  **/
  @ApiModelProperty(value = "Applied to the sign-in button.  EX: #FF0033")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public OAuth2ProviderResource icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * The Font Awesome classes to be applied to the sign-in button. Ex: fab fa-facebook
   * @return icon
  **/
  @ApiModelProperty(value = "The Font Awesome classes to be applied to the sign-in button. Ex: fab fa-facebook")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public OAuth2ProviderResource jwkSetUri(String jwkSetUri) {
    this.jwkSetUri = jwkSetUri;
    return this;
  }

   /**
   * The provider&#39;s URL that allows decoding JWT oauth tokens
   * @return jwkSetUri
  **/
  @ApiModelProperty(value = "The provider's URL that allows decoding JWT oauth tokens")
  public String getJwkSetUri() {
    return jwkSetUri;
  }

  public void setJwkSetUri(String jwkSetUri) {
    this.jwkSetUri = jwkSetUri;
  }

  public OAuth2ProviderResource oidcCompliant(Boolean oidcCompliant) {
    this.oidcCompliant = oidcCompliant;
    return this;
  }

   /**
   * Whether this provider follows OIDC standards.  If not, you must provide the required mapping in provider_details
   * @return oidcCompliant
  **/
  @ApiModelProperty(example = "false", value = "Whether this provider follows OIDC standards.  If not, you must provide the required mapping in provider_details")
  public Boolean isOidcCompliant() {
    return oidcCompliant;
  }

  public void setOidcCompliant(Boolean oidcCompliant) {
    this.oidcCompliant = oidcCompliant;
  }

  public OAuth2ProviderResource providerDetails(Map<String, String> providerDetails) {
    this.providerDetails = providerDetails;
    return this;
  }

  public OAuth2ProviderResource putProviderDetailsItem(String key, String providerDetailsItem) {
    if (this.providerDetails == null) {
      this.providerDetails = new HashMap<String, String>();
    }
    this.providerDetails.put(key, providerDetailsItem);
    return this;
  }

   /**
   * A map of keys and the keys they translate to for non-OIDC complient providers.  The &#39;email&#39; key is required if emails are set to required in the config service.  Optional keys are other keys in the user object, currently ignoring lists and maps.
   * @return providerDetails
  **/
  @ApiModelProperty(value = "A map of keys and the keys they translate to for non-OIDC complient providers.  The 'email' key is required if emails are set to required in the config service.  Optional keys are other keys in the user object, currently ignoring lists and maps.")
  public Map<String, String> getProviderDetails() {
    return providerDetails;
  }

  public void setProviderDetails(Map<String, String> providerDetails) {
    this.providerDetails = providerDetails;
  }

  public OAuth2ProviderResource providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * The unique ID given to this provider
   * @return providerId
  **/
  @ApiModelProperty(value = "The unique ID given to this provider")
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public OAuth2ProviderResource scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

   /**
   * The list of permissions to request the provider when signing-in (Allow MyApp to access x, y, z information). Comma-separated strings without spaces
   * @return scopes
  **/
  @ApiModelProperty(value = "The list of permissions to request the provider when signing-in (Allow MyApp to access x, y, z information). Comma-separated strings without spaces")
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  public OAuth2ProviderResource tokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
    return this;
  }

   /**
   * The provider&#39;s token URL used to exchange the authorization code for a token. Typically something like oauth/token
   * @return tokenUri
  **/
  @ApiModelProperty(value = "The provider's token URL used to exchange the authorization code for a token. Typically something like oauth/token")
  public String getTokenUri() {
    return tokenUri;
  }

  public void setTokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
  }

  public OAuth2ProviderResource userInfoEndpointUri(String userInfoEndpointUri) {
    this.userInfoEndpointUri = userInfoEndpointUri;
    return this;
  }

   /**
   * The provider&#39;s user info URL AKA \&quot;me endpoint\&quot; used to load the user&#39;s details associated with the oauth token
   * @return userInfoEndpointUri
  **/
  @ApiModelProperty(value = "The provider's user info URL AKA \"me endpoint\" used to load the user's details associated with the oauth token")
  public String getUserInfoEndpointUri() {
    return userInfoEndpointUri;
  }

  public void setUserInfoEndpointUri(String userInfoEndpointUri) {
    this.userInfoEndpointUri = userInfoEndpointUri;
  }

  public OAuth2ProviderResource userInfoEndpointUserNameAttributeName(String userInfoEndpointUserNameAttributeName) {
    this.userInfoEndpointUserNameAttributeName = userInfoEndpointUserNameAttributeName;
    return this;
  }

   /**
   * The name of the field in the provider&#39;s User Info Endpoint that provides a unique identifier for the connected user.  Defaults to &#39;id&#39;.
   * @return userInfoEndpointUserNameAttributeName
  **/
  @ApiModelProperty(value = "The name of the field in the provider's User Info Endpoint that provides a unique identifier for the connected user.  Defaults to 'id'.")
  public String getUserInfoEndpointUserNameAttributeName() {
    return userInfoEndpointUserNameAttributeName;
  }

  public void setUserInfoEndpointUserNameAttributeName(String userInfoEndpointUserNameAttributeName) {
    this.userInfoEndpointUserNameAttributeName = userInfoEndpointUserNameAttributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ProviderResource oauth2ProviderResource = (OAuth2ProviderResource) o;
    return Objects.equals(this.authorizationGrantType, oauth2ProviderResource.authorizationGrantType) &&
        Objects.equals(this.authorizationUri, oauth2ProviderResource.authorizationUri) &&
        Objects.equals(this.clientAuthenticationMethod, oauth2ProviderResource.clientAuthenticationMethod) &&
        Objects.equals(this.clientId, oauth2ProviderResource.clientId) &&
        Objects.equals(this.clientName, oauth2ProviderResource.clientName) &&
        Objects.equals(this.clientSecret, oauth2ProviderResource.clientSecret) &&
        Objects.equals(this.color, oauth2ProviderResource.color) &&
        Objects.equals(this.icon, oauth2ProviderResource.icon) &&
        Objects.equals(this.jwkSetUri, oauth2ProviderResource.jwkSetUri) &&
        Objects.equals(this.oidcCompliant, oauth2ProviderResource.oidcCompliant) &&
        Objects.equals(this.providerDetails, oauth2ProviderResource.providerDetails) &&
        Objects.equals(this.providerId, oauth2ProviderResource.providerId) &&
        Objects.equals(this.scopes, oauth2ProviderResource.scopes) &&
        Objects.equals(this.tokenUri, oauth2ProviderResource.tokenUri) &&
        Objects.equals(this.userInfoEndpointUri, oauth2ProviderResource.userInfoEndpointUri) &&
        Objects.equals(this.userInfoEndpointUserNameAttributeName, oauth2ProviderResource.userInfoEndpointUserNameAttributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationGrantType, authorizationUri, clientAuthenticationMethod, clientId, clientName, clientSecret, color, icon, jwkSetUri, oidcCompliant, providerDetails, providerId, scopes, tokenUri, userInfoEndpointUri, userInfoEndpointUserNameAttributeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ProviderResource {\n");
    
    sb.append("    authorizationGrantType: ").append(toIndentedString(authorizationGrantType)).append("\n");
    sb.append("    authorizationUri: ").append(toIndentedString(authorizationUri)).append("\n");
    sb.append("    clientAuthenticationMethod: ").append(toIndentedString(clientAuthenticationMethod)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    jwkSetUri: ").append(toIndentedString(jwkSetUri)).append("\n");
    sb.append("    oidcCompliant: ").append(toIndentedString(oidcCompliant)).append("\n");
    sb.append("    providerDetails: ").append(toIndentedString(providerDetails)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    userInfoEndpointUri: ").append(toIndentedString(userInfoEndpointUri)).append("\n");
    sb.append("    userInfoEndpointUserNameAttributeName: ").append(toIndentedString(userInfoEndpointUserNameAttributeName)).append("\n");
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


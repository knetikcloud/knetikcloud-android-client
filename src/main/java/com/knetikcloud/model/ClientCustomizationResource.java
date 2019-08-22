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
 * ClientCustomizationResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T09:25:43.839-04:00")
public class ClientCustomizationResource {
  @SerializedName("credential_text")
  private String credentialText = null;

  @SerializedName("custom_css_url")
  private String customCssUrl = null;

  @SerializedName("favicon_url")
  private String faviconUrl = null;

  @SerializedName("footer")
  private String footer = null;

  @SerializedName("forgot_password_text")
  private String forgotPasswordText = null;

  @SerializedName("forgot_password_url")
  private String forgotPasswordUrl = null;

  @SerializedName("forgot_username_text")
  private String forgotUsernameText = null;

  @SerializedName("forgot_username_url")
  private String forgotUsernameUrl = null;

  @SerializedName("header")
  private String header = null;

  @SerializedName("invalid_login_text")
  private String invalidLoginText = null;

  @SerializedName("login_button_text")
  private String loginButtonText = null;

  @SerializedName("logout_text")
  private String logoutText = null;

  @SerializedName("password_placeholder")
  private String passwordPlaceholder = null;

  @SerializedName("provider_text")
  private String providerText = null;

  @SerializedName("sign_up_text")
  private String signUpText = null;

  @SerializedName("sign_up_url")
  private String signUpUrl = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("username_placeholder")
  private String usernamePlaceholder = null;

  public ClientCustomizationResource credentialText(String credentialText) {
    this.credentialText = credentialText;
    return this;
  }

   /**
   * The text displayed above the login form for the login page.  Default: Enter your credentials
   * @return credentialText
  **/
  @ApiModelProperty(value = "The text displayed above the login form for the login page.  Default: Enter your credentials")
  public String getCredentialText() {
    return credentialText;
  }

  public void setCredentialText(String credentialText) {
    this.credentialText = credentialText;
  }

  public ClientCustomizationResource customCssUrl(String customCssUrl) {
    this.customCssUrl = customCssUrl;
    return this;
  }

   /**
   * The link to a custom css file for the login page.  If not using, keep it set as null.
   * @return customCssUrl
  **/
  @ApiModelProperty(value = "The link to a custom css file for the login page.  If not using, keep it set as null.")
  public String getCustomCssUrl() {
    return customCssUrl;
  }

  public void setCustomCssUrl(String customCssUrl) {
    this.customCssUrl = customCssUrl;
  }

  public ClientCustomizationResource faviconUrl(String faviconUrl) {
    this.faviconUrl = faviconUrl;
    return this;
  }

   /**
   * The link to a favicon ico for the login page.  If not using, keep it set as null.
   * @return faviconUrl
  **/
  @ApiModelProperty(value = "The link to a favicon ico for the login page.  If not using, keep it set as null.")
  public String getFaviconUrl() {
    return faviconUrl;
  }

  public void setFaviconUrl(String faviconUrl) {
    this.faviconUrl = faviconUrl;
  }

  public ClientCustomizationResource footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * The HTML inside the header for the login page.  If not using, keep it set as null.
   * @return footer
  **/
  @ApiModelProperty(value = "The HTML inside the header for the login page.  If not using, keep it set as null.")
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public ClientCustomizationResource forgotPasswordText(String forgotPasswordText) {
    this.forgotPasswordText = forgotPasswordText;
    return this;
  }

   /**
   * The text provided for the link for a forgotten username for the login page.  Default: Forgot password?
   * @return forgotPasswordText
  **/
  @ApiModelProperty(value = "The text provided for the link for a forgotten username for the login page.  Default: Forgot password?")
  public String getForgotPasswordText() {
    return forgotPasswordText;
  }

  public void setForgotPasswordText(String forgotPasswordText) {
    this.forgotPasswordText = forgotPasswordText;
  }

  public ClientCustomizationResource forgotPasswordUrl(String forgotPasswordUrl) {
    this.forgotPasswordUrl = forgotPasswordUrl;
    return this;
  }

   /**
   * The link to a forgot password page for the login page.  If not using, keep it set as null.
   * @return forgotPasswordUrl
  **/
  @ApiModelProperty(value = "The link to a forgot password page for the login page.  If not using, keep it set as null.")
  public String getForgotPasswordUrl() {
    return forgotPasswordUrl;
  }

  public void setForgotPasswordUrl(String forgotPasswordUrl) {
    this.forgotPasswordUrl = forgotPasswordUrl;
  }

  public ClientCustomizationResource forgotUsernameText(String forgotUsernameText) {
    this.forgotUsernameText = forgotUsernameText;
    return this;
  }

   /**
   * The text provided for the link for a forgotten username for the login page.  Default: Forgot username?
   * @return forgotUsernameText
  **/
  @ApiModelProperty(value = "The text provided for the link for a forgotten username for the login page.  Default: Forgot username?")
  public String getForgotUsernameText() {
    return forgotUsernameText;
  }

  public void setForgotUsernameText(String forgotUsernameText) {
    this.forgotUsernameText = forgotUsernameText;
  }

  public ClientCustomizationResource forgotUsernameUrl(String forgotUsernameUrl) {
    this.forgotUsernameUrl = forgotUsernameUrl;
    return this;
  }

   /**
   * The link to a forgot username page for the login page.  If not using, keep it set as null.
   * @return forgotUsernameUrl
  **/
  @ApiModelProperty(value = "The link to a forgot username page for the login page.  If not using, keep it set as null.")
  public String getForgotUsernameUrl() {
    return forgotUsernameUrl;
  }

  public void setForgotUsernameUrl(String forgotUsernameUrl) {
    this.forgotUsernameUrl = forgotUsernameUrl;
  }

  public ClientCustomizationResource header(String header) {
    this.header = header;
    return this;
  }

   /**
   * The HTML inside the header for the login page.  If not using, keep it set as null.
   * @return header
  **/
  @ApiModelProperty(value = "The HTML inside the header for the login page.  If not using, keep it set as null.")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public ClientCustomizationResource invalidLoginText(String invalidLoginText) {
    this.invalidLoginText = invalidLoginText;
    return this;
  }

   /**
   * The text displayed when inputting an invalid user/pass for the login page.  Default: Invalid username or password.
   * @return invalidLoginText
  **/
  @ApiModelProperty(value = "The text displayed when inputting an invalid user/pass for the login page.  Default: Invalid username or password.")
  public String getInvalidLoginText() {
    return invalidLoginText;
  }

  public void setInvalidLoginText(String invalidLoginText) {
    this.invalidLoginText = invalidLoginText;
  }

  public ClientCustomizationResource loginButtonText(String loginButtonText) {
    this.loginButtonText = loginButtonText;
    return this;
  }

   /**
   * The text displayed on the login button for the login page.  Default: Log In
   * @return loginButtonText
  **/
  @ApiModelProperty(value = "The text displayed on the login button for the login page.  Default: Log In")
  public String getLoginButtonText() {
    return loginButtonText;
  }

  public void setLoginButtonText(String loginButtonText) {
    this.loginButtonText = loginButtonText;
  }

  public ClientCustomizationResource logoutText(String logoutText) {
    this.logoutText = logoutText;
    return this;
  }

   /**
   * The text displayed when logging out for the login page.  Default: You have been logged out.
   * @return logoutText
  **/
  @ApiModelProperty(value = "The text displayed when logging out for the login page.  Default: You have been logged out.")
  public String getLogoutText() {
    return logoutText;
  }

  public void setLogoutText(String logoutText) {
    this.logoutText = logoutText;
  }

  public ClientCustomizationResource passwordPlaceholder(String passwordPlaceholder) {
    this.passwordPlaceholder = passwordPlaceholder;
    return this;
  }

   /**
   * The placeholder text in the password entry for the login page.  Default: Password
   * @return passwordPlaceholder
  **/
  @ApiModelProperty(value = "The placeholder text in the password entry for the login page.  Default: Password")
  public String getPasswordPlaceholder() {
    return passwordPlaceholder;
  }

  public void setPasswordPlaceholder(String passwordPlaceholder) {
    this.passwordPlaceholder = passwordPlaceholder;
  }

  public ClientCustomizationResource providerText(String providerText) {
    this.providerText = providerText;
    return this;
  }

   /**
   * The text displayed when there are auth providers to select from for the login page.  Default: Or use your favorite identity provider
   * @return providerText
  **/
  @ApiModelProperty(value = "The text displayed when there are auth providers to select from for the login page.  Default: Or use your favorite identity provider")
  public String getProviderText() {
    return providerText;
  }

  public void setProviderText(String providerText) {
    this.providerText = providerText;
  }

  public ClientCustomizationResource signUpText(String signUpText) {
    this.signUpText = signUpText;
    return this;
  }

   /**
   * The text provided for the link to sign up for the login page.  Default: Sign up
   * @return signUpText
  **/
  @ApiModelProperty(value = "The text provided for the link to sign up for the login page.  Default: Sign up")
  public String getSignUpText() {
    return signUpText;
  }

  public void setSignUpText(String signUpText) {
    this.signUpText = signUpText;
  }

  public ClientCustomizationResource signUpUrl(String signUpUrl) {
    this.signUpUrl = signUpUrl;
    return this;
  }

   /**
   * The link to a sign up url for the login page.  If not using, keep it set as null.
   * @return signUpUrl
  **/
  @ApiModelProperty(value = "The link to a sign up url for the login page.  If not using, keep it set as null.")
  public String getSignUpUrl() {
    return signUpUrl;
  }

  public void setSignUpUrl(String signUpUrl) {
    this.signUpUrl = signUpUrl;
  }

  public ClientCustomizationResource title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the login page.  If not using, keep it set as null.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the login page.  If not using, keep it set as null.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ClientCustomizationResource usernamePlaceholder(String usernamePlaceholder) {
    this.usernamePlaceholder = usernamePlaceholder;
    return this;
  }

   /**
   * The placeholder text in the username entry for the login page.  Default: Username
   * @return usernamePlaceholder
  **/
  @ApiModelProperty(value = "The placeholder text in the username entry for the login page.  Default: Username")
  public String getUsernamePlaceholder() {
    return usernamePlaceholder;
  }

  public void setUsernamePlaceholder(String usernamePlaceholder) {
    this.usernamePlaceholder = usernamePlaceholder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientCustomizationResource clientCustomizationResource = (ClientCustomizationResource) o;
    return Objects.equals(this.credentialText, clientCustomizationResource.credentialText) &&
        Objects.equals(this.customCssUrl, clientCustomizationResource.customCssUrl) &&
        Objects.equals(this.faviconUrl, clientCustomizationResource.faviconUrl) &&
        Objects.equals(this.footer, clientCustomizationResource.footer) &&
        Objects.equals(this.forgotPasswordText, clientCustomizationResource.forgotPasswordText) &&
        Objects.equals(this.forgotPasswordUrl, clientCustomizationResource.forgotPasswordUrl) &&
        Objects.equals(this.forgotUsernameText, clientCustomizationResource.forgotUsernameText) &&
        Objects.equals(this.forgotUsernameUrl, clientCustomizationResource.forgotUsernameUrl) &&
        Objects.equals(this.header, clientCustomizationResource.header) &&
        Objects.equals(this.invalidLoginText, clientCustomizationResource.invalidLoginText) &&
        Objects.equals(this.loginButtonText, clientCustomizationResource.loginButtonText) &&
        Objects.equals(this.logoutText, clientCustomizationResource.logoutText) &&
        Objects.equals(this.passwordPlaceholder, clientCustomizationResource.passwordPlaceholder) &&
        Objects.equals(this.providerText, clientCustomizationResource.providerText) &&
        Objects.equals(this.signUpText, clientCustomizationResource.signUpText) &&
        Objects.equals(this.signUpUrl, clientCustomizationResource.signUpUrl) &&
        Objects.equals(this.title, clientCustomizationResource.title) &&
        Objects.equals(this.usernamePlaceholder, clientCustomizationResource.usernamePlaceholder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialText, customCssUrl, faviconUrl, footer, forgotPasswordText, forgotPasswordUrl, forgotUsernameText, forgotUsernameUrl, header, invalidLoginText, loginButtonText, logoutText, passwordPlaceholder, providerText, signUpText, signUpUrl, title, usernamePlaceholder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientCustomizationResource {\n");
    
    sb.append("    credentialText: ").append(toIndentedString(credentialText)).append("\n");
    sb.append("    customCssUrl: ").append(toIndentedString(customCssUrl)).append("\n");
    sb.append("    faviconUrl: ").append(toIndentedString(faviconUrl)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    forgotPasswordText: ").append(toIndentedString(forgotPasswordText)).append("\n");
    sb.append("    forgotPasswordUrl: ").append(toIndentedString(forgotPasswordUrl)).append("\n");
    sb.append("    forgotUsernameText: ").append(toIndentedString(forgotUsernameText)).append("\n");
    sb.append("    forgotUsernameUrl: ").append(toIndentedString(forgotUsernameUrl)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    invalidLoginText: ").append(toIndentedString(invalidLoginText)).append("\n");
    sb.append("    loginButtonText: ").append(toIndentedString(loginButtonText)).append("\n");
    sb.append("    logoutText: ").append(toIndentedString(logoutText)).append("\n");
    sb.append("    passwordPlaceholder: ").append(toIndentedString(passwordPlaceholder)).append("\n");
    sb.append("    providerText: ").append(toIndentedString(providerText)).append("\n");
    sb.append("    signUpText: ").append(toIndentedString(signUpText)).append("\n");
    sb.append("    signUpUrl: ").append(toIndentedString(signUpUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    usernamePlaceholder: ").append(toIndentedString(usernamePlaceholder)).append("\n");
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


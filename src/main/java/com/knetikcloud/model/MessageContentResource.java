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
import com.knetikcloud.model.TemplatedEmail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MessageContentResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-05T08:45:52.063-04:00")
public class MessageContentResource {
  @SerializedName("email")
  private String email = null;

  @SerializedName("push")
  private String push = null;

  @SerializedName("sms")
  private String sms = null;

  @SerializedName("templated_email")
  private TemplatedEmail templatedEmail = null;

  @SerializedName("websocket")
  private Object websocket = null;

  public MessageContentResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The content of the email
   * @return email
  **/
  @ApiModelProperty(value = "The content of the email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MessageContentResource push(String push) {
    this.push = push;
    return this;
  }

   /**
   * The content of the mobile app push notification
   * @return push
  **/
  @ApiModelProperty(value = "The content of the mobile app push notification")
  public String getPush() {
    return push;
  }

  public void setPush(String push) {
    this.push = push;
  }

  public MessageContentResource sms(String sms) {
    this.sms = sms;
    return this;
  }

   /**
   * The content of the sms
   * @return sms
  **/
  @ApiModelProperty(value = "The content of the sms")
  public String getSms() {
    return sms;
  }

  public void setSms(String sms) {
    this.sms = sms;
  }

  public MessageContentResource templatedEmail(TemplatedEmail templatedEmail) {
    this.templatedEmail = templatedEmail;
    return this;
  }

   /**
   * The content of the templated email
   * @return templatedEmail
  **/
  @ApiModelProperty(value = "The content of the templated email")
  public TemplatedEmail getTemplatedEmail() {
    return templatedEmail;
  }

  public void setTemplatedEmail(TemplatedEmail templatedEmail) {
    this.templatedEmail = templatedEmail;
  }

  public MessageContentResource websocket(Object websocket) {
    this.websocket = websocket;
    return this;
  }

   /**
   * The content of the websocket message
   * @return websocket
  **/
  @ApiModelProperty(value = "The content of the websocket message")
  public Object getWebsocket() {
    return websocket;
  }

  public void setWebsocket(Object websocket) {
    this.websocket = websocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentResource messageContentResource = (MessageContentResource) o;
    return Objects.equals(this.email, messageContentResource.email) &&
        Objects.equals(this.push, messageContentResource.push) &&
        Objects.equals(this.sms, messageContentResource.sms) &&
        Objects.equals(this.templatedEmail, messageContentResource.templatedEmail) &&
        Objects.equals(this.websocket, messageContentResource.websocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, push, sms, templatedEmail, websocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentResource {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    templatedEmail: ").append(toIndentedString(templatedEmail)).append("\n");
    sb.append("    websocket: ").append(toIndentedString(websocket)).append("\n");
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


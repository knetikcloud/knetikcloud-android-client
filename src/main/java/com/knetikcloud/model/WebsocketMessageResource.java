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
import java.util.ArrayList;
import java.util.List;

/**
 * WebsocketMessageResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:24.234-05:00")
public class WebsocketMessageResource {
  @SerializedName("content")
  private Object content = null;

  @SerializedName("message_type")
  private String messageType = null;

  @SerializedName("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  public WebsocketMessageResource content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * The body of the outgoing message.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The body of the outgoing message.")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public WebsocketMessageResource messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * A message type to inform websocket recipient how to parse content
   * @return messageType
  **/
  @ApiModelProperty(value = "A message type to inform websocket recipient how to parse content")
  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public WebsocketMessageResource recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public WebsocketMessageResource addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * A list of user ids to send the message to.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "A list of user ids to send the message to.")
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketMessageResource websocketMessageResource = (WebsocketMessageResource) o;
    return Objects.equals(this.content, websocketMessageResource.content) &&
        Objects.equals(this.messageType, websocketMessageResource.messageType) &&
        Objects.equals(this.recipients, websocketMessageResource.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, messageType, recipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketMessageResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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


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
import com.knetikcloud.model.MessageContentResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MessageResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T16:33:10.036-04:00")
public class MessageResource {
  @SerializedName("content")
  private MessageContentResource content = null;

  @SerializedName("recipient")
  private String recipient = null;

  /**
   * The type of recipient for the message. Either a user, or all users in a topic. Required if sending directly to messaging service
   */
  @JsonAdapter(RecipientTypeEnum.Adapter.class)
  public enum RecipientTypeEnum {
    USER("user"),
    
    TOPIC("topic");

    private String value;

    RecipientTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecipientTypeEnum fromValue(String text) {
      for (RecipientTypeEnum b : RecipientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RecipientTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecipientTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecipientTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecipientTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("recipient_type")
  private RecipientTypeEnum recipientType = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("type")
  private String type = null;

  public MessageResource content(MessageContentResource content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the message in various formats
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The content of the message in various formats")
  public MessageContentResource getContent() {
    return content;
  }

  public void setContent(MessageContentResource content) {
    this.content = content;
  }

  public MessageResource recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * The id of the recipient, dependent on the recipient_type. The user&#39;s id or the topic&#39;s id. Required if sending directly to messaging service
   * @return recipient
  **/
  @ApiModelProperty(value = "The id of the recipient, dependent on the recipient_type. The user's id or the topic's id. Required if sending directly to messaging service")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public MessageResource recipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * The type of recipient for the message. Either a user, or all users in a topic. Required if sending directly to messaging service
   * @return recipientType
  **/
  @ApiModelProperty(value = "The type of recipient for the message. Either a user, or all users in a topic. Required if sending directly to messaging service")
  public RecipientTypeEnum getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }

  public MessageResource subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the message. Required for email messages
   * @return subject
  **/
  @ApiModelProperty(value = "The subject of the message. Required for email messages")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MessageResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of message for websocket type hinting. will be added to the payload with the key _type
   * @return type
  **/
  @ApiModelProperty(value = "The type of message for websocket type hinting. will be added to the payload with the key _type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResource messageResource = (MessageResource) o;
    return Objects.equals(this.content, messageResource.content) &&
        Objects.equals(this.recipient, messageResource.recipient) &&
        Objects.equals(this.recipientType, messageResource.recipientType) &&
        Objects.equals(this.subject, messageResource.subject) &&
        Objects.equals(this.type, messageResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, recipient, recipientType, subject, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
 * ChatMessageResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T13:11:14.426-05:00")
public class ChatMessageResource {
  @SerializedName("content")
  private Object content = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("edited")
  private Boolean edited = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("message_type")
  private String messageType = null;

  @SerializedName("recipient_id")
  private String recipientId = null;

  /**
   * The recipient type of the message
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

  @SerializedName("sender_id")
  private Integer senderId = null;

  @SerializedName("thread_id")
  private String threadId = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public ChatMessageResource content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the message
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The content of the message")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

   /**
   * The date the chat message was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the chat message was created")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * Whether the message has been edited
   * @return edited
  **/
  @ApiModelProperty(example = "false", value = "Whether the message has been edited")
  public Boolean isEdited() {
    return edited;
  }

   /**
   * The id for this message
   * @return id
  **/
  @ApiModelProperty(value = "The id for this message")
  public String getId() {
    return id;
  }

  public ChatMessageResource messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * The type of the message set by the client
   * @return messageType
  **/
  @ApiModelProperty(required = true, value = "The type of the message set by the client")
  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public ChatMessageResource recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The id of the recipient: user id or topic id
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The id of the recipient: user id or topic id")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public ChatMessageResource recipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * The recipient type of the message
   * @return recipientType
  **/
  @ApiModelProperty(required = true, value = "The recipient type of the message")
  public RecipientTypeEnum getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }

   /**
   * The id of the sender
   * @return senderId
  **/
  @ApiModelProperty(value = "The id of the sender")
  public Integer getSenderId() {
    return senderId;
  }

   /**
   * The id of the thread
   * @return threadId
  **/
  @ApiModelProperty(value = "The id of the thread")
  public String getThreadId() {
    return threadId;
  }

   /**
   * The date the chat message was updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the chat message was updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessageResource chatMessageResource = (ChatMessageResource) o;
    return Objects.equals(this.content, chatMessageResource.content) &&
        Objects.equals(this.createdDate, chatMessageResource.createdDate) &&
        Objects.equals(this.edited, chatMessageResource.edited) &&
        Objects.equals(this.id, chatMessageResource.id) &&
        Objects.equals(this.messageType, chatMessageResource.messageType) &&
        Objects.equals(this.recipientId, chatMessageResource.recipientId) &&
        Objects.equals(this.recipientType, chatMessageResource.recipientType) &&
        Objects.equals(this.senderId, chatMessageResource.senderId) &&
        Objects.equals(this.threadId, chatMessageResource.threadId) &&
        Objects.equals(this.updatedDate, chatMessageResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, createdDate, edited, id, messageType, recipientId, recipientType, senderId, threadId, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessageResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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


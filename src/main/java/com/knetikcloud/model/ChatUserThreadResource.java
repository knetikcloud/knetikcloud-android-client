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
import com.knetikcloud.model.ChatThreadResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChatUserThreadResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:01.795-05:00")
public class ChatUserThreadResource {
  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("read_count")
  private Integer readCount = null;

  @SerializedName("thread")
  private ChatThreadResource thread = null;

  @SerializedName("thread_id")
  private String threadId = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user_id")
  private Integer userId = null;

   /**
   * The date the user thread was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the user thread was created")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The number of messages read in the thread
   * @return readCount
  **/
  @ApiModelProperty(value = "The number of messages read in the thread")
  public Integer getReadCount() {
    return readCount;
  }

  public ChatUserThreadResource thread(ChatThreadResource thread) {
    this.thread = thread;
    return this;
  }

   /**
   * The details about the thread
   * @return thread
  **/
  @ApiModelProperty(value = "The details about the thread")
  public ChatThreadResource getThread() {
    return thread;
  }

  public void setThread(ChatThreadResource thread) {
    this.thread = thread;
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
   * The date the user thread was updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the user thread was updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public ChatUserThreadResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user
   * @return userId
  **/
  @ApiModelProperty(value = "The id of the user")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatUserThreadResource chatUserThreadResource = (ChatUserThreadResource) o;
    return Objects.equals(this.createdDate, chatUserThreadResource.createdDate) &&
        Objects.equals(this.readCount, chatUserThreadResource.readCount) &&
        Objects.equals(this.thread, chatUserThreadResource.thread) &&
        Objects.equals(this.threadId, chatUserThreadResource.threadId) &&
        Objects.equals(this.updatedDate, chatUserThreadResource.updatedDate) &&
        Objects.equals(this.userId, chatUserThreadResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, readCount, thread, threadId, updatedDate, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatUserThreadResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    readCount: ").append(toIndentedString(readCount)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


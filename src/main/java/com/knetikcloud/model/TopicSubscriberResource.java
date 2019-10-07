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
 * TopicSubscriberResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-07T16:43:21.868-04:00")
public class TopicSubscriberResource {
  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("topic_id")
  private String topicId = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("username")
  private String username = null;

  public TopicSubscriberResource disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether the user has disabled messages from the topic
   * @return disabled
  **/
  @ApiModelProperty(example = "false", value = "Whether the user has disabled messages from the topic")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public TopicSubscriberResource topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * The ID for this topic
   * @return topicId
  **/
  @ApiModelProperty(required = true, value = "The ID for this topic")
  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public TopicSubscriberResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user ID subscribed to the topic
   * @return userId
  **/
  @ApiModelProperty(value = "The user ID subscribed to the topic")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public TopicSubscriberResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username subscribed to the topic
   * @return username
  **/
  @ApiModelProperty(value = "The username subscribed to the topic")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicSubscriberResource topicSubscriberResource = (TopicSubscriberResource) o;
    return Objects.equals(this.disabled, topicSubscriberResource.disabled) &&
        Objects.equals(this.topicId, topicSubscriberResource.topicId) &&
        Objects.equals(this.userId, topicSubscriberResource.userId) &&
        Objects.equals(this.username, topicSubscriberResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, topicId, userId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicSubscriberResource {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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


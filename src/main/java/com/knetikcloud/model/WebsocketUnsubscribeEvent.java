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
import com.knetikcloud.model.BroadcastableEvent;
import com.knetikcloud.model.Topic;
import com.knetikcloud.model.TopicSubscriber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebsocketUnsubscribeEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T13:20:56.767-04:00")
public class WebsocketUnsubscribeEvent extends BroadcastableEvent {
  @SerializedName("topic")
  private Topic topic = null;

  @SerializedName("topic_subscriber")
  private TopicSubscriber topicSubscriber = null;

  public WebsocketUnsubscribeEvent topic(Topic topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @ApiModelProperty(value = "")
  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Topic topic) {
    this.topic = topic;
  }

  public WebsocketUnsubscribeEvent topicSubscriber(TopicSubscriber topicSubscriber) {
    this.topicSubscriber = topicSubscriber;
    return this;
  }

   /**
   * Get topicSubscriber
   * @return topicSubscriber
  **/
  @ApiModelProperty(value = "")
  public TopicSubscriber getTopicSubscriber() {
    return topicSubscriber;
  }

  public void setTopicSubscriber(TopicSubscriber topicSubscriber) {
    this.topicSubscriber = topicSubscriber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketUnsubscribeEvent websocketUnsubscribeEvent = (WebsocketUnsubscribeEvent) o;
    return Objects.equals(this.topic, websocketUnsubscribeEvent.topic) &&
        Objects.equals(this.topicSubscriber, websocketUnsubscribeEvent.topicSubscriber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, topicSubscriber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketUnsubscribeEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    topicSubscriber: ").append(toIndentedString(topicSubscriber)).append("\n");
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


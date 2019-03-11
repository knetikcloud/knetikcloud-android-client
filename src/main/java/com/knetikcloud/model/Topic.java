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
 * Topic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T10:17:25.583-04:00")
public class Topic {
  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("topic_map")
  private Object topicMap = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user_count")
  private Integer userCount = null;

  public Topic createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public Topic displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Topic id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Topic locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Topic tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Topic addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Topic topicMap(Object topicMap) {
    this.topicMap = topicMap;
    return this;
  }

   /**
   * Get topicMap
   * @return topicMap
  **/
  @ApiModelProperty(value = "")
  public Object getTopicMap() {
    return topicMap;
  }

  public void setTopicMap(Object topicMap) {
    this.topicMap = topicMap;
  }

  public Topic updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  @ApiModelProperty(value = "")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Topic userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @ApiModelProperty(value = "")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topic topic = (Topic) o;
    return Objects.equals(this.createdDate, topic.createdDate) &&
        Objects.equals(this.displayName, topic.displayName) &&
        Objects.equals(this.id, topic.id) &&
        Objects.equals(this.locked, topic.locked) &&
        Objects.equals(this.tags, topic.tags) &&
        Objects.equals(this.topicMap, topic.topicMap) &&
        Objects.equals(this.updatedDate, topic.updatedDate) &&
        Objects.equals(this.userCount, topic.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, displayName, id, locked, tags, topicMap, updatedDate, userCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topic {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    topicMap: ").append(toIndentedString(topicMap)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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


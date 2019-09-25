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
 * MessageTemplateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:41:32.579-04:00")
public class MessageTemplateResource {
  @SerializedName("content")
  private String content = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public MessageTemplateResource content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the template. See Apache Velocity documentation for formatting
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The content of the template. See Apache Velocity documentation for formatting")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MessageTemplateResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the template. Cannot be changed after creation. default: auto generated
   * @return id
  **/
  @ApiModelProperty(value = "The id of the template. Cannot be changed after creation. default: auto generated")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageTemplateResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MessageTemplateResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MessageTemplateResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for search purposes. Will be converted to lower case
   * @return tags
  **/
  @ApiModelProperty(value = "A list of tags for search purposes. Will be converted to lower case")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateResource messageTemplateResource = (MessageTemplateResource) o;
    return Objects.equals(this.content, messageTemplateResource.content) &&
        Objects.equals(this.id, messageTemplateResource.id) &&
        Objects.equals(this.name, messageTemplateResource.name) &&
        Objects.equals(this.tags, messageTemplateResource.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, id, name, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


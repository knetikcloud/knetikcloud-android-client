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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChatBlacklistResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T15:40:11.397-05:00")
public class ChatBlacklistResource {
  @SerializedName("blacklisted_user")
  private SimpleUserResource blacklistedUser = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public ChatBlacklistResource blacklistedUser(SimpleUserResource blacklistedUser) {
    this.blacklistedUser = blacklistedUser;
    return this;
  }

   /**
   * The user that is blacklisted
   * @return blacklistedUser
  **/
  @ApiModelProperty(value = "The user that is blacklisted")
  public SimpleUserResource getBlacklistedUser() {
    return blacklistedUser;
  }

  public void setBlacklistedUser(SimpleUserResource blacklistedUser) {
    this.blacklistedUser = blacklistedUser;
  }

   /**
   * The date the user was blacklisted
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the user was blacklisted")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The unique ID for this chat message blacklist
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for this chat message blacklist")
  public String getId() {
    return id;
  }

   /**
   * The user that has blacklisted someone
   * @return userId
  **/
  @ApiModelProperty(value = "The user that has blacklisted someone")
  public Integer getUserId() {
    return userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatBlacklistResource chatBlacklistResource = (ChatBlacklistResource) o;
    return Objects.equals(this.blacklistedUser, chatBlacklistResource.blacklistedUser) &&
        Objects.equals(this.createdDate, chatBlacklistResource.createdDate) &&
        Objects.equals(this.id, chatBlacklistResource.id) &&
        Objects.equals(this.userId, chatBlacklistResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blacklistedUser, createdDate, id, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatBlacklistResource {\n");
    
    sb.append("    blacklistedUser: ").append(toIndentedString(blacklistedUser)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


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
 * NotificationUserTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T16:33:10.036-04:00")
public class NotificationUserTypeResource {
  @SerializedName("silenced")
  private Boolean silenced = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public NotificationUserTypeResource silenced(Boolean silenced) {
    this.silenced = silenced;
    return this;
  }

   /**
   * Whether the user has muted direct notification of this type. Notifications can still be retrieved via the api
   * @return silenced
  **/
  @ApiModelProperty(example = "false", value = "Whether the user has muted direct notification of this type. Notifications can still be retrieved via the api")
  public Boolean isSilenced() {
    return silenced;
  }

  public void setSilenced(Boolean silenced) {
    this.silenced = silenced;
  }

  public NotificationUserTypeResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The notification type id
   * @return type
  **/
  @ApiModelProperty(value = "The notification type id")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NotificationUserTypeResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user&#39;s id
   * @return userId
  **/
  @ApiModelProperty(value = "The user's id")
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
    NotificationUserTypeResource notificationUserTypeResource = (NotificationUserTypeResource) o;
    return Objects.equals(this.silenced, notificationUserTypeResource.silenced) &&
        Objects.equals(this.type, notificationUserTypeResource.type) &&
        Objects.equals(this.userId, notificationUserTypeResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(silenced, type, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationUserTypeResource {\n");
    
    sb.append("    silenced: ").append(toIndentedString(silenced)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
 * UserSidResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-18T14:10:20.820-05:00")
public class UserSidResource {
  @SerializedName("sid")
  private String sid = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public UserSidResource sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * The security id
   * @return sid
  **/
  @ApiModelProperty(required = true, value = "The security id")
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public UserSidResource userId(Integer userId) {
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
    UserSidResource userSidResource = (UserSidResource) o;
    return Objects.equals(this.sid, userSidResource.sid) &&
        Objects.equals(this.userId, userSidResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sid, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSidResource {\n");
    
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
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


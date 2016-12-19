/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SimpleUserResource {
  
  @SerializedName("avatar_url")
  private String avatarUrl = null;
  @SerializedName("display_name")
  private String displayName = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("username")
  private String username = null;

  /**
   * The url of the user's avatar image
   **/
  @ApiModelProperty(value = "The url of the user's avatar image")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * The public username of the user
   **/
  @ApiModelProperty(value = "The public username of the user")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The id of the user
   **/
  @ApiModelProperty(required = true, value = "The id of the user")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The username of the user
   **/
  @ApiModelProperty(value = "The username of the user")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleUserResource simpleUserResource = (SimpleUserResource) o;
    return (this.avatarUrl == null ? simpleUserResource.avatarUrl == null : this.avatarUrl.equals(simpleUserResource.avatarUrl)) &&
        (this.displayName == null ? simpleUserResource.displayName == null : this.displayName.equals(simpleUserResource.displayName)) &&
        (this.id == null ? simpleUserResource.id == null : this.id.equals(simpleUserResource.id)) &&
        (this.username == null ? simpleUserResource.username == null : this.username.equals(simpleUserResource.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleUserResource {\n");
    
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChallengeEventParticipantResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class ChallengeEventParticipantResource {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("fullname")
  private String fullname = null;

  @JsonProperty("score")
  private Long score = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  @JsonProperty("username")
  private String username = null;

  public ChallengeEventParticipantResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ChallengeEventParticipantResource fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * The full name of the user
   * @return fullname
  **/
  @ApiModelProperty(value = "The full name of the user")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public ChallengeEventParticipantResource score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * The user&#39;s score
   * @return score
  **/
  @ApiModelProperty(value = "The user's score")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public ChallengeEventParticipantResource userId(Integer userId) {
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

  public ChallengeEventParticipantResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the user
   * @return username
  **/
  @ApiModelProperty(value = "The username of the user")
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
    ChallengeEventParticipantResource challengeEventParticipantResource = (ChallengeEventParticipantResource) o;
    return Objects.equals(this.email, challengeEventParticipantResource.email) &&
        Objects.equals(this.fullname, challengeEventParticipantResource.fullname) &&
        Objects.equals(this.score, challengeEventParticipantResource.score) &&
        Objects.equals(this.userId, challengeEventParticipantResource.userId) &&
        Objects.equals(this.username, challengeEventParticipantResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fullname, score, userId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeEventParticipantResource {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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


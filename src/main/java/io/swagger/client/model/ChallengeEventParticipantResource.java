/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
public class ChallengeEventParticipantResource {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("fullname")
  private String fullname = null;
  @SerializedName("score")
  private Long score = null;
  @SerializedName("user_id")
  private Integer userId = null;
  @SerializedName("username")
  private String username = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFullname() {
    return fullname;
  }
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    ChallengeEventParticipantResource challengeEventParticipantResource = (ChallengeEventParticipantResource) o;
    return (this.email == null ? challengeEventParticipantResource.email == null : this.email.equals(challengeEventParticipantResource.email)) &&
        (this.fullname == null ? challengeEventParticipantResource.fullname == null : this.fullname.equals(challengeEventParticipantResource.fullname)) &&
        (this.score == null ? challengeEventParticipantResource.score == null : this.score.equals(challengeEventParticipantResource.score)) &&
        (this.userId == null ? challengeEventParticipantResource.userId == null : this.userId.equals(challengeEventParticipantResource.userId)) &&
        (this.username == null ? challengeEventParticipantResource.username == null : this.username.equals(challengeEventParticipantResource.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.fullname == null ? 0: this.fullname.hashCode());
    result = 31 * result + (this.score == null ? 0: this.score.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeEventParticipantResource {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  fullname: ").append(fullname).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

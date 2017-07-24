/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BareChallengeActivityResource {
  
  @SerializedName("activity_id")
  private Long activityId = null;
  @SerializedName("challenge_id")
  private Long challengeId = null;
  @SerializedName("id")
  private Long id = null;

  /**
   * The id of the activity
   **/
  @ApiModelProperty(required = true, value = "The id of the activity")
  public Long getActivityId() {
    return activityId;
  }
  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  /**
   * The id of the challenge
   **/
  @ApiModelProperty(required = true, value = "The id of the challenge")
  public Long getChallengeId() {
    return challengeId;
  }
  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }

  /**
   * The unique ID for this resource
   **/
  @ApiModelProperty(value = "The unique ID for this resource")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BareChallengeActivityResource bareChallengeActivityResource = (BareChallengeActivityResource) o;
    return (this.activityId == null ? bareChallengeActivityResource.activityId == null : this.activityId.equals(bareChallengeActivityResource.activityId)) &&
        (this.challengeId == null ? bareChallengeActivityResource.challengeId == null : this.challengeId.equals(bareChallengeActivityResource.challengeId)) &&
        (this.id == null ? bareChallengeActivityResource.id == null : this.id.equals(bareChallengeActivityResource.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.activityId == null ? 0: this.activityId.hashCode());
    result = 31 * result + (this.challengeId == null ? 0: this.challengeId.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BareChallengeActivityResource {\n");
    
    sb.append("  activityId: ").append(activityId).append("\n");
    sb.append("  challengeId: ").append(challengeId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

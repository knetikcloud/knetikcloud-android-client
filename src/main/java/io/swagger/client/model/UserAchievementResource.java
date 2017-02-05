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
public class UserAchievementResource {
  
  @SerializedName("achieved")
  private Boolean achieved = null;
  @SerializedName("achievement_name")
  private String achievementName = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("earned_date")
  private Long earnedDate = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * Flag indicating whether the user has earned the achievement
   **/
  @ApiModelProperty(value = "Flag indicating whether the user has earned the achievement")
  public Boolean getAchieved() {
    return achieved;
  }
  public void setAchieved(Boolean achieved) {
    this.achieved = achieved;
  }

  /**
   * The achievement being tracked.  If used for Leveling, this represents the tier name
   **/
  @ApiModelProperty(required = true, value = "The achievement being tracked.  If used for Leveling, this represents the tier name")
  public String getAchievementName() {
    return achievementName;
  }
  public void setAchievementName(String achievementName) {
    this.achievementName = achievementName;
  }

  /**
   * The date/time this resource was created in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The date/time the achievement was earned as a unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date/time the achievement was earned as a unix timestamp in seconds")
  public Long getEarnedDate() {
    return earnedDate;
  }
  public void setEarnedDate(Long earnedDate) {
    this.earnedDate = earnedDate;
  }

  /**
   * The date/time this resource was last updated in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAchievementResource userAchievementResource = (UserAchievementResource) o;
    return (this.achieved == null ? userAchievementResource.achieved == null : this.achieved.equals(userAchievementResource.achieved)) &&
        (this.achievementName == null ? userAchievementResource.achievementName == null : this.achievementName.equals(userAchievementResource.achievementName)) &&
        (this.createdDate == null ? userAchievementResource.createdDate == null : this.createdDate.equals(userAchievementResource.createdDate)) &&
        (this.earnedDate == null ? userAchievementResource.earnedDate == null : this.earnedDate.equals(userAchievementResource.earnedDate)) &&
        (this.updatedDate == null ? userAchievementResource.updatedDate == null : this.updatedDate.equals(userAchievementResource.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.achieved == null ? 0: this.achieved.hashCode());
    result = 31 * result + (this.achievementName == null ? 0: this.achievementName.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.earnedDate == null ? 0: this.earnedDate.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAchievementResource {\n");
    
    sb.append("  achieved: ").append(achieved).append("\n");
    sb.append("  achievementName: ").append(achievementName).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  earnedDate: ").append(earnedDate).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

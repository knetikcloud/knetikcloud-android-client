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

import io.swagger.client.model.UserAchievementResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserAchievementGroupResource {
  
  @SerializedName("achievements")
  private List<UserAchievementResource> achievements = null;
  @SerializedName("group_name")
  private String groupName = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("progress")
  private Integer progress = null;
  @SerializedName("user_id")
  private Integer userId = null;

  /**
   * The list of achievements associated with the group
   **/
  @ApiModelProperty(required = true, value = "The list of achievements associated with the group")
  public List<UserAchievementResource> getAchievements() {
    return achievements;
  }
  public void setAchievements(List<UserAchievementResource> achievements) {
    this.achievements = achievements;
  }

  /**
   * The name of the group.  If used by Leveling, this will represent the level name
   **/
  @ApiModelProperty(required = true, value = "The name of the group.  If used by Leveling, this will represent the level name")
  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * The id of the achievement progress
   **/
  @ApiModelProperty(value = "The id of the achievement progress")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The current progress of the user on the group
   **/
  @ApiModelProperty(required = true, value = "The current progress of the user on the group")
  public Integer getProgress() {
    return progress;
  }
  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  /**
   * The id of the user whose progress is being tracked
   **/
  @ApiModelProperty(required = true, value = "The id of the user whose progress is being tracked")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAchievementGroupResource userAchievementGroupResource = (UserAchievementGroupResource) o;
    return (this.achievements == null ? userAchievementGroupResource.achievements == null : this.achievements.equals(userAchievementGroupResource.achievements)) &&
        (this.groupName == null ? userAchievementGroupResource.groupName == null : this.groupName.equals(userAchievementGroupResource.groupName)) &&
        (this.id == null ? userAchievementGroupResource.id == null : this.id.equals(userAchievementGroupResource.id)) &&
        (this.progress == null ? userAchievementGroupResource.progress == null : this.progress.equals(userAchievementGroupResource.progress)) &&
        (this.userId == null ? userAchievementGroupResource.userId == null : this.userId.equals(userAchievementGroupResource.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.achievements == null ? 0: this.achievements.hashCode());
    result = 31 * result + (this.groupName == null ? 0: this.groupName.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.progress == null ? 0: this.progress.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAchievementGroupResource {\n");
    
    sb.append("  achievements: ").append(achievements).append("\n");
    sb.append("  groupName: ").append(groupName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  progress: ").append(progress).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserActionLog {
  
  @SerializedName("action_description")
  private String actionDescription = null;
  @SerializedName("action_name")
  private String actionName = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("details")
  private Map<String, String> details = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("request_id")
  private String requestId = null;
  @SerializedName("user_id")
  private Integer userId = null;

  /**
   * A description of the action taken
   **/
  @ApiModelProperty(required = true, value = "A description of the action taken")
  public String getActionDescription() {
    return actionDescription;
  }
  public void setActionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
  }

  /**
   * The name of the action taken
   **/
  @ApiModelProperty(required = true, value = "The name of the action taken")
  public String getActionName() {
    return actionName;
  }
  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  /**
   * The date of the action, unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date of the action, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * A map of additional details such as the target of the action
   **/
  @ApiModelProperty(value = "A map of additional details such as the target of the action")
  public Map<String, String> getDetails() {
    return details;
  }
  public void setDetails(Map<String, String> details) {
    this.details = details;
  }

  /**
   * The id of the log entry
   **/
  @ApiModelProperty(value = "The id of the log entry")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The id of the api request that spawned the action, if generated internally
   **/
  @ApiModelProperty(value = "The id of the api request that spawned the action, if generated internally")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * The id of the user that took the action, if any. Read-only if not posting with LOGS_ADMIN
   **/
  @ApiModelProperty(value = "The id of the user that took the action, if any. Read-only if not posting with LOGS_ADMIN")
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
    UserActionLog userActionLog = (UserActionLog) o;
    return (this.actionDescription == null ? userActionLog.actionDescription == null : this.actionDescription.equals(userActionLog.actionDescription)) &&
        (this.actionName == null ? userActionLog.actionName == null : this.actionName.equals(userActionLog.actionName)) &&
        (this.createdDate == null ? userActionLog.createdDate == null : this.createdDate.equals(userActionLog.createdDate)) &&
        (this.details == null ? userActionLog.details == null : this.details.equals(userActionLog.details)) &&
        (this.id == null ? userActionLog.id == null : this.id.equals(userActionLog.id)) &&
        (this.requestId == null ? userActionLog.requestId == null : this.requestId.equals(userActionLog.requestId)) &&
        (this.userId == null ? userActionLog.userId == null : this.userId.equals(userActionLog.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.actionDescription == null ? 0: this.actionDescription.hashCode());
    result = 31 * result + (this.actionName == null ? 0: this.actionName.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.requestId == null ? 0: this.requestId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActionLog {\n");
    
    sb.append("  actionDescription: ").append(actionDescription).append("\n");
    sb.append("  actionName: ").append(actionName).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  requestId: ").append(requestId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

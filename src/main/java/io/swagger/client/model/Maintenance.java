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
public class Maintenance {
  
  @SerializedName("access_locked")
  private Boolean accessLocked = null;
  @SerializedName("details")
  private Object details = null;
  @SerializedName("message")
  private String message = null;

  /**
   * Whether access to the system has been locked
   **/
  @ApiModelProperty(required = true, value = "Whether access to the system has been locked")
  public Boolean getAccessLocked() {
    return accessLocked;
  }
  public void setAccessLocked(Boolean accessLocked) {
    this.accessLocked = accessLocked;
  }

  /**
   * A simple object of any schema for client side use and processing
   **/
  @ApiModelProperty(value = "A simple object of any schema for client side use and processing")
  public Object getDetails() {
    return details;
  }
  public void setDetails(Object details) {
    this.details = details;
  }

  /**
   * User displayable message about the maintenance
   **/
  @ApiModelProperty(required = true, value = "User displayable message about the maintenance")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Maintenance maintenance = (Maintenance) o;
    return (this.accessLocked == null ? maintenance.accessLocked == null : this.accessLocked.equals(maintenance.accessLocked)) &&
        (this.details == null ? maintenance.details == null : this.details.equals(maintenance.details)) &&
        (this.message == null ? maintenance.message == null : this.message.equals(maintenance.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accessLocked == null ? 0: this.accessLocked.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Maintenance {\n");
    
    sb.append("  accessLocked: ").append(accessLocked).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

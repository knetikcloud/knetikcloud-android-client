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

import io.swagger.client.model.MetricResource;
import io.swagger.client.model.SimpleUserResource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ActivityUserResource {
  
  @SerializedName("host")
  private Boolean host = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("joined_date")
  private Long joinedDate = null;
  @SerializedName("left_date")
  private Long leftDate = null;
  @SerializedName("metric")
  private MetricResource metric = null;
  public enum StatusEnum {
     present,  ready,  left,  surrendered,  disconnected, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("user")
  private SimpleUserResource user = null;

  /**
   * Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false)
   **/
  @ApiModelProperty(value = "Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false)")
  public Boolean getHost() {
    return host;
  }
  public void setHost(Boolean host) {
    this.host = host;
  }

  /**
   * The id of the activity user entry
   **/
  @ApiModelProperty(value = "The id of the activity user entry")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The date this user last joined the occurrence, unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date this user last joined the occurrence, unix timestamp in seconds")
  public Long getJoinedDate() {
    return joinedDate;
  }
  public void setJoinedDate(Long joinedDate) {
    this.joinedDate = joinedDate;
  }

  /**
   * The date this user last left the occurrence, unix timestamp in seconds. Null if still present
   **/
  @ApiModelProperty(value = "The date this user last left the occurrence, unix timestamp in seconds. Null if still present")
  public Long getLeftDate() {
    return leftDate;
  }
  public void setLeftDate(Long leftDate) {
    this.leftDate = leftDate;
  }

  /**
   * The metric for the user's results, after the game is over
   **/
  @ApiModelProperty(value = "The metric for the user's results, after the game is over")
  public MetricResource getMetric() {
    return metric;
  }
  public void setMetric(MetricResource metric) {
    this.metric = metric;
  }

  /**
   * The current status of the user in the occurrence (default: present)
   **/
  @ApiModelProperty(value = "The current status of the user in the occurrence (default: present)")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The user
   **/
  @ApiModelProperty(required = true, value = "The user")
  public SimpleUserResource getUser() {
    return user;
  }
  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityUserResource activityUserResource = (ActivityUserResource) o;
    return (this.host == null ? activityUserResource.host == null : this.host.equals(activityUserResource.host)) &&
        (this.id == null ? activityUserResource.id == null : this.id.equals(activityUserResource.id)) &&
        (this.joinedDate == null ? activityUserResource.joinedDate == null : this.joinedDate.equals(activityUserResource.joinedDate)) &&
        (this.leftDate == null ? activityUserResource.leftDate == null : this.leftDate.equals(activityUserResource.leftDate)) &&
        (this.metric == null ? activityUserResource.metric == null : this.metric.equals(activityUserResource.metric)) &&
        (this.status == null ? activityUserResource.status == null : this.status.equals(activityUserResource.status)) &&
        (this.user == null ? activityUserResource.user == null : this.user.equals(activityUserResource.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.host == null ? 0: this.host.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.joinedDate == null ? 0: this.joinedDate.hashCode());
    result = 31 * result + (this.leftDate == null ? 0: this.leftDate.hashCode());
    result = 31 * result + (this.metric == null ? 0: this.metric.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityUserResource {\n");
    
    sb.append("  host: ").append(host).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  joinedDate: ").append(joinedDate).append("\n");
    sb.append("  leftDate: ").append(leftDate).append("\n");
    sb.append("  metric: ").append(metric).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

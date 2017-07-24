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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MetricResource {
  
  @SerializedName("activity_occurence_id")
  private Long activityOccurenceId = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("value")
  private Long value = null;

  /**
   * The id of the activity occurence where this score/metric occurred
   **/
  @ApiModelProperty(required = true, value = "The id of the activity occurence where this score/metric occurred")
  public Long getActivityOccurenceId() {
    return activityOccurenceId;
  }
  public void setActivityOccurenceId(Long activityOccurenceId) {
    this.activityOccurenceId = activityOccurenceId;
  }

  /**
   * Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each
   **/
  @ApiModelProperty(value = "Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The value/score of the metric
   **/
  @ApiModelProperty(required = true, value = "The value/score of the metric")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricResource metricResource = (MetricResource) o;
    return (this.activityOccurenceId == null ? metricResource.activityOccurenceId == null : this.activityOccurenceId.equals(metricResource.activityOccurenceId)) &&
        (this.tags == null ? metricResource.tags == null : this.tags.equals(metricResource.tags)) &&
        (this.value == null ? metricResource.value == null : this.value.equals(metricResource.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.activityOccurenceId == null ? 0: this.activityOccurenceId.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricResource {\n");
    
    sb.append("  activityOccurenceId: ").append(activityOccurenceId).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import com.knetikcloud.model.ContributionResource;
import com.knetikcloud.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ArtistResource {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("born")
  private String born = null;
  @SerializedName("contribution_count")
  private Integer contributionCount = null;
  @SerializedName("contributions")
  private List<ContributionResource> contributions = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("died")
  private String died = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("priority")
  private Integer priority = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * YYYY/MM/DD when this artist was born
   **/
  @ApiModelProperty(value = "YYYY/MM/DD when this artist was born")
  public String getBorn() {
    return born;
  }
  public void setBorn(String born) {
    this.born = born;
  }

  /**
   * The current number of contributions the artist has made
   **/
  @ApiModelProperty(value = "The current number of contributions the artist has made")
  public Integer getContributionCount() {
    return contributionCount;
  }
  public void setContributionCount(Integer contributionCount) {
    this.contributionCount = contributionCount;
  }

  /**
   * The list of media this artist has contributed to as well as role(s) during contribution.  Use media endpoint to add contributions
   **/
  @ApiModelProperty(value = "The list of media this artist has contributed to as well as role(s) during contribution.  Use media endpoint to add contributions")
  public List<ContributionResource> getContributions() {
    return contributions;
  }
  public void setContributions(List<ContributionResource> contributions) {
    this.contributions = contributions;
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
   * YYYY/MM/DD when this artist died
   **/
  @ApiModelProperty(value = "YYYY/MM/DD when this artist died")
  public String getDied() {
    return died;
  }
  public void setDied(String died) {
    this.died = died;
  }

  /**
   * The unique ID for that resource
   **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * The user friendly name of that resource
   **/
  @ApiModelProperty(required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The sort order priority ofr the artist.  Default 100
   **/
  @ApiModelProperty(value = "The sort order priority ofr the artist.  Default 100")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * An artist template this artist is validated against (private). May be null and no validation of additional_properties will be done
   **/
  @ApiModelProperty(value = "An artist template this artist is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
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
    ArtistResource artistResource = (ArtistResource) o;
    return (this.additionalProperties == null ? artistResource.additionalProperties == null : this.additionalProperties.equals(artistResource.additionalProperties)) &&
        (this.born == null ? artistResource.born == null : this.born.equals(artistResource.born)) &&
        (this.contributionCount == null ? artistResource.contributionCount == null : this.contributionCount.equals(artistResource.contributionCount)) &&
        (this.contributions == null ? artistResource.contributions == null : this.contributions.equals(artistResource.contributions)) &&
        (this.createdDate == null ? artistResource.createdDate == null : this.createdDate.equals(artistResource.createdDate)) &&
        (this.died == null ? artistResource.died == null : this.died.equals(artistResource.died)) &&
        (this.id == null ? artistResource.id == null : this.id.equals(artistResource.id)) &&
        (this.longDescription == null ? artistResource.longDescription == null : this.longDescription.equals(artistResource.longDescription)) &&
        (this.name == null ? artistResource.name == null : this.name.equals(artistResource.name)) &&
        (this.priority == null ? artistResource.priority == null : this.priority.equals(artistResource.priority)) &&
        (this.shortDescription == null ? artistResource.shortDescription == null : this.shortDescription.equals(artistResource.shortDescription)) &&
        (this.template == null ? artistResource.template == null : this.template.equals(artistResource.template)) &&
        (this.updatedDate == null ? artistResource.updatedDate == null : this.updatedDate.equals(artistResource.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.born == null ? 0: this.born.hashCode());
    result = 31 * result + (this.contributionCount == null ? 0: this.contributionCount.hashCode());
    result = 31 * result + (this.contributions == null ? 0: this.contributions.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.died == null ? 0: this.died.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.priority == null ? 0: this.priority.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistResource {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  born: ").append(born).append("\n");
    sb.append("  contributionCount: ").append(contributionCount).append("\n");
    sb.append("  contributions: ").append(contributions).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  died: ").append(died).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

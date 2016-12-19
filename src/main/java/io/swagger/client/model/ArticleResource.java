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

import io.swagger.client.model.NestedCategory;
import io.swagger.client.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ArticleResource {
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("body")
  private String body = null;
  @SerializedName("category")
  private NestedCategory category = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * Whether the article is active
   **/
  @ApiModelProperty(required = true, value = "Whether the article is active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

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
   * The body of the article
   **/
  @ApiModelProperty(required = true, value = "The body of the article")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * The category for the article
   **/
  @ApiModelProperty(required = true, value = "The category for the article")
  public NestedCategory getCategory() {
    return category;
  }
  public void setCategory(NestedCategory category) {
    this.category = category;
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
   * The id of the article
   **/
  @ApiModelProperty(value = "The id of the article")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The tags for the article
   **/
  @ApiModelProperty(value = "The tags for the article")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * An article template this article is validated against (private). May be null and no validation of additional_properties will be done
   **/
  @ApiModelProperty(value = "An article template this article is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * The title of the article
   **/
  @ApiModelProperty(required = true, value = "The title of the article")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
    ArticleResource articleResource = (ArticleResource) o;
    return (this.active == null ? articleResource.active == null : this.active.equals(articleResource.active)) &&
        (this.additionalProperties == null ? articleResource.additionalProperties == null : this.additionalProperties.equals(articleResource.additionalProperties)) &&
        (this.body == null ? articleResource.body == null : this.body.equals(articleResource.body)) &&
        (this.category == null ? articleResource.category == null : this.category.equals(articleResource.category)) &&
        (this.createdDate == null ? articleResource.createdDate == null : this.createdDate.equals(articleResource.createdDate)) &&
        (this.id == null ? articleResource.id == null : this.id.equals(articleResource.id)) &&
        (this.tags == null ? articleResource.tags == null : this.tags.equals(articleResource.tags)) &&
        (this.template == null ? articleResource.template == null : this.template.equals(articleResource.template)) &&
        (this.title == null ? articleResource.title == null : this.title.equals(articleResource.title)) &&
        (this.updatedDate == null ? articleResource.updatedDate == null : this.updatedDate.equals(articleResource.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.body == null ? 0: this.body.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleResource {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  body: ").append(body).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

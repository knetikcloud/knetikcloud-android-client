/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.model;

import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.Item;
import com.knetikcloud.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EntitlementItem extends Item {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("behaviors")
  private List<Behavior> behaviors = null;
  @SerializedName("category")
  private String category = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("sort")
  private Integer sort = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("type_hint")
  private String typeHint = null;
  @SerializedName("unique_key")
  private String uniqueKey = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template
   **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * The behaviors linked to the item, describing various options and interactions. May not be included in item lists
   **/
  @ApiModelProperty(value = "The behaviors linked to the item, describing various options and interactions. May not be included in item lists")
  public List<Behavior> getBehaviors() {
    return behaviors;
  }
  public void setBehaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
  }

  /**
   * A category for filtering items
   **/
  @ApiModelProperty(value = "A category for filtering items")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The date the item was created, unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date the item was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The id of the item
   **/
  @ApiModelProperty(value = "The id of the item")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * A long description of the item
   **/
  @ApiModelProperty(value = "A long description of the item")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * The name of the item
   **/
  @ApiModelProperty(required = true, value = "The name of the item")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A short description of the item, max 255 chars
   **/
  @ApiModelProperty(value = "A short description of the item, max 255 chars")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * A number to use in sorting items.  Default 500
   **/
  @ApiModelProperty(value = "A number to use in sorting items.  Default 500")
  public Integer getSort() {
    return sort;
  }
  public void setSort(Integer sort) {
    this.sort = sort;
  }

  /**
   * List of tags used for filtering items
   **/
  @ApiModelProperty(value = "List of tags used for filtering items")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null
   **/
  @ApiModelProperty(value = "An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * The type of the item
   **/
  @ApiModelProperty(required = true, value = "The type of the item")
  public String getTypeHint() {
    return typeHint;
  }
  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  /**
   * The unique key for the item
   **/
  @ApiModelProperty(value = "The unique key for the item")
  public String getUniqueKey() {
    return uniqueKey;
  }
  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  /**
   * The date the item was last updated, unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date the item was last updated, unix timestamp in seconds")
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
    EntitlementItem entitlementItem = (EntitlementItem) o;
    return (this.additionalProperties == null ? entitlementItem.additionalProperties == null : this.additionalProperties.equals(entitlementItem.additionalProperties)) &&
        (this.behaviors == null ? entitlementItem.behaviors == null : this.behaviors.equals(entitlementItem.behaviors)) &&
        (this.category == null ? entitlementItem.category == null : this.category.equals(entitlementItem.category)) &&
        (this.createdDate == null ? entitlementItem.createdDate == null : this.createdDate.equals(entitlementItem.createdDate)) &&
        (this.id == null ? entitlementItem.id == null : this.id.equals(entitlementItem.id)) &&
        (this.longDescription == null ? entitlementItem.longDescription == null : this.longDescription.equals(entitlementItem.longDescription)) &&
        (this.name == null ? entitlementItem.name == null : this.name.equals(entitlementItem.name)) &&
        (this.shortDescription == null ? entitlementItem.shortDescription == null : this.shortDescription.equals(entitlementItem.shortDescription)) &&
        (this.sort == null ? entitlementItem.sort == null : this.sort.equals(entitlementItem.sort)) &&
        (this.tags == null ? entitlementItem.tags == null : this.tags.equals(entitlementItem.tags)) &&
        (this.template == null ? entitlementItem.template == null : this.template.equals(entitlementItem.template)) &&
        (this.typeHint == null ? entitlementItem.typeHint == null : this.typeHint.equals(entitlementItem.typeHint)) &&
        (this.uniqueKey == null ? entitlementItem.uniqueKey == null : this.uniqueKey.equals(entitlementItem.uniqueKey)) &&
        (this.updatedDate == null ? entitlementItem.updatedDate == null : this.updatedDate.equals(entitlementItem.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.behaviors == null ? 0: this.behaviors.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    result = 31 * result + (this.uniqueKey == null ? 0: this.uniqueKey.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementItem {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  behaviors: ").append(behaviors).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("  uniqueKey: ").append(uniqueKey).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

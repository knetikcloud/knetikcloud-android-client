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

import com.knetikcloud.model.Property;
import com.knetikcloud.model.SubscriptionPlanResource;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SubscriptionResource {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  public enum AvailabilityEnum {
     all,  new_subscribers, 
  };
  @SerializedName("availability")
  private AvailabilityEnum availability = null;
  @SerializedName("category")
  private String category = null;
  @SerializedName("consolidation_day_of_month")
  private Integer consolidationDayOfMonth = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("geo_country_list")
  private List<String> geoCountryList = null;
  public enum GeoPolicyTypeEnum {
     whitelist,  blacklist, 
  };
  @SerializedName("geo_policy_type")
  private GeoPolicyTypeEnum geoPolicyType = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("plans")
  private List<SubscriptionPlanResource> plans = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("sort")
  private Integer sort = null;
  @SerializedName("store_end")
  private Long storeEnd = null;
  @SerializedName("store_start")
  private Long storeStart = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("unique_key")
  private String uniqueKey = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;
  @SerializedName("vendor_id")
  private Integer vendorId = null;

  /**
   * A map of item additional properties, keyed on the property name. Must match the names and types defined in the template for this item type.
   **/
  @ApiModelProperty(value = "A map of item additional properties, keyed on the property name. Must match the names and types defined in the template for this item type.")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * Who can purchase this subscription
   **/
  @ApiModelProperty(value = "Who can purchase this subscription")
  public AvailabilityEnum getAvailability() {
    return availability;
  }
  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
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
   * The day of the month 1..31 this subscription will renew
   **/
  @ApiModelProperty(value = "The day of the month 1..31 this subscription will renew")
  public Integer getConsolidationDayOfMonth() {
    return consolidationDayOfMonth;
  }
  public void setConsolidationDayOfMonth(Integer consolidationDayOfMonth) {
    this.consolidationDayOfMonth = consolidationDayOfMonth;
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
   * A list of country iso3 codes to include in the blacklist/whitelist geo policy
   **/
  @ApiModelProperty(value = "A list of country iso3 codes to include in the blacklist/whitelist geo policy")
  public List<String> getGeoCountryList() {
    return geoCountryList;
  }
  public void setGeoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
  }

  /**
   * Whether to use the geo_country_list as a black list or white list for item geographical availability
   **/
  @ApiModelProperty(value = "Whether to use the geo_country_list as a black list or white list for item geographical availability")
  public GeoPolicyTypeEnum getGeoPolicyType() {
    return geoPolicyType;
  }
  public void setGeoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
    this.geoPolicyType = geoPolicyType;
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
   * A long description of the subscription
   **/
  @ApiModelProperty(value = "A long description of the subscription")
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
   * The billing options for this subscription
   **/
  @ApiModelProperty(value = "The billing options for this subscription")
  public List<SubscriptionPlanResource> getPlans() {
    return plans;
  }
  public void setPlans(List<SubscriptionPlanResource> plans) {
    this.plans = plans;
  }

  /**
   * A short description of the subscription.  Max 255 characters
   **/
  @ApiModelProperty(value = "A short description of the subscription.  Max 255 characters")
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
   * Used to schedule removal from store.  Null means the subscription will never be removed
   **/
  @ApiModelProperty(value = "Used to schedule removal from store.  Null means the subscription will never be removed")
  public Long getStoreEnd() {
    return storeEnd;
  }
  public void setStoreEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
  }

  /**
   * Used to schedule appearance in store.  Null means the subscription will appear now
   **/
  @ApiModelProperty(value = "Used to schedule appearance in store.  Null means the subscription will appear now")
  public Long getStoreStart() {
    return storeStart;
  }
  public void setStoreStart(Long storeStart) {
    this.storeStart = storeStart;
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
   * An item template this item is validated against. May be null and no validation of additional properties will be done.
   **/
  @ApiModelProperty(value = "An item template this item is validated against. May be null and no validation of additional properties will be done.")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
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
   * The date the item was last updated
   **/
  @ApiModelProperty(value = "The date the item was last updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   * The vendor who provides the item
   **/
  @ApiModelProperty(required = true, value = "The vendor who provides the item")
  public Integer getVendorId() {
    return vendorId;
  }
  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResource subscriptionResource = (SubscriptionResource) o;
    return (this.additionalProperties == null ? subscriptionResource.additionalProperties == null : this.additionalProperties.equals(subscriptionResource.additionalProperties)) &&
        (this.availability == null ? subscriptionResource.availability == null : this.availability.equals(subscriptionResource.availability)) &&
        (this.category == null ? subscriptionResource.category == null : this.category.equals(subscriptionResource.category)) &&
        (this.consolidationDayOfMonth == null ? subscriptionResource.consolidationDayOfMonth == null : this.consolidationDayOfMonth.equals(subscriptionResource.consolidationDayOfMonth)) &&
        (this.createdDate == null ? subscriptionResource.createdDate == null : this.createdDate.equals(subscriptionResource.createdDate)) &&
        (this.geoCountryList == null ? subscriptionResource.geoCountryList == null : this.geoCountryList.equals(subscriptionResource.geoCountryList)) &&
        (this.geoPolicyType == null ? subscriptionResource.geoPolicyType == null : this.geoPolicyType.equals(subscriptionResource.geoPolicyType)) &&
        (this.id == null ? subscriptionResource.id == null : this.id.equals(subscriptionResource.id)) &&
        (this.longDescription == null ? subscriptionResource.longDescription == null : this.longDescription.equals(subscriptionResource.longDescription)) &&
        (this.name == null ? subscriptionResource.name == null : this.name.equals(subscriptionResource.name)) &&
        (this.plans == null ? subscriptionResource.plans == null : this.plans.equals(subscriptionResource.plans)) &&
        (this.shortDescription == null ? subscriptionResource.shortDescription == null : this.shortDescription.equals(subscriptionResource.shortDescription)) &&
        (this.sort == null ? subscriptionResource.sort == null : this.sort.equals(subscriptionResource.sort)) &&
        (this.storeEnd == null ? subscriptionResource.storeEnd == null : this.storeEnd.equals(subscriptionResource.storeEnd)) &&
        (this.storeStart == null ? subscriptionResource.storeStart == null : this.storeStart.equals(subscriptionResource.storeStart)) &&
        (this.tags == null ? subscriptionResource.tags == null : this.tags.equals(subscriptionResource.tags)) &&
        (this.template == null ? subscriptionResource.template == null : this.template.equals(subscriptionResource.template)) &&
        (this.uniqueKey == null ? subscriptionResource.uniqueKey == null : this.uniqueKey.equals(subscriptionResource.uniqueKey)) &&
        (this.updatedDate == null ? subscriptionResource.updatedDate == null : this.updatedDate.equals(subscriptionResource.updatedDate)) &&
        (this.vendorId == null ? subscriptionResource.vendorId == null : this.vendorId.equals(subscriptionResource.vendorId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.availability == null ? 0: this.availability.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.consolidationDayOfMonth == null ? 0: this.consolidationDayOfMonth.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.geoCountryList == null ? 0: this.geoCountryList.hashCode());
    result = 31 * result + (this.geoPolicyType == null ? 0: this.geoPolicyType.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.plans == null ? 0: this.plans.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.storeEnd == null ? 0: this.storeEnd.hashCode());
    result = 31 * result + (this.storeStart == null ? 0: this.storeStart.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.uniqueKey == null ? 0: this.uniqueKey.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    result = 31 * result + (this.vendorId == null ? 0: this.vendorId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResource {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  availability: ").append(availability).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  consolidationDayOfMonth: ").append(consolidationDayOfMonth).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  geoCountryList: ").append(geoCountryList).append("\n");
    sb.append("  geoPolicyType: ").append(geoPolicyType).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  plans: ").append(plans).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  storeEnd: ").append(storeEnd).append("\n");
    sb.append("  storeStart: ").append(storeStart).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  uniqueKey: ").append(uniqueKey).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("  vendorId: ").append(vendorId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import io.swagger.client.model.Behavior;
import io.swagger.client.model.Property;
import io.swagger.client.model.Sku;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ShippingItem {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("behaviors")
  private List<Behavior> behaviors = null;
  @SerializedName("category")
  private String category = null;
  @SerializedName("countries")
  private List<String> countries = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("displayable")
  private Boolean displayable = null;
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
  @SerializedName("max_tier_total")
  private Integer maxTierTotal = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("shipping_tier")
  private Integer shippingTier = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("skus")
  private List<Sku> skus = null;
  @SerializedName("sort")
  private Integer sort = null;
  @SerializedName("store_end")
  private Long storeEnd = null;
  @SerializedName("store_start")
  private Long storeStart = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("taxable")
  private Boolean taxable = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("type_hint")
  private String typeHint = null;
  @SerializedName("unique_key")
  private String uniqueKey = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;
  @SerializedName("vendor_id")
  private Integer vendorId = null;

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
   * A unique list of country iso3 codes that allow the shipping option
   **/
  @ApiModelProperty(value = "A unique list of country iso3 codes that allow the shipping option")
  public List<String> getCountries() {
    return countries;
  }
  public void setCountries(List<String> countries) {
    this.countries = countries;
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
   * Whether or not the item is currently displayable.  Default = true
   **/
  @ApiModelProperty(value = "Whether or not the item is currently displayable.  Default = true")
  public Boolean getDisplayable() {
    return displayable;
  }
  public void setDisplayable(Boolean displayable) {
    this.displayable = displayable;
  }

  /**
   * A list of country ID to include in the blacklist/whitelist geo policy
   **/
  @ApiModelProperty(value = "A list of country ID to include in the blacklist/whitelist geo policy")
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
   * An abstract max value that the values of item's shipping_tier work against to decide whether an order can be fulfilled
   **/
  @ApiModelProperty(required = true, value = "An abstract max value that the values of item's shipping_tier work against to decide whether an order can be fulfilled")
  public Integer getMaxTierTotal() {
    return maxTierTotal;
  }
  public void setMaxTierTotal(Integer maxTierTotal) {
    this.maxTierTotal = maxTierTotal;
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
   * Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0
   **/
  @ApiModelProperty(value = "Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0")
  public Integer getShippingTier() {
    return shippingTier;
  }
  public void setShippingTier(Integer shippingTier) {
    this.shippingTier = shippingTier;
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
   * The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart
   **/
  @ApiModelProperty(required = true, value = "The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart")
  public List<Sku> getSkus() {
    return skus;
  }
  public void setSkus(List<Sku> skus) {
    this.skus = skus;
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
   * The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store
   **/
  @ApiModelProperty(value = "The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store")
  public Long getStoreEnd() {
    return storeEnd;
  }
  public void setStoreEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
  }

  /**
   * The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately
   **/
  @ApiModelProperty(value = "The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately")
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
   * Whether tax should be applied to the shipping price.  Default = false
   **/
  @ApiModelProperty(value = "Whether tax should be applied to the shipping price.  Default = false")
  public Boolean getTaxable() {
    return taxable;
  }
  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
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
    ShippingItem shippingItem = (ShippingItem) o;
    return (this.additionalProperties == null ? shippingItem.additionalProperties == null : this.additionalProperties.equals(shippingItem.additionalProperties)) &&
        (this.behaviors == null ? shippingItem.behaviors == null : this.behaviors.equals(shippingItem.behaviors)) &&
        (this.category == null ? shippingItem.category == null : this.category.equals(shippingItem.category)) &&
        (this.countries == null ? shippingItem.countries == null : this.countries.equals(shippingItem.countries)) &&
        (this.createdDate == null ? shippingItem.createdDate == null : this.createdDate.equals(shippingItem.createdDate)) &&
        (this.displayable == null ? shippingItem.displayable == null : this.displayable.equals(shippingItem.displayable)) &&
        (this.geoCountryList == null ? shippingItem.geoCountryList == null : this.geoCountryList.equals(shippingItem.geoCountryList)) &&
        (this.geoPolicyType == null ? shippingItem.geoPolicyType == null : this.geoPolicyType.equals(shippingItem.geoPolicyType)) &&
        (this.id == null ? shippingItem.id == null : this.id.equals(shippingItem.id)) &&
        (this.longDescription == null ? shippingItem.longDescription == null : this.longDescription.equals(shippingItem.longDescription)) &&
        (this.maxTierTotal == null ? shippingItem.maxTierTotal == null : this.maxTierTotal.equals(shippingItem.maxTierTotal)) &&
        (this.name == null ? shippingItem.name == null : this.name.equals(shippingItem.name)) &&
        (this.shippingTier == null ? shippingItem.shippingTier == null : this.shippingTier.equals(shippingItem.shippingTier)) &&
        (this.shortDescription == null ? shippingItem.shortDescription == null : this.shortDescription.equals(shippingItem.shortDescription)) &&
        (this.skus == null ? shippingItem.skus == null : this.skus.equals(shippingItem.skus)) &&
        (this.sort == null ? shippingItem.sort == null : this.sort.equals(shippingItem.sort)) &&
        (this.storeEnd == null ? shippingItem.storeEnd == null : this.storeEnd.equals(shippingItem.storeEnd)) &&
        (this.storeStart == null ? shippingItem.storeStart == null : this.storeStart.equals(shippingItem.storeStart)) &&
        (this.tags == null ? shippingItem.tags == null : this.tags.equals(shippingItem.tags)) &&
        (this.taxable == null ? shippingItem.taxable == null : this.taxable.equals(shippingItem.taxable)) &&
        (this.template == null ? shippingItem.template == null : this.template.equals(shippingItem.template)) &&
        (this.typeHint == null ? shippingItem.typeHint == null : this.typeHint.equals(shippingItem.typeHint)) &&
        (this.uniqueKey == null ? shippingItem.uniqueKey == null : this.uniqueKey.equals(shippingItem.uniqueKey)) &&
        (this.updatedDate == null ? shippingItem.updatedDate == null : this.updatedDate.equals(shippingItem.updatedDate)) &&
        (this.vendorId == null ? shippingItem.vendorId == null : this.vendorId.equals(shippingItem.vendorId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.behaviors == null ? 0: this.behaviors.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.countries == null ? 0: this.countries.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.displayable == null ? 0: this.displayable.hashCode());
    result = 31 * result + (this.geoCountryList == null ? 0: this.geoCountryList.hashCode());
    result = 31 * result + (this.geoPolicyType == null ? 0: this.geoPolicyType.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.maxTierTotal == null ? 0: this.maxTierTotal.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.shippingTier == null ? 0: this.shippingTier.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.skus == null ? 0: this.skus.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.storeEnd == null ? 0: this.storeEnd.hashCode());
    result = 31 * result + (this.storeStart == null ? 0: this.storeStart.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.taxable == null ? 0: this.taxable.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    result = 31 * result + (this.uniqueKey == null ? 0: this.uniqueKey.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    result = 31 * result + (this.vendorId == null ? 0: this.vendorId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingItem {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  behaviors: ").append(behaviors).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  countries: ").append(countries).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  displayable: ").append(displayable).append("\n");
    sb.append("  geoCountryList: ").append(geoCountryList).append("\n");
    sb.append("  geoPolicyType: ").append(geoPolicyType).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  maxTierTotal: ").append(maxTierTotal).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  shippingTier: ").append(shippingTier).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  skus: ").append(skus).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  storeEnd: ").append(storeEnd).append("\n");
    sb.append("  storeStart: ").append(storeStart).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  taxable: ").append(taxable).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("  uniqueKey: ").append(uniqueKey).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("  vendorId: ").append(vendorId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

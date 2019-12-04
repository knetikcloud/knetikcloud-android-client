/*
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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * QuickPaidRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T08:55:54.185-05:00")
public class QuickPaidRequest {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("billing_address1")
  private String billingAddress1 = null;

  @SerializedName("billing_address2")
  private String billingAddress2 = null;

  @SerializedName("billing_city_name")
  private String billingCityName = null;

  @SerializedName("billing_country_name")
  private String billingCountryName = null;

  @SerializedName("billing_full_name")
  private String billingFullName = null;

  @SerializedName("billing_postal_code")
  private String billingPostalCode = null;

  @SerializedName("billing_state_name")
  private String billingStateName = null;

  @SerializedName("city_name")
  private String cityName = null;

  @SerializedName("country_name")
  private String countryName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("federal_tax")
  private BigDecimal federalTax = null;

  @SerializedName("gift_target")
  private Integer giftTarget = null;

  @SerializedName("item_notes")
  private String itemNotes = null;

  @SerializedName("name_prefix")
  private String namePrefix = null;

  @SerializedName("paid_amount")
  private BigDecimal paidAmount = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("price_override")
  private BigDecimal priceOverride = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("state_name")
  private String stateName = null;

  @SerializedName("state_tax")
  private BigDecimal stateTax = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("transaction_details")
  private String transactionDetails = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public QuickPaidRequest additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public QuickPaidRequest putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this invoice type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this invoice type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public QuickPaidRequest address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Line one of the customer&#39;s shipping address
   * @return address1
  **/
  @ApiModelProperty(value = "Line one of the customer's shipping address")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public QuickPaidRequest address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Line two of the customer&#39;s shipping address
   * @return address2
  **/
  @ApiModelProperty(value = "Line two of the customer's shipping address")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public QuickPaidRequest billingAddress1(String billingAddress1) {
    this.billingAddress1 = billingAddress1;
    return this;
  }

   /**
   * Line one of the customer&#39;s billing address
   * @return billingAddress1
  **/
  @ApiModelProperty(value = "Line one of the customer's billing address")
  public String getBillingAddress1() {
    return billingAddress1;
  }

  public void setBillingAddress1(String billingAddress1) {
    this.billingAddress1 = billingAddress1;
  }

  public QuickPaidRequest billingAddress2(String billingAddress2) {
    this.billingAddress2 = billingAddress2;
    return this;
  }

   /**
   * Line two of the customer&#39;s billing address
   * @return billingAddress2
  **/
  @ApiModelProperty(value = "Line two of the customer's billing address")
  public String getBillingAddress2() {
    return billingAddress2;
  }

  public void setBillingAddress2(String billingAddress2) {
    this.billingAddress2 = billingAddress2;
  }

  public QuickPaidRequest billingCityName(String billingCityName) {
    this.billingCityName = billingCityName;
    return this;
  }

   /**
   * The city for the customer&#39;s billing address
   * @return billingCityName
  **/
  @ApiModelProperty(value = "The city for the customer's billing address")
  public String getBillingCityName() {
    return billingCityName;
  }

  public void setBillingCityName(String billingCityName) {
    this.billingCityName = billingCityName;
  }

  public QuickPaidRequest billingCountryName(String billingCountryName) {
    this.billingCountryName = billingCountryName;
    return this;
  }

   /**
   * The country for the customer&#39;s billing address
   * @return billingCountryName
  **/
  @ApiModelProperty(value = "The country for the customer's billing address")
  public String getBillingCountryName() {
    return billingCountryName;
  }

  public void setBillingCountryName(String billingCountryName) {
    this.billingCountryName = billingCountryName;
  }

  public QuickPaidRequest billingFullName(String billingFullName) {
    this.billingFullName = billingFullName;
    return this;
  }

   /**
   * The customer&#39;s name for the billing address
   * @return billingFullName
  **/
  @ApiModelProperty(value = "The customer's name for the billing address")
  public String getBillingFullName() {
    return billingFullName;
  }

  public void setBillingFullName(String billingFullName) {
    this.billingFullName = billingFullName;
  }

  public QuickPaidRequest billingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
    return this;
  }

   /**
   * The postal code for the customer&#39;s billing address
   * @return billingPostalCode
  **/
  @ApiModelProperty(value = "The postal code for the customer's billing address")
  public String getBillingPostalCode() {
    return billingPostalCode;
  }

  public void setBillingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
  }

  public QuickPaidRequest billingStateName(String billingStateName) {
    this.billingStateName = billingStateName;
    return this;
  }

   /**
   * The state for the customer&#39;s billing address
   * @return billingStateName
  **/
  @ApiModelProperty(value = "The state for the customer's billing address")
  public String getBillingStateName() {
    return billingStateName;
  }

  public void setBillingStateName(String billingStateName) {
    this.billingStateName = billingStateName;
  }

  public QuickPaidRequest cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * The city for the customer&#39;s shipping address
   * @return cityName
  **/
  @ApiModelProperty(value = "The city for the customer's shipping address")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public QuickPaidRequest countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * The country for the customer&#39;s shipping address
   * @return countryName
  **/
  @ApiModelProperty(value = "The country for the customer's shipping address")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public QuickPaidRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The customer&#39;s email address
   * @return email
  **/
  @ApiModelProperty(value = "The customer's email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public QuickPaidRequest federalTax(BigDecimal federalTax) {
    this.federalTax = federalTax;
    return this;
  }

   /**
   * The amount of federal tax to add (increases final price of invoice even if using price override). Minimum 0
   * @return federalTax
  **/
  @ApiModelProperty(value = "The amount of federal tax to add (increases final price of invoice even if using price override). Minimum 0")
  public BigDecimal getFederalTax() {
    return federalTax;
  }

  public void setFederalTax(BigDecimal federalTax) {
    this.federalTax = federalTax;
  }

  public QuickPaidRequest giftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
    return this;
  }

   /**
   * An optional target user to give the item to as a gift
   * @return giftTarget
  **/
  @ApiModelProperty(required = true, value = "An optional target user to give the item to as a gift")
  public Integer getGiftTarget() {
    return giftTarget;
  }

  public void setGiftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
  }

  public QuickPaidRequest itemNotes(String itemNotes) {
    this.itemNotes = itemNotes;
    return this;
  }

   /**
   * An optional note to add to the item
   * @return itemNotes
  **/
  @ApiModelProperty(value = "An optional note to add to the item")
  public String getItemNotes() {
    return itemNotes;
  }

  public void setItemNotes(String itemNotes) {
    this.itemNotes = itemNotes;
  }

  public QuickPaidRequest namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * The customer&#39;s name prefix
   * @return namePrefix
  **/
  @ApiModelProperty(value = "The customer's name prefix")
  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public QuickPaidRequest paidAmount(BigDecimal paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * The amount already paid. Must match final price to complete purchase. Ignored for non-paid endpoints. Minimum 0
   * @return paidAmount
  **/
  @ApiModelProperty(value = "The amount already paid. Must match final price to complete purchase. Ignored for non-paid endpoints. Minimum 0")
  public BigDecimal getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(BigDecimal paidAmount) {
    this.paidAmount = paidAmount;
  }

  public QuickPaidRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code for the customer&#39;s shipping address
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code for the customer's shipping address")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public QuickPaidRequest priceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
    return this;
  }

   /**
   * Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0
   * @return priceOverride
  **/
  @ApiModelProperty(value = "Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0")
  public BigDecimal getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
  }

  public QuickPaidRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * SKU of item being purchased
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "SKU of item being purchased")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public QuickPaidRequest stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

   /**
   * The state for the customer&#39;s shipping address
   * @return stateName
  **/
  @ApiModelProperty(value = "The state for the customer's shipping address")
  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public QuickPaidRequest stateTax(BigDecimal stateTax) {
    this.stateTax = stateTax;
    return this;
  }

   /**
   * The amount of state tax to add (increases final price of invoice even if using price override). Minimum 0
   * @return stateTax
  **/
  @ApiModelProperty(value = "The amount of state tax to add (increases final price of invoice even if using price override). Minimum 0")
  public BigDecimal getStateTax() {
    return stateTax;
  }

  public void setStateTax(BigDecimal stateTax) {
    this.stateTax = stateTax;
  }

  public QuickPaidRequest template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An invoice template this invoice is validated against (private). May be null and no validation of properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "An invoice template this invoice is validated against (private). May be null and no validation of properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public QuickPaidRequest transactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

   /**
   * Transaction details
   * @return transactionDetails
  **/
  @ApiModelProperty(value = "Transaction details")
  public String getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public QuickPaidRequest transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Transaction type
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "Transaction type")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public QuickPaidRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user making the purchase. If null, currently logged in user will be used.
   * @return userId
  **/
  @ApiModelProperty(value = "ID of the user making the purchase. If null, currently logged in user will be used.")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickPaidRequest quickPaidRequest = (QuickPaidRequest) o;
    return Objects.equals(this.additionalProperties, quickPaidRequest.additionalProperties) &&
        Objects.equals(this.address1, quickPaidRequest.address1) &&
        Objects.equals(this.address2, quickPaidRequest.address2) &&
        Objects.equals(this.billingAddress1, quickPaidRequest.billingAddress1) &&
        Objects.equals(this.billingAddress2, quickPaidRequest.billingAddress2) &&
        Objects.equals(this.billingCityName, quickPaidRequest.billingCityName) &&
        Objects.equals(this.billingCountryName, quickPaidRequest.billingCountryName) &&
        Objects.equals(this.billingFullName, quickPaidRequest.billingFullName) &&
        Objects.equals(this.billingPostalCode, quickPaidRequest.billingPostalCode) &&
        Objects.equals(this.billingStateName, quickPaidRequest.billingStateName) &&
        Objects.equals(this.cityName, quickPaidRequest.cityName) &&
        Objects.equals(this.countryName, quickPaidRequest.countryName) &&
        Objects.equals(this.email, quickPaidRequest.email) &&
        Objects.equals(this.federalTax, quickPaidRequest.federalTax) &&
        Objects.equals(this.giftTarget, quickPaidRequest.giftTarget) &&
        Objects.equals(this.itemNotes, quickPaidRequest.itemNotes) &&
        Objects.equals(this.namePrefix, quickPaidRequest.namePrefix) &&
        Objects.equals(this.paidAmount, quickPaidRequest.paidAmount) &&
        Objects.equals(this.postalCode, quickPaidRequest.postalCode) &&
        Objects.equals(this.priceOverride, quickPaidRequest.priceOverride) &&
        Objects.equals(this.sku, quickPaidRequest.sku) &&
        Objects.equals(this.stateName, quickPaidRequest.stateName) &&
        Objects.equals(this.stateTax, quickPaidRequest.stateTax) &&
        Objects.equals(this.template, quickPaidRequest.template) &&
        Objects.equals(this.transactionDetails, quickPaidRequest.transactionDetails) &&
        Objects.equals(this.transactionType, quickPaidRequest.transactionType) &&
        Objects.equals(this.userId, quickPaidRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, address1, address2, billingAddress1, billingAddress2, billingCityName, billingCountryName, billingFullName, billingPostalCode, billingStateName, cityName, countryName, email, federalTax, giftTarget, itemNotes, namePrefix, paidAmount, postalCode, priceOverride, sku, stateName, stateTax, template, transactionDetails, transactionType, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickPaidRequest {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    billingAddress1: ").append(toIndentedString(billingAddress1)).append("\n");
    sb.append("    billingAddress2: ").append(toIndentedString(billingAddress2)).append("\n");
    sb.append("    billingCityName: ").append(toIndentedString(billingCityName)).append("\n");
    sb.append("    billingCountryName: ").append(toIndentedString(billingCountryName)).append("\n");
    sb.append("    billingFullName: ").append(toIndentedString(billingFullName)).append("\n");
    sb.append("    billingPostalCode: ").append(toIndentedString(billingPostalCode)).append("\n");
    sb.append("    billingStateName: ").append(toIndentedString(billingStateName)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    federalTax: ").append(toIndentedString(federalTax)).append("\n");
    sb.append("    giftTarget: ").append(toIndentedString(giftTarget)).append("\n");
    sb.append("    itemNotes: ").append(toIndentedString(itemNotes)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    priceOverride: ").append(toIndentedString(priceOverride)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    stateTax: ").append(toIndentedString(stateTax)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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

import com.knetikcloud.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SubscriptionPlan {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  public enum AvailabilityEnum {
     all,  new_subscribers, 
  };
  @SerializedName("availability")
  private AvailabilityEnum availability = null;
  @SerializedName("bill_grace_days")
  private Integer billGraceDays = null;
  @SerializedName("consolidated")
  private Boolean consolidated = null;
  @SerializedName("first_bill")
  private Integer firstBill = null;
  public enum FirstBillUnitOfTimeEnum {
     millisecond,  second,  minute,  hour,  day,  week,  month,  year, 
  };
  @SerializedName("first_bill_unit_of_time")
  private FirstBillUnitOfTimeEnum firstBillUnitOfTime = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("late_payment_sku")
  private String latePaymentSku = null;
  @SerializedName("locked")
  private Boolean locked = null;
  @SerializedName("max_auto_renew")
  private Integer maxAutoRenew = null;
  @SerializedName("max_bill_attempts")
  private Integer maxBillAttempts = null;
  @SerializedName("migration_plan")
  private String migrationPlan = null;
  @SerializedName("minimum_term")
  private Integer minimumTerm = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("primary_sku")
  private String primarySku = null;
  @SerializedName("reactivation_sku")
  private String reactivationSku = null;
  @SerializedName("recurring_sku")
  private String recurringSku = null;
  @SerializedName("renew_period")
  private Integer renewPeriod = null;
  public enum RenewPeriodUnitOfTimeEnum {
     millisecond,  second,  minute,  hour,  day,  week,  month,  year, 
  };
  @SerializedName("renew_period_unit_of_time")
  private RenewPeriodUnitOfTimeEnum renewPeriodUnitOfTime = null;
  @SerializedName("subscription_id")
  private Integer subscriptionId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AvailabilityEnum getAvailability() {
    return availability;
  }
  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getBillGraceDays() {
    return billGraceDays;
  }
  public void setBillGraceDays(Integer billGraceDays) {
    this.billGraceDays = billGraceDays;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getConsolidated() {
    return consolidated;
  }
  public void setConsolidated(Boolean consolidated) {
    this.consolidated = consolidated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFirstBill() {
    return firstBill;
  }
  public void setFirstBill(Integer firstBill) {
    this.firstBill = firstBill;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FirstBillUnitOfTimeEnum getFirstBillUnitOfTime() {
    return firstBillUnitOfTime;
  }
  public void setFirstBillUnitOfTime(FirstBillUnitOfTimeEnum firstBillUnitOfTime) {
    this.firstBillUnitOfTime = firstBillUnitOfTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLatePaymentSku() {
    return latePaymentSku;
  }
  public void setLatePaymentSku(String latePaymentSku) {
    this.latePaymentSku = latePaymentSku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaxAutoRenew() {
    return maxAutoRenew;
  }
  public void setMaxAutoRenew(Integer maxAutoRenew) {
    this.maxAutoRenew = maxAutoRenew;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaxBillAttempts() {
    return maxBillAttempts;
  }
  public void setMaxBillAttempts(Integer maxBillAttempts) {
    this.maxBillAttempts = maxBillAttempts;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMigrationPlan() {
    return migrationPlan;
  }
  public void setMigrationPlan(String migrationPlan) {
    this.migrationPlan = migrationPlan;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMinimumTerm() {
    return minimumTerm;
  }
  public void setMinimumTerm(Integer minimumTerm) {
    this.minimumTerm = minimumTerm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrimarySku() {
    return primarySku;
  }
  public void setPrimarySku(String primarySku) {
    this.primarySku = primarySku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReactivationSku() {
    return reactivationSku;
  }
  public void setReactivationSku(String reactivationSku) {
    this.reactivationSku = reactivationSku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRecurringSku() {
    return recurringSku;
  }
  public void setRecurringSku(String recurringSku) {
    this.recurringSku = recurringSku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRenewPeriod() {
    return renewPeriod;
  }
  public void setRenewPeriod(Integer renewPeriod) {
    this.renewPeriod = renewPeriod;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RenewPeriodUnitOfTimeEnum getRenewPeriodUnitOfTime() {
    return renewPeriodUnitOfTime;
  }
  public void setRenewPeriodUnitOfTime(RenewPeriodUnitOfTimeEnum renewPeriodUnitOfTime) {
    this.renewPeriodUnitOfTime = renewPeriodUnitOfTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlan subscriptionPlan = (SubscriptionPlan) o;
    return (this.additionalProperties == null ? subscriptionPlan.additionalProperties == null : this.additionalProperties.equals(subscriptionPlan.additionalProperties)) &&
        (this.availability == null ? subscriptionPlan.availability == null : this.availability.equals(subscriptionPlan.availability)) &&
        (this.billGraceDays == null ? subscriptionPlan.billGraceDays == null : this.billGraceDays.equals(subscriptionPlan.billGraceDays)) &&
        (this.consolidated == null ? subscriptionPlan.consolidated == null : this.consolidated.equals(subscriptionPlan.consolidated)) &&
        (this.firstBill == null ? subscriptionPlan.firstBill == null : this.firstBill.equals(subscriptionPlan.firstBill)) &&
        (this.firstBillUnitOfTime == null ? subscriptionPlan.firstBillUnitOfTime == null : this.firstBillUnitOfTime.equals(subscriptionPlan.firstBillUnitOfTime)) &&
        (this.id == null ? subscriptionPlan.id == null : this.id.equals(subscriptionPlan.id)) &&
        (this.latePaymentSku == null ? subscriptionPlan.latePaymentSku == null : this.latePaymentSku.equals(subscriptionPlan.latePaymentSku)) &&
        (this.locked == null ? subscriptionPlan.locked == null : this.locked.equals(subscriptionPlan.locked)) &&
        (this.maxAutoRenew == null ? subscriptionPlan.maxAutoRenew == null : this.maxAutoRenew.equals(subscriptionPlan.maxAutoRenew)) &&
        (this.maxBillAttempts == null ? subscriptionPlan.maxBillAttempts == null : this.maxBillAttempts.equals(subscriptionPlan.maxBillAttempts)) &&
        (this.migrationPlan == null ? subscriptionPlan.migrationPlan == null : this.migrationPlan.equals(subscriptionPlan.migrationPlan)) &&
        (this.minimumTerm == null ? subscriptionPlan.minimumTerm == null : this.minimumTerm.equals(subscriptionPlan.minimumTerm)) &&
        (this.name == null ? subscriptionPlan.name == null : this.name.equals(subscriptionPlan.name)) &&
        (this.primarySku == null ? subscriptionPlan.primarySku == null : this.primarySku.equals(subscriptionPlan.primarySku)) &&
        (this.reactivationSku == null ? subscriptionPlan.reactivationSku == null : this.reactivationSku.equals(subscriptionPlan.reactivationSku)) &&
        (this.recurringSku == null ? subscriptionPlan.recurringSku == null : this.recurringSku.equals(subscriptionPlan.recurringSku)) &&
        (this.renewPeriod == null ? subscriptionPlan.renewPeriod == null : this.renewPeriod.equals(subscriptionPlan.renewPeriod)) &&
        (this.renewPeriodUnitOfTime == null ? subscriptionPlan.renewPeriodUnitOfTime == null : this.renewPeriodUnitOfTime.equals(subscriptionPlan.renewPeriodUnitOfTime)) &&
        (this.subscriptionId == null ? subscriptionPlan.subscriptionId == null : this.subscriptionId.equals(subscriptionPlan.subscriptionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.availability == null ? 0: this.availability.hashCode());
    result = 31 * result + (this.billGraceDays == null ? 0: this.billGraceDays.hashCode());
    result = 31 * result + (this.consolidated == null ? 0: this.consolidated.hashCode());
    result = 31 * result + (this.firstBill == null ? 0: this.firstBill.hashCode());
    result = 31 * result + (this.firstBillUnitOfTime == null ? 0: this.firstBillUnitOfTime.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.latePaymentSku == null ? 0: this.latePaymentSku.hashCode());
    result = 31 * result + (this.locked == null ? 0: this.locked.hashCode());
    result = 31 * result + (this.maxAutoRenew == null ? 0: this.maxAutoRenew.hashCode());
    result = 31 * result + (this.maxBillAttempts == null ? 0: this.maxBillAttempts.hashCode());
    result = 31 * result + (this.migrationPlan == null ? 0: this.migrationPlan.hashCode());
    result = 31 * result + (this.minimumTerm == null ? 0: this.minimumTerm.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.primarySku == null ? 0: this.primarySku.hashCode());
    result = 31 * result + (this.reactivationSku == null ? 0: this.reactivationSku.hashCode());
    result = 31 * result + (this.recurringSku == null ? 0: this.recurringSku.hashCode());
    result = 31 * result + (this.renewPeriod == null ? 0: this.renewPeriod.hashCode());
    result = 31 * result + (this.renewPeriodUnitOfTime == null ? 0: this.renewPeriodUnitOfTime.hashCode());
    result = 31 * result + (this.subscriptionId == null ? 0: this.subscriptionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlan {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  availability: ").append(availability).append("\n");
    sb.append("  billGraceDays: ").append(billGraceDays).append("\n");
    sb.append("  consolidated: ").append(consolidated).append("\n");
    sb.append("  firstBill: ").append(firstBill).append("\n");
    sb.append("  firstBillUnitOfTime: ").append(firstBillUnitOfTime).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  latePaymentSku: ").append(latePaymentSku).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  maxAutoRenew: ").append(maxAutoRenew).append("\n");
    sb.append("  maxBillAttempts: ").append(maxBillAttempts).append("\n");
    sb.append("  migrationPlan: ").append(migrationPlan).append("\n");
    sb.append("  minimumTerm: ").append(minimumTerm).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  primarySku: ").append(primarySku).append("\n");
    sb.append("  reactivationSku: ").append(reactivationSku).append("\n");
    sb.append("  recurringSku: ").append(recurringSku).append("\n");
    sb.append("  renewPeriod: ").append(renewPeriod).append("\n");
    sb.append("  renewPeriodUnitOfTime: ").append(renewPeriodUnitOfTime).append("\n");
    sb.append("  subscriptionId: ").append(subscriptionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
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

import io.swagger.client.model.SimpleUserResource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserInventoryResource {
  
  @SerializedName("behavior_data")
  private Object behaviorData = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("expires")
  private Long expires = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("invoice_id")
  private Integer invoiceId = null;
  @SerializedName("item_id")
  private Integer itemId = null;
  @SerializedName("item_name")
  private String itemName = null;
  @SerializedName("item_type_hint")
  private String itemTypeHint = null;
  public enum StatusEnum {
     pending,  active,  inactive, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;
  @SerializedName("user")
  private SimpleUserResource user = null;

  /**
   * A map of data for behaviors
   **/
  @ApiModelProperty(value = "A map of data for behaviors")
  public Object getBehaviorData() {
    return behaviorData;
  }
  public void setBehaviorData(Object behaviorData) {
    this.behaviorData = behaviorData;
  }

  /**
   * The date/time this resource was created in seconds since epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The date/time this resource exires in seconds since epoch. Null for no expiration. For subscriptions, this is the end of the 'grace period' if left unpaid
   **/
  @ApiModelProperty(value = "The date/time this resource exires in seconds since epoch. Null for no expiration. For subscriptions, this is the end of the 'grace period' if left unpaid")
  public Long getExpires() {
    return expires;
  }
  public void setExpires(Long expires) {
    this.expires = expires;
  }

  /**
   * The id of the inventory
   **/
  @ApiModelProperty(value = "The id of the inventory")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The id of the invoice that resulted in this inventory, if any
   **/
  @ApiModelProperty(value = "The id of the invoice that resulted in this inventory, if any")
  public Integer getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * The id of the item
   **/
  @ApiModelProperty(value = "The id of the item")
  public Integer getItemId() {
    return itemId;
  }
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  /**
   * The name of the item
   **/
  @ApiModelProperty(value = "The name of the item")
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  /**
   * The type hint of the item
   **/
  @ApiModelProperty(value = "The type hint of the item")
  public String getItemTypeHint() {
    return itemTypeHint;
  }
  public void setItemTypeHint(String itemTypeHint) {
    this.itemTypeHint = itemTypeHint;
  }

  /**
   * The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up
   **/
  @ApiModelProperty(value = "The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The date/time this resource was last updated in seconds since epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   * The id of the user this inventory belongs to
   **/
  @ApiModelProperty(value = "The id of the user this inventory belongs to")
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
    UserInventoryResource userInventoryResource = (UserInventoryResource) o;
    return (this.behaviorData == null ? userInventoryResource.behaviorData == null : this.behaviorData.equals(userInventoryResource.behaviorData)) &&
        (this.createdDate == null ? userInventoryResource.createdDate == null : this.createdDate.equals(userInventoryResource.createdDate)) &&
        (this.expires == null ? userInventoryResource.expires == null : this.expires.equals(userInventoryResource.expires)) &&
        (this.id == null ? userInventoryResource.id == null : this.id.equals(userInventoryResource.id)) &&
        (this.invoiceId == null ? userInventoryResource.invoiceId == null : this.invoiceId.equals(userInventoryResource.invoiceId)) &&
        (this.itemId == null ? userInventoryResource.itemId == null : this.itemId.equals(userInventoryResource.itemId)) &&
        (this.itemName == null ? userInventoryResource.itemName == null : this.itemName.equals(userInventoryResource.itemName)) &&
        (this.itemTypeHint == null ? userInventoryResource.itemTypeHint == null : this.itemTypeHint.equals(userInventoryResource.itemTypeHint)) &&
        (this.status == null ? userInventoryResource.status == null : this.status.equals(userInventoryResource.status)) &&
        (this.updatedDate == null ? userInventoryResource.updatedDate == null : this.updatedDate.equals(userInventoryResource.updatedDate)) &&
        (this.user == null ? userInventoryResource.user == null : this.user.equals(userInventoryResource.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.behaviorData == null ? 0: this.behaviorData.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.expires == null ? 0: this.expires.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.invoiceId == null ? 0: this.invoiceId.hashCode());
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    result = 31 * result + (this.itemName == null ? 0: this.itemName.hashCode());
    result = 31 * result + (this.itemTypeHint == null ? 0: this.itemTypeHint.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInventoryResource {\n");
    
    sb.append("  behaviorData: ").append(behaviorData).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("  itemName: ").append(itemName).append("\n");
    sb.append("  itemTypeHint: ").append(itemTypeHint).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

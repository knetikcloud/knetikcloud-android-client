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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CouponDefinition {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("description")
  private String description = null;
  public enum DiscountTypeEnum {
     value,  percentage, 
  };
  @SerializedName("discount_type")
  private DiscountTypeEnum discountType = null;
  @SerializedName("exclusive")
  private Boolean exclusive = null;
  @SerializedName("max_discount")
  private Double maxDiscount = null;
  @SerializedName("max_quantity")
  private Integer maxQuantity = null;
  @SerializedName("min_cart_total")
  private Double minCartTotal = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("self_exclusive")
  private Boolean selfExclusive = null;
  @SerializedName("target_item_id")
  private Integer targetItemId = null;
  public enum TypeEnum {
     coupon_cart,  coupon_single_item,  coupon_voucher,  coupon_vendor,  coupon_tag, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("valid_for_tags")
  private List<String> validForTags = null;
  @SerializedName("value")
  private Double value = null;
  @SerializedName("vendor_id")
  private Integer vendorId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }
  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getExclusive() {
    return exclusive;
  }
  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMaxDiscount() {
    return maxDiscount;
  }
  public void setMaxDiscount(Double maxDiscount) {
    this.maxDiscount = maxDiscount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }
  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMinCartTotal() {
    return minCartTotal;
  }
  public void setMinCartTotal(Double minCartTotal) {
    this.minCartTotal = minCartTotal;
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
  public Boolean getSelfExclusive() {
    return selfExclusive;
  }
  public void setSelfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTargetItemId() {
    return targetItemId;
  }
  public void setTargetItemId(Integer targetItemId) {
    this.targetItemId = targetItemId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getValidForTags() {
    return validForTags;
  }
  public void setValidForTags(List<String> validForTags) {
    this.validForTags = validForTags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    CouponDefinition couponDefinition = (CouponDefinition) o;
    return (this.code == null ? couponDefinition.code == null : this.code.equals(couponDefinition.code)) &&
        (this.description == null ? couponDefinition.description == null : this.description.equals(couponDefinition.description)) &&
        (this.discountType == null ? couponDefinition.discountType == null : this.discountType.equals(couponDefinition.discountType)) &&
        (this.exclusive == null ? couponDefinition.exclusive == null : this.exclusive.equals(couponDefinition.exclusive)) &&
        (this.maxDiscount == null ? couponDefinition.maxDiscount == null : this.maxDiscount.equals(couponDefinition.maxDiscount)) &&
        (this.maxQuantity == null ? couponDefinition.maxQuantity == null : this.maxQuantity.equals(couponDefinition.maxQuantity)) &&
        (this.minCartTotal == null ? couponDefinition.minCartTotal == null : this.minCartTotal.equals(couponDefinition.minCartTotal)) &&
        (this.name == null ? couponDefinition.name == null : this.name.equals(couponDefinition.name)) &&
        (this.selfExclusive == null ? couponDefinition.selfExclusive == null : this.selfExclusive.equals(couponDefinition.selfExclusive)) &&
        (this.targetItemId == null ? couponDefinition.targetItemId == null : this.targetItemId.equals(couponDefinition.targetItemId)) &&
        (this.type == null ? couponDefinition.type == null : this.type.equals(couponDefinition.type)) &&
        (this.validForTags == null ? couponDefinition.validForTags == null : this.validForTags.equals(couponDefinition.validForTags)) &&
        (this.value == null ? couponDefinition.value == null : this.value.equals(couponDefinition.value)) &&
        (this.vendorId == null ? couponDefinition.vendorId == null : this.vendorId.equals(couponDefinition.vendorId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.discountType == null ? 0: this.discountType.hashCode());
    result = 31 * result + (this.exclusive == null ? 0: this.exclusive.hashCode());
    result = 31 * result + (this.maxDiscount == null ? 0: this.maxDiscount.hashCode());
    result = 31 * result + (this.maxQuantity == null ? 0: this.maxQuantity.hashCode());
    result = 31 * result + (this.minCartTotal == null ? 0: this.minCartTotal.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.selfExclusive == null ? 0: this.selfExclusive.hashCode());
    result = 31 * result + (this.targetItemId == null ? 0: this.targetItemId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.validForTags == null ? 0: this.validForTags.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.vendorId == null ? 0: this.vendorId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponDefinition {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  discountType: ").append(discountType).append("\n");
    sb.append("  exclusive: ").append(exclusive).append("\n");
    sb.append("  maxDiscount: ").append(maxDiscount).append("\n");
    sb.append("  maxQuantity: ").append(maxQuantity).append("\n");
    sb.append("  minCartTotal: ").append(minCartTotal).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  selfExclusive: ").append(selfExclusive).append("\n");
    sb.append("  targetItemId: ").append(targetItemId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  validForTags: ").append(validForTags).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  vendorId: ").append(vendorId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

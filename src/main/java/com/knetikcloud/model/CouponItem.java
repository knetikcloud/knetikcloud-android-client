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
import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.Sku;
import com.knetikcloud.model.StoreItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * CouponItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T12:23:32.916-04:00")
public class CouponItem extends StoreItem {
  /**
   * The type of coupon
   */
  @JsonAdapter(CouponTypeHintEnum.Adapter.class)
  public enum CouponTypeHintEnum {
    CART("coupon_cart"),
    
    SINGLE_ITEM("coupon_single_item"),
    
    VOUCHER("coupon_voucher"),
    
    VENDOR("coupon_vendor"),
    
    TAG("coupon_tag");

    private String value;

    CouponTypeHintEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CouponTypeHintEnum fromValue(String text) {
      for (CouponTypeHintEnum b : CouponTypeHintEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CouponTypeHintEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CouponTypeHintEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CouponTypeHintEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CouponTypeHintEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("coupon_type_hint")
  private CouponTypeHintEnum couponTypeHint = null;

  @SerializedName("discount_max")
  private Double discountMax = null;

  @SerializedName("discount_min_cart_value")
  private Double discountMinCartValue = null;

  /**
   * The type of discount in terms of how it deducts price. Value based discount not available for coupon_cart type coupons
   */
  @JsonAdapter(DiscountTypeEnum.Adapter.class)
  public enum DiscountTypeEnum {
    VALUE("value"),
    
    PERCENTAGE("percentage");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DiscountTypeEnum fromValue(String text) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DiscountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiscountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiscountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DiscountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("discount_type")
  private DiscountTypeEnum discountType = null;

  @SerializedName("discount_value")
  private Double discountValue = null;

  @SerializedName("exclusive")
  private Boolean exclusive = null;

  @SerializedName("item_id")
  private Integer itemId = null;

  @SerializedName("max_quantity")
  private Integer maxQuantity = null;

  @SerializedName("self_exclusive")
  private Boolean selfExclusive = null;

  @SerializedName("valid_for_tags")
  private List<String> validForTags = null;

  public CouponItem couponTypeHint(CouponTypeHintEnum couponTypeHint) {
    this.couponTypeHint = couponTypeHint;
    return this;
  }

   /**
   * The type of coupon
   * @return couponTypeHint
  **/
  @ApiModelProperty(required = true, value = "The type of coupon")
  public CouponTypeHintEnum getCouponTypeHint() {
    return couponTypeHint;
  }

  public void setCouponTypeHint(CouponTypeHintEnum couponTypeHint) {
    this.couponTypeHint = couponTypeHint;
  }

  public CouponItem discountMax(Double discountMax) {
    this.discountMax = discountMax;
    return this;
  }

   /**
   * The amount this coupon is maxed out at.  Applies if coupon_type_hint is coupon_cart
   * @return discountMax
  **/
  @ApiModelProperty(value = "The amount this coupon is maxed out at.  Applies if coupon_type_hint is coupon_cart")
  public Double getDiscountMax() {
    return discountMax;
  }

  public void setDiscountMax(Double discountMax) {
    this.discountMax = discountMax;
  }

  public CouponItem discountMinCartValue(Double discountMinCartValue) {
    this.discountMinCartValue = discountMinCartValue;
    return this;
  }

   /**
   * The minimium amount needed in the cart for the coupon to apply.  Applies if coupon_type_hint is coupon_cart
   * @return discountMinCartValue
  **/
  @ApiModelProperty(value = "The minimium amount needed in the cart for the coupon to apply.  Applies if coupon_type_hint is coupon_cart")
  public Double getDiscountMinCartValue() {
    return discountMinCartValue;
  }

  public void setDiscountMinCartValue(Double discountMinCartValue) {
    this.discountMinCartValue = discountMinCartValue;
  }

  public CouponItem discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * The type of discount in terms of how it deducts price. Value based discount not available for coupon_cart type coupons
   * @return discountType
  **/
  @ApiModelProperty(required = true, value = "The type of discount in terms of how it deducts price. Value based discount not available for coupon_cart type coupons")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public CouponItem discountValue(Double discountValue) {
    this.discountValue = discountValue;
    return this;
  }

   /**
   * The amount the coupon will discount the item. If discount_type is &#39;value&#39; this will be a flat amount of currency. If discount type is &#39;percentage&#39; this will be a fraction (0.2 for 20% off) multiplied by the price of the matching item or items.
   * @return discountValue
  **/
  @ApiModelProperty(required = true, value = "The amount the coupon will discount the item. If discount_type is 'value' this will be a flat amount of currency. If discount type is 'percentage' this will be a fraction (0.2 for 20% off) multiplied by the price of the matching item or items.")
  public Double getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(Double discountValue) {
    this.discountValue = discountValue;
  }

  public CouponItem exclusive(Boolean exclusive) {
    this.exclusive = exclusive;
    return this;
  }

   /**
   * Whether this coupon is exclusive or not (true means cannot be in same cart as another).  Default &#x3D; false
   * @return exclusive
  **/
  @ApiModelProperty(example = "false", value = "Whether this coupon is exclusive or not (true means cannot be in same cart as another).  Default = false")
  public Boolean isExclusive() {
    return exclusive;
  }

  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  public CouponItem itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The id of the item the coupon is applied to.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher
   * @return itemId
  **/
  @ApiModelProperty(value = "The id of the item the coupon is applied to.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public CouponItem maxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }

   /**
   * The maximum quantity of items the coupon can apply to, null if no limit and minimum 1 otherwise.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher
   * @return maxQuantity
  **/
  @ApiModelProperty(value = "The maximum quantity of items the coupon can apply to, null if no limit and minimum 1 otherwise.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public CouponItem selfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
    return this;
  }

   /**
   * Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default &#x3D; false
   * @return selfExclusive
  **/
  @ApiModelProperty(example = "false", value = "Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false")
  public Boolean isSelfExclusive() {
    return selfExclusive;
  }

  public void setSelfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
  }

  public CouponItem validForTags(List<String> validForTags) {
    this.validForTags = validForTags;
    return this;
  }

  public CouponItem addValidForTagsItem(String validForTagsItem) {
    if (this.validForTags == null) {
      this.validForTags = new ArrayList<String>();
    }
    this.validForTags.add(validForTagsItem);
    return this;
  }

   /**
   * A list of tags for a coupon.  The coupon can only apply to an item that has at least one of these tags.  Applies if coupon_type_hint is coupon_tag
   * @return validForTags
  **/
  @ApiModelProperty(value = "A list of tags for a coupon.  The coupon can only apply to an item that has at least one of these tags.  Applies if coupon_type_hint is coupon_tag")
  public List<String> getValidForTags() {
    return validForTags;
  }

  public void setValidForTags(List<String> validForTags) {
    this.validForTags = validForTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponItem couponItem = (CouponItem) o;
    return Objects.equals(this.couponTypeHint, couponItem.couponTypeHint) &&
        Objects.equals(this.discountMax, couponItem.discountMax) &&
        Objects.equals(this.discountMinCartValue, couponItem.discountMinCartValue) &&
        Objects.equals(this.discountType, couponItem.discountType) &&
        Objects.equals(this.discountValue, couponItem.discountValue) &&
        Objects.equals(this.exclusive, couponItem.exclusive) &&
        Objects.equals(this.itemId, couponItem.itemId) &&
        Objects.equals(this.maxQuantity, couponItem.maxQuantity) &&
        Objects.equals(this.selfExclusive, couponItem.selfExclusive) &&
        Objects.equals(this.validForTags, couponItem.validForTags) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponTypeHint, discountMax, discountMinCartValue, discountType, discountValue, exclusive, itemId, maxQuantity, selfExclusive, validForTags, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    couponTypeHint: ").append(toIndentedString(couponTypeHint)).append("\n");
    sb.append("    discountMax: ").append(toIndentedString(discountMax)).append("\n");
    sb.append("    discountMinCartValue: ").append(toIndentedString(discountMinCartValue)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    selfExclusive: ").append(toIndentedString(selfExclusive)).append("\n");
    sb.append("    validForTags: ").append(toIndentedString(validForTags)).append("\n");
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

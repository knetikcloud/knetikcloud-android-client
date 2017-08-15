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
import com.knetikcloud.model.BundledSku;
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
 * BundleItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T12:23:32.916-04:00")
public class BundleItem extends StoreItem {
  @SerializedName("bundled_skus")
  private List<BundledSku> bundledSkus = new ArrayList<BundledSku>();

  public BundleItem bundledSkus(List<BundledSku> bundledSkus) {
    this.bundledSkus = bundledSkus;
    return this;
  }

  public BundleItem addBundledSkusItem(BundledSku bundledSkusItem) {
    this.bundledSkus.add(bundledSkusItem);
    return this;
  }

   /**
   * The skus of items to be included in this bundle, and how they influence the bundle total price.  Must have at least one SKU
   * @return bundledSkus
  **/
  @ApiModelProperty(required = true, value = "The skus of items to be included in this bundle, and how they influence the bundle total price.  Must have at least one SKU")
  public List<BundledSku> getBundledSkus() {
    return bundledSkus;
  }

  public void setBundledSkus(List<BundledSku> bundledSkus) {
    this.bundledSkus = bundledSkus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleItem bundleItem = (BundleItem) o;
    return Objects.equals(this.bundledSkus, bundleItem.bundledSkus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundledSkus, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bundledSkus: ").append(toIndentedString(bundledSkus)).append("\n");
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

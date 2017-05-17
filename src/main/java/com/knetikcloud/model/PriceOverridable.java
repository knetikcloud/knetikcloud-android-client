/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.knetikcloud.model.Behavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PriceOverridable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class PriceOverridable extends Behavior implements Parcelable {
  @SerializedName("max_price")
  private Integer maxPrice = null;

  @SerializedName("min_price")
  private Integer minPrice = null;

  public PriceOverridable maxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

   /**
   * The maximum price allowed
   * @return maxPrice
  **/
  @ApiModelProperty(example = "null", value = "The maximum price allowed")
  public Integer getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
  }

  public PriceOverridable minPrice(Integer minPrice) {
    this.minPrice = minPrice;
    return this;
  }

   /**
   * The minimum price allowed
   * @return minPrice
  **/
  @ApiModelProperty(example = "null", value = "The minimum price allowed")
  public Integer getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(Integer minPrice) {
    this.minPrice = minPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceOverridable priceOverridable = (PriceOverridable) o;
    return Objects.equals(this.maxPrice, priceOverridable.maxPrice) &&
        Objects.equals(this.minPrice, priceOverridable.minPrice) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPrice, minPrice, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceOverridable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
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
  
  public void writeToParcel(Parcel out, int flags) {
     super.writeToParcel(out, flags);  
    out.writeValue(maxPrice);

    out.writeValue(minPrice);
  }

  public PriceOverridable() {
    super();
  }

  PriceOverridable(Parcel in) {
     super(in); 
    maxPrice = (Integer)in.readValue(null);
    minPrice = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PriceOverridable> CREATOR = new Parcelable.Creator<PriceOverridable>() {
    public PriceOverridable createFromParcel(Parcel in) {
      return new PriceOverridable(in);
    }
    public PriceOverridable[] newArray(int size) {
      return new PriceOverridable[size];
    }
  };
}


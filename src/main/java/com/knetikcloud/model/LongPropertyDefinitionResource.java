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
import com.knetikcloud.model.PropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * LongPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class LongPropertyDefinitionResource extends PropertyDefinitionResource implements Parcelable {
  @SerializedName("max")
  private Long max = null;

  @SerializedName("min")
  private Long min = null;

  public LongPropertyDefinitionResource max(Long max) {
    this.max = max;
    return this;
  }

   /**
   * If provided, the maximum value
   * @return max
  **/
  @ApiModelProperty(example = "null", value = "If provided, the maximum value")
  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public LongPropertyDefinitionResource min(Long min) {
    this.min = min;
    return this;
  }

   /**
   * If provided, the minimum value
   * @return min
  **/
  @ApiModelProperty(example = "null", value = "If provided, the minimum value")
  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongPropertyDefinitionResource longPropertyDefinitionResource = (LongPropertyDefinitionResource) o;
    return Objects.equals(this.max, longPropertyDefinitionResource.max) &&
        Objects.equals(this.min, longPropertyDefinitionResource.min) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
    out.writeValue(max);

    out.writeValue(min);
  }

  public LongPropertyDefinitionResource() {
    super();
  }

  LongPropertyDefinitionResource(Parcel in) {
     super(in); 
    max = (Long)in.readValue(null);
    min = (Long)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<LongPropertyDefinitionResource> CREATOR = new Parcelable.Creator<LongPropertyDefinitionResource>() {
    public LongPropertyDefinitionResource createFromParcel(Parcel in) {
      return new LongPropertyDefinitionResource(in);
    }
    public LongPropertyDefinitionResource[] newArray(int size) {
      return new LongPropertyDefinitionResource[size];
    }
  };
}


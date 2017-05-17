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
 * Expirable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class Expirable extends Behavior implements Parcelable {
  @SerializedName("time_length")
  private Integer timeLength = null;

  @SerializedName("unit_of_time")
  private String unitOfTime = null;

  public Expirable timeLength(Integer timeLength) {
    this.timeLength = timeLength;
    return this;
  }

   /**
   * The length of time
   * @return timeLength
  **/
  @ApiModelProperty(example = "null", value = "The length of time")
  public Integer getTimeLength() {
    return timeLength;
  }

  public void setTimeLength(Integer timeLength) {
    this.timeLength = timeLength;
  }

  public Expirable unitOfTime(String unitOfTime) {
    this.unitOfTime = unitOfTime;
    return this;
  }

   /**
   * The unit of time
   * @return unitOfTime
  **/
  @ApiModelProperty(example = "null", value = "The unit of time")
  public String getUnitOfTime() {
    return unitOfTime;
  }

  public void setUnitOfTime(String unitOfTime) {
    this.unitOfTime = unitOfTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expirable expirable = (Expirable) o;
    return Objects.equals(this.timeLength, expirable.timeLength) &&
        Objects.equals(this.unitOfTime, expirable.unitOfTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeLength, unitOfTime, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expirable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timeLength: ").append(toIndentedString(timeLength)).append("\n");
    sb.append("    unitOfTime: ").append(toIndentedString(unitOfTime)).append("\n");
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
    out.writeValue(timeLength);

    out.writeValue(unitOfTime);
  }

  public Expirable() {
    super();
  }

  Expirable(Parcel in) {
     super(in); 
    timeLength = (Integer)in.readValue(null);
    unitOfTime = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Expirable> CREATOR = new Parcelable.Creator<Expirable>() {
    public Expirable createFromParcel(Parcel in) {
      return new Expirable(in);
    }
    public Expirable[] newArray(int size) {
      return new Expirable[size];
    }
  };
}


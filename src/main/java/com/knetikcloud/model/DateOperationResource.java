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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * DateOperationResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class DateOperationResource implements Parcelable {
  @SerializedName("args")
  private List<ExpressionResource> args = new ArrayList<ExpressionResource>();

  @SerializedName("op")
  private String op = null;

  @SerializedName("type")
  private String type = null;

  public DateOperationResource args(List<ExpressionResource> args) {
    this.args = args;
    return this;
  }

  public DateOperationResource addArgsItem(ExpressionResource argsItem) {
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ExpressionResource> getArgs() {
    return args;
  }

  public void setArgs(List<ExpressionResource> args) {
    this.args = args;
  }

  public DateOperationResource op(String op) {
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public DateOperationResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateOperationResource dateOperationResource = (DateOperationResource) o;
    return Objects.equals(this.args, dateOperationResource.args) &&
        Objects.equals(this.op, dateOperationResource.op) &&
        Objects.equals(this.type, dateOperationResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, op, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateOperationResource {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
     
    out.writeValue(args);

    out.writeValue(op);

    out.writeValue(type);
  }

  public DateOperationResource() {
    super();
  }

  DateOperationResource(Parcel in) {
    
    args = (List<ExpressionResource>)in.readValue(ExpressionResource.class.getClassLoader());
    op = (String)in.readValue(null);
    type = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<DateOperationResource> CREATOR = new Parcelable.Creator<DateOperationResource>() {
    public DateOperationResource createFromParcel(Parcel in) {
      return new DateOperationResource(in);
    }
    public DateOperationResource[] newArray(int size) {
      return new DateOperationResource[size];
    }
  };
}


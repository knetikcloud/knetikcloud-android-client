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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * NestedCategory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class NestedCategory implements Parcelable {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

   /**
   * Whether the category is active
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the category is active")
  public Boolean getActive() {
    return active;
  }

  public NestedCategory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the category
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the category")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The name of the category
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the category")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedCategory nestedCategory = (NestedCategory) o;
    return Objects.equals(this.active, nestedCategory.active) &&
        Objects.equals(this.id, nestedCategory.id) &&
        Objects.equals(this.name, nestedCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedCategory {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
     
    out.writeValue(active);

    out.writeValue(id);

    out.writeValue(name);
  }

  public NestedCategory() {
    super();
  }

  NestedCategory(Parcel in) {
    
    active = (Boolean)in.readValue(null);
    id = (String)in.readValue(null);
    name = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<NestedCategory> CREATOR = new Parcelable.Creator<NestedCategory>() {
    public NestedCategory createFromParcel(Parcel in) {
      return new NestedCategory(in);
    }
    public NestedCategory[] newArray(int size) {
      return new NestedCategory[size];
    }
  };
}


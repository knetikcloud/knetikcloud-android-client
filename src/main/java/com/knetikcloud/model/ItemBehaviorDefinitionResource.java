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
 * ItemBehaviorDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class ItemBehaviorDefinitionResource implements Parcelable {
  @SerializedName("behavior")
  private Behavior behavior = null;

  @SerializedName("modifiable")
  private Boolean modifiable = null;

  @SerializedName("required")
  private Boolean required = null;

  public ItemBehaviorDefinitionResource behavior(Behavior behavior) {
    this.behavior = behavior;
    return this;
  }

   /**
   * The default version of the behavior
   * @return behavior
  **/
  @ApiModelProperty(example = "null", required = true, value = "The default version of the behavior")
  public Behavior getBehavior() {
    return behavior;
  }

  public void setBehavior(Behavior behavior) {
    this.behavior = behavior;
  }

  public ItemBehaviorDefinitionResource modifiable(Boolean modifiable) {
    this.modifiable = modifiable;
    return this;
  }

   /**
   * Whether the behavior's values can be modified
   * @return modifiable
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the behavior's values can be modified")
  public Boolean getModifiable() {
    return modifiable;
  }

  public void setModifiable(Boolean modifiable) {
    this.modifiable = modifiable;
  }

  public ItemBehaviorDefinitionResource required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether the behavior can be removed
   * @return required
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the behavior can be removed")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBehaviorDefinitionResource itemBehaviorDefinitionResource = (ItemBehaviorDefinitionResource) o;
    return Objects.equals(this.behavior, itemBehaviorDefinitionResource.behavior) &&
        Objects.equals(this.modifiable, itemBehaviorDefinitionResource.modifiable) &&
        Objects.equals(this.required, itemBehaviorDefinitionResource.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behavior, modifiable, required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBehaviorDefinitionResource {\n");
    
    sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
    sb.append("    modifiable: ").append(toIndentedString(modifiable)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
     
    out.writeValue(behavior);

    out.writeValue(modifiable);

    out.writeValue(required);
  }

  public ItemBehaviorDefinitionResource() {
    super();
  }

  ItemBehaviorDefinitionResource(Parcel in) {
    
    behavior = (Behavior)in.readValue(null);
    modifiable = (Boolean)in.readValue(null);
    required = (Boolean)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ItemBehaviorDefinitionResource> CREATOR = new Parcelable.Creator<ItemBehaviorDefinitionResource>() {
    public ItemBehaviorDefinitionResource createFromParcel(Parcel in) {
      return new ItemBehaviorDefinitionResource(in);
    }
    public ItemBehaviorDefinitionResource[] newArray(int size) {
      return new ItemBehaviorDefinitionResource[size];
    }
  };
}


/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LimitedGettableGroup {
  
  @SerializedName("active_only")
  private Boolean activeOnly = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("owned_limit")
  private Integer ownedLimit = null;

  /**
   * Whether to get active items only
   **/
  @ApiModelProperty(required = true, value = "Whether to get active items only")
  public Boolean getActiveOnly() {
    return activeOnly;
  }
  public void setActiveOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
  }

  /**
   * The name of the group. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that owned_limit and active_only will be the same for all, but this is not enforced and the item being recieved will use its settings.
   **/
  @ApiModelProperty(value = "The name of the group. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that owned_limit and active_only will be the same for all, but this is not enforced and the item being recieved will use its settings.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The max number of items that can be purchased
   **/
  @ApiModelProperty(required = true, value = "The max number of items that can be purchased")
  public Integer getOwnedLimit() {
    return ownedLimit;
  }
  public void setOwnedLimit(Integer ownedLimit) {
    this.ownedLimit = ownedLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitedGettableGroup limitedGettableGroup = (LimitedGettableGroup) o;
    return (this.activeOnly == null ? limitedGettableGroup.activeOnly == null : this.activeOnly.equals(limitedGettableGroup.activeOnly)) &&
        (this.name == null ? limitedGettableGroup.name == null : this.name.equals(limitedGettableGroup.name)) &&
        (this.ownedLimit == null ? limitedGettableGroup.ownedLimit == null : this.ownedLimit.equals(limitedGettableGroup.ownedLimit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.activeOnly == null ? 0: this.activeOnly.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.ownedLimit == null ? 0: this.ownedLimit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitedGettableGroup {\n");
    
    sb.append("  activeOnly: ").append(activeOnly).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  ownedLimit: ").append(ownedLimit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

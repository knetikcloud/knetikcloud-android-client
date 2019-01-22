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
import com.knetikcloud.model.PatchActionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PatchResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-22T09:25:50.362-05:00")
public class PatchResource {
  @SerializedName("patch_actions")
  private List<PatchActionResource> patchActions = new ArrayList<PatchActionResource>();

  public PatchResource patchActions(List<PatchActionResource> patchActions) {
    this.patchActions = patchActions;
    return this;
  }

  public PatchResource addPatchActionsItem(PatchActionResource patchActionsItem) {
    this.patchActions.add(patchActionsItem);
    return this;
  }

   /**
   * The list of patch actions to perform on a resource
   * @return patchActions
  **/
  @ApiModelProperty(required = true, value = "The list of patch actions to perform on a resource")
  public List<PatchActionResource> getPatchActions() {
    return patchActions;
  }

  public void setPatchActions(List<PatchActionResource> patchActions) {
    this.patchActions = patchActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchResource patchResource = (PatchResource) o;
    return Objects.equals(this.patchActions, patchResource.patchActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchActions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchResource {\n");
    
    sb.append("    patchActions: ").append(toIndentedString(patchActions)).append("\n");
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


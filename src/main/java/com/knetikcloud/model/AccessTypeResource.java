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
import com.knetikcloud.model.AccessEntryResource;
import com.knetikcloud.model.AccessSubTypeResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:46:55.685-04:00")
public class AccessTypeResource {
  @SerializedName("access")
  private List<AccessEntryResource> access = new ArrayList<AccessEntryResource>();

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("parent_type")
  private String parentType = null;

  @SerializedName("sub_types")
  private List<AccessSubTypeResource> subTypes = new ArrayList<AccessSubTypeResource>();

  @SerializedName("type")
  private String type = null;

  public AccessTypeResource access(List<AccessEntryResource> access) {
    this.access = access;
    return this;
  }

  public AccessTypeResource addAccessItem(AccessEntryResource accessItem) {
    this.access.add(accessItem);
    return this;
  }

   /**
   * The access list. Combines with parent access to determine permission
   * @return access
  **/
  @ApiModelProperty(required = true, value = "The access list. Combines with parent access to determine permission")
  public List<AccessEntryResource> getAccess() {
    return access;
  }

  public void setAccess(List<AccessEntryResource> access) {
    this.access = access;
  }

  public AccessTypeResource actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public AccessTypeResource addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The actions that are possible for the resource type
   * @return actions
  **/
  @ApiModelProperty(value = "The actions that are possible for the resource type")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public AccessTypeResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the resource we are defining access for (null for top level)
   * @return id
  **/
  @ApiModelProperty(value = "The id of the resource we are defining access for (null for top level)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccessTypeResource parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The id of the parent resource (null if parent top level)
   * @return parentId
  **/
  @ApiModelProperty(value = "The id of the parent resource (null if parent top level)")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public AccessTypeResource parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

   /**
   * The type of the parent resource (null for top level)
   * @return parentType
  **/
  @ApiModelProperty(value = "The type of the parent resource (null for top level)")
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public AccessTypeResource subTypes(List<AccessSubTypeResource> subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  public AccessTypeResource addSubTypesItem(AccessSubTypeResource subTypesItem) {
    this.subTypes.add(subTypesItem);
    return this;
  }

   /**
   * List of resource types that can inherit from this one, to define default access lists on creation
   * @return subTypes
  **/
  @ApiModelProperty(required = true, value = "List of resource types that can inherit from this one, to define default access lists on creation")
  public List<AccessSubTypeResource> getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(List<AccessSubTypeResource> subTypes) {
    this.subTypes = subTypes;
  }

  public AccessTypeResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The resource type we are defining access for
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The resource type we are defining access for")
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
    AccessTypeResource accessTypeResource = (AccessTypeResource) o;
    return Objects.equals(this.access, accessTypeResource.access) &&
        Objects.equals(this.actions, accessTypeResource.actions) &&
        Objects.equals(this.id, accessTypeResource.id) &&
        Objects.equals(this.parentId, accessTypeResource.parentId) &&
        Objects.equals(this.parentType, accessTypeResource.parentType) &&
        Objects.equals(this.subTypes, accessTypeResource.subTypes) &&
        Objects.equals(this.type, accessTypeResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, actions, id, parentId, parentType, subTypes, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTypeResource {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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

}


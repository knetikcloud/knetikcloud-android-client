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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessEntryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T13:17:32.471-04:00")
public class AccessEntryResource {
  @SerializedName("actions")
  private List<String> actions = new ArrayList<String>();

  @SerializedName("field_blacklist")
  private List<String> fieldBlacklist = null;

  @SerializedName("sid")
  private String sid = null;

  public AccessEntryResource actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public AccessEntryResource addActionsItem(String actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The actions that users with the sid can take on this resource. Must match with actions available for the type of resource
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "The actions that users with the sid can take on this resource. Must match with actions available for the type of resource")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public AccessEntryResource fieldBlacklist(List<String> fieldBlacklist) {
    this.fieldBlacklist = fieldBlacklist;
    return this;
  }

  public AccessEntryResource addFieldBlacklistItem(String fieldBlacklistItem) {
    if (this.fieldBlacklist == null) {
      this.fieldBlacklist = new ArrayList<String>();
    }
    this.fieldBlacklist.add(fieldBlacklistItem);
    return this;
  }

   /**
   * Optional list of fields, in JSON Pointer notation (RFC 6901), that are not to be granted the associated actions for. Specifically, this affects LIST, GET, PUT, and POST by not allowing retrieval, edit, or creation of the field. For LIST the fields stripped from return objects based on parent ACL. The ACL is always additive, thus other access entries may grant these actions on these fields anyways
   * @return fieldBlacklist
  **/
  @ApiModelProperty(value = "Optional list of fields, in JSON Pointer notation (RFC 6901), that are not to be granted the associated actions for. Specifically, this affects LIST, GET, PUT, and POST by not allowing retrieval, edit, or creation of the field. For LIST the fields stripped from return objects based on parent ACL. The ACL is always additive, thus other access entries may grant these actions on these fields anyways")
  public List<String> getFieldBlacklist() {
    return fieldBlacklist;
  }

  public void setFieldBlacklist(List<String> fieldBlacklist) {
    this.fieldBlacklist = fieldBlacklist;
  }

  public AccessEntryResource sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * The security id that gets this level of access. Security ids are prefixed with a type, foollowed by a hyphen, then an id. Formats: user-ID, group-UNIQUE_NAME, friend-USER_ID and role-ROLE
   * @return sid
  **/
  @ApiModelProperty(required = true, value = "The security id that gets this level of access. Security ids are prefixed with a type, foollowed by a hyphen, then an id. Formats: user-ID, group-UNIQUE_NAME, friend-USER_ID and role-ROLE")
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessEntryResource accessEntryResource = (AccessEntryResource) o;
    return Objects.equals(this.actions, accessEntryResource.actions) &&
        Objects.equals(this.fieldBlacklist, accessEntryResource.fieldBlacklist) &&
        Objects.equals(this.sid, accessEntryResource.sid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, fieldBlacklist, sid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessEntryResource {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    fieldBlacklist: ").append(toIndentedString(fieldBlacklist)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
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


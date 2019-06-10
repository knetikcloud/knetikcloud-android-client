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
import com.knetikcloud.model.BreGlobalScopeDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BreGlobalResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-10T16:27:41.909-04:00")
public class BreGlobalResource {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scopes")
  private List<BreGlobalScopeDefinition> scopes = null;

  @SerializedName("system_global")
  private Boolean systemGlobal = null;

  @SerializedName("type")
  private String type = null;

  public BreGlobalResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable description for display in admin pages
   * @return description
  **/
  @ApiModelProperty(value = "A human readable description for display in admin pages")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BreGlobalResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the global definition. Default is a random guid. Cannot be updated
   * @return id
  **/
  @ApiModelProperty(value = "The id of the global definition. Default is a random guid. Cannot be updated")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BreGlobalResource key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key for the global. Must be unique when combined with scope names. Usually a single descriptive word like &#39;purchases&#39; or &#39;logins&#39;
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key for the global. Must be unique when combined with scope names. Usually a single descriptive word like 'purchases' or 'logins'")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BreGlobalResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human readable name for display in admin pages
   * @return name
  **/
  @ApiModelProperty(value = "A human readable name for display in admin pages")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BreGlobalResource scopes(List<BreGlobalScopeDefinition> scopes) {
    this.scopes = scopes;
    return this;
  }

  public BreGlobalResource addScopesItem(BreGlobalScopeDefinition scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<BreGlobalScopeDefinition>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * A list of scoping parameters. Allows the global to have a different value in different context such as a count of purchases for each user (by putting a &#39;user&#39; scope in this list). When using this global in a rule these scopes will need to be mapped with an expression to provide a value, similar to the parameters in an action
   * @return scopes
  **/
  @ApiModelProperty(value = "A list of scoping parameters. Allows the global to have a different value in different context such as a count of purchases for each user (by putting a 'user' scope in this list). When using this global in a rule these scopes will need to be mapped with an expression to provide a value, similar to the parameters in an action")
  public List<BreGlobalScopeDefinition> getScopes() {
    return scopes;
  }

  public void setScopes(List<BreGlobalScopeDefinition> scopes) {
    this.scopes = scopes;
  }

   /**
   * Where this global came from. System globals cannot be removed or updated
   * @return systemGlobal
  **/
  @ApiModelProperty(example = "false", value = "Where this global came from. System globals cannot be removed or updated")
  public Boolean isSystemGlobal() {
    return systemGlobal;
  }

  public BreGlobalResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The variable type the global stores. See the BRE variables endpoint for list
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The variable type the global stores. See the BRE variables endpoint for list")
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
    BreGlobalResource breGlobalResource = (BreGlobalResource) o;
    return Objects.equals(this.description, breGlobalResource.description) &&
        Objects.equals(this.id, breGlobalResource.id) &&
        Objects.equals(this.key, breGlobalResource.key) &&
        Objects.equals(this.name, breGlobalResource.name) &&
        Objects.equals(this.scopes, breGlobalResource.scopes) &&
        Objects.equals(this.systemGlobal, breGlobalResource.systemGlobal) &&
        Objects.equals(this.type, breGlobalResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, key, name, scopes, systemGlobal, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreGlobalResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    systemGlobal: ").append(toIndentedString(systemGlobal)).append("\n");
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


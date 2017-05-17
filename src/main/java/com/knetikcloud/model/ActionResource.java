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
import com.knetikcloud.model.ActionVariableResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * ActionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class ActionResource implements Parcelable {
  /**
   * The category the action is in. All customer specific actions are in the 'custom' category
   */
  public enum CategoryEnum {
    @SerializedName("achievement")
    ACHIEVEMENT("achievement"),
    
    @SerializedName("behavior")
    BEHAVIOR("behavior"),
    
    @SerializedName("comment")
    COMMENT("comment"),
    
    @SerializedName("disposition")
    DISPOSITION("disposition"),
    
    @SerializedName("device")
    DEVICE("device"),
    
    @SerializedName("entitlement")
    ENTITLEMENT("entitlement"),
    
    @SerializedName("friends")
    FRIENDS("friends"),
    
    @SerializedName("fulfillment")
    FULFILLMENT("fulfillment"),
    
    @SerializedName("gamification")
    GAMIFICATION("gamification"),
    
    @SerializedName("inventory")
    INVENTORY("inventory"),
    
    @SerializedName("invoice")
    INVOICE("invoice"),
    
    @SerializedName("media")
    MEDIA("media"),
    
    @SerializedName("scheduler")
    SCHEDULER("scheduler"),
    
    @SerializedName("store")
    STORE("store"),
    
    @SerializedName("subscription")
    SUBSCRIPTION("subscription"),
    
    @SerializedName("user")
    USER("user"),
    
    @SerializedName("wallet")
    WALLET("wallet"),
    
    @SerializedName("custom")
    CUSTOM("custom"),
    
    @SerializedName("challenge")
    CHALLENGE("challenge"),
    
    @SerializedName("activity")
    ACTIVITY("activity"),
    
    @SerializedName("campaign")
    CAMPAIGN("campaign"),
    
    @SerializedName("event")
    EVENT("event");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("variables")
  private List<ActionVariableResource> variables = new ArrayList<ActionVariableResource>();

  public ActionResource category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * The category the action is in. All customer specific actions are in the 'custom' category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "The category the action is in. All customer specific actions are in the 'custom' category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public ActionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the action
   * @return description
  **/
  @ApiModelProperty(example = "null", required = true, value = "The description of the action")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the action. Used as the unique id for reference
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the action. Used as the unique id for reference")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActionResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ActionResource addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for searching
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "A list of tags for searching")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ActionResource variables(List<ActionVariableResource> variables) {
    this.variables = variables;
    return this;
  }

  public ActionResource addVariablesItem(ActionVariableResource variablesItem) {
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * The variables required for the action
   * @return variables
  **/
  @ApiModelProperty(example = "null", required = true, value = "The variables required for the action")
  public List<ActionVariableResource> getVariables() {
    return variables;
  }

  public void setVariables(List<ActionVariableResource> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionResource actionResource = (ActionResource) o;
    return Objects.equals(this.category, actionResource.category) &&
        Objects.equals(this.description, actionResource.description) &&
        Objects.equals(this.name, actionResource.name) &&
        Objects.equals(this.tags, actionResource.tags) &&
        Objects.equals(this.variables, actionResource.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, name, tags, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionResource {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
     
    out.writeValue(category);

    out.writeValue(description);

    out.writeValue(name);

    out.writeValue(tags);

    out.writeValue(variables);
  }

  public ActionResource() {
    super();
  }

  ActionResource(Parcel in) {
    
    category = (CategoryEnum)in.readValue(null);
    description = (String)in.readValue(null);
    name = (String)in.readValue(null);
    tags = (List<String>)in.readValue(null);
    variables = (List<ActionVariableResource>)in.readValue(ActionVariableResource.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ActionResource> CREATOR = new Parcelable.Creator<ActionResource>() {
    public ActionResource createFromParcel(Parcel in) {
      return new ActionResource(in);
    }
    public ActionResource[] newArray(int size) {
      return new ActionResource[size];
    }
  };
}


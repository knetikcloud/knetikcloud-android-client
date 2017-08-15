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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PredicateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T12:23:32.916-04:00")
public class PredicateResource {
  @SerializedName("args")
  private List<ExpressionResource> args = new ArrayList<ExpressionResource>();

  @SerializedName("op")
  private String op = null;

  @SerializedName("type")
  private String type = null;

  public PredicateResource args(List<ExpressionResource> args) {
    this.args = args;
    return this;
  }

  public PredicateResource addArgsItem(ExpressionResource argsItem) {
    this.args.add(argsItem);
    return this;
  }

   /**
   * The arguments the operator apply to. See notes for details.
   * @return args
  **/
  @ApiModelProperty(required = true, value = "The arguments the operator apply to. See notes for details.")
  public List<ExpressionResource> getArgs() {
    return args;
  }

  public void setArgs(List<ExpressionResource> args) {
    this.args = args;
  }

  public PredicateResource op(String op) {
    this.op = op;
    return this;
  }

   /**
   * The operator to be used in this predicate. See notes for details.
   * @return op
  **/
  @ApiModelProperty(required = true, value = "The operator to be used in this predicate. See notes for details.")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public PredicateResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
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
    PredicateResource predicateResource = (PredicateResource) o;
    return Objects.equals(this.args, predicateResource.args) &&
        Objects.equals(this.op, predicateResource.op) &&
        Objects.equals(this.type, predicateResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, op, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredicateResource {\n");
    
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

}

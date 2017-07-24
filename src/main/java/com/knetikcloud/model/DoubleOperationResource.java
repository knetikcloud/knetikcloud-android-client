/**
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

import com.knetikcloud.model.ExpressionResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DoubleOperationResource {
  
  @SerializedName("args")
  private List<ExpressionResource> args = null;
  @SerializedName("op")
  private String op = null;
  @SerializedName("type")
  private String type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ExpressionResource> getArgs() {
    return args;
  }
  public void setArgs(List<ExpressionResource> args) {
    this.args = args;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOp() {
    return op;
  }
  public void setOp(String op) {
    this.op = op;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoubleOperationResource doubleOperationResource = (DoubleOperationResource) o;
    return (this.args == null ? doubleOperationResource.args == null : this.args.equals(doubleOperationResource.args)) &&
        (this.op == null ? doubleOperationResource.op == null : this.op.equals(doubleOperationResource.op)) &&
        (this.type == null ? doubleOperationResource.type == null : this.type.equals(doubleOperationResource.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.args == null ? 0: this.args.hashCode());
    result = 31 * result + (this.op == null ? 0: this.op.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoubleOperationResource {\n");
    
    sb.append("  args: ").append(args).append("\n");
    sb.append("  op: ").append(op).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

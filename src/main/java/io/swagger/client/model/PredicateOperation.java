/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.Expressionobject;
import io.swagger.client.model.Operator;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PredicateOperation {
  
  @SerializedName("args")
  private List<Expressionobject> args = null;
  @SerializedName("operator")
  private Operator operator = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Expressionobject> getArgs() {
    return args;
  }
  public void setArgs(List<Expressionobject> args) {
    this.args = args;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Operator getOperator() {
    return operator;
  }
  public void setOperator(Operator operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredicateOperation predicateOperation = (PredicateOperation) o;
    return (this.args == null ? predicateOperation.args == null : this.args.equals(predicateOperation.args)) &&
        (this.operator == null ? predicateOperation.operator == null : this.operator.equals(predicateOperation.operator));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.args == null ? 0: this.args.hashCode());
    result = 31 * result + (this.operator == null ? 0: this.operator.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredicateOperation {\n");
    
    sb.append("  args: ").append(args).append("\n");
    sb.append("  operator: ").append(operator).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

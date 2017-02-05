/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.BatchRequest;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Batch {
  
  @SerializedName("batch")
  private List<BatchRequest> batch = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BatchRequest> getBatch() {
    return batch;
  }
  public void setBatch(List<BatchRequest> batch) {
    this.batch = batch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return (this.batch == null ? batch.batch == null : this.batch.equals(batch.batch));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.batch == null ? 0: this.batch.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    
    sb.append("  batch: ").append(batch).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

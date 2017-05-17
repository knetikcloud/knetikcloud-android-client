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

import com.knetikcloud.model.BatchReturn;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BatchResult {
  
  @SerializedName("batch_return")
  private List<BatchReturn> batchReturn = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * List of batch responses.  Returns in the order requested
   **/
  @ApiModelProperty(value = "List of batch responses.  Returns in the order requested")
  public List<BatchReturn> getBatchReturn() {
    return batchReturn;
  }
  public void setBatchReturn(List<BatchReturn> batchReturn) {
    this.batchReturn = batchReturn;
  }

  /**
   * The date the batch call started processing
   **/
  @ApiModelProperty(value = "The date the batch call started processing")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The token to use at the /batch/{token} endpoint if the request times out
   **/
  @ApiModelProperty(value = "The token to use at the /batch/{token} endpoint if the request times out")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The date the batch call finished processing
   **/
  @ApiModelProperty(value = "The date the batch call finished processing")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResult batchResult = (BatchResult) o;
    return (this.batchReturn == null ? batchResult.batchReturn == null : this.batchReturn.equals(batchResult.batchReturn)) &&
        (this.createdDate == null ? batchResult.createdDate == null : this.createdDate.equals(batchResult.createdDate)) &&
        (this.id == null ? batchResult.id == null : this.id.equals(batchResult.id)) &&
        (this.updatedDate == null ? batchResult.updatedDate == null : this.updatedDate.equals(batchResult.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.batchReturn == null ? 0: this.batchReturn.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResult {\n");
    
    sb.append("  batchReturn: ").append(batchReturn).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
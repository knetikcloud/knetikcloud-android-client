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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ForwardLog {
  
  @SerializedName("end_date")
  private Long endDate = null;
  @SerializedName("error_msg")
  private String errorMsg = null;
  @SerializedName("http_status_code")
  private Integer httpStatusCode = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("payload")
  private Object payload = null;
  @SerializedName("response")
  private String response = null;
  @SerializedName("retry_count")
  private Integer retryCount = null;
  @SerializedName("start_date")
  private Long startDate = null;
  @SerializedName("url")
  private String url = null;

  /**
   * The end date of the forward log entry
   **/
  @ApiModelProperty(value = "The end date of the forward log entry")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getErrorMsg() {
    return errorMsg;
  }
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  /**
   * The http status code the forward log entry
   **/
  @ApiModelProperty(value = "The http status code the forward log entry")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }
  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /**
   * The id of the forward log entry
   **/
  @ApiModelProperty(value = "The id of the forward log entry")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The payload of the forward log entry
   **/
  @ApiModelProperty(value = "The payload of the forward log entry")
  public Object getPayload() {
    return payload;
  }
  public void setPayload(Object payload) {
    this.payload = payload;
  }

  /**
   * The response string of the forward log entry
   **/
  @ApiModelProperty(value = "The response string of the forward log entry")
  public String getResponse() {
    return response;
  }
  public void setResponse(String response) {
    this.response = response;
  }

  /**
   * The retry count of the forward log entry
   **/
  @ApiModelProperty(value = "The retry count of the forward log entry")
  public Integer getRetryCount() {
    return retryCount;
  }
  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }

  /**
   * The start date of the forward log entry
   **/
  @ApiModelProperty(value = "The start date of the forward log entry")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   * The endpoint url of the forward log entry
   **/
  @ApiModelProperty(value = "The endpoint url of the forward log entry")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardLog forwardLog = (ForwardLog) o;
    return (this.endDate == null ? forwardLog.endDate == null : this.endDate.equals(forwardLog.endDate)) &&
        (this.errorMsg == null ? forwardLog.errorMsg == null : this.errorMsg.equals(forwardLog.errorMsg)) &&
        (this.httpStatusCode == null ? forwardLog.httpStatusCode == null : this.httpStatusCode.equals(forwardLog.httpStatusCode)) &&
        (this.id == null ? forwardLog.id == null : this.id.equals(forwardLog.id)) &&
        (this.payload == null ? forwardLog.payload == null : this.payload.equals(forwardLog.payload)) &&
        (this.response == null ? forwardLog.response == null : this.response.equals(forwardLog.response)) &&
        (this.retryCount == null ? forwardLog.retryCount == null : this.retryCount.equals(forwardLog.retryCount)) &&
        (this.startDate == null ? forwardLog.startDate == null : this.startDate.equals(forwardLog.startDate)) &&
        (this.url == null ? forwardLog.url == null : this.url.equals(forwardLog.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.errorMsg == null ? 0: this.errorMsg.hashCode());
    result = 31 * result + (this.httpStatusCode == null ? 0: this.httpStatusCode.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.payload == null ? 0: this.payload.hashCode());
    result = 31 * result + (this.response == null ? 0: this.response.hashCode());
    result = 31 * result + (this.retryCount == null ? 0: this.retryCount.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardLog {\n");
    
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  errorMsg: ").append(errorMsg).append("\n");
    sb.append("  httpStatusCode: ").append(httpStatusCode).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  payload: ").append(payload).append("\n");
    sb.append("  response: ").append(response).append("\n");
    sb.append("  retryCount: ").append(retryCount).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

/**
 * ForwardLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:46:55.685-04:00")
public class ForwardLog {
  @SerializedName("end_date")
  private Long endDate = null;

  @SerializedName("error_msg")
  private String errorMsg = null;

  @SerializedName("event_id")
  private String eventId = null;

  @SerializedName("headers")
  private String headers = null;

  @SerializedName("http_status_code")
  private Integer httpStatusCode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("payload")
  private Object payload = null;

  @SerializedName("response")
  private String response = null;

  @SerializedName("retry_count")
  private Integer retryCount = null;

  @SerializedName("retryable")
  private Boolean retryable = null;

  @SerializedName("rule_id")
  private String ruleId = null;

  @SerializedName("start_date")
  private Long startDate = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("url")
  private String url = null;

   /**
   * The end date of the forward log entry
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the forward log entry")
  public Long getEndDate() {
    return endDate;
  }

  public ForwardLog errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Get errorMsg
   * @return errorMsg
  **/
  @ApiModelProperty(value = "")
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public ForwardLog eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(value = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ForwardLog headers(String headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public String getHeaders() {
    return headers;
  }

  public void setHeaders(String headers) {
    this.headers = headers;
  }

   /**
   * The http status code the forward log entry
   * @return httpStatusCode
  **/
  @ApiModelProperty(value = "The http status code the forward log entry")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

   /**
   * The id of the forward log entry
   * @return id
  **/
  @ApiModelProperty(value = "The id of the forward log entry")
  public String getId() {
    return id;
  }

  public ForwardLog method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ForwardLog payload(Object payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload of the forward log entry
   * @return payload
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
   * @return response
  **/
  @ApiModelProperty(value = "The response string of the forward log entry")
  public String getResponse() {
    return response;
  }

   /**
   * The retry count of the forward log entry
   * @return retryCount
  **/
  @ApiModelProperty(value = "The retry count of the forward log entry")
  public Integer getRetryCount() {
    return retryCount;
  }

  public ForwardLog retryable(Boolean retryable) {
    this.retryable = retryable;
    return this;
  }

   /**
   * Get retryable
   * @return retryable
  **/
  @ApiModelProperty(value = "")
  public Boolean isRetryable() {
    return retryable;
  }

  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }

  public ForwardLog ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @ApiModelProperty(value = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

   /**
   * The start date of the forward log entry
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the forward log entry")
  public Long getStartDate() {
    return startDate;
  }

  public ForwardLog success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

   /**
   * The endpoint url of the forward log entry
   * @return url
  **/
  @ApiModelProperty(value = "The endpoint url of the forward log entry")
  public String getUrl() {
    return url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardLog forwardLog = (ForwardLog) o;
    return Objects.equals(this.endDate, forwardLog.endDate) &&
        Objects.equals(this.errorMsg, forwardLog.errorMsg) &&
        Objects.equals(this.eventId, forwardLog.eventId) &&
        Objects.equals(this.headers, forwardLog.headers) &&
        Objects.equals(this.httpStatusCode, forwardLog.httpStatusCode) &&
        Objects.equals(this.id, forwardLog.id) &&
        Objects.equals(this.method, forwardLog.method) &&
        Objects.equals(this.payload, forwardLog.payload) &&
        Objects.equals(this.response, forwardLog.response) &&
        Objects.equals(this.retryCount, forwardLog.retryCount) &&
        Objects.equals(this.retryable, forwardLog.retryable) &&
        Objects.equals(this.ruleId, forwardLog.ruleId) &&
        Objects.equals(this.startDate, forwardLog.startDate) &&
        Objects.equals(this.success, forwardLog.success) &&
        Objects.equals(this.url, forwardLog.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, errorMsg, eventId, headers, httpStatusCode, id, method, payload, response, retryCount, retryable, ruleId, startDate, success, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardLog {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


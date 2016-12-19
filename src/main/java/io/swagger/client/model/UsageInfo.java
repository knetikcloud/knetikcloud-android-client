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
public class UsageInfo {
  
  @SerializedName("count")
  private Long count = null;
  @SerializedName("date")
  private Long date = null;
  @SerializedName("method")
  private String method = null;
  @SerializedName("url")
  private String url = null;

  /**
   * The number of requests within the range
   **/
  @ApiModelProperty(value = "The number of requests within the range")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   * The date at the start of the range (see granularity)
   **/
  @ApiModelProperty(value = "The date at the start of the range (see granularity)")
  public Long getDate() {
    return date;
  }
  public void setDate(Long date) {
    this.date = date;
  }

  /**
   * The http method
   **/
  @ApiModelProperty(value = "The http method")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * The url path
   **/
  @ApiModelProperty(value = "The url path")
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
    UsageInfo usageInfo = (UsageInfo) o;
    return (this.count == null ? usageInfo.count == null : this.count.equals(usageInfo.count)) &&
        (this.date == null ? usageInfo.date == null : this.date.equals(usageInfo.date)) &&
        (this.method == null ? usageInfo.method == null : this.method.equals(usageInfo.method)) &&
        (this.url == null ? usageInfo.url == null : this.url.equals(usageInfo.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.count == null ? 0: this.count.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.method == null ? 0: this.method.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageInfo {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

package io.swagger.client.model;

import io.swagger.client.model.GroupMemberResource;
import io.swagger.client.model.Order;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PageResourceGroupMemberResource {
  
  @SerializedName("content")
  private List<GroupMemberResource> content = null;
  @SerializedName("first")
  private Boolean first = null;
  @SerializedName("last")
  private Boolean last = null;
  @SerializedName("number")
  private Integer number = null;
  @SerializedName("number_of_elements")
  private Integer numberOfElements = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("sort")
  private List<Order> sort = null;
  @SerializedName("total_elements")
  private Long totalElements = null;
  @SerializedName("total_pages")
  private Integer totalPages = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<GroupMemberResource> getContent() {
    return content;
  }
  public void setContent(List<GroupMemberResource> content) {
    this.content = content;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFirst() {
    return first;
  }
  public void setFirst(Boolean first) {
    this.first = first;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getLast() {
    return last;
  }
  public void setLast(Boolean last) {
    this.last = last;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }
  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Order> getSort() {
    return sort;
  }
  public void setSort(List<Order> sort) {
    this.sort = sort;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotalElements() {
    return totalElements;
  }
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageResourceGroupMemberResource pageResourceGroupMemberResource = (PageResourceGroupMemberResource) o;
    return (this.content == null ? pageResourceGroupMemberResource.content == null : this.content.equals(pageResourceGroupMemberResource.content)) &&
        (this.first == null ? pageResourceGroupMemberResource.first == null : this.first.equals(pageResourceGroupMemberResource.first)) &&
        (this.last == null ? pageResourceGroupMemberResource.last == null : this.last.equals(pageResourceGroupMemberResource.last)) &&
        (this.number == null ? pageResourceGroupMemberResource.number == null : this.number.equals(pageResourceGroupMemberResource.number)) &&
        (this.numberOfElements == null ? pageResourceGroupMemberResource.numberOfElements == null : this.numberOfElements.equals(pageResourceGroupMemberResource.numberOfElements)) &&
        (this.size == null ? pageResourceGroupMemberResource.size == null : this.size.equals(pageResourceGroupMemberResource.size)) &&
        (this.sort == null ? pageResourceGroupMemberResource.sort == null : this.sort.equals(pageResourceGroupMemberResource.sort)) &&
        (this.totalElements == null ? pageResourceGroupMemberResource.totalElements == null : this.totalElements.equals(pageResourceGroupMemberResource.totalElements)) &&
        (this.totalPages == null ? pageResourceGroupMemberResource.totalPages == null : this.totalPages.equals(pageResourceGroupMemberResource.totalPages));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.first == null ? 0: this.first.hashCode());
    result = 31 * result + (this.last == null ? 0: this.last.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this.numberOfElements == null ? 0: this.numberOfElements.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.totalElements == null ? 0: this.totalElements.hashCode());
    result = 31 * result + (this.totalPages == null ? 0: this.totalPages.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResourceGroupMemberResource {\n");
    
    sb.append("  content: ").append(content).append("\n");
    sb.append("  first: ").append(first).append("\n");
    sb.append("  last: ").append(last).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  numberOfElements: ").append(numberOfElements).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  totalElements: ").append(totalElements).append("\n");
    sb.append("  totalPages: ").append(totalPages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
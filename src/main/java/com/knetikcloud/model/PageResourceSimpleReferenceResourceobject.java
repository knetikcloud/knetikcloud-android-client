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
import com.knetikcloud.model.Order;
import com.knetikcloud.model.SimpleReferenceResourceobject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PageResourceSimpleReferenceResourceobject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class PageResourceSimpleReferenceResourceobject implements Parcelable {
  @SerializedName("content")
  private List<SimpleReferenceResourceobject> content = new ArrayList<SimpleReferenceResourceobject>();

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
  private List<Order> sort = new ArrayList<Order>();

  @SerializedName("total_elements")
  private Long totalElements = null;

  @SerializedName("total_pages")
  private Integer totalPages = null;

  public PageResourceSimpleReferenceResourceobject content(List<SimpleReferenceResourceobject> content) {
    this.content = content;
    return this;
  }

  public PageResourceSimpleReferenceResourceobject addContentItem(SimpleReferenceResourceobject contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SimpleReferenceResourceobject> getContent() {
    return content;
  }

  public void setContent(List<SimpleReferenceResourceobject> content) {
    this.content = content;
  }

  public PageResourceSimpleReferenceResourceobject first(Boolean first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageResourceSimpleReferenceResourceobject last(Boolean last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageResourceSimpleReferenceResourceobject number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageResourceSimpleReferenceResourceobject numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageResourceSimpleReferenceResourceobject size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageResourceSimpleReferenceResourceobject sort(List<Order> sort) {
    this.sort = sort;
    return this;
  }

  public PageResourceSimpleReferenceResourceobject addSortItem(Order sortItem) {
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Order> getSort() {
    return sort;
  }

  public void setSort(List<Order> sort) {
    this.sort = sort;
  }

  public PageResourceSimpleReferenceResourceobject totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageResourceSimpleReferenceResourceobject totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageResourceSimpleReferenceResourceobject pageResourceSimpleReferenceResourceobject = (PageResourceSimpleReferenceResourceobject) o;
    return Objects.equals(this.content, pageResourceSimpleReferenceResourceobject.content) &&
        Objects.equals(this.first, pageResourceSimpleReferenceResourceobject.first) &&
        Objects.equals(this.last, pageResourceSimpleReferenceResourceobject.last) &&
        Objects.equals(this.number, pageResourceSimpleReferenceResourceobject.number) &&
        Objects.equals(this.numberOfElements, pageResourceSimpleReferenceResourceobject.numberOfElements) &&
        Objects.equals(this.size, pageResourceSimpleReferenceResourceobject.size) &&
        Objects.equals(this.sort, pageResourceSimpleReferenceResourceobject.sort) &&
        Objects.equals(this.totalElements, pageResourceSimpleReferenceResourceobject.totalElements) &&
        Objects.equals(this.totalPages, pageResourceSimpleReferenceResourceobject.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, number, numberOfElements, size, sort, totalElements, totalPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResourceSimpleReferenceResourceobject {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
     
    out.writeValue(content);

    out.writeValue(first);

    out.writeValue(last);

    out.writeValue(number);

    out.writeValue(numberOfElements);

    out.writeValue(size);

    out.writeValue(sort);

    out.writeValue(totalElements);

    out.writeValue(totalPages);
  }

  public PageResourceSimpleReferenceResourceobject() {
    super();
  }

  PageResourceSimpleReferenceResourceobject(Parcel in) {
    
    content = (List<SimpleReferenceResourceobject>)in.readValue(SimpleReferenceResourceobject.class.getClassLoader());
    first = (Boolean)in.readValue(null);
    last = (Boolean)in.readValue(null);
    number = (Integer)in.readValue(null);
    numberOfElements = (Integer)in.readValue(null);
    size = (Integer)in.readValue(null);
    sort = (List<Order>)in.readValue(Order.class.getClassLoader());
    totalElements = (Long)in.readValue(null);
    totalPages = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PageResourceSimpleReferenceResourceobject> CREATOR = new Parcelable.Creator<PageResourceSimpleReferenceResourceobject>() {
    public PageResourceSimpleReferenceResourceobject createFromParcel(Parcel in) {
      return new PageResourceSimpleReferenceResourceobject(in);
    }
    public PageResourceSimpleReferenceResourceobject[] newArray(int size) {
      return new PageResourceSimpleReferenceResourceobject[size];
    }
  };
}


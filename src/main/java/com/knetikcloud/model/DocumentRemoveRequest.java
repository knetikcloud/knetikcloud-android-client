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
 * DocumentRemoveRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T13:50:44.564-04:00")
public class DocumentRemoveRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("type")
  private String type = null;

  public DocumentRemoveRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the document
   * @return id
  **/
  @ApiModelProperty(value = "The id of the document")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocumentRemoveRequest template(String template) {
    this.template = template;
    return this;
  }

   /**
   * The id of the template if this document is based on a templated resource
   * @return template
  **/
  @ApiModelProperty(value = "The id of the template if this document is based on a templated resource")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public DocumentRemoveRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of document
   * @return type
  **/
  @ApiModelProperty(value = "The type of document")
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
    DocumentRemoveRequest documentRemoveRequest = (DocumentRemoveRequest) o;
    return Objects.equals(this.id, documentRemoveRequest.id) &&
        Objects.equals(this.template, documentRemoveRequest.template) &&
        Objects.equals(this.type, documentRemoveRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, template, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRemoveRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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


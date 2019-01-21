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
 * TemplatedEmail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T15:40:11.397-05:00")
public class TemplatedEmail {
  @SerializedName("external_template_id")
  private String externalTemplateId = null;

  @SerializedName("template_data")
  private Object templateData = null;

  public TemplatedEmail externalTemplateId(String externalTemplateId) {
    this.externalTemplateId = externalTemplateId;
    return this;
  }

   /**
   * The external template ID used by the email provider
   * @return externalTemplateId
  **/
  @ApiModelProperty(value = "The external template ID used by the email provider")
  public String getExternalTemplateId() {
    return externalTemplateId;
  }

  public void setExternalTemplateId(String externalTemplateId) {
    this.externalTemplateId = externalTemplateId;
  }

  public TemplatedEmail templateData(Object templateData) {
    this.templateData = templateData;
    return this;
  }

   /**
   * The map of data used by the template
   * @return templateData
  **/
  @ApiModelProperty(value = "The map of data used by the template")
  public Object getTemplateData() {
    return templateData;
  }

  public void setTemplateData(Object templateData) {
    this.templateData = templateData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatedEmail templatedEmail = (TemplatedEmail) o;
    return Objects.equals(this.externalTemplateId, templatedEmail.externalTemplateId) &&
        Objects.equals(this.templateData, templatedEmail.templateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalTemplateId, templateData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatedEmail {\n");
    
    sb.append("    externalTemplateId: ").append(toIndentedString(externalTemplateId)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
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


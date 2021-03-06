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
import java.util.ArrayList;
import java.util.List;

/**
 * TemplateSMSResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:01.795-05:00")
public class TemplateSMSResource {
  @SerializedName("from")
  private String from = null;

  @SerializedName("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  @SerializedName("template")
  private String template = null;

  @SerializedName("template_vars")
  private Object templateVars = null;

  public TemplateSMSResource from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The phone number to attribute the outgoing message to. Optional if the config text.out_number is set.
   * @return from
  **/
  @ApiModelProperty(value = "The phone number to attribute the outgoing message to. Optional if the config text.out_number is set.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public TemplateSMSResource recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public TemplateSMSResource addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * A list of user ids to send the message to.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "A list of user ids to send the message to.")
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  public TemplateSMSResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A mustache template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "A mustache template")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public TemplateSMSResource templateVars(Object templateVars) {
    this.templateVars = templateVars;
    return this;
  }

   /**
   * A map of values to fill in the template
   * @return templateVars
  **/
  @ApiModelProperty(value = "A map of values to fill in the template")
  public Object getTemplateVars() {
    return templateVars;
  }

  public void setTemplateVars(Object templateVars) {
    this.templateVars = templateVars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSMSResource templateSMSResource = (TemplateSMSResource) o;
    return Objects.equals(this.from, templateSMSResource.from) &&
        Objects.equals(this.recipients, templateSMSResource.recipients) &&
        Objects.equals(this.template, templateSMSResource.template) &&
        Objects.equals(this.templateVars, templateSMSResource.templateVars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, recipients, template, templateVars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSMSResource {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateVars: ").append(toIndentedString(templateVars)).append("\n");
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


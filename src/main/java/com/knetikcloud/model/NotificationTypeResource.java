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
 * NotificationTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-09T14:18:22.878-05:00")
public class NotificationTypeResource {
  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("email_body_template_external")
  private Boolean emailBodyTemplateExternal = null;

  @SerializedName("email_body_template_id")
  private String emailBodyTemplateId = null;

  @SerializedName("email_subject_template_id")
  private String emailSubjectTemplateId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sms_template_id")
  private String smsTemplateId = null;

  @SerializedName("template_id")
  private String templateId = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

   /**
   * The date the type was created, as a unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the type was created, as a unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public NotificationTypeResource emailBodyTemplateExternal(Boolean emailBodyTemplateExternal) {
    this.emailBodyTemplateExternal = emailBodyTemplateExternal;
    return this;
  }

   /**
   * Whether the email body should be resolved. If true, the external email delivery system will be expected to handle the templating (Mandrill/Mailchimp). default: false
   * @return emailBodyTemplateExternal
  **/
  @ApiModelProperty(example = "false", value = "Whether the email body should be resolved. If true, the external email delivery system will be expected to handle the templating (Mandrill/Mailchimp). default: false")
  public Boolean isEmailBodyTemplateExternal() {
    return emailBodyTemplateExternal;
  }

  public void setEmailBodyTemplateExternal(Boolean emailBodyTemplateExternal) {
    this.emailBodyTemplateExternal = emailBodyTemplateExternal;
  }

  public NotificationTypeResource emailBodyTemplateId(String emailBodyTemplateId) {
    this.emailBodyTemplateId = emailBodyTemplateId;
    return this;
  }

   /**
   * The id of a message template to resolve the email body. If null, no websocket message wil be sent
   * @return emailBodyTemplateId
  **/
  @ApiModelProperty(value = "The id of a message template to resolve the email body. If null, no websocket message wil be sent")
  public String getEmailBodyTemplateId() {
    return emailBodyTemplateId;
  }

  public void setEmailBodyTemplateId(String emailBodyTemplateId) {
    this.emailBodyTemplateId = emailBodyTemplateId;
  }

  public NotificationTypeResource emailSubjectTemplateId(String emailSubjectTemplateId) {
    this.emailSubjectTemplateId = emailSubjectTemplateId;
    return this;
  }

   /**
   * The id of a message template to resolve the email subject. If null, no websocket message wil be sent
   * @return emailSubjectTemplateId
  **/
  @ApiModelProperty(value = "The id of a message template to resolve the email subject. If null, no websocket message wil be sent")
  public String getEmailSubjectTemplateId() {
    return emailSubjectTemplateId;
  }

  public void setEmailSubjectTemplateId(String emailSubjectTemplateId) {
    this.emailSubjectTemplateId = emailSubjectTemplateId;
  }

  public NotificationTypeResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the notification type. Default: random
   * @return id
  **/
  @ApiModelProperty(value = "The id of the notification type. Default: random")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NotificationTypeResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the notification type
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the notification type")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationTypeResource smsTemplateId(String smsTemplateId) {
    this.smsTemplateId = smsTemplateId;
    return this;
  }

   /**
   * The id of a message template to resolve the SMS message. If null, no sms message wil be sent
   * @return smsTemplateId
  **/
  @ApiModelProperty(value = "The id of a message template to resolve the SMS message. If null, no sms message wil be sent")
  public String getSmsTemplateId() {
    return smsTemplateId;
  }

  public void setSmsTemplateId(String smsTemplateId) {
    this.smsTemplateId = smsTemplateId;
  }

  public NotificationTypeResource templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The id of a message template to resolve the basic message (for user retrieval). If null, message wil be blank
   * @return templateId
  **/
  @ApiModelProperty(value = "The id of a message template to resolve the basic message (for user retrieval). If null, message wil be blank")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

   /**
   * The date the type was last updated, as a unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the type was last updated, as a unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTypeResource notificationTypeResource = (NotificationTypeResource) o;
    return Objects.equals(this.createdDate, notificationTypeResource.createdDate) &&
        Objects.equals(this.emailBodyTemplateExternal, notificationTypeResource.emailBodyTemplateExternal) &&
        Objects.equals(this.emailBodyTemplateId, notificationTypeResource.emailBodyTemplateId) &&
        Objects.equals(this.emailSubjectTemplateId, notificationTypeResource.emailSubjectTemplateId) &&
        Objects.equals(this.id, notificationTypeResource.id) &&
        Objects.equals(this.name, notificationTypeResource.name) &&
        Objects.equals(this.smsTemplateId, notificationTypeResource.smsTemplateId) &&
        Objects.equals(this.templateId, notificationTypeResource.templateId) &&
        Objects.equals(this.updatedDate, notificationTypeResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, emailBodyTemplateExternal, emailBodyTemplateId, emailSubjectTemplateId, id, name, smsTemplateId, templateId, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTypeResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    emailBodyTemplateExternal: ").append(toIndentedString(emailBodyTemplateExternal)).append("\n");
    sb.append("    emailBodyTemplateId: ").append(toIndentedString(emailBodyTemplateId)).append("\n");
    sb.append("    emailSubjectTemplateId: ").append(toIndentedString(emailSubjectTemplateId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    smsTemplateId: ").append(toIndentedString(smsTemplateId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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


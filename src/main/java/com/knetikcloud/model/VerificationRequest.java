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
import com.knetikcloud.model.Property;
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VerificationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-07T16:43:21.868-04:00")
public class VerificationRequest {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("codelength")
  private Integer codelength = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("expiration_date")
  private Long expirationDate = null;

  @SerializedName("include_letters")
  private Boolean includeLetters = null;

  @SerializedName("include_numbers")
  private Boolean includeNumbers = null;

  @SerializedName("originator")
  private SimpleUserResource originator = null;

  @SerializedName("target_user")
  private SimpleUserResource targetUser = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public VerificationRequest additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public VerificationRequest putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public VerificationRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A unique code to identify the request. May be publically known and use ACL to require the correct user to respond, or private and the ACL allows anyone with the code to verify. default: random
   * @return code
  **/
  @ApiModelProperty(value = "A unique code to identify the request. May be publically known and use ACL to require the correct user to respond, or private and the ACL allows anyone with the code to verify. default: random")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VerificationRequest codelength(Integer codelength) {
    this.codelength = codelength;
    return this;
  }

   /**
   * The intended length of the code, if auto-generated. Minimum 3, default 16
   * @return codelength
  **/
  @ApiModelProperty(value = "The intended length of the code, if auto-generated. Minimum 3, default 16")
  public Integer getCodelength() {
    return codelength;
  }

  public void setCodelength(Integer codelength) {
    this.codelength = codelength;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public VerificationRequest expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The date, as a unix timestamp in seconds, that the request expires
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The date, as a unix timestamp in seconds, that the request expires")
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public VerificationRequest includeLetters(Boolean includeLetters) {
    this.includeLetters = includeLetters;
    return this;
  }

   /**
   * Whether to include letters, if the code is auto-generated. Default: true
   * @return includeLetters
  **/
  @ApiModelProperty(example = "false", value = "Whether to include letters, if the code is auto-generated. Default: true")
  public Boolean isIncludeLetters() {
    return includeLetters;
  }

  public void setIncludeLetters(Boolean includeLetters) {
    this.includeLetters = includeLetters;
  }

  public VerificationRequest includeNumbers(Boolean includeNumbers) {
    this.includeNumbers = includeNumbers;
    return this;
  }

   /**
   * Whether to include numbers, if the code is auto-generated. Default: true
   * @return includeNumbers
  **/
  @ApiModelProperty(example = "false", value = "Whether to include numbers, if the code is auto-generated. Default: true")
  public Boolean isIncludeNumbers() {
    return includeNumbers;
  }

  public void setIncludeNumbers(Boolean includeNumbers) {
    this.includeNumbers = includeNumbers;
  }

  public VerificationRequest originator(SimpleUserResource originator) {
    this.originator = originator;
    return this;
  }

   /**
   * The originating user of the request, filled at 
   * @return originator
  **/
  @ApiModelProperty(value = "The originating user of the request, filled at ")
  public SimpleUserResource getOriginator() {
    return originator;
  }

  public void setOriginator(SimpleUserResource originator) {
    this.originator = originator;
  }

  public VerificationRequest targetUser(SimpleUserResource targetUser) {
    this.targetUser = targetUser;
    return this;
  }

   /**
   * An optional user that is expected to respond
   * @return targetUser
  **/
  @ApiModelProperty(value = "An optional user that is expected to respond")
  public SimpleUserResource getTargetUser() {
    return targetUser;
  }

  public void setTargetUser(SimpleUserResource targetUser) {
    this.targetUser = targetUser;
  }

  public VerificationRequest template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A template this verification request is validated against. Filled from url
   * @return template
  **/
  @ApiModelProperty(value = "A template this verification request is validated against. Filled from url")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
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
    VerificationRequest verificationRequest = (VerificationRequest) o;
    return Objects.equals(this.additionalProperties, verificationRequest.additionalProperties) &&
        Objects.equals(this.code, verificationRequest.code) &&
        Objects.equals(this.codelength, verificationRequest.codelength) &&
        Objects.equals(this.createdDate, verificationRequest.createdDate) &&
        Objects.equals(this.expirationDate, verificationRequest.expirationDate) &&
        Objects.equals(this.includeLetters, verificationRequest.includeLetters) &&
        Objects.equals(this.includeNumbers, verificationRequest.includeNumbers) &&
        Objects.equals(this.originator, verificationRequest.originator) &&
        Objects.equals(this.targetUser, verificationRequest.targetUser) &&
        Objects.equals(this.template, verificationRequest.template) &&
        Objects.equals(this.updatedDate, verificationRequest.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, code, codelength, createdDate, expirationDate, includeLetters, includeNumbers, originator, targetUser, template, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationRequest {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codelength: ").append(toIndentedString(codelength)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    includeLetters: ").append(toIndentedString(includeLetters)).append("\n");
    sb.append("    includeNumbers: ").append(toIndentedString(includeNumbers)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    targetUser: ").append(toIndentedString(targetUser)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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


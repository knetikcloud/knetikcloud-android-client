/**
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

import com.knetikcloud.model.KeyValuePairstringstring;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TemplateEmailResource {
  
  @SerializedName("from")
  private String from = null;
  @SerializedName("recipients")
  private List<Integer> recipients = null;
  @SerializedName("template_key")
  private String templateKey = null;
  @SerializedName("template_vars")
  private List<KeyValuePairstringstring> templateVars = null;

  /**
   * Address to attribute the outgoing message to. Optional if the config email.out_address is set.
   **/
  @ApiModelProperty(value = "Address to attribute the outgoing message to. Optional if the config email.out_address is set.")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  /**
   * A list of user ids to send the message to.
   **/
  @ApiModelProperty(required = true, value = "A list of user ids to send the message to.")
  public List<Integer> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  /**
   * The key for the template
   **/
  @ApiModelProperty(required = true, value = "The key for the template")
  public String getTemplateKey() {
    return templateKey;
  }
  public void setTemplateKey(String templateKey) {
    this.templateKey = templateKey;
  }

  /**
   * A list of variables to fill in the template
   **/
  @ApiModelProperty(value = "A list of variables to fill in the template")
  public List<KeyValuePairstringstring> getTemplateVars() {
    return templateVars;
  }
  public void setTemplateVars(List<KeyValuePairstringstring> templateVars) {
    this.templateVars = templateVars;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateEmailResource templateEmailResource = (TemplateEmailResource) o;
    return (this.from == null ? templateEmailResource.from == null : this.from.equals(templateEmailResource.from)) &&
        (this.recipients == null ? templateEmailResource.recipients == null : this.recipients.equals(templateEmailResource.recipients)) &&
        (this.templateKey == null ? templateEmailResource.templateKey == null : this.templateKey.equals(templateEmailResource.templateKey)) &&
        (this.templateVars == null ? templateEmailResource.templateVars == null : this.templateVars.equals(templateEmailResource.templateVars));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.from == null ? 0: this.from.hashCode());
    result = 31 * result + (this.recipients == null ? 0: this.recipients.hashCode());
    result = 31 * result + (this.templateKey == null ? 0: this.templateKey.hashCode());
    result = 31 * result + (this.templateVars == null ? 0: this.templateVars.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateEmailResource {\n");
    
    sb.append("  from: ").append(from).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  templateKey: ").append(templateKey).append("\n");
    sb.append("  templateVars: ").append(templateVars).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

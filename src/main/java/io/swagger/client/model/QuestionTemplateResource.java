/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.PropertyDefinitionResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class QuestionTemplateResource {
  
  @SerializedName("answer_property")
  private PropertyDefinitionResource answerProperty = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("properties")
  private List<PropertyDefinitionResource> properties = null;
  @SerializedName("question_property")
  private PropertyDefinitionResource questionProperty = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * A property definition for all answers. If included each answer must match this definition's type and be valid
   **/
  @ApiModelProperty(value = "A property definition for all answers. If included each answer must match this definition's type and be valid")
  public PropertyDefinitionResource getAnswerProperty() {
    return answerProperty;
  }
  public void setAnswerProperty(PropertyDefinitionResource answerProperty) {
    this.answerProperty = answerProperty;
  }

  /**
   * The date/time this resource was created in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The id of the template
   **/
  @ApiModelProperty(value = "The id of the template")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the template
   **/
  @ApiModelProperty(required = true, value = "The name of the template")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The customized properties that are present
   **/
  @ApiModelProperty(value = "The customized properties that are present")
  public List<PropertyDefinitionResource> getProperties() {
    return properties;
  }
  public void setProperties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
  }

  /**
   * A property definition for the question itself. If included the answer must match this definition's type and be valid
   **/
  @ApiModelProperty(value = "A property definition for the question itself. If included the answer must match this definition's type and be valid")
  public PropertyDefinitionResource getQuestionProperty() {
    return questionProperty;
  }
  public void setQuestionProperty(PropertyDefinitionResource questionProperty) {
    this.questionProperty = questionProperty;
  }

  /**
   * The date/time this resource was last updated in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionTemplateResource questionTemplateResource = (QuestionTemplateResource) o;
    return (this.answerProperty == null ? questionTemplateResource.answerProperty == null : this.answerProperty.equals(questionTemplateResource.answerProperty)) &&
        (this.createdDate == null ? questionTemplateResource.createdDate == null : this.createdDate.equals(questionTemplateResource.createdDate)) &&
        (this.id == null ? questionTemplateResource.id == null : this.id.equals(questionTemplateResource.id)) &&
        (this.name == null ? questionTemplateResource.name == null : this.name.equals(questionTemplateResource.name)) &&
        (this.properties == null ? questionTemplateResource.properties == null : this.properties.equals(questionTemplateResource.properties)) &&
        (this.questionProperty == null ? questionTemplateResource.questionProperty == null : this.questionProperty.equals(questionTemplateResource.questionProperty)) &&
        (this.updatedDate == null ? questionTemplateResource.updatedDate == null : this.updatedDate.equals(questionTemplateResource.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.answerProperty == null ? 0: this.answerProperty.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.properties == null ? 0: this.properties.hashCode());
    result = 31 * result + (this.questionProperty == null ? 0: this.questionProperty.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionTemplateResource {\n");
    
    sb.append("  answerProperty: ").append(answerProperty).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  questionProperty: ").append(questionProperty).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

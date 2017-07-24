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

import com.knetikcloud.model.Property;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AnswerResource {
  
  @SerializedName("answer")
  private Property answer = null;
  @SerializedName("correct")
  private Boolean correct = null;
  @SerializedName("id")
  private String id = null;

  /**
   * The answer to the question. Different 'type' values indicate different structures as the answer may be test, image, etc. See information on additional properties for the list and their structures
   **/
  @ApiModelProperty(required = true, value = "The answer to the question. Different 'type' values indicate different structures as the answer may be test, image, etc. See information on additional properties for the list and their structures")
  public Property getAnswer() {
    return answer;
  }
  public void setAnswer(Property answer) {
    this.answer = answer;
  }

  /**
   * Whether the answer is correct or not
   **/
  @ApiModelProperty(required = true, value = "Whether the answer is correct or not")
  public Boolean getCorrect() {
    return correct;
  }
  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  /**
   * The unique ID for that resource
   **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerResource answerResource = (AnswerResource) o;
    return (this.answer == null ? answerResource.answer == null : this.answer.equals(answerResource.answer)) &&
        (this.correct == null ? answerResource.correct == null : this.correct.equals(answerResource.correct)) &&
        (this.id == null ? answerResource.id == null : this.id.equals(answerResource.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.answer == null ? 0: this.answer.hashCode());
    result = 31 * result + (this.correct == null ? 0: this.correct.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerResource {\n");
    
    sb.append("  answer: ").append(answer).append("\n");
    sb.append("  correct: ").append(correct).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

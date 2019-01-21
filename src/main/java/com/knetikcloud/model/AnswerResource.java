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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AnswerResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T13:11:14.426-05:00")
public class AnswerResource {
  @SerializedName("answer")
  private Property answer = null;

  @SerializedName("correct")
  private Boolean correct = null;

  @SerializedName("id")
  private String id = null;

  public AnswerResource answer(Property answer) {
    this.answer = answer;
    return this;
  }

   /**
   * The answer to the question. Different &#39;type&#39; values indicate different structures as the answer may be test, image, etc. See information on additional properties for the list and their structures
   * @return answer
  **/
  @ApiModelProperty(required = true, value = "The answer to the question. Different 'type' values indicate different structures as the answer may be test, image, etc. See information on additional properties for the list and their structures")
  public Property getAnswer() {
    return answer;
  }

  public void setAnswer(Property answer) {
    this.answer = answer;
  }

  public AnswerResource correct(Boolean correct) {
    this.correct = correct;
    return this;
  }

   /**
   * Whether the answer is correct or not
   * @return correct
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the answer is correct or not")
  public Boolean isCorrect() {
    return correct;
  }

  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public String getId() {
    return id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerResource answerResource = (AnswerResource) o;
    return Objects.equals(this.answer, answerResource.answer) &&
        Objects.equals(this.correct, answerResource.correct) &&
        Objects.equals(this.id, answerResource.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, correct, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerResource {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


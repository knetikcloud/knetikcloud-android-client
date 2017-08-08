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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = DatePropertyDefinitionResource.class, name = "date"),
  @JsonSubTypes.Type(value = ImageGroupPropertyDefinitionResource.class, name = "image_group"),
  @JsonSubTypes.Type(value = IntegerPropertyDefinitionResource.class, name = "integer"),
  @JsonSubTypes.Type(value = DoublePropertyDefinitionResource.class, name = "double"),
  @JsonSubTypes.Type(value = AudioPropertyDefinitionResource.class, name = "audio"),
  @JsonSubTypes.Type(value = LongPropertyDefinitionResource.class, name = "long"),
  @JsonSubTypes.Type(value = FileGroupPropertyDefinitionResource.class, name = "file_group"),
  @JsonSubTypes.Type(value = BooleanPropertyDefinitionResource.class, name = "boolean"),
  @JsonSubTypes.Type(value = VideoGroupPropertyDefinitionResource.class, name = "video_group"),
  @JsonSubTypes.Type(value = FormattedTextPropertyDefinitionResource.class, name = "formatted_text"),
  @JsonSubTypes.Type(value = ImagePropertyDefinitionResource.class, name = "image"),
  @JsonSubTypes.Type(value = AudioGroupPropertyDefinitionResource.class, name = "audio_group"),
  @JsonSubTypes.Type(value = VideoPropertyDefinitionResource.class, name = "video"),
  @JsonSubTypes.Type(value = FilePropertyDefinitionResource.class, name = "file"),
  @JsonSubTypes.Type(value = TextPropertyDefinitionResource.class, name = "text"),
})

public class PropertyDefinitionResource {
  @JsonProperty("field_list")
  private PropertyFieldListResource fieldList = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("type")
  private String type = null;

  public PropertyDefinitionResource fieldList(PropertyFieldListResource fieldList) {
    this.fieldList = fieldList;
    return this;
  }

   /**
   * A list of the fields on both the property definition and property of this type
   * @return fieldList
  **/
  @ApiModelProperty(value = "A list of the fields on both the property definition and property of this type")
  public PropertyFieldListResource getFieldList() {
    return fieldList;
  }

  public void setFieldList(PropertyFieldListResource fieldList) {
    this.fieldList = fieldList;
  }

  public PropertyDefinitionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the property
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the property")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PropertyDefinitionResource required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether the property is required
   * @return required
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the property is required")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PropertyDefinitionResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.")
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
    PropertyDefinitionResource propertyDefinitionResource = (PropertyDefinitionResource) o;
    return Objects.equals(this.fieldList, propertyDefinitionResource.fieldList) &&
        Objects.equals(this.name, propertyDefinitionResource.name) &&
        Objects.equals(this.required, propertyDefinitionResource.required) &&
        Objects.equals(this.type, propertyDefinitionResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldList, name, required, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDefinitionResource {\n");
    
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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


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
import com.knetikcloud.model.PropertyFieldResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PropertyFieldResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-05T10:20:40.002-04:00")
public class PropertyFieldResource {
  @SerializedName("description")
  private String description = null;

  /**
   * The type of values within a &#39;list&#39; type field
   */
  @JsonAdapter(InnerTypeEnum.Adapter.class)
  public enum InnerTypeEnum {
    INTEGER("integer"),
    
    NUMBER("number"),
    
    BOOL("bool"),
    
    STRING("string"),
    
    ENUMERATION("enumeration"),
    
    LIST("list"),
    
    OBJECT("object"),
    
    DEFINITION("definition");

    private String value;

    InnerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InnerTypeEnum fromValue(String text) {
      for (InnerTypeEnum b : InnerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InnerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InnerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InnerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InnerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("inner_type")
  private InnerTypeEnum innerType = null;

  @SerializedName("inner_type_fields")
  private List<PropertyFieldResource> innerTypeFields = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("required")
  private Boolean required = null;

  /**
   * The type of the field
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INTEGER("integer"),
    
    NUMBER("number"),
    
    BOOL("bool"),
    
    STRING("string"),
    
    ENUMERATION("enumeration"),
    
    LIST("list"),
    
    OBJECT("object"),
    
    DEFINITION("definition");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("valid_values")
  private List<String> validValues = null;

  public PropertyFieldResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the field
   * @return description
  **/
  @ApiModelProperty(value = "A description of the field")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PropertyFieldResource innerType(InnerTypeEnum innerType) {
    this.innerType = innerType;
    return this;
  }

   /**
   * The type of values within a &#39;list&#39; type field
   * @return innerType
  **/
  @ApiModelProperty(value = "The type of values within a 'list' type field")
  public InnerTypeEnum getInnerType() {
    return innerType;
  }

  public void setInnerType(InnerTypeEnum innerType) {
    this.innerType = innerType;
  }

  public PropertyFieldResource innerTypeFields(List<PropertyFieldResource> innerTypeFields) {
    this.innerTypeFields = innerTypeFields;
    return this;
  }

  public PropertyFieldResource addInnerTypeFieldsItem(PropertyFieldResource innerTypeFieldsItem) {
    if (this.innerTypeFields == null) {
      this.innerTypeFields = new ArrayList<PropertyFieldResource>();
    }
    this.innerTypeFields.add(innerTypeFieldsItem);
    return this;
  }

   /**
   * A description of fields within objects within a &#39;list&#39; type field, when inner_type is &#39;object&#39;
   * @return innerTypeFields
  **/
  @ApiModelProperty(value = "A description of fields within objects within a 'list' type field, when inner_type is 'object'")
  public List<PropertyFieldResource> getInnerTypeFields() {
    return innerTypeFields;
  }

  public void setInnerTypeFields(List<PropertyFieldResource> innerTypeFields) {
    this.innerTypeFields = innerTypeFields;
  }

  public PropertyFieldResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the field
   * @return name
  **/
  @ApiModelProperty(value = "The name of the field")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PropertyFieldResource required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether the field is required
   * @return required
  **/
  @ApiModelProperty(example = "false", value = "Whether the field is required")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PropertyFieldResource type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the field
   * @return type
  **/
  @ApiModelProperty(value = "The type of the field")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PropertyFieldResource validValues(List<String> validValues) {
    this.validValues = validValues;
    return this;
  }

  public PropertyFieldResource addValidValuesItem(String validValuesItem) {
    if (this.validValues == null) {
      this.validValues = new ArrayList<String>();
    }
    this.validValues.add(validValuesItem);
    return this;
  }

   /**
   * A list of valid values for &#39;enum&#39; type fields
   * @return validValues
  **/
  @ApiModelProperty(value = "A list of valid values for 'enum' type fields")
  public List<String> getValidValues() {
    return validValues;
  }

  public void setValidValues(List<String> validValues) {
    this.validValues = validValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyFieldResource propertyFieldResource = (PropertyFieldResource) o;
    return Objects.equals(this.description, propertyFieldResource.description) &&
        Objects.equals(this.innerType, propertyFieldResource.innerType) &&
        Objects.equals(this.innerTypeFields, propertyFieldResource.innerTypeFields) &&
        Objects.equals(this.name, propertyFieldResource.name) &&
        Objects.equals(this.required, propertyFieldResource.required) &&
        Objects.equals(this.type, propertyFieldResource.type) &&
        Objects.equals(this.validValues, propertyFieldResource.validValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, innerType, innerTypeFields, name, required, type, validValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyFieldResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    innerType: ").append(toIndentedString(innerType)).append("\n");
    sb.append("    innerTypeFields: ").append(toIndentedString(innerTypeFields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
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


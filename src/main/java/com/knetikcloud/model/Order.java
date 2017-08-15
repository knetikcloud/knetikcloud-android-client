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
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T13:12:56.036-04:00")
public class Order {
  @SerializedName("ascending")
  private Boolean ascending = null;

  @SerializedName("descending")
  private Boolean descending = null;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("ignore_case")
  private Boolean ignoreCase = null;

  /**
   * Gets or Sets nullHandling
   */
  @JsonAdapter(NullHandlingEnum.Adapter.class)
  public enum NullHandlingEnum {
    NATIVE("NATIVE"),
    
    NULLS_FIRST("NULLS_FIRST"),
    
    NULLS_LAST("NULLS_LAST");

    private String value;

    NullHandlingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NullHandlingEnum fromValue(String text) {
      for (NullHandlingEnum b : NullHandlingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NullHandlingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NullHandlingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NullHandlingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NullHandlingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("null_handling")
  private NullHandlingEnum nullHandling = null;

  @SerializedName("property")
  private String property = null;

  public Order ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }

   /**
   * Get ascending
   * @return ascending
  **/
  @ApiModelProperty(value = "")
  public Boolean isAscending() {
    return ascending;
  }

  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }

  public Order descending(Boolean descending) {
    this.descending = descending;
    return this;
  }

   /**
   * Get descending
   * @return descending
  **/
  @ApiModelProperty(value = "")
  public Boolean isDescending() {
    return descending;
  }

  public void setDescending(Boolean descending) {
    this.descending = descending;
  }

  public Order direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public Order ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @ApiModelProperty(value = "")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public Order nullHandling(NullHandlingEnum nullHandling) {
    this.nullHandling = nullHandling;
    return this;
  }

   /**
   * Get nullHandling
   * @return nullHandling
  **/
  @ApiModelProperty(value = "")
  public NullHandlingEnum getNullHandling() {
    return nullHandling;
  }

  public void setNullHandling(NullHandlingEnum nullHandling) {
    this.nullHandling = nullHandling;
  }

  public Order property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(value = "")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.ascending, order.ascending) &&
        Objects.equals(this.descending, order.descending) &&
        Objects.equals(this.direction, order.direction) &&
        Objects.equals(this.ignoreCase, order.ignoreCase) &&
        Objects.equals(this.nullHandling, order.nullHandling) &&
        Objects.equals(this.property, order.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ascending, descending, direction, ignoreCase, nullHandling, property);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
    sb.append("    descending: ").append(toIndentedString(descending)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    nullHandling: ").append(toIndentedString(nullHandling)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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


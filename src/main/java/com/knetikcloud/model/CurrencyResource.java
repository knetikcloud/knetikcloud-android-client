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
import java.math.BigDecimal;

/**
 * CurrencyResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T15:40:11.397-05:00")
public class CurrencyResource {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("default_currency")
  private Boolean defaultCurrency = null;

  @SerializedName("factor")
  private BigDecimal factor = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The type of currency. Default &#39;real&#39;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REAL("real"),
    
    VIRTUAL("virtual");

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

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public CurrencyResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the currency is active. Default true
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the currency is active. Default true")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CurrencyResource code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The unique id code for the currency. Maximum 5 characters
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The unique id code for the currency. Maximum 5 characters")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

   /**
   * The unix timestamp in seconds the currency was added to the system
   * @return createdDate
  **/
  @ApiModelProperty(value = "The unix timestamp in seconds the currency was added to the system")
  public Long getCreatedDate() {
    return createdDate;
  }

  public CurrencyResource defaultCurrency(Boolean defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Whether this is the default currency. All real money wallets will be in this currency, and the &#39;factor&#39; on each currency is in relation to the default. There must be one default currency and the current will be changed if you set another as the default. Cannot be combined with virtual currency. Take extreme caution when changing
   * @return defaultCurrency
  **/
  @ApiModelProperty(example = "false", value = "Whether this is the default currency. All real money wallets will be in this currency, and the 'factor' on each currency is in relation to the default. There must be one default currency and the current will be changed if you set another as the default. Cannot be combined with virtual currency. Take extreme caution when changing")
  public Boolean isDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(Boolean defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CurrencyResource factor(BigDecimal factor) {
    this.factor = factor;
    return this;
  }

   /**
   * The decimal to multiply the default currency to localize to this one. Should be 1 for the default currency itself.
   * @return factor
  **/
  @ApiModelProperty(required = true, value = "The decimal to multiply the default currency to localize to this one. Should be 1 for the default currency itself.")
  public BigDecimal getFactor() {
    return factor;
  }

  public void setFactor(BigDecimal factor) {
    this.factor = factor;
  }

  public CurrencyResource icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * The url for an icon of the currency
   * @return icon
  **/
  @ApiModelProperty(value = "The url for an icon of the currency")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public CurrencyResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the currency
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the currency")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrencyResource type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of currency. Default &#39;real&#39;
   * @return type
  **/
  @ApiModelProperty(value = "The type of currency. Default 'real'")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

   /**
   * The unix timestamp in seconds the currency was last updated in the system.
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The unix timestamp in seconds the currency was last updated in the system.")
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
    CurrencyResource currencyResource = (CurrencyResource) o;
    return Objects.equals(this.active, currencyResource.active) &&
        Objects.equals(this.code, currencyResource.code) &&
        Objects.equals(this.createdDate, currencyResource.createdDate) &&
        Objects.equals(this.defaultCurrency, currencyResource.defaultCurrency) &&
        Objects.equals(this.factor, currencyResource.factor) &&
        Objects.equals(this.icon, currencyResource.icon) &&
        Objects.equals(this.name, currencyResource.name) &&
        Objects.equals(this.type, currencyResource.type) &&
        Objects.equals(this.updatedDate, currencyResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, code, createdDate, defaultCurrency, factor, icon, name, type, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
import com.knetikcloud.model.IdRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Participant
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T08:55:54.185-05:00")
public class Participant {
  @SerializedName("host")
  private Boolean host = null;

  /**
   * The current status of the user in the occurrence (default: present)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PRESENT("present"),
    
    READY("ready"),
    
    LEFT("left"),
    
    SURRENDERED("surrendered"),
    
    DISCONNECTED("disconnected");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("user")
  private IdRef user = null;

  public Participant host(Boolean host) {
    this.host = host;
    return this;
  }

   /**
   * Whether this user is the &#39;host&#39; of the occurrence and has increased access to settings/etc (default: false)
   * @return host
  **/
  @ApiModelProperty(example = "false", value = "Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false)")
  public Boolean isHost() {
    return host;
  }

  public void setHost(Boolean host) {
    this.host = host;
  }

  public Participant status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the user in the occurrence (default: present)
   * @return status
  **/
  @ApiModelProperty(value = "The current status of the user in the occurrence (default: present)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Participant user(IdRef user) {
    this.user = user;
    return this;
  }

   /**
   * The user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "The user")
  public IdRef getUser() {
    return user;
  }

  public void setUser(IdRef user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.host, participant.host) &&
        Objects.equals(this.status, participant.status) &&
        Objects.equals(this.user, participant.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, status, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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


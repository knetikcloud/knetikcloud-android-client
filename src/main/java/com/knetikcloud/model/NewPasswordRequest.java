/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * NewPasswordRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class NewPasswordRequest implements Parcelable {
  @SerializedName("password")
  private String password = null;

  @SerializedName("secret")
  private String secret = null;

  public NewPasswordRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The new password in plain text
   * @return password
  **/
  @ApiModelProperty(example = "null", required = true, value = "The new password in plain text")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public NewPasswordRequest secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The secret provided after the password reset
   * @return secret
  **/
  @ApiModelProperty(example = "null", required = true, value = "The secret provided after the password reset")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPasswordRequest newPasswordRequest = (NewPasswordRequest) o;
    return Objects.equals(this.password, newPasswordRequest.password) &&
        Objects.equals(this.secret, newPasswordRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPasswordRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(password);

    out.writeValue(secret);
  }

  public NewPasswordRequest() {
    super();
  }

  NewPasswordRequest(Parcel in) {
    
    password = (String)in.readValue(null);
    secret = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<NewPasswordRequest> CREATOR = new Parcelable.Creator<NewPasswordRequest>() {
    public NewPasswordRequest createFromParcel(Parcel in) {
      return new NewPasswordRequest(in);
    }
    public NewPasswordRequest[] newArray(int size) {
      return new NewPasswordRequest[size];
    }
  };
}


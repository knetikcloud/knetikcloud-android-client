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
import com.knetikcloud.model.FileGroupProperty;
import com.knetikcloud.model.FileProperty;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * VideoGroupProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class VideoGroupProperty extends FileGroupProperty implements Parcelable {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoGroupProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
     super.writeToParcel(out, flags);    }

  public VideoGroupProperty() {
    super();
  }

  VideoGroupProperty(Parcel in) {
     super(in); 
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<VideoGroupProperty> CREATOR = new Parcelable.Creator<VideoGroupProperty>() {
    public VideoGroupProperty createFromParcel(Parcel in) {
      return new VideoGroupProperty(in);
    }
    public VideoGroupProperty[] newArray(int size) {
      return new VideoGroupProperty[size];
    }
  };
}


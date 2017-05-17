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
import com.knetikcloud.model.FileGroupPropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * VideoGroupPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T08:21:48.548-04:00")
public class VideoGroupPropertyDefinitionResource extends FileGroupPropertyDefinitionResource implements Parcelable {
  @SerializedName("max_height")
  private Integer maxHeight = null;

  @SerializedName("max_length")
  private Integer maxLength = null;

  @SerializedName("max_width")
  private Integer maxWidth = null;

  @SerializedName("min_height")
  private Integer minHeight = null;

  @SerializedName("min_length")
  private Integer minLength = null;

  @SerializedName("min_width")
  private Integer minWidth = null;

  public VideoGroupPropertyDefinitionResource maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * If provided, the maximum height of each video
   * @return maxHeight
  **/
  @ApiModelProperty(example = "null", value = "If provided, the maximum height of each video")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  public VideoGroupPropertyDefinitionResource maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * If provided, the maximum length of each video
   * @return maxLength
  **/
  @ApiModelProperty(example = "null", value = "If provided, the maximum length of each video")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public VideoGroupPropertyDefinitionResource maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * If provided, the maximum width of each video
   * @return maxWidth
  **/
  @ApiModelProperty(example = "null", value = "If provided, the maximum width of each video")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public VideoGroupPropertyDefinitionResource minHeight(Integer minHeight) {
    this.minHeight = minHeight;
    return this;
  }

   /**
   * If provided, the minimum height of each video
   * @return minHeight
  **/
  @ApiModelProperty(example = "null", value = "If provided, the minimum height of each video")
  public Integer getMinHeight() {
    return minHeight;
  }

  public void setMinHeight(Integer minHeight) {
    this.minHeight = minHeight;
  }

  public VideoGroupPropertyDefinitionResource minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * If provided, the minimum length of each video
   * @return minLength
  **/
  @ApiModelProperty(example = "null", value = "If provided, the minimum length of each video")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public VideoGroupPropertyDefinitionResource minWidth(Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

   /**
   * If provided, the minimum width of each video
   * @return minWidth
  **/
  @ApiModelProperty(example = "null", value = "If provided, the minimum width of each video")
  public Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Integer minWidth) {
    this.minWidth = minWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoGroupPropertyDefinitionResource videoGroupPropertyDefinitionResource = (VideoGroupPropertyDefinitionResource) o;
    return Objects.equals(this.maxHeight, videoGroupPropertyDefinitionResource.maxHeight) &&
        Objects.equals(this.maxLength, videoGroupPropertyDefinitionResource.maxLength) &&
        Objects.equals(this.maxWidth, videoGroupPropertyDefinitionResource.maxWidth) &&
        Objects.equals(this.minHeight, videoGroupPropertyDefinitionResource.minHeight) &&
        Objects.equals(this.minLength, videoGroupPropertyDefinitionResource.minLength) &&
        Objects.equals(this.minWidth, videoGroupPropertyDefinitionResource.minWidth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHeight, maxLength, maxWidth, minHeight, minLength, minWidth, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoGroupPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
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
     super.writeToParcel(out, flags);  
    out.writeValue(maxHeight);

    out.writeValue(maxLength);

    out.writeValue(maxWidth);

    out.writeValue(minHeight);

    out.writeValue(minLength);

    out.writeValue(minWidth);
  }

  public VideoGroupPropertyDefinitionResource() {
    super();
  }

  VideoGroupPropertyDefinitionResource(Parcel in) {
     super(in); 
    maxHeight = (Integer)in.readValue(null);
    maxLength = (Integer)in.readValue(null);
    maxWidth = (Integer)in.readValue(null);
    minHeight = (Integer)in.readValue(null);
    minLength = (Integer)in.readValue(null);
    minWidth = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<VideoGroupPropertyDefinitionResource> CREATOR = new Parcelable.Creator<VideoGroupPropertyDefinitionResource>() {
    public VideoGroupPropertyDefinitionResource createFromParcel(Parcel in) {
      return new VideoGroupPropertyDefinitionResource(in);
    }
    public VideoGroupPropertyDefinitionResource[] newArray(int size) {
      return new VideoGroupPropertyDefinitionResource[size];
    }
  };
}


/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.Artist;
import io.swagger.client.model.Video;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class VideoContribution {
  
  @SerializedName("artist")
  private Artist artist = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("media")
  private Video media = null;
  @SerializedName("role")
  private String role = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Artist getArtist() {
    return artist;
  }
  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Video getMedia() {
    return media;
  }
  public void setMedia(Video media) {
    this.media = media;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoContribution videoContribution = (VideoContribution) o;
    return (this.artist == null ? videoContribution.artist == null : this.artist.equals(videoContribution.artist)) &&
        (this.id == null ? videoContribution.id == null : this.id.equals(videoContribution.id)) &&
        (this.media == null ? videoContribution.media == null : this.media.equals(videoContribution.media)) &&
        (this.role == null ? videoContribution.role == null : this.role.equals(videoContribution.role));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.artist == null ? 0: this.artist.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.media == null ? 0: this.media.hashCode());
    result = 31 * result + (this.role == null ? 0: this.role.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoContribution {\n");
    
    sb.append("  artist: ").append(artist).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  media: ").append(media).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

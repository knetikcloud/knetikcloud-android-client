/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.SimpleReferenceResourcelong;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ContributionResource {
  
  @SerializedName("artist")
  private SimpleReferenceResourcelong artist = null;
  @SerializedName("media")
  private SimpleReferenceResourcelong media = null;
  @SerializedName("role")
  private String role = null;

  /**
   * A reference to the contributing artist
   **/
  @ApiModelProperty(required = true, value = "A reference to the contributing artist")
  public SimpleReferenceResourcelong getArtist() {
    return artist;
  }
  public void setArtist(SimpleReferenceResourcelong artist) {
    this.artist = artist;
  }

  /**
   * A reference to the media being contributed to
   **/
  @ApiModelProperty(required = true, value = "A reference to the media being contributed to")
  public SimpleReferenceResourcelong getMedia() {
    return media;
  }
  public void setMedia(SimpleReferenceResourcelong media) {
    this.media = media;
  }

  /**
   * The nature of the contribution (role of the artist as in 'producer', 'performer', etc)
   **/
  @ApiModelProperty(required = true, value = "The nature of the contribution (role of the artist as in 'producer', 'performer', etc)")
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
    ContributionResource contributionResource = (ContributionResource) o;
    return (this.artist == null ? contributionResource.artist == null : this.artist.equals(contributionResource.artist)) &&
        (this.media == null ? contributionResource.media == null : this.media.equals(contributionResource.media)) &&
        (this.role == null ? contributionResource.role == null : this.role.equals(contributionResource.role));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.artist == null ? 0: this.artist.hashCode());
    result = 31 * result + (this.media == null ? 0: this.media.hashCode());
    result = 31 * result + (this.role == null ? 0: this.role.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributionResource {\n");
    
    sb.append("  artist: ").append(artist).append("\n");
    sb.append("  media: ").append(media).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

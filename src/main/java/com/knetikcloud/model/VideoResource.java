/**
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

import com.knetikcloud.model.CommentResource;
import com.knetikcloud.model.ContributionResource;
import com.knetikcloud.model.SimpleReferenceResourcelong;
import com.knetikcloud.model.SimpleReferenceResourcestring;
import com.knetikcloud.model.SimpleUserResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class VideoResource {
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("author")
  private SimpleReferenceResourcelong author = null;
  @SerializedName("authored")
  private Long authored = null;
  @SerializedName("banned")
  private Boolean banned = null;
  @SerializedName("category")
  private SimpleReferenceResourcestring category = null;
  @SerializedName("comments")
  private List<CommentResource> comments = null;
  @SerializedName("contributors")
  private List<ContributionResource> contributors = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("embed")
  private String embed = null;
  @SerializedName("extension")
  private String extension = null;
  @SerializedName("height")
  private Integer height = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("length")
  private Integer length = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("mime_type")
  private String mimeType = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("priority")
  private Integer priority = null;
  public enum PrivacyEnum {
     private,  friends,  public, 
  };
  @SerializedName("privacy")
  private PrivacyEnum privacy = null;
  @SerializedName("published")
  private Boolean published = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("size")
  private Long size = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("thumbnail")
  private String thumbnail = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;
  @SerializedName("uploader")
  private SimpleUserResource uploader = null;
  @SerializedName("views")
  private Long views = null;
  @SerializedName("width")
  private Integer width = null;

  /**
   * Whether the video is available, based on various factors
   **/
  @ApiModelProperty(value = "Whether the video is available, based on various factors")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * The original artist of the media
   **/
  @ApiModelProperty(value = "The original artist of the media")
  public SimpleReferenceResourcelong getAuthor() {
    return author;
  }
  public void setAuthor(SimpleReferenceResourcelong author) {
    this.author = author;
  }

  /**
   * The date the media was created as a unix timestamp in seconds
   **/
  @ApiModelProperty(value = "The date the media was created as a unix timestamp in seconds")
  public Long getAuthored() {
    return authored;
  }
  public void setAuthored(Long authored) {
    this.authored = authored;
  }

  /**
   * Whether the video has been banned or not
   **/
  @ApiModelProperty(value = "Whether the video has been banned or not")
  public Boolean getBanned() {
    return banned;
  }
  public void setBanned(Boolean banned) {
    this.banned = banned;
  }

  /**
   * The category of the video
   **/
  @ApiModelProperty(required = true, value = "The category of the video")
  public SimpleReferenceResourcestring getCategory() {
    return category;
  }
  public void setCategory(SimpleReferenceResourcestring category) {
    this.category = category;
  }

  /**
   * The comments of the video
   **/
  @ApiModelProperty(value = "The comments of the video")
  public List<CommentResource> getComments() {
    return comments;
  }
  public void setComments(List<CommentResource> comments) {
    this.comments = comments;
  }

  /**
   * Artists that contributed to the creation. See separate endpoint to add to list
   **/
  @ApiModelProperty(value = "Artists that contributed to the creation. See separate endpoint to add to list")
  public List<ContributionResource> getContributors() {
    return contributors;
  }
  public void setContributors(List<ContributionResource> contributors) {
    this.contributors = contributors;
  }

  /**
   * The date/time this resource was created in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The country of an embedable version
   **/
  @ApiModelProperty(value = "The country of an embedable version")
  public String getEmbed() {
    return embed;
  }
  public void setEmbed(String embed) {
    this.embed = embed;
  }

  /**
   * The file extension of the media file. 1-5 characters
   **/
  @ApiModelProperty(required = true, value = "The file extension of the media file. 1-5 characters")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }

  /**
   * The height of the video in px
   **/
  @ApiModelProperty(required = true, value = "The height of the video in px")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * The unique ID for that resource
   **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The length of the video in seconds
   **/
  @ApiModelProperty(required = true, value = "The length of the video in seconds")
  public Integer getLength() {
    return length;
  }
  public void setLength(Integer length) {
    this.length = length;
  }

  /**
   * The country of the media. Typically a url. Cannot be blank
   **/
  @ApiModelProperty(required = true, value = "The country of the media. Typically a url. Cannot be blank")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * The mime-type of the media
   **/
  @ApiModelProperty(value = "The mime-type of the media")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The user friendly name of that resource
   **/
  @ApiModelProperty(required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The sort order of the video. default: 100
   **/
  @ApiModelProperty(value = "The sort order of the video. default: 100")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The privacy setting. default: private
   **/
  @ApiModelProperty(value = "The privacy setting. default: private")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }
  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  /**
   * Whether the video has been made public. Default true
   **/
  @ApiModelProperty(value = "Whether the video has been made public. Default true")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * The size of the media. Minimum 0 if supplied
   **/
  @ApiModelProperty(value = "The size of the media. Minimum 0 if supplied")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   * The tags for the video
   **/
  @ApiModelProperty(value = "The tags for the video")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The country of a thumbnail version. Typically a url
   **/
  @ApiModelProperty(value = "The country of a thumbnail version. Typically a url")
  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   * The date/time this resource was last updated in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   * The user the media was uploaded by. May be null for system uploaded media. May only be set to a user other than the current caller if VIDEOS_ADMIN permission. Null will mean the caller is the uploader unless the caller has VIDEOS_ADMIN permission, in which case it will be set to null
   **/
  @ApiModelProperty(value = "The user the media was uploaded by. May be null for system uploaded media. May only be set to a user other than the current caller if VIDEOS_ADMIN permission. Null will mean the caller is the uploader unless the caller has VIDEOS_ADMIN permission, in which case it will be set to null")
  public SimpleUserResource getUploader() {
    return uploader;
  }
  public void setUploader(SimpleUserResource uploader) {
    this.uploader = uploader;
  }

  /**
   * The view count of the video
   **/
  @ApiModelProperty(value = "The view count of the video")
  public Long getViews() {
    return views;
  }
  public void setViews(Long views) {
    this.views = views;
  }

  /**
   * The width of the video in px
   **/
  @ApiModelProperty(required = true, value = "The width of the video in px")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoResource videoResource = (VideoResource) o;
    return (this.active == null ? videoResource.active == null : this.active.equals(videoResource.active)) &&
        (this.author == null ? videoResource.author == null : this.author.equals(videoResource.author)) &&
        (this.authored == null ? videoResource.authored == null : this.authored.equals(videoResource.authored)) &&
        (this.banned == null ? videoResource.banned == null : this.banned.equals(videoResource.banned)) &&
        (this.category == null ? videoResource.category == null : this.category.equals(videoResource.category)) &&
        (this.comments == null ? videoResource.comments == null : this.comments.equals(videoResource.comments)) &&
        (this.contributors == null ? videoResource.contributors == null : this.contributors.equals(videoResource.contributors)) &&
        (this.createdDate == null ? videoResource.createdDate == null : this.createdDate.equals(videoResource.createdDate)) &&
        (this.embed == null ? videoResource.embed == null : this.embed.equals(videoResource.embed)) &&
        (this.extension == null ? videoResource.extension == null : this.extension.equals(videoResource.extension)) &&
        (this.height == null ? videoResource.height == null : this.height.equals(videoResource.height)) &&
        (this.id == null ? videoResource.id == null : this.id.equals(videoResource.id)) &&
        (this.length == null ? videoResource.length == null : this.length.equals(videoResource.length)) &&
        (this.location == null ? videoResource.location == null : this.location.equals(videoResource.location)) &&
        (this.longDescription == null ? videoResource.longDescription == null : this.longDescription.equals(videoResource.longDescription)) &&
        (this.mimeType == null ? videoResource.mimeType == null : this.mimeType.equals(videoResource.mimeType)) &&
        (this.name == null ? videoResource.name == null : this.name.equals(videoResource.name)) &&
        (this.priority == null ? videoResource.priority == null : this.priority.equals(videoResource.priority)) &&
        (this.privacy == null ? videoResource.privacy == null : this.privacy.equals(videoResource.privacy)) &&
        (this.published == null ? videoResource.published == null : this.published.equals(videoResource.published)) &&
        (this.shortDescription == null ? videoResource.shortDescription == null : this.shortDescription.equals(videoResource.shortDescription)) &&
        (this.size == null ? videoResource.size == null : this.size.equals(videoResource.size)) &&
        (this.tags == null ? videoResource.tags == null : this.tags.equals(videoResource.tags)) &&
        (this.thumbnail == null ? videoResource.thumbnail == null : this.thumbnail.equals(videoResource.thumbnail)) &&
        (this.updatedDate == null ? videoResource.updatedDate == null : this.updatedDate.equals(videoResource.updatedDate)) &&
        (this.uploader == null ? videoResource.uploader == null : this.uploader.equals(videoResource.uploader)) &&
        (this.views == null ? videoResource.views == null : this.views.equals(videoResource.views)) &&
        (this.width == null ? videoResource.width == null : this.width.equals(videoResource.width));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.author == null ? 0: this.author.hashCode());
    result = 31 * result + (this.authored == null ? 0: this.authored.hashCode());
    result = 31 * result + (this.banned == null ? 0: this.banned.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.comments == null ? 0: this.comments.hashCode());
    result = 31 * result + (this.contributors == null ? 0: this.contributors.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.embed == null ? 0: this.embed.hashCode());
    result = 31 * result + (this.extension == null ? 0: this.extension.hashCode());
    result = 31 * result + (this.height == null ? 0: this.height.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.length == null ? 0: this.length.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.mimeType == null ? 0: this.mimeType.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.priority == null ? 0: this.priority.hashCode());
    result = 31 * result + (this.privacy == null ? 0: this.privacy.hashCode());
    result = 31 * result + (this.published == null ? 0: this.published.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.thumbnail == null ? 0: this.thumbnail.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    result = 31 * result + (this.uploader == null ? 0: this.uploader.hashCode());
    result = 31 * result + (this.views == null ? 0: this.views.hashCode());
    result = 31 * result + (this.width == null ? 0: this.width.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoResource {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  authored: ").append(authored).append("\n");
    sb.append("  banned: ").append(banned).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  comments: ").append(comments).append("\n");
    sb.append("  contributors: ").append(contributors).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  embed: ").append(embed).append("\n");
    sb.append("  extension: ").append(extension).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  length: ").append(length).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  mimeType: ").append(mimeType).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("  privacy: ").append(privacy).append("\n");
    sb.append("  published: ").append(published).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  thumbnail: ").append(thumbnail).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("  uploader: ").append(uploader).append("\n");
    sb.append("  views: ").append(views).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

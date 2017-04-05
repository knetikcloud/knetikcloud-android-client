/**
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

package io.swagger.client.model;

import io.swagger.client.model.Artist;
import io.swagger.client.model.CollectionVideoContribution;
import io.swagger.client.model.User;
import io.swagger.client.model.VideoTag;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Video {
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("author")
  private Artist author = null;
  @SerializedName("authored")
  private Long authored = null;
  @SerializedName("banned")
  private Boolean banned = null;
  @SerializedName("category_id")
  private String categoryId = null;
  @SerializedName("category_name")
  private String categoryName = null;
  @SerializedName("contributors")
  private CollectionVideoContribution contributors = null;
  @SerializedName("created")
  private Long created = null;
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
  private List<VideoTag> tags = null;
  @SerializedName("thumbnail")
  private String thumbnail = null;
  @SerializedName("updated")
  private Long updated = null;
  @SerializedName("uploader")
  private User uploader = null;
  @SerializedName("views")
  private Long views = null;
  @SerializedName("whitelist")
  private List<User> whitelist = null;
  @SerializedName("width")
  private Integer width = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Artist getAuthor() {
    return author;
  }
  public void setAuthor(Artist author) {
    this.author = author;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAuthored() {
    return authored;
  }
  public void setAuthored(Long authored) {
    this.authored = authored;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBanned() {
    return banned;
  }
  public void setBanned(Boolean banned) {
    this.banned = banned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CollectionVideoContribution getContributors() {
    return contributors;
  }
  public void setContributors(CollectionVideoContribution contributors) {
    this.contributors = contributors;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmbed() {
    return embed;
  }
  public void setEmbed(String embed) {
    this.embed = embed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLength() {
    return length;
  }
  public void setLength(Integer length) {
    this.length = length;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }
  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<VideoTag> getTags() {
    return tags;
  }
  public void setTags(List<VideoTag> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getUploader() {
    return uploader;
  }
  public void setUploader(User uploader) {
    this.uploader = uploader;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getViews() {
    return views;
  }
  public void setViews(Long views) {
    this.views = views;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<User> getWhitelist() {
    return whitelist;
  }
  public void setWhitelist(List<User> whitelist) {
    this.whitelist = whitelist;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    Video video = (Video) o;
    return (this.active == null ? video.active == null : this.active.equals(video.active)) &&
        (this.author == null ? video.author == null : this.author.equals(video.author)) &&
        (this.authored == null ? video.authored == null : this.authored.equals(video.authored)) &&
        (this.banned == null ? video.banned == null : this.banned.equals(video.banned)) &&
        (this.categoryId == null ? video.categoryId == null : this.categoryId.equals(video.categoryId)) &&
        (this.categoryName == null ? video.categoryName == null : this.categoryName.equals(video.categoryName)) &&
        (this.contributors == null ? video.contributors == null : this.contributors.equals(video.contributors)) &&
        (this.created == null ? video.created == null : this.created.equals(video.created)) &&
        (this.embed == null ? video.embed == null : this.embed.equals(video.embed)) &&
        (this.extension == null ? video.extension == null : this.extension.equals(video.extension)) &&
        (this.height == null ? video.height == null : this.height.equals(video.height)) &&
        (this.id == null ? video.id == null : this.id.equals(video.id)) &&
        (this.length == null ? video.length == null : this.length.equals(video.length)) &&
        (this.location == null ? video.location == null : this.location.equals(video.location)) &&
        (this.longDescription == null ? video.longDescription == null : this.longDescription.equals(video.longDescription)) &&
        (this.mimeType == null ? video.mimeType == null : this.mimeType.equals(video.mimeType)) &&
        (this.name == null ? video.name == null : this.name.equals(video.name)) &&
        (this.priority == null ? video.priority == null : this.priority.equals(video.priority)) &&
        (this.privacy == null ? video.privacy == null : this.privacy.equals(video.privacy)) &&
        (this.published == null ? video.published == null : this.published.equals(video.published)) &&
        (this.shortDescription == null ? video.shortDescription == null : this.shortDescription.equals(video.shortDescription)) &&
        (this.size == null ? video.size == null : this.size.equals(video.size)) &&
        (this.tags == null ? video.tags == null : this.tags.equals(video.tags)) &&
        (this.thumbnail == null ? video.thumbnail == null : this.thumbnail.equals(video.thumbnail)) &&
        (this.updated == null ? video.updated == null : this.updated.equals(video.updated)) &&
        (this.uploader == null ? video.uploader == null : this.uploader.equals(video.uploader)) &&
        (this.views == null ? video.views == null : this.views.equals(video.views)) &&
        (this.whitelist == null ? video.whitelist == null : this.whitelist.equals(video.whitelist)) &&
        (this.width == null ? video.width == null : this.width.equals(video.width));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.author == null ? 0: this.author.hashCode());
    result = 31 * result + (this.authored == null ? 0: this.authored.hashCode());
    result = 31 * result + (this.banned == null ? 0: this.banned.hashCode());
    result = 31 * result + (this.categoryId == null ? 0: this.categoryId.hashCode());
    result = 31 * result + (this.categoryName == null ? 0: this.categoryName.hashCode());
    result = 31 * result + (this.contributors == null ? 0: this.contributors.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
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
    result = 31 * result + (this.updated == null ? 0: this.updated.hashCode());
    result = 31 * result + (this.uploader == null ? 0: this.uploader.hashCode());
    result = 31 * result + (this.views == null ? 0: this.views.hashCode());
    result = 31 * result + (this.whitelist == null ? 0: this.whitelist.hashCode());
    result = 31 * result + (this.width == null ? 0: this.width.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  authored: ").append(authored).append("\n");
    sb.append("  banned: ").append(banned).append("\n");
    sb.append("  categoryId: ").append(categoryId).append("\n");
    sb.append("  categoryName: ").append(categoryName).append("\n");
    sb.append("  contributors: ").append(contributors).append("\n");
    sb.append("  created: ").append(created).append("\n");
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
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  uploader: ").append(uploader).append("\n");
    sb.append("  views: ").append(views).append("\n");
    sb.append("  whitelist: ").append(whitelist).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
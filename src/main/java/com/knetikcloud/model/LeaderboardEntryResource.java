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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LeaderboardEntryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-31T16:19:51.285-05:00")
public class LeaderboardEntryResource {
  @SerializedName("rank")
  private Long rank = null;

  @SerializedName("score")
  private Long score = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  public LeaderboardEntryResource rank(Long rank) {
    this.rank = rank;
    return this;
  }

   /**
   * The position of the user in the leaderboard. Null means non-compete or disqualification
   * @return rank
  **/
  @ApiModelProperty(value = "The position of the user in the leaderboard. Null means non-compete or disqualification")
  public Long getRank() {
    return rank;
  }

  public void setRank(Long rank) {
    this.rank = rank;
  }

  public LeaderboardEntryResource score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * The raw score in this leaderboard. Null means non-compete or disqualification
   * @return score
  **/
  @ApiModelProperty(value = "The raw score in this leaderboard. Null means non-compete or disqualification")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public LeaderboardEntryResource updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * The date this score was recorded or updated. Unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date this score was recorded or updated. Unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public LeaderboardEntryResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The player for this entry
   * @return user
  **/
  @ApiModelProperty(required = true, value = "The player for this entry")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
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
    LeaderboardEntryResource leaderboardEntryResource = (LeaderboardEntryResource) o;
    return Objects.equals(this.rank, leaderboardEntryResource.rank) &&
        Objects.equals(this.score, leaderboardEntryResource.score) &&
        Objects.equals(this.updatedDate, leaderboardEntryResource.updatedDate) &&
        Objects.equals(this.user, leaderboardEntryResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, score, updatedDate, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardEntryResource {\n");
    
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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


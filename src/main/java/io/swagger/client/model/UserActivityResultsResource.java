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

import io.swagger.client.model.RewardCurrencyResource;
import io.swagger.client.model.RewardItemResource;
import io.swagger.client.model.SimpleUserResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserActivityResultsResource {
  
  @SerializedName("currency_rewards")
  private List<RewardCurrencyResource> currencyRewards = null;
  @SerializedName("item_rewards")
  private List<RewardItemResource> itemRewards = null;
  @SerializedName("rank")
  private Long rank = null;
  @SerializedName("score")
  private Long score = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("ties")
  private Integer ties = null;
  @SerializedName("user")
  private SimpleUserResource user = null;

  /**
   * Any currency rewarded to this user
   **/
  @ApiModelProperty(value = "Any currency rewarded to this user")
  public List<RewardCurrencyResource> getCurrencyRewards() {
    return currencyRewards;
  }
  public void setCurrencyRewards(List<RewardCurrencyResource> currencyRewards) {
    this.currencyRewards = currencyRewards;
  }

  /**
   * Any items rewarded to this user
   **/
  @ApiModelProperty(value = "Any items rewarded to this user")
  public List<RewardItemResource> getItemRewards() {
    return itemRewards;
  }
  public void setItemRewards(List<RewardItemResource> itemRewards) {
    this.itemRewards = itemRewards;
  }

  /**
   * The position of the user in the leaderboard. Null means non-compete or disqualification
   **/
  @ApiModelProperty(value = "The position of the user in the leaderboard. Null means non-compete or disqualification")
  public Long getRank() {
    return rank;
  }
  public void setRank(Long rank) {
    this.rank = rank;
  }

  /**
   * The raw score in this leaderboard. Null means non-compete or disqualification
   **/
  @ApiModelProperty(value = "The raw score in this leaderboard. Null means non-compete or disqualification")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  /**
   * Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each
   **/
  @ApiModelProperty(value = "Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The number of users tied at this rank, including this user. 1 means no tie
   **/
  @ApiModelProperty(value = "The number of users tied at this rank, including this user. 1 means no tie")
  public Integer getTies() {
    return ties;
  }
  public void setTies(Integer ties) {
    this.ties = ties;
  }

  /**
   * The player for this entry
   **/
  @ApiModelProperty(required = true, value = "The player for this entry")
  public SimpleUserResource getUser() {
    return user;
  }
  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityResultsResource userActivityResultsResource = (UserActivityResultsResource) o;
    return (this.currencyRewards == null ? userActivityResultsResource.currencyRewards == null : this.currencyRewards.equals(userActivityResultsResource.currencyRewards)) &&
        (this.itemRewards == null ? userActivityResultsResource.itemRewards == null : this.itemRewards.equals(userActivityResultsResource.itemRewards)) &&
        (this.rank == null ? userActivityResultsResource.rank == null : this.rank.equals(userActivityResultsResource.rank)) &&
        (this.score == null ? userActivityResultsResource.score == null : this.score.equals(userActivityResultsResource.score)) &&
        (this.tags == null ? userActivityResultsResource.tags == null : this.tags.equals(userActivityResultsResource.tags)) &&
        (this.ties == null ? userActivityResultsResource.ties == null : this.ties.equals(userActivityResultsResource.ties)) &&
        (this.user == null ? userActivityResultsResource.user == null : this.user.equals(userActivityResultsResource.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currencyRewards == null ? 0: this.currencyRewards.hashCode());
    result = 31 * result + (this.itemRewards == null ? 0: this.itemRewards.hashCode());
    result = 31 * result + (this.rank == null ? 0: this.rank.hashCode());
    result = 31 * result + (this.score == null ? 0: this.score.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.ties == null ? 0: this.ties.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityResultsResource {\n");
    
    sb.append("  currencyRewards: ").append(currencyRewards).append("\n");
    sb.append("  itemRewards: ").append(itemRewards).append("\n");
    sb.append("  rank: ").append(rank).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  ties: ").append(ties).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

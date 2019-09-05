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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CoreActivityOccurrenceSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-05T08:45:52.063-04:00")
public class CoreActivityOccurrenceSettings {
  @SerializedName("boot_in_play")
  private Boolean bootInPlay = null;

  @SerializedName("custom_launch_address")
  private String customLaunchAddress = null;

  @SerializedName("host_status_control")
  private Boolean hostStatusControl = null;

  @SerializedName("join_in_play")
  private Boolean joinInPlay = null;

  @SerializedName("leave_in_play")
  private Boolean leaveInPlay = null;

  @SerializedName("max_players")
  private Integer maxPlayers = null;

  @SerializedName("min_players")
  private Integer minPlayers = null;

  @SerializedName("non_host_status_control")
  private Boolean nonHostStatusControl = null;

  /**
   * Restriction for who is able to report game end and results. Admin is always able to send results as well. Must be equal or more restrictive than activity (or must match challenge if applicable). Default inherits
   */
  @JsonAdapter(ResultsTrustEnum.Adapter.class)
  public enum ResultsTrustEnum {
    NONE("none"),
    
    HOST("host"),
    
    ALL("all");

    private String value;

    ResultsTrustEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultsTrustEnum fromValue(String text) {
      for (ResultsTrustEnum b : ResultsTrustEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResultsTrustEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultsTrustEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultsTrustEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResultsTrustEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("results_trust")
  private ResultsTrustEnum resultsTrust = null;

  public CoreActivityOccurrenceSettings bootInPlay(Boolean bootInPlay) {
    this.bootInPlay = bootInPlay;
    return this;
  }

   /**
   * Whether the host can boot another user while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit
   * @return bootInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether the host can boot another user while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit")
  public Boolean isBootInPlay() {
    return bootInPlay;
  }

  public void setBootInPlay(Boolean bootInPlay) {
    this.bootInPlay = bootInPlay;
  }

  public CoreActivityOccurrenceSettings customLaunchAddress(String customLaunchAddress) {
    this.customLaunchAddress = customLaunchAddress;
    return this;
  }

   /**
   * A custom address (url, ip or whatever is needed in your game) that users should connect to to play in this occurrence rather than the usual game server. Could be the ip address of the host for peer-to-peer play. Can only be set if the activity/challenge custom_launch_address_allowed is true. Max length: 255
   * @return customLaunchAddress
  **/
  @ApiModelProperty(value = "A custom address (url, ip or whatever is needed in your game) that users should connect to to play in this occurrence rather than the usual game server. Could be the ip address of the host for peer-to-peer play. Can only be set if the activity/challenge custom_launch_address_allowed is true. Max length: 255")
  public String getCustomLaunchAddress() {
    return customLaunchAddress;
  }

  public void setCustomLaunchAddress(String customLaunchAddress) {
    this.customLaunchAddress = customLaunchAddress;
  }

  public CoreActivityOccurrenceSettings hostStatusControl(Boolean hostStatusControl) {
    this.hostStatusControl = hostStatusControl;
    return this;
  }

   /**
   * Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Cannot be true if activity/challenge has it false. Null to inherit
   * @return hostStatusControl
  **/
  @ApiModelProperty(example = "false", value = "Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Cannot be true if activity/challenge has it false. Null to inherit")
  public Boolean isHostStatusControl() {
    return hostStatusControl;
  }

  public void setHostStatusControl(Boolean hostStatusControl) {
    this.hostStatusControl = hostStatusControl;
  }

  public CoreActivityOccurrenceSettings joinInPlay(Boolean joinInPlay) {
    this.joinInPlay = joinInPlay;
    return this;
  }

   /**
   * Whether users can join while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit
   * @return joinInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether users can join while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit")
  public Boolean isJoinInPlay() {
    return joinInPlay;
  }

  public void setJoinInPlay(Boolean joinInPlay) {
    this.joinInPlay = joinInPlay;
  }

  public CoreActivityOccurrenceSettings leaveInPlay(Boolean leaveInPlay) {
    this.leaveInPlay = leaveInPlay;
    return this;
  }

   /**
   * Whether users can leave while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit
   * @return leaveInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether users can leave while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit")
  public Boolean isLeaveInPlay() {
    return leaveInPlay;
  }

  public void setLeaveInPlay(Boolean leaveInPlay) {
    this.leaveInPlay = leaveInPlay;
  }

  public CoreActivityOccurrenceSettings maxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
    return this;
  }

   /**
   * The maximum number of players the game can hold. Must be equal or less than activity (or must match challenge if applicable)
   * @return maxPlayers
  **/
  @ApiModelProperty(value = "The maximum number of players the game can hold. Must be equal or less than activity (or must match challenge if applicable)")
  public Integer getMaxPlayers() {
    return maxPlayers;
  }

  public void setMaxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
  }

  public CoreActivityOccurrenceSettings minPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
    return this;
  }

   /**
   * The minimum number of players the game can hold. Must be equal or greater than activity (or must match challenge if applicable)
   * @return minPlayers
  **/
  @ApiModelProperty(value = "The minimum number of players the game can hold. Must be equal or greater than activity (or must match challenge if applicable)")
  public Integer getMinPlayers() {
    return minPlayers;
  }

  public void setMinPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
  }

  public CoreActivityOccurrenceSettings nonHostStatusControl(Boolean nonHostStatusControl) {
    this.nonHostStatusControl = nonHostStatusControl;
    return this;
  }

   /**
   * Restriction for whether the non-host players can control of the status in place of the host. Default: false
   * @return nonHostStatusControl
  **/
  @ApiModelProperty(example = "false", value = "Restriction for whether the non-host players can control of the status in place of the host. Default: false")
  public Boolean isNonHostStatusControl() {
    return nonHostStatusControl;
  }

  public void setNonHostStatusControl(Boolean nonHostStatusControl) {
    this.nonHostStatusControl = nonHostStatusControl;
  }

  public CoreActivityOccurrenceSettings resultsTrust(ResultsTrustEnum resultsTrust) {
    this.resultsTrust = resultsTrust;
    return this;
  }

   /**
   * Restriction for who is able to report game end and results. Admin is always able to send results as well. Must be equal or more restrictive than activity (or must match challenge if applicable). Default inherits
   * @return resultsTrust
  **/
  @ApiModelProperty(value = "Restriction for who is able to report game end and results. Admin is always able to send results as well. Must be equal or more restrictive than activity (or must match challenge if applicable). Default inherits")
  public ResultsTrustEnum getResultsTrust() {
    return resultsTrust;
  }

  public void setResultsTrust(ResultsTrustEnum resultsTrust) {
    this.resultsTrust = resultsTrust;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreActivityOccurrenceSettings coreActivityOccurrenceSettings = (CoreActivityOccurrenceSettings) o;
    return Objects.equals(this.bootInPlay, coreActivityOccurrenceSettings.bootInPlay) &&
        Objects.equals(this.customLaunchAddress, coreActivityOccurrenceSettings.customLaunchAddress) &&
        Objects.equals(this.hostStatusControl, coreActivityOccurrenceSettings.hostStatusControl) &&
        Objects.equals(this.joinInPlay, coreActivityOccurrenceSettings.joinInPlay) &&
        Objects.equals(this.leaveInPlay, coreActivityOccurrenceSettings.leaveInPlay) &&
        Objects.equals(this.maxPlayers, coreActivityOccurrenceSettings.maxPlayers) &&
        Objects.equals(this.minPlayers, coreActivityOccurrenceSettings.minPlayers) &&
        Objects.equals(this.nonHostStatusControl, coreActivityOccurrenceSettings.nonHostStatusControl) &&
        Objects.equals(this.resultsTrust, coreActivityOccurrenceSettings.resultsTrust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootInPlay, customLaunchAddress, hostStatusControl, joinInPlay, leaveInPlay, maxPlayers, minPlayers, nonHostStatusControl, resultsTrust);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreActivityOccurrenceSettings {\n");
    
    sb.append("    bootInPlay: ").append(toIndentedString(bootInPlay)).append("\n");
    sb.append("    customLaunchAddress: ").append(toIndentedString(customLaunchAddress)).append("\n");
    sb.append("    hostStatusControl: ").append(toIndentedString(hostStatusControl)).append("\n");
    sb.append("    joinInPlay: ").append(toIndentedString(joinInPlay)).append("\n");
    sb.append("    leaveInPlay: ").append(toIndentedString(leaveInPlay)).append("\n");
    sb.append("    maxPlayers: ").append(toIndentedString(maxPlayers)).append("\n");
    sb.append("    minPlayers: ").append(toIndentedString(minPlayers)).append("\n");
    sb.append("    nonHostStatusControl: ").append(toIndentedString(nonHostStatusControl)).append("\n");
    sb.append("    resultsTrust: ").append(toIndentedString(resultsTrust)).append("\n");
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


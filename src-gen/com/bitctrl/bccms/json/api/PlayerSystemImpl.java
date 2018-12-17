package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "owner",
    "playerstystemGroup",
    "playersystemType",
    "manufactor",
    "name",
    "description",
    "enable",
    "bordcomputerid"
})
public class PlayerSystemImpl implements PlayerSystem {
  @NotNull
  @JsonProperty("id")
  private Number id;

  @NotNull
  @JsonProperty("owner")
  private String owner;

  @NotNull
  @JsonProperty("playerstystemGroup")
  private String playerstystemGroup;

  @JsonProperty("playersystemType")
  @NotNull
  private Number playersystemType;

  @JsonProperty("manufactor")
  @NotNull
  private String manufactor;

  @JsonProperty("name")
  @NotNull
  private String name;

  @JsonProperty("description")
  @NotNull
  private String description;

  @JsonProperty("enable")
  @NotNull
  private boolean enable;

  @JsonProperty("bordcomputerid")
  @NotNull
  private String bordcomputerid;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("id")
  public Number getId() {
    return this.id;
  }

  @JsonProperty("id")
  public void setId(Number id) {
    this.id = id;
  }

  @JsonProperty("owner")
  public String getOwner() {
    return this.owner;
  }

  @JsonProperty("owner")
  public void setOwner(String owner) {
    this.owner = owner;
  }

  @JsonProperty("playerstystemGroup")
  public String getPlayerstystemGroup() {
    return this.playerstystemGroup;
  }

  @JsonProperty("playerstystemGroup")
  public void setPlayerstystemGroup(String playerstystemGroup) {
    this.playerstystemGroup = playerstystemGroup;
  }

  @JsonProperty("playersystemType")
  public Number getPlayersystemType() {
    return this.playersystemType;
  }

  @JsonProperty("playersystemType")
  public void setPlayersystemType(Number playersystemType) {
    this.playersystemType = playersystemType;
  }

  @JsonProperty("manufactor")
  public String getManufactor() {
    return this.manufactor;
  }

  @JsonProperty("manufactor")
  public void setManufactor(String manufactor) {
    this.manufactor = manufactor;
  }

  @JsonProperty("name")
  public String getName() {
    return this.name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("description")
  public String getDescription() {
    return this.description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("enable")
  public boolean getEnable() {
    return this.enable;
  }

  @JsonProperty("enable")
  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  @JsonProperty("bordcomputerid")
  public String getBordcomputerid() {
    return this.bordcomputerid;
  }

  @JsonProperty("bordcomputerid")
  public void setBordcomputerid(String bordcomputerid) {
    this.bordcomputerid = bordcomputerid;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperties(String key, Object value) {
    this.additionalProperties.put(key, value);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (this == o) return true;
    if (getClass() != o.getClass()) return false;
    PlayerSystemImpl other = (PlayerSystemImpl) o;
    return java.util.Objects.equals(this.id, other.id) && java.util.Objects.equals(this.owner, other.owner) && java.util.Objects.equals(this.playerstystemGroup, other.playerstystemGroup) && java.util.Objects.equals(this.playersystemType, other.playersystemType) && java.util.Objects.equals(this.manufactor, other.manufactor) && java.util.Objects.equals(this.name, other.name) && java.util.Objects.equals(this.description, other.description) && (this.enable == other.enable) && java.util.Objects.equals(this.bordcomputerid, other.bordcomputerid) && java.util.Objects.equals(this.additionalProperties, other.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id,owner,playerstystemGroup,playersystemType,manufactor,name,description,enable,bordcomputerid,additionalProperties);
  }
}

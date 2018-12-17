package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = PlayerSystemImpl.class
)
public interface PlayerSystem {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("id")
  Number getId();

  @JsonProperty("id")
  void setId(Number id);

  @JsonProperty("owner")
  String getOwner();

  @JsonProperty("owner")
  void setOwner(String owner);

  @JsonProperty("playerstystemGroup")
  String getPlayerstystemGroup();

  @JsonProperty("playerstystemGroup")
  void setPlayerstystemGroup(String playerstystemGroup);

  @JsonProperty("playersystemType")
  Number getPlayersystemType();

  @JsonProperty("playersystemType")
  void setPlayersystemType(Number playersystemType);

  @JsonProperty("manufactor")
  String getManufactor();

  @JsonProperty("manufactor")
  void setManufactor(String manufactor);

  @JsonProperty("name")
  String getName();

  @JsonProperty("name")
  void setName(String name);

  @JsonProperty("description")
  String getDescription();

  @JsonProperty("description")
  void setDescription(String description);

  @JsonProperty("enable")
  boolean getEnable();

  @JsonProperty("enable")
  void setEnable(boolean enable);

  @JsonProperty("bordcomputerid")
  String getBordcomputerid();

  @JsonProperty("bordcomputerid")
  void setBordcomputerid(String bordcomputerid);
}

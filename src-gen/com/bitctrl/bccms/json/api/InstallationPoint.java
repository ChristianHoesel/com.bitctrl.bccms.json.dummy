package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = InstallationPointImpl.class
)
public interface InstallationPoint {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("id")
  Number getId();

  @JsonProperty("id")
  void setId(Number id);

  @JsonProperty("playersystem")
  Number getPlayersystem();

  @JsonProperty("playersystem")
  void setPlayersystem(Number playersystem);

  @JsonProperty("typ")
  int getTyp();

  @JsonProperty("typ")
  void setTyp(int typ);

  @JsonProperty("name")
  String getName();

  @JsonProperty("name")
  void setName(String name);
}

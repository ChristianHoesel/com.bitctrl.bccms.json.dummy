package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = PlayerSystemTypImpl.class
)
public interface PlayerSystemTyp {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("id")
  Number getId();

  @JsonProperty("id")
  void setId(Number id);

  @JsonProperty("name")
  String getName();

  @JsonProperty("name")
  void setName(String name);
}

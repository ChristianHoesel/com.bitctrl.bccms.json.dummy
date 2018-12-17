package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.Map;

@JsonDeserialize(
    as = ServicePointImpl.class
)
public interface ServicePoint {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("id")
  Number getId();

  @JsonProperty("id")
  void setId(Number id);

  @JsonProperty("computer")
  Number getComputer();

  @JsonProperty("computer")
  void setComputer(Number computer);

  @JsonProperty("playersystem")
  Number getPlayersystem();

  @JsonProperty("playersystem")
  void setPlayersystem(Number playersystem);

  @JsonProperty("user")
  Number getUser();

  @JsonProperty("user")
  void setUser(Number user);

  @JsonProperty("servicetime")
  Date getServicetime();

  @JsonProperty("servicetime")
  void setServicetime(Date servicetime);

  @JsonProperty("shortdescription")
  String getShortdescription();

  @JsonProperty("shortdescription")
  void setShortdescription(String shortdescription);

  @JsonProperty("description")
  String getDescription();

  @JsonProperty("description")
  void setDescription(String description);

  @JsonProperty("externorderno")
  String getExternorderno();

  @JsonProperty("externorderno")
  void setExternorderno(String externorderno);

  @JsonProperty("assembler")
  String getAssembler();

  @JsonProperty("assembler")
  void setAssembler(String assembler);
}

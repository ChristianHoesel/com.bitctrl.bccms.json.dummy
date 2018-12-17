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
    "playersystem",
    "typ",
    "name"
})
public class InstallationPointImpl implements InstallationPoint {
  @NotNull
  @JsonProperty("id")
  private Number id;

  @JsonProperty("playersystem")
  @NotNull
  private Number playersystem;

  @NotNull
  @JsonProperty("typ")
  private int typ;

  @JsonProperty("name")
  @NotNull
  private String name;

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

  @JsonProperty("playersystem")
  public Number getPlayersystem() {
    return this.playersystem;
  }

  @JsonProperty("playersystem")
  public void setPlayersystem(Number playersystem) {
    this.playersystem = playersystem;
  }

  @JsonProperty("typ")
  public int getTyp() {
    return this.typ;
  }

  @JsonProperty("typ")
  public void setTyp(int typ) {
    this.typ = typ;
  }

  @JsonProperty("name")
  public String getName() {
    return this.name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
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
    InstallationPointImpl other = (InstallationPointImpl) o;
    return java.util.Objects.equals(this.id, other.id) && java.util.Objects.equals(this.playersystem, other.playersystem) && (this.typ == other.typ) && java.util.Objects.equals(this.name, other.name) && java.util.Objects.equals(this.additionalProperties, other.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id,playersystem,typ,name,additionalProperties);
  }
}

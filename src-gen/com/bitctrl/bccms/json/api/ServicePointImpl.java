package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "computer",
    "playersystem",
    "user",
    "servicetime",
    "shortdescription",
    "description",
    "externorderno",
    "assembler"
})
public class ServicePointImpl implements ServicePoint {
  @NotNull
  @JsonProperty("id")
  private Number id;

  @JsonProperty("computer")
  @NotNull
  private Number computer;

  @NotNull
  @JsonProperty("playersystem")
  private Number playersystem;

  @NotNull
  @JsonProperty("user")
  private Number user;

  @NotNull
  @JsonProperty("servicetime")
  @JsonFormat(
      shape = JsonFormat.Shape.STRING,
      pattern = "yyyy-MM-dd'T'HH:mm:ssZ"
  )
  private Date servicetime;

  @JsonProperty("shortdescription")
  @NotNull
  @Size(
      max = 56
  )
  private String shortdescription;

  @JsonProperty("description")
  @NotNull
  @Size(
      max = 1024
  )
  private String description;

  @JsonProperty("externorderno")
  @NotNull
  @Size(
      max = 56
  )
  private String externorderno;

  @NotNull
  @Size(
      max = 64
  )
  @JsonProperty("assembler")
  private String assembler;

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

  @JsonProperty("computer")
  public Number getComputer() {
    return this.computer;
  }

  @JsonProperty("computer")
  public void setComputer(Number computer) {
    this.computer = computer;
  }

  @JsonProperty("playersystem")
  public Number getPlayersystem() {
    return this.playersystem;
  }

  @JsonProperty("playersystem")
  public void setPlayersystem(Number playersystem) {
    this.playersystem = playersystem;
  }

  @JsonProperty("user")
  public Number getUser() {
    return this.user;
  }

  @JsonProperty("user")
  public void setUser(Number user) {
    this.user = user;
  }

  @JsonProperty("servicetime")
  public Date getServicetime() {
    return this.servicetime;
  }

  @JsonProperty("servicetime")
  public void setServicetime(Date servicetime) {
    this.servicetime = servicetime;
  }

  @JsonProperty("shortdescription")
  public String getShortdescription() {
    return this.shortdescription;
  }

  @JsonProperty("shortdescription")
  public void setShortdescription(String shortdescription) {
    this.shortdescription = shortdescription;
  }

  @JsonProperty("description")
  public String getDescription() {
    return this.description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("externorderno")
  public String getExternorderno() {
    return this.externorderno;
  }

  @JsonProperty("externorderno")
  public void setExternorderno(String externorderno) {
    this.externorderno = externorderno;
  }

  @JsonProperty("assembler")
  public String getAssembler() {
    return this.assembler;
  }

  @JsonProperty("assembler")
  public void setAssembler(String assembler) {
    this.assembler = assembler;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (this == o) return true;
    if (getClass() != o.getClass()) return false;
    ServicePointImpl other = (ServicePointImpl) o;
    return java.util.Objects.equals(this.id, other.id) && java.util.Objects.equals(this.computer, other.computer) && java.util.Objects.equals(this.playersystem, other.playersystem) && java.util.Objects.equals(this.user, other.user) && java.util.Objects.equals(this.servicetime, other.servicetime) && java.util.Objects.equals(this.shortdescription, other.shortdescription) && java.util.Objects.equals(this.description, other.description) && java.util.Objects.equals(this.externorderno, other.externorderno) && java.util.Objects.equals(this.assembler, other.assembler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id,computer,playersystem,user,servicetime,shortdescription,description,externorderno,assembler);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperties(String key, Object value) {
    this.additionalProperties.put(key, value);
  }
}

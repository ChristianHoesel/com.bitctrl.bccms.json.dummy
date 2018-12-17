package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = UserImpl.class
)
public interface User {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("id")
  Number getId();

  @JsonProperty("id")
  void setId(Number id);

  @JsonProperty("country")
  String getCountry();

  @JsonProperty("country")
  void setCountry(String country);

  @JsonProperty("company")
  String getCompany();

  @JsonProperty("company")
  void setCompany(String company);

  @JsonProperty("firstname")
  String getFirstname();

  @JsonProperty("firstname")
  void setFirstname(String firstname);

  @JsonProperty("lastname")
  String getLastname();

  @JsonProperty("lastname")
  void setLastname(String lastname);

  @JsonProperty("login")
  String getLogin();

  @JsonProperty("login")
  void setLogin(String login);

  @JsonProperty("street")
  String getStreet();

  @JsonProperty("street")
  void setStreet(String street);

  @JsonProperty("city")
  String getCity();

  @JsonProperty("city")
  void setCity(String city);

  @JsonProperty("phone")
  String getPhone();

  @JsonProperty("phone")
  void setPhone(String phone);

  @JsonProperty("mobile")
  String getMobile();

  @JsonProperty("mobile")
  void setMobile(String mobile);

  @JsonProperty("fax")
  String getFax();

  @JsonProperty("fax")
  void setFax(String fax);

  @JsonProperty("email")
  String getEmail();

  @JsonProperty("email")
  void setEmail(String email);

  @JsonProperty("roles")
  List<Number> getRoles();

  @JsonProperty("roles")
  void setRoles(List<Number> roles);
}

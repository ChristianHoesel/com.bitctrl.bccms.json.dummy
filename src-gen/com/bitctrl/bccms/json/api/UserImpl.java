package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "country",
    "company",
    "firstname",
    "lastname",
    "login",
    "street",
    "city",
    "phone",
    "mobile",
    "fax",
    "email",
    "roles"
})
public class UserImpl implements User {
  @JsonProperty("id")
  @NotNull
  private Number id;

  @NotNull
  @JsonProperty("country")
  private String country;

  @JsonProperty("company")
  @NotNull
  private String company;

  @NotNull
  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("lastname")
  @NotNull
  private String lastname;

  @JsonProperty("login")
  @NotNull
  private String login;

  @NotNull
  @JsonProperty("street")
  private String street;

  @NotNull
  @JsonProperty("city")
  private String city;

  @NotNull
  @JsonProperty("phone")
  private String phone;

  @NotNull
  @JsonProperty("mobile")
  private String mobile;

  @NotNull
  @JsonProperty("fax")
  private String fax;

  @JsonProperty("email")
  @NotNull
  private String email;

  @NotNull
  @JsonProperty("roles")
  private List<Number> roles;

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

  @JsonProperty("country")
  public String getCountry() {
    return this.country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("company")
  public String getCompany() {
    return this.company;
  }

  @JsonProperty("company")
  public void setCompany(String company) {
    this.company = company;
  }

  @JsonProperty("firstname")
  public String getFirstname() {
    return this.firstname;
  }

  @JsonProperty("firstname")
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  @JsonProperty("lastname")
  public String getLastname() {
    return this.lastname;
  }

  @JsonProperty("lastname")
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @JsonProperty("login")
  public String getLogin() {
    return this.login;
  }

  @JsonProperty("login")
  public void setLogin(String login) {
    this.login = login;
  }

  @JsonProperty("street")
  public String getStreet() {
    return this.street;
  }

  @JsonProperty("street")
  public void setStreet(String street) {
    this.street = street;
  }

  @JsonProperty("city")
  public String getCity() {
    return this.city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  @JsonProperty("phone")
  public String getPhone() {
    return this.phone;
  }

  @JsonProperty("phone")
  public void setPhone(String phone) {
    this.phone = phone;
  }

  @JsonProperty("mobile")
  public String getMobile() {
    return this.mobile;
  }

  @JsonProperty("mobile")
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  @JsonProperty("fax")
  public String getFax() {
    return this.fax;
  }

  @JsonProperty("fax")
  public void setFax(String fax) {
    this.fax = fax;
  }

  @JsonProperty("email")
  public String getEmail() {
    return this.email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @JsonProperty("roles")
  public List<Number> getRoles() {
    return this.roles;
  }

  @JsonProperty("roles")
  public void setRoles(List<Number> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (this == o) return true;
    if (getClass() != o.getClass()) return false;
    UserImpl other = (UserImpl) o;
    return java.util.Objects.equals(this.id, other.id) && java.util.Objects.equals(this.country, other.country) && java.util.Objects.equals(this.company, other.company) && java.util.Objects.equals(this.firstname, other.firstname) && java.util.Objects.equals(this.lastname, other.lastname) && java.util.Objects.equals(this.login, other.login) && java.util.Objects.equals(this.street, other.street) && java.util.Objects.equals(this.city, other.city) && java.util.Objects.equals(this.phone, other.phone) && java.util.Objects.equals(this.mobile, other.mobile) && java.util.Objects.equals(this.fax, other.fax) && java.util.Objects.equals(this.email, other.email) && java.util.Objects.equals(this.roles, other.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id,country,company,firstname,lastname,login,street,city,phone,mobile,fax,email,roles);
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

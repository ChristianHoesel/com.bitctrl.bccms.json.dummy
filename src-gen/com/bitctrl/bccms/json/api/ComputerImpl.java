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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "company",
    "support",
    "owner",
    "channel",
    "playersystem",
    "typ",
    "distributiontyp",
    "playeros",
    "playertyp",
    "hostname",
    "phonenumber",
    "sim",
    "logid",
    "enable",
    "description",
    "lastvalidupdate",
    "ip",
    "mac",
    "iplan",
    "maclan",
    "macversion",
    "maincontrolversion",
    "sernumber",
    "operationhours",
    "installationpoint"
})
public class ComputerImpl implements Computer {
  @JsonProperty("id")
  @NotNull
  private Number id;

  @JsonProperty("company")
  @NotNull
  private String company;

  @JsonProperty("support")
  @NotNull
  @Valid
  private User support;

  @NotNull
  @JsonProperty("owner")
  private String owner;

  @JsonProperty("channel")
  @NotNull
  private String channel;

  @JsonProperty("playersystem")
  @NotNull
  private Number playersystem;

  @JsonProperty("typ")
  @NotNull
  private String typ;

  @NotNull
  @JsonProperty("distributiontyp")
  private String distributiontyp;

  @JsonProperty("playeros")
  @NotNull
  private String playeros;

  @NotNull
  @JsonProperty("playertyp")
  private String playertyp;

  @NotNull
  @JsonProperty("hostname")
  private String hostname;

  @NotNull
  @JsonProperty("phonenumber")
  private String phonenumber;

  @NotNull
  @JsonProperty("sim")
  private String sim;

  @NotNull
  @JsonProperty("logid")
  private String logid;

  @NotNull
  @JsonProperty("enable")
  private boolean enable;

  @NotNull
  @JsonProperty("description")
  private String description;

  @NotNull
  @JsonProperty("lastvalidupdate")
  @JsonFormat(
      shape = JsonFormat.Shape.STRING,
      pattern = "yyyy-MM-dd'T'HH:mm:ssZ"
  )
  private Date lastvalidupdate;

  @JsonProperty("ip")
  @NotNull
  private String ip;

  @NotNull
  @JsonProperty("mac")
  private String mac;

  @JsonProperty("iplan")
  @NotNull
  private String iplan;

  @JsonProperty("maclan")
  @NotNull
  private String maclan;

  @NotNull
  @JsonProperty("macversion")
  private String macversion;

  @NotNull
  @JsonProperty("maincontrolversion")
  private String maincontrolversion;

  @JsonProperty("sernumber")
  @NotNull
  private String sernumber;

  @NotNull
  @JsonProperty("operationhours")
  private int operationhours;

  @NotNull
  @JsonProperty("installationpoint")
  private Number installationpoint;

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

  @JsonProperty("company")
  public String getCompany() {
    return this.company;
  }

  @JsonProperty("company")
  public void setCompany(String company) {
    this.company = company;
  }

  @JsonProperty("support")
  public User getSupport() {
    return this.support;
  }

  @JsonProperty("support")
  public void setSupport(User support) {
    this.support = support;
  }

  @JsonProperty("owner")
  public String getOwner() {
    return this.owner;
  }

  @JsonProperty("owner")
  public void setOwner(String owner) {
    this.owner = owner;
  }

  @JsonProperty("channel")
  public String getChannel() {
    return this.channel;
  }

  @JsonProperty("channel")
  public void setChannel(String channel) {
    this.channel = channel;
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
  public String getTyp() {
    return this.typ;
  }

  @JsonProperty("typ")
  public void setTyp(String typ) {
    this.typ = typ;
  }

  @JsonProperty("distributiontyp")
  public String getDistributiontyp() {
    return this.distributiontyp;
  }

  @JsonProperty("distributiontyp")
  public void setDistributiontyp(String distributiontyp) {
    this.distributiontyp = distributiontyp;
  }

  @JsonProperty("playeros")
  public String getPlayeros() {
    return this.playeros;
  }

  @JsonProperty("playeros")
  public void setPlayeros(String playeros) {
    this.playeros = playeros;
  }

  @JsonProperty("playertyp")
  public String getPlayertyp() {
    return this.playertyp;
  }

  @JsonProperty("playertyp")
  public void setPlayertyp(String playertyp) {
    this.playertyp = playertyp;
  }

  @JsonProperty("hostname")
  public String getHostname() {
    return this.hostname;
  }

  @JsonProperty("hostname")
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  @JsonProperty("phonenumber")
  public String getPhonenumber() {
    return this.phonenumber;
  }

  @JsonProperty("phonenumber")
  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

  @JsonProperty("sim")
  public String getSim() {
    return this.sim;
  }

  @JsonProperty("sim")
  public void setSim(String sim) {
    this.sim = sim;
  }

  @JsonProperty("logid")
  public String getLogid() {
    return this.logid;
  }

  @JsonProperty("logid")
  public void setLogid(String logid) {
    this.logid = logid;
  }

  @JsonProperty("enable")
  public boolean getEnable() {
    return this.enable;
  }

  @JsonProperty("enable")
  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  @JsonProperty("description")
  public String getDescription() {
    return this.description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("lastvalidupdate")
  public Date getLastvalidupdate() {
    return this.lastvalidupdate;
  }

  @JsonProperty("lastvalidupdate")
  public void setLastvalidupdate(Date lastvalidupdate) {
    this.lastvalidupdate = lastvalidupdate;
  }

  @JsonProperty("ip")
  public String getIp() {
    return this.ip;
  }

  @JsonProperty("ip")
  public void setIp(String ip) {
    this.ip = ip;
  }

  @JsonProperty("mac")
  public String getMac() {
    return this.mac;
  }

  @JsonProperty("mac")
  public void setMac(String mac) {
    this.mac = mac;
  }

  @JsonProperty("iplan")
  public String getIplan() {
    return this.iplan;
  }

  @JsonProperty("iplan")
  public void setIplan(String iplan) {
    this.iplan = iplan;
  }

  @JsonProperty("maclan")
  public String getMaclan() {
    return this.maclan;
  }

  @JsonProperty("maclan")
  public void setMaclan(String maclan) {
    this.maclan = maclan;
  }

  @JsonProperty("macversion")
  public String getMacversion() {
    return this.macversion;
  }

  @JsonProperty("macversion")
  public void setMacversion(String macversion) {
    this.macversion = macversion;
  }

  @JsonProperty("maincontrolversion")
  public String getMaincontrolversion() {
    return this.maincontrolversion;
  }

  @JsonProperty("maincontrolversion")
  public void setMaincontrolversion(String maincontrolversion) {
    this.maincontrolversion = maincontrolversion;
  }

  @JsonProperty("sernumber")
  public String getSernumber() {
    return this.sernumber;
  }

  @JsonProperty("sernumber")
  public void setSernumber(String sernumber) {
    this.sernumber = sernumber;
  }

  @JsonProperty("operationhours")
  public int getOperationhours() {
    return this.operationhours;
  }

  @JsonProperty("operationhours")
  public void setOperationhours(int operationhours) {
    this.operationhours = operationhours;
  }

  @JsonProperty("installationpoint")
  public Number getInstallationpoint() {
    return this.installationpoint;
  }

  @JsonProperty("installationpoint")
  public void setInstallationpoint(Number installationpoint) {
    this.installationpoint = installationpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (this == o) return true;
    if (getClass() != o.getClass()) return false;
    ComputerImpl other = (ComputerImpl) o;
    return java.util.Objects.equals(this.id, other.id) && java.util.Objects.equals(this.company, other.company) && java.util.Objects.equals(this.support, other.support) && java.util.Objects.equals(this.owner, other.owner) && java.util.Objects.equals(this.channel, other.channel) && java.util.Objects.equals(this.playersystem, other.playersystem) && java.util.Objects.equals(this.typ, other.typ) && java.util.Objects.equals(this.distributiontyp, other.distributiontyp) && java.util.Objects.equals(this.playeros, other.playeros) && java.util.Objects.equals(this.playertyp, other.playertyp) && java.util.Objects.equals(this.hostname, other.hostname) && java.util.Objects.equals(this.phonenumber, other.phonenumber) && java.util.Objects.equals(this.sim, other.sim) && java.util.Objects.equals(this.logid, other.logid) && (this.enable == other.enable) && java.util.Objects.equals(this.description, other.description) && java.util.Objects.equals(this.lastvalidupdate, other.lastvalidupdate) && java.util.Objects.equals(this.ip, other.ip) && java.util.Objects.equals(this.mac, other.mac) && java.util.Objects.equals(this.iplan, other.iplan) && java.util.Objects.equals(this.maclan, other.maclan) && java.util.Objects.equals(this.macversion, other.macversion) && java.util.Objects.equals(this.maincontrolversion, other.maincontrolversion) && java.util.Objects.equals(this.sernumber, other.sernumber) && (this.operationhours == other.operationhours) && java.util.Objects.equals(this.installationpoint, other.installationpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id,company,support,owner,channel,playersystem,typ,distributiontyp,playeros,playertyp,hostname,phonenumber,sim,logid,enable,description,lastvalidupdate,ip,mac,iplan,maclan,macversion,maincontrolversion,sernumber,operationhours,installationpoint);
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

package com.bitctrl.bccms.json.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.Map;

@JsonDeserialize(
    as = ComputerImpl.class
)
public interface Computer {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("id")
  Number getId();

  @JsonProperty("id")
  void setId(Number id);

  @JsonProperty("company")
  String getCompany();

  @JsonProperty("company")
  void setCompany(String company);

  @JsonProperty("support")
  User getSupport();

  @JsonProperty("support")
  void setSupport(User support);

  @JsonProperty("owner")
  String getOwner();

  @JsonProperty("owner")
  void setOwner(String owner);

  @JsonProperty("channel")
  String getChannel();

  @JsonProperty("channel")
  void setChannel(String channel);

  @JsonProperty("playersystem")
  Number getPlayersystem();

  @JsonProperty("playersystem")
  void setPlayersystem(Number playersystem);

  @JsonProperty("typ")
  String getTyp();

  @JsonProperty("typ")
  void setTyp(String typ);

  @JsonProperty("distributiontyp")
  String getDistributiontyp();

  @JsonProperty("distributiontyp")
  void setDistributiontyp(String distributiontyp);

  @JsonProperty("playeros")
  String getPlayeros();

  @JsonProperty("playeros")
  void setPlayeros(String playeros);

  @JsonProperty("playertyp")
  String getPlayertyp();

  @JsonProperty("playertyp")
  void setPlayertyp(String playertyp);

  @JsonProperty("hostname")
  String getHostname();

  @JsonProperty("hostname")
  void setHostname(String hostname);

  @JsonProperty("phonenumber")
  String getPhonenumber();

  @JsonProperty("phonenumber")
  void setPhonenumber(String phonenumber);

  @JsonProperty("sim")
  String getSim();

  @JsonProperty("sim")
  void setSim(String sim);

  @JsonProperty("logid")
  String getLogid();

  @JsonProperty("logid")
  void setLogid(String logid);

  @JsonProperty("enable")
  boolean getEnable();

  @JsonProperty("enable")
  void setEnable(boolean enable);

  @JsonProperty("description")
  String getDescription();

  @JsonProperty("description")
  void setDescription(String description);

  @JsonProperty("lastvalidupdate")
  Date getLastvalidupdate();

  @JsonProperty("lastvalidupdate")
  void setLastvalidupdate(Date lastvalidupdate);

  @JsonProperty("ip")
  String getIp();

  @JsonProperty("ip")
  void setIp(String ip);

  @JsonProperty("mac")
  String getMac();

  @JsonProperty("mac")
  void setMac(String mac);

  @JsonProperty("iplan")
  String getIplan();

  @JsonProperty("iplan")
  void setIplan(String iplan);

  @JsonProperty("maclan")
  String getMaclan();

  @JsonProperty("maclan")
  void setMaclan(String maclan);

  @JsonProperty("macversion")
  String getMacversion();

  @JsonProperty("macversion")
  void setMacversion(String macversion);

  @JsonProperty("maincontrolversion")
  String getMaincontrolversion();

  @JsonProperty("maincontrolversion")
  void setMaincontrolversion(String maincontrolversion);

  @JsonProperty("sernumber")
  String getSernumber();

  @JsonProperty("sernumber")
  void setSernumber(String sernumber);

  @JsonProperty("operationhours")
  int getOperationhours();

  @JsonProperty("operationhours")
  void setOperationhours(int operationhours);

  @JsonProperty("installationpoint")
  Number getInstallationpoint();

  @JsonProperty("installationpoint")
  void setInstallationpoint(Number installationpoint);
}

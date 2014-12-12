package com.shclearing.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
public class Irsagenyrelation {


  private String id;
  private String abbr;
  private String account;
  private String caccount;
  private Timestamp crtime;
  private Timestamp lastmodifytime;
  private String linkmen;
  private String name;
  private String phone;
  private String status;
  private String type;

  @Id
  @Column(name = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Basic
  @Column(name = "ABBR")
  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  @Basic
  @Column(name = "ACCOUNT")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  @Basic
  @Column(name = "CACCOUNT")
  public String getCaccount() {
    return caccount;
  }

  public void setCaccount(String caccount) {
    this.caccount = caccount;
  }

  @Basic
  @Column(name = "CRTIME")
  public Timestamp getCrtime() {
    return crtime;
  }

  public void setCrtime(Timestamp crtime) {
    this.crtime = crtime;
  }

  @Basic
  @Column(name = "LASTMODIFYTIME")
  public Timestamp getLastmodifytime() {
    return lastmodifytime;
  }

  public void setLastmodifytime(Timestamp lastmodifytime) {
    this.lastmodifytime = lastmodifytime;
  }

  @Basic
  @Column(name = "LINKMEN")
  public String getLinkmen() {
    return linkmen;
  }

  public void setLinkmen(String linkmen) {
    this.linkmen = linkmen;
  }

  @Basic
  @Column(name = "NAME")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "PHONE")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Basic
  @Column(name = "STATUS")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Basic
  @Column(name = "TYPE")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Irsagenyrelation that = (Irsagenyrelation) o;

    if (abbr != null ? !abbr.equals(that.abbr) : that.abbr != null) return false;
    if (account != null ? !account.equals(that.account) : that.account != null) return false;
    if (caccount != null ? !caccount.equals(that.caccount) : that.caccount != null) return false;
    if (crtime != null ? !crtime.equals(that.crtime) : that.crtime != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (lastmodifytime != null ? !lastmodifytime.equals(that.lastmodifytime) : that.lastmodifytime != null) return false;
    if (linkmen != null ? !linkmen.equals(that.linkmen) : that.linkmen != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (abbr != null ? abbr.hashCode() : 0);
    result = 31 * result + (account != null ? account.hashCode() : 0);
    result = 31 * result + (caccount != null ? caccount.hashCode() : 0);
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (lastmodifytime != null ? lastmodifytime.hashCode() : 0);
    result = 31 * result + (linkmen != null ? linkmen.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }
}

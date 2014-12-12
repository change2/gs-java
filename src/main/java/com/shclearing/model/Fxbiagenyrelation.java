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
public class Fxbiagenyrelation {


  private String id;
  private Timestamp crtime;
  private String holderaccount;
  private String importlogid;
  private String agenyaccount;
  private String category;
  private String status;
  private String abbr;
  private String dlabbr;
  private String dlengaddr;
  private String dlengname;
  private String dlname;
  private String engaddr;
  private String engname;
  private String name;

  @Id
  @Column(name = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
  @Column(name = "HOLDERACCOUNT")
  public String getHolderaccount() {
    return holderaccount;
  }

  public void setHolderaccount(String holderaccount) {
    this.holderaccount = holderaccount;
  }

  @Basic
  @Column(name = "IMPORTLOGID")
  public String getImportlogid() {
    return importlogid;
  }

  public void setImportlogid(String importlogid) {
    this.importlogid = importlogid;
  }

  @Basic
  @Column(name = "AGENYACCOUNT")
  public String getAgenyaccount() {
    return agenyaccount;
  }

  public void setAgenyaccount(String agenyaccount) {
    this.agenyaccount = agenyaccount;
  }

  @Basic
  @Column(name = "CATEGORY")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
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
  @Column(name = "ABBR")
  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  @Basic
  @Column(name = "DLABBR")
  public String getDlabbr() {
    return dlabbr;
  }

  public void setDlabbr(String dlabbr) {
    this.dlabbr = dlabbr;
  }

  @Basic
  @Column(name = "DLENGADDR")
  public String getDlengaddr() {
    return dlengaddr;
  }

  public void setDlengaddr(String dlengaddr) {
    this.dlengaddr = dlengaddr;
  }

  @Basic
  @Column(name = "DLENGNAME")
  public String getDlengname() {
    return dlengname;
  }

  public void setDlengname(String dlengname) {
    this.dlengname = dlengname;
  }

  @Basic
  @Column(name = "DLNAME")
  public String getDlname() {
    return dlname;
  }

  public void setDlname(String dlname) {
    this.dlname = dlname;
  }

  @Basic
  @Column(name = "ENGADDR")
  public String getEngaddr() {
    return engaddr;
  }

  public void setEngaddr(String engaddr) {
    this.engaddr = engaddr;
  }

  @Basic
  @Column(name = "ENGNAME")
  public String getEngname() {
    return engname;
  }

  public void setEngname(String engname) {
    this.engname = engname;
  }

  @Basic
  @Column(name = "NAME")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Fxbiagenyrelation that = (Fxbiagenyrelation) o;

    if (abbr != null ? !abbr.equals(that.abbr) : that.abbr != null) return false;
    if (agenyaccount != null ? !agenyaccount.equals(that.agenyaccount) : that.agenyaccount != null) return false;
    if (category != null ? !category.equals(that.category) : that.category != null) return false;
    if (crtime != null ? !crtime.equals(that.crtime) : that.crtime != null) return false;
    if (dlabbr != null ? !dlabbr.equals(that.dlabbr) : that.dlabbr != null) return false;
    if (dlengaddr != null ? !dlengaddr.equals(that.dlengaddr) : that.dlengaddr != null) return false;
    if (dlengname != null ? !dlengname.equals(that.dlengname) : that.dlengname != null) return false;
    if (dlname != null ? !dlname.equals(that.dlname) : that.dlname != null) return false;
    if (engaddr != null ? !engaddr.equals(that.engaddr) : that.engaddr != null) return false;
    if (engname != null ? !engname.equals(that.engname) : that.engname != null) return false;
    if (holderaccount != null ? !holderaccount.equals(that.holderaccount) : that.holderaccount != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (importlogid != null ? !importlogid.equals(that.importlogid) : that.importlogid != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (holderaccount != null ? holderaccount.hashCode() : 0);
    result = 31 * result + (importlogid != null ? importlogid.hashCode() : 0);
    result = 31 * result + (agenyaccount != null ? agenyaccount.hashCode() : 0);
    result = 31 * result + (category != null ? category.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (abbr != null ? abbr.hashCode() : 0);
    result = 31 * result + (dlabbr != null ? dlabbr.hashCode() : 0);
    result = 31 * result + (dlengaddr != null ? dlengaddr.hashCode() : 0);
    result = 31 * result + (dlengname != null ? dlengname.hashCode() : 0);
    result = 31 * result + (dlname != null ? dlname.hashCode() : 0);
    result = 31 * result + (engaddr != null ? engaddr.hashCode() : 0);
    result = 31 * result + (engname != null ? engname.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}

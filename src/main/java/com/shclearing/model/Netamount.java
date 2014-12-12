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
public class Netamount {


  private String id;
  private Timestamp crtime;
  private String holderaccount;
  private String importlogid;
  private String businesstype;
  private String currency;
  private Timestamp cutdaydate;
  private String netamount;
  private Timestamp settlementdate;
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
  @Column(name = "BUSINESSTYPE")
  public String getBusinesstype() {
    return businesstype;
  }

  public void setBusinesstype(String businesstype) {
    this.businesstype = businesstype;
  }

  @Basic
  @Column(name = "CURRENCY")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Basic
  @Column(name = "CUTDAYDATE")
  public Timestamp getCutdaydate() {
    return cutdaydate;
  }

  public void setCutdaydate(Timestamp cutdaydate) {
    this.cutdaydate = cutdaydate;
  }

  @Basic
  @Column(name = "NETAMOUNT")
  public String getNetamount() {
    return netamount;
  }

  public void setNetamount(String netamount) {
    this.netamount = netamount;
  }

  @Basic
  @Column(name = "SETTLEMENTDATE")
  public Timestamp getSettlementdate() {
    return settlementdate;
  }

  public void setSettlementdate(Timestamp settlementdate) {
    this.settlementdate = settlementdate;
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

    Netamount netamount1 = (Netamount) o;

    if (businesstype != null ? !businesstype.equals(netamount1.businesstype) : netamount1.businesstype != null) return false;
    if (crtime != null ? !crtime.equals(netamount1.crtime) : netamount1.crtime != null) return false;
    if (currency != null ? !currency.equals(netamount1.currency) : netamount1.currency != null) return false;
    if (cutdaydate != null ? !cutdaydate.equals(netamount1.cutdaydate) : netamount1.cutdaydate != null) return false;
    if (holderaccount != null ? !holderaccount.equals(netamount1.holderaccount) : netamount1.holderaccount != null) return false;
    if (id != null ? !id.equals(netamount1.id) : netamount1.id != null) return false;
    if (importlogid != null ? !importlogid.equals(netamount1.importlogid) : netamount1.importlogid != null) return false;
    if (netamount != null ? !netamount.equals(netamount1.netamount) : netamount1.netamount != null) return false;
    if (settlementdate != null ? !settlementdate.equals(netamount1.settlementdate) : netamount1.settlementdate != null) return false;
    if (type != null ? !type.equals(netamount1.type) : netamount1.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (holderaccount != null ? holderaccount.hashCode() : 0);
    result = 31 * result + (importlogid != null ? importlogid.hashCode() : 0);
    result = 31 * result + (businesstype != null ? businesstype.hashCode() : 0);
    result = 31 * result + (currency != null ? currency.hashCode() : 0);
    result = 31 * result + (cutdaydate != null ? cutdaydate.hashCode() : 0);
    result = 31 * result + (netamount != null ? netamount.hashCode() : 0);
    result = 31 * result + (settlementdate != null ? settlementdate.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }
}

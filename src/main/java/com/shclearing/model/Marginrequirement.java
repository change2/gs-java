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
public class Marginrequirement {


  private String id;
  private Timestamp crtime;
  private String holderaccount;
  private String importlogid;
  private String businesstype;
  private String marrequireamount;
  private Timestamp marrequiredate;
  private String type;
  private String currency;

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
  @Column(name = "MARREQUIREAMOUNT")
  public String getMarrequireamount() {
    return marrequireamount;
  }

  public void setMarrequireamount(String marrequireamount) {
    this.marrequireamount = marrequireamount;
  }

  @Basic
  @Column(name = "MARREQUIREDATE")
  public Timestamp getMarrequiredate() {
    return marrequiredate;
  }

  public void setMarrequiredate(Timestamp marrequiredate) {
    this.marrequiredate = marrequiredate;
  }

  @Basic
  @Column(name = "TYPE")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Basic
  @Column(name = "CURRENCY")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Marginrequirement that = (Marginrequirement) o;

    if (businesstype != null ? !businesstype.equals(that.businesstype) : that.businesstype != null) return false;
    if (crtime != null ? !crtime.equals(that.crtime) : that.crtime != null) return false;
    if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
    if (holderaccount != null ? !holderaccount.equals(that.holderaccount) : that.holderaccount != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (importlogid != null ? !importlogid.equals(that.importlogid) : that.importlogid != null) return false;
    if (marrequireamount != null ? !marrequireamount.equals(that.marrequireamount) : that.marrequireamount != null) return false;
    if (marrequiredate != null ? !marrequiredate.equals(that.marrequiredate) : that.marrequiredate != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (holderaccount != null ? holderaccount.hashCode() : 0);
    result = 31 * result + (importlogid != null ? importlogid.hashCode() : 0);
    result = 31 * result + (businesstype != null ? businesstype.hashCode() : 0);
    result = 31 * result + (marrequireamount != null ? marrequireamount.hashCode() : 0);
    result = 31 * result + (marrequiredate != null ? marrequiredate.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (currency != null ? currency.hashCode() : 0);
    return result;
  }
}

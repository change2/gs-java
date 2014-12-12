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
public class Marginrequireadddetail {


  private String id;
  private Timestamp crtime;
  private String holderaccount;
  private String importlogid;
  private String addcurrency;
  private Timestamp adddate;
  private String addtype;
  private String amount;
  private String businesstype;
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
  @Column(name = "ADDCURRENCY")
  public String getAddcurrency() {
    return addcurrency;
  }

  public void setAddcurrency(String addcurrency) {
    this.addcurrency = addcurrency;
  }

  @Basic
  @Column(name = "ADDDATE")
  public Timestamp getAdddate() {
    return adddate;
  }

  public void setAdddate(Timestamp adddate) {
    this.adddate = adddate;
  }

  @Basic
  @Column(name = "ADDTYPE")
  public String getAddtype() {
    return addtype;
  }

  public void setAddtype(String addtype) {
    this.addtype = addtype;
  }

  @Basic
  @Column(name = "AMOUNT")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
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

    Marginrequireadddetail that = (Marginrequireadddetail) o;

    if (addcurrency != null ? !addcurrency.equals(that.addcurrency) : that.addcurrency != null) return false;
    if (adddate != null ? !adddate.equals(that.adddate) : that.adddate != null) return false;
    if (addtype != null ? !addtype.equals(that.addtype) : that.addtype != null) return false;
    if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
    if (businesstype != null ? !businesstype.equals(that.businesstype) : that.businesstype != null) return false;
    if (crtime != null ? !crtime.equals(that.crtime) : that.crtime != null) return false;
    if (holderaccount != null ? !holderaccount.equals(that.holderaccount) : that.holderaccount != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (importlogid != null ? !importlogid.equals(that.importlogid) : that.importlogid != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (holderaccount != null ? holderaccount.hashCode() : 0);
    result = 31 * result + (importlogid != null ? importlogid.hashCode() : 0);
    result = 31 * result + (addcurrency != null ? addcurrency.hashCode() : 0);
    result = 31 * result + (adddate != null ? adddate.hashCode() : 0);
    result = 31 * result + (addtype != null ? addtype.hashCode() : 0);
    result = 31 * result + (amount != null ? amount.hashCode() : 0);
    result = 31 * result + (businesstype != null ? businesstype.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }
}

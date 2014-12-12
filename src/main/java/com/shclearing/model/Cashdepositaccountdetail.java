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
public class Cashdepositaccountdetail {


  private String id;
  private Timestamp crtime;
  private String holderaccount;
  private String importlogid;
  private String balance;
  private String cashdepositaccount;
  private String cashdepositaccountname;
  private String currency;
  private String dealamount;
  private Timestamp dealtime;
  private String dealtype;
  private String financetype;

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
  @Column(name = "BALANCE")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  @Basic
  @Column(name = "CASHDEPOSITACCOUNT")
  public String getCashdepositaccount() {
    return cashdepositaccount;
  }

  public void setCashdepositaccount(String cashdepositaccount) {
    this.cashdepositaccount = cashdepositaccount;
  }

  @Basic
  @Column(name = "CASHDEPOSITACCOUNTNAME")
  public String getCashdepositaccountname() {
    return cashdepositaccountname;
  }

  public void setCashdepositaccountname(String cashdepositaccountname) {
    this.cashdepositaccountname = cashdepositaccountname;
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
  @Column(name = "DEALAMOUNT")
  public String getDealamount() {
    return dealamount;
  }

  public void setDealamount(String dealamount) {
    this.dealamount = dealamount;
  }

  @Basic
  @Column(name = "DEALTIME")
  public Timestamp getDealtime() {
    return dealtime;
  }

  public void setDealtime(Timestamp dealtime) {
    this.dealtime = dealtime;
  }

  @Basic
  @Column(name = "DEALTYPE")
  public String getDealtype() {
    return dealtype;
  }

  public void setDealtype(String dealtype) {
    this.dealtype = dealtype;
  }

  @Basic
  @Column(name = "FINANCETYPE")
  public String getFinancetype() {
    return financetype;
  }

  public void setFinancetype(String financetype) {
    this.financetype = financetype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cashdepositaccountdetail that = (Cashdepositaccountdetail) o;

    if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
    if (cashdepositaccount != null ? !cashdepositaccount.equals(that.cashdepositaccount) : that.cashdepositaccount != null) return false;
    if (cashdepositaccountname != null ? !cashdepositaccountname.equals(that.cashdepositaccountname) : that.cashdepositaccountname != null) return false;
    if (crtime != null ? !crtime.equals(that.crtime) : that.crtime != null) return false;
    if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
    if (dealamount != null ? !dealamount.equals(that.dealamount) : that.dealamount != null) return false;
    if (dealtime != null ? !dealtime.equals(that.dealtime) : that.dealtime != null) return false;
    if (dealtype != null ? !dealtype.equals(that.dealtype) : that.dealtype != null) return false;
    if (financetype != null ? !financetype.equals(that.financetype) : that.financetype != null) return false;
    if (holderaccount != null ? !holderaccount.equals(that.holderaccount) : that.holderaccount != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (importlogid != null ? !importlogid.equals(that.importlogid) : that.importlogid != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (holderaccount != null ? holderaccount.hashCode() : 0);
    result = 31 * result + (importlogid != null ? importlogid.hashCode() : 0);
    result = 31 * result + (balance != null ? balance.hashCode() : 0);
    result = 31 * result + (cashdepositaccount != null ? cashdepositaccount.hashCode() : 0);
    result = 31 * result + (cashdepositaccountname != null ? cashdepositaccountname.hashCode() : 0);
    result = 31 * result + (currency != null ? currency.hashCode() : 0);
    result = 31 * result + (dealamount != null ? dealamount.hashCode() : 0);
    result = 31 * result + (dealtime != null ? dealtime.hashCode() : 0);
    result = 31 * result + (dealtype != null ? dealtype.hashCode() : 0);
    result = 31 * result + (financetype != null ? financetype.hashCode() : 0);
    return result;
  }
}

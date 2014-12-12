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
public class Balanceofcashdepositaccount {


  private String id;
  private Timestamp crtime;
  private String holderaccount;
  private String importlogid;
  private String availablebalance;
  private String balance;
  private Timestamp balancedate;
  private String blockedbalance;
  private String cashdepositaccount;
  private String cashdepositaccountname;
  private String currency;
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
  @Column(name = "AVAILABLEBALANCE")
  public String getAvailablebalance() {
    return availablebalance;
  }

  public void setAvailablebalance(String availablebalance) {
    this.availablebalance = availablebalance;
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
  @Column(name = "BALANCEDATE")
  public Timestamp getBalancedate() {
    return balancedate;
  }

  public void setBalancedate(Timestamp balancedate) {
    this.balancedate = balancedate;
  }

  @Basic
  @Column(name = "BLOCKEDBALANCE")
  public String getBlockedbalance() {
    return blockedbalance;
  }

  public void setBlockedbalance(String blockedbalance) {
    this.blockedbalance = blockedbalance;
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

    Balanceofcashdepositaccount that = (Balanceofcashdepositaccount) o;

    if (availablebalance != null ? !availablebalance.equals(that.availablebalance) : that.availablebalance != null) return false;
    if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
    if (balancedate != null ? !balancedate.equals(that.balancedate) : that.balancedate != null) return false;
    if (blockedbalance != null ? !blockedbalance.equals(that.blockedbalance) : that.blockedbalance != null) return false;
    if (cashdepositaccount != null ? !cashdepositaccount.equals(that.cashdepositaccount) : that.cashdepositaccount != null) return false;
    if (cashdepositaccountname != null ? !cashdepositaccountname.equals(that.cashdepositaccountname) : that.cashdepositaccountname != null) return false;
    if (crtime != null ? !crtime.equals(that.crtime) : that.crtime != null) return false;
    if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
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
    result = 31 * result + (availablebalance != null ? availablebalance.hashCode() : 0);
    result = 31 * result + (balance != null ? balance.hashCode() : 0);
    result = 31 * result + (balancedate != null ? balancedate.hashCode() : 0);
    result = 31 * result + (blockedbalance != null ? blockedbalance.hashCode() : 0);
    result = 31 * result + (cashdepositaccount != null ? cashdepositaccount.hashCode() : 0);
    result = 31 * result + (cashdepositaccountname != null ? cashdepositaccountname.hashCode() : 0);
    result = 31 * result + (currency != null ? currency.hashCode() : 0);
    result = 31 * result + (financetype != null ? financetype.hashCode() : 0);
    return result;
  }
}

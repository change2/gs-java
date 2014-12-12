package com.shclearing.model;

import javax.persistence.*;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
public class Texchangeroleapply {


  private String account;
  private String accountname;
  private String address;
  private String department;
  private String idnum;
  private String name;
  private String phone;
  private String id;
  private String abname;
  private Troleapply troleapplyById;

  @Basic
  @Column(name = "ACCOUNT")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  @Basic
  @Column(name = "ACCOUNTNAME")
  public String getAccountname() {
    return accountname;
  }

  public void setAccountname(String accountname) {
    this.accountname = accountname;
  }

  @Basic
  @Column(name = "ADDRESS")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Basic
  @Column(name = "DEPARTMENT")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  @Basic
  @Column(name = "IDNUM")
  public String getIdnum() {
    return idnum;
  }

  public void setIdnum(String idnum) {
    this.idnum = idnum;
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

  @Id
  @Column(name = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Basic
  @Column(name = "ABNAME")
  public String getAbname() {
    return abname;
  }

  public void setAbname(String abname) {
    this.abname = abname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Texchangeroleapply that = (Texchangeroleapply) o;

    if (abname != null ? !abname.equals(that.abname) : that.abname != null) return false;
    if (account != null ? !account.equals(that.account) : that.account != null) return false;
    if (accountname != null ? !accountname.equals(that.accountname) : that.accountname != null) return false;
    if (address != null ? !address.equals(that.address) : that.address != null) return false;
    if (department != null ? !department.equals(that.department) : that.department != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (idnum != null ? !idnum.equals(that.idnum) : that.idnum != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = account != null ? account.hashCode() : 0;
    result = 31 * result + (accountname != null ? accountname.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (department != null ? department.hashCode() : 0);
    result = 31 * result + (idnum != null ? idnum.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (abname != null ? abname.hashCode() : 0);
    return result;
  }

  @OneToOne
  @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
  public Troleapply getTroleapplyById() {
    return troleapplyById;
  }

  public void setTroleapplyById(Troleapply troleapplyById) {
    this.troleapplyById = troleapplyById;
  }
}

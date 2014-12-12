package com.shclearing.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
public class Tadminuser {


  private String id;
  private Timestamp createdate;
  private String creator;
  private BigInteger isdel;
  private String lastmodifier;
  private Timestamp lastmodifydate;
  private String cellphone;
  private String email;
  private String password;
  private String phone;
  private String truename;
  private String username;
  private Collection<TadminuserTrole> tadminuserTrolesById;

  @Id
  @Column(name = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Basic
  @Column(name = "CREATEDATE")
  public Timestamp getCreatedate() {
    return createdate;
  }

  public void setCreatedate(Timestamp createdate) {
    this.createdate = createdate;
  }

  @Basic
  @Column(name = "CREATOR")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  @Basic
  @Column(name = "ISDEL")
  public BigInteger getIsdel() {
    return isdel;
  }

  public void setIsdel(BigInteger isdel) {
    this.isdel = isdel;
  }

  @Basic
  @Column(name = "LASTMODIFIER")
  public String getLastmodifier() {
    return lastmodifier;
  }

  public void setLastmodifier(String lastmodifier) {
    this.lastmodifier = lastmodifier;
  }

  @Basic
  @Column(name = "LASTMODIFYDATE")
  public Timestamp getLastmodifydate() {
    return lastmodifydate;
  }

  public void setLastmodifydate(Timestamp lastmodifydate) {
    this.lastmodifydate = lastmodifydate;
  }

  @Basic
  @Column(name = "CELLPHONE")
  public String getCellphone() {
    return cellphone;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }

  @Basic
  @Column(name = "EMAIL")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Basic
  @Column(name = "PASSWORD")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
  @Column(name = "TRUENAME")
  public String getTruename() {
    return truename;
  }

  public void setTruename(String truename) {
    this.truename = truename;
  }

  @Basic
  @Column(name = "USERNAME")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Tadminuser that = (Tadminuser) o;

    if (cellphone != null ? !cellphone.equals(that.cellphone) : that.cellphone != null) return false;
    if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
    if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
    if (email != null ? !email.equals(that.email) : that.email != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (isdel != null ? !isdel.equals(that.isdel) : that.isdel != null) return false;
    if (lastmodifier != null ? !lastmodifier.equals(that.lastmodifier) : that.lastmodifier != null) return false;
    if (lastmodifydate != null ? !lastmodifydate.equals(that.lastmodifydate) : that.lastmodifydate != null) return false;
    if (password != null ? !password.equals(that.password) : that.password != null) return false;
    if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
    if (truename != null ? !truename.equals(that.truename) : that.truename != null) return false;
    if (username != null ? !username.equals(that.username) : that.username != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
    result = 31 * result + (creator != null ? creator.hashCode() : 0);
    result = 31 * result + (isdel != null ? isdel.hashCode() : 0);
    result = 31 * result + (lastmodifier != null ? lastmodifier.hashCode() : 0);
    result = 31 * result + (lastmodifydate != null ? lastmodifydate.hashCode() : 0);
    result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (password != null ? password.hashCode() : 0);
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    result = 31 * result + (truename != null ? truename.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @OneToMany(mappedBy = "tadminuserByUsersId")
  public Collection<TadminuserTrole> getTadminuserTrolesById() {
    return tadminuserTrolesById;
  }

  public void setTadminuserTrolesById(Collection<TadminuserTrole> tadminuserTrolesById) {
    this.tadminuserTrolesById = tadminuserTrolesById;
  }
}

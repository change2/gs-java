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
public class Irsmember {


  private String type;
  private String id;
  private String abbr;
  private String account;
  private Timestamp crtime;
  private String cruser;
  private Timestamp opertime;
  private String operuser;
  private String clearingmemberid;
  private Timestamp createdate;
  private String creator;
  private BigInteger isdel;
  private String lastmodifier;
  private Timestamp lastmodifydate;
  private String memberid;
  private Irsmember irsmemberByClearingmemberid;
  private Collection<Irsmember> irsmembersById;
  private Irsmember irsmemberByMemberid;
  private Collection<Irsmember> irsmembersById_0;

  @Basic
  @Column(name = "TYPE")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
  @Column(name = "CRTIME")
  public Timestamp getCrtime() {
    return crtime;
  }

  public void setCrtime(Timestamp crtime) {
    this.crtime = crtime;
  }

  @Basic
  @Column(name = "CRUSER")
  public String getCruser() {
    return cruser;
  }

  public void setCruser(String cruser) {
    this.cruser = cruser;
  }

  @Basic
  @Column(name = "OPERTIME")
  public Timestamp getOpertime() {
    return opertime;
  }

  public void setOpertime(Timestamp opertime) {
    this.opertime = opertime;
  }

  @Basic
  @Column(name = "OPERUSER")
  public String getOperuser() {
    return operuser;
  }

  public void setOperuser(String operuser) {
    this.operuser = operuser;
  }

  @Basic
  @Column(name = "CLEARINGMEMBERID")
  public String getClearingmemberid() {
    return clearingmemberid;
  }

  public void setClearingmemberid(String clearingmemberid) {
    this.clearingmemberid = clearingmemberid;
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
  @Column(name = "MEMBERID")
  public String getMemberid() {
    return memberid;
  }

  public void setMemberid(String memberid) {
    this.memberid = memberid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Irsmember irsmember = (Irsmember) o;

    if (abbr != null ? !abbr.equals(irsmember.abbr) : irsmember.abbr != null) return false;
    if (account != null ? !account.equals(irsmember.account) : irsmember.account != null) return false;
    if (clearingmemberid != null ? !clearingmemberid.equals(irsmember.clearingmemberid) : irsmember.clearingmemberid != null) return false;
    if (createdate != null ? !createdate.equals(irsmember.createdate) : irsmember.createdate != null) return false;
    if (creator != null ? !creator.equals(irsmember.creator) : irsmember.creator != null) return false;
    if (crtime != null ? !crtime.equals(irsmember.crtime) : irsmember.crtime != null) return false;
    if (cruser != null ? !cruser.equals(irsmember.cruser) : irsmember.cruser != null) return false;
    if (id != null ? !id.equals(irsmember.id) : irsmember.id != null) return false;
    if (isdel != null ? !isdel.equals(irsmember.isdel) : irsmember.isdel != null) return false;
    if (lastmodifier != null ? !lastmodifier.equals(irsmember.lastmodifier) : irsmember.lastmodifier != null) return false;
    if (lastmodifydate != null ? !lastmodifydate.equals(irsmember.lastmodifydate) : irsmember.lastmodifydate != null) return false;
    if (memberid != null ? !memberid.equals(irsmember.memberid) : irsmember.memberid != null) return false;
    if (opertime != null ? !opertime.equals(irsmember.opertime) : irsmember.opertime != null) return false;
    if (operuser != null ? !operuser.equals(irsmember.operuser) : irsmember.operuser != null) return false;
    if (type != null ? !type.equals(irsmember.type) : irsmember.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = type != null ? type.hashCode() : 0;
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (abbr != null ? abbr.hashCode() : 0);
    result = 31 * result + (account != null ? account.hashCode() : 0);
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (cruser != null ? cruser.hashCode() : 0);
    result = 31 * result + (opertime != null ? opertime.hashCode() : 0);
    result = 31 * result + (operuser != null ? operuser.hashCode() : 0);
    result = 31 * result + (clearingmemberid != null ? clearingmemberid.hashCode() : 0);
    result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
    result = 31 * result + (creator != null ? creator.hashCode() : 0);
    result = 31 * result + (isdel != null ? isdel.hashCode() : 0);
    result = 31 * result + (lastmodifier != null ? lastmodifier.hashCode() : 0);
    result = 31 * result + (lastmodifydate != null ? lastmodifydate.hashCode() : 0);
    result = 31 * result + (memberid != null ? memberid.hashCode() : 0);
    return result;
  }

  @ManyToOne
  @JoinColumn(name = "CLEARINGMEMBERID", referencedColumnName = "ID")
  public Irsmember getIrsmemberByClearingmemberid() {
    return irsmemberByClearingmemberid;
  }

  public void setIrsmemberByClearingmemberid(Irsmember irsmemberByClearingmemberid) {
    this.irsmemberByClearingmemberid = irsmemberByClearingmemberid;
  }

  @OneToMany(mappedBy = "irsmemberByClearingmemberid")
  public Collection<Irsmember> getIrsmembersById() {
    return irsmembersById;
  }

  public void setIrsmembersById(Collection<Irsmember> irsmembersById) {
    this.irsmembersById = irsmembersById;
  }

  @ManyToOne
  @JoinColumn(name = "MEMBERID", referencedColumnName = "ID")
  public Irsmember getIrsmemberByMemberid() {
    return irsmemberByMemberid;
  }

  public void setIrsmemberByMemberid(Irsmember irsmemberByMemberid) {
    this.irsmemberByMemberid = irsmemberByMemberid;
  }

  @OneToMany(mappedBy = "irsmemberByMemberid")
  public Collection<Irsmember> getIrsmembersById_0() {
    return irsmembersById_0;
  }

  public void setIrsmembersById_0(Collection<Irsmember> irsmembersById_0) {
    this.irsmembersById_0 = irsmembersById_0;
  }
}

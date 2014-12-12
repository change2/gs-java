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
public class Troleapply {


  private String id;
  private Timestamp createdate;
  private String creator;
  private BigInteger isdel;
  private String lastmodifier;
  private Timestamp lastmodifydate;
  private String comments;
  private BigInteger sendemail;
  private BigInteger sendsms;
  private Integer status;
  private String roleId;
  private String userId;
  private Texchangeroleapply texchangeroleapplyById;
  private Tirsroleapply tirsroleapplyById;
  private Tnetuser tnetuserByUserId;
  private Trole troleByRoleId;
  private Collection<TroleapplyLog> troleapplyLogsById;

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
  @Column(name = "COMMENTS")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  @Basic
  @Column(name = "SENDEMAIL")
  public BigInteger getSendemail() {
    return sendemail;
  }

  public void setSendemail(BigInteger sendemail) {
    this.sendemail = sendemail;
  }

  @Basic
  @Column(name = "SENDSMS")
  public BigInteger getSendsms() {
    return sendsms;
  }

  public void setSendsms(BigInteger sendsms) {
    this.sendsms = sendsms;
  }

  @Basic
  @Column(name = "STATUS")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @Basic
  @Column(name = "ROLE_ID")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  @Basic
  @Column(name = "USER_ID")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Troleapply that = (Troleapply) o;

    if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
    if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
    if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (isdel != null ? !isdel.equals(that.isdel) : that.isdel != null) return false;
    if (lastmodifier != null ? !lastmodifier.equals(that.lastmodifier) : that.lastmodifier != null) return false;
    if (lastmodifydate != null ? !lastmodifydate.equals(that.lastmodifydate) : that.lastmodifydate != null) return false;
    if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
    if (sendemail != null ? !sendemail.equals(that.sendemail) : that.sendemail != null) return false;
    if (sendsms != null ? !sendsms.equals(that.sendsms) : that.sendsms != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

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
    result = 31 * result + (comments != null ? comments.hashCode() : 0);
    result = 31 * result + (sendemail != null ? sendemail.hashCode() : 0);
    result = 31 * result + (sendsms != null ? sendsms.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
    result = 31 * result + (userId != null ? userId.hashCode() : 0);
    return result;
  }

  @OneToOne(mappedBy = "troleapplyById")
  public Texchangeroleapply getTexchangeroleapplyById() {
    return texchangeroleapplyById;
  }

  public void setTexchangeroleapplyById(Texchangeroleapply texchangeroleapplyById) {
    this.texchangeroleapplyById = texchangeroleapplyById;
  }

  @OneToOne(mappedBy = "troleapplyById")
  public Tirsroleapply getTirsroleapplyById() {
    return tirsroleapplyById;
  }

  public void setTirsroleapplyById(Tirsroleapply tirsroleapplyById) {
    this.tirsroleapplyById = tirsroleapplyById;
  }

  @ManyToOne
  @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
  public Tnetuser getTnetuserByUserId() {
    return tnetuserByUserId;
  }

  public void setTnetuserByUserId(Tnetuser tnetuserByUserId) {
    this.tnetuserByUserId = tnetuserByUserId;
  }

  @ManyToOne
  @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
  public Trole getTroleByRoleId() {
    return troleByRoleId;
  }

  public void setTroleByRoleId(Trole troleByRoleId) {
    this.troleByRoleId = troleByRoleId;
  }

  @OneToMany(mappedBy = "troleapplyByApplyId")
  public Collection<TroleapplyLog> getTroleapplyLogsById() {
    return troleapplyLogsById;
  }

  public void setTroleapplyLogsById(Collection<TroleapplyLog> troleapplyLogsById) {
    this.troleapplyLogsById = troleapplyLogsById;
  }
}

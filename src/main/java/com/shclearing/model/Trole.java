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
public class Trole {


  private String type;
  private String id;
  private Timestamp createdate;
  private String creator;
  private BigInteger isdel;
  private String lastmodifier;
  private Timestamp lastmodifydate;
  private String roledesc;
  private String rolename;
  private String parentId;
  private String model;
  private Collection<TadminuserTrole> tadminuserTrolesById;
  private Collection<TnetuserTrole> tnetuserTrolesById;
  private Trole troleByParentId;
  private Collection<Trole> trolesById;
  private Collection<Troleapply> troleappliesById;
  private Collection<TroleTresource> troleTresourcesById;

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
  @Column(name = "ROLEDESC")
  public String getRoledesc() {
    return roledesc;
  }

  public void setRoledesc(String roledesc) {
    this.roledesc = roledesc;
  }

  @Basic
  @Column(name = "ROLENAME")
  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

  @Basic
  @Column(name = "PARENT_ID")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Basic
  @Column(name = "MODEL")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Trole trole = (Trole) o;

    if (createdate != null ? !createdate.equals(trole.createdate) : trole.createdate != null) return false;
    if (creator != null ? !creator.equals(trole.creator) : trole.creator != null) return false;
    if (id != null ? !id.equals(trole.id) : trole.id != null) return false;
    if (isdel != null ? !isdel.equals(trole.isdel) : trole.isdel != null) return false;
    if (lastmodifier != null ? !lastmodifier.equals(trole.lastmodifier) : trole.lastmodifier != null) return false;
    if (lastmodifydate != null ? !lastmodifydate.equals(trole.lastmodifydate) : trole.lastmodifydate != null) return false;
    if (model != null ? !model.equals(trole.model) : trole.model != null) return false;
    if (parentId != null ? !parentId.equals(trole.parentId) : trole.parentId != null) return false;
    if (roledesc != null ? !roledesc.equals(trole.roledesc) : trole.roledesc != null) return false;
    if (rolename != null ? !rolename.equals(trole.rolename) : trole.rolename != null) return false;
    if (type != null ? !type.equals(trole.type) : trole.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = type != null ? type.hashCode() : 0;
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
    result = 31 * result + (creator != null ? creator.hashCode() : 0);
    result = 31 * result + (isdel != null ? isdel.hashCode() : 0);
    result = 31 * result + (lastmodifier != null ? lastmodifier.hashCode() : 0);
    result = 31 * result + (lastmodifydate != null ? lastmodifydate.hashCode() : 0);
    result = 31 * result + (roledesc != null ? roledesc.hashCode() : 0);
    result = 31 * result + (rolename != null ? rolename.hashCode() : 0);
    result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
    result = 31 * result + (model != null ? model.hashCode() : 0);
    return result;
  }

  @OneToMany(mappedBy = "troleByRolesId")
  public Collection<TadminuserTrole> getTadminuserTrolesById() {
    return tadminuserTrolesById;
  }

  public void setTadminuserTrolesById(Collection<TadminuserTrole> tadminuserTrolesById) {
    this.tadminuserTrolesById = tadminuserTrolesById;
  }

  @OneToMany(mappedBy = "troleByRolesId")
  public Collection<TnetuserTrole> getTnetuserTrolesById() {
    return tnetuserTrolesById;
  }

  public void setTnetuserTrolesById(Collection<TnetuserTrole> tnetuserTrolesById) {
    this.tnetuserTrolesById = tnetuserTrolesById;
  }

  @ManyToOne
  @JoinColumn(name = "PARENT_ID", referencedColumnName = "ID")
  public Trole getTroleByParentId() {
    return troleByParentId;
  }

  public void setTroleByParentId(Trole troleByParentId) {
    this.troleByParentId = troleByParentId;
  }

  @OneToMany(mappedBy = "troleByParentId")
  public Collection<Trole> getTrolesById() {
    return trolesById;
  }

  public void setTrolesById(Collection<Trole> trolesById) {
    this.trolesById = trolesById;
  }

  @OneToMany(mappedBy = "troleByRoleId")
  public Collection<Troleapply> getTroleappliesById() {
    return troleappliesById;
  }

  public void setTroleappliesById(Collection<Troleapply> troleappliesById) {
    this.troleappliesById = troleappliesById;
  }

  @OneToMany(mappedBy = "troleByRolesId")
  public Collection<TroleTresource> getTroleTresourcesById() {
    return troleTresourcesById;
  }

  public void setTroleTresourcesById(Collection<TroleTresource> troleTresourcesById) {
    this.troleTresourcesById = troleTresourcesById;
  }
}

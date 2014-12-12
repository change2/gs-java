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
public class Tresource {


  private String type;
  private String id;
  private Timestamp createdate;
  private String creator;
  private BigInteger isdel;
  private String lastmodifier;
  private Timestamp lastmodifydate;
  private String accessurl;
  private String code;
  private String description;
  private String ename;
  private String name;
  private String parentId;
  private String iconclass;
  private Tresource tresourceByParentId;
  private Collection<Tresource> tresourcesById;
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
  @Column(name = "ACCESSURL")
  public String getAccessurl() {
    return accessurl;
  }

  public void setAccessurl(String accessurl) {
    this.accessurl = accessurl;
  }

  @Basic
  @Column(name = "CODE")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Basic
  @Column(name = "DESCRIPTION")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Basic
  @Column(name = "ENAME")
  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
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
  @Column(name = "PARENT_ID")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Basic
  @Column(name = "ICONCLASS")
  public String getIconclass() {
    return iconclass;
  }

  public void setIconclass(String iconclass) {
    this.iconclass = iconclass;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Tresource tresource = (Tresource) o;

    if (accessurl != null ? !accessurl.equals(tresource.accessurl) : tresource.accessurl != null) return false;
    if (code != null ? !code.equals(tresource.code) : tresource.code != null) return false;
    if (createdate != null ? !createdate.equals(tresource.createdate) : tresource.createdate != null) return false;
    if (creator != null ? !creator.equals(tresource.creator) : tresource.creator != null) return false;
    if (description != null ? !description.equals(tresource.description) : tresource.description != null) return false;
    if (ename != null ? !ename.equals(tresource.ename) : tresource.ename != null) return false;
    if (iconclass != null ? !iconclass.equals(tresource.iconclass) : tresource.iconclass != null) return false;
    if (id != null ? !id.equals(tresource.id) : tresource.id != null) return false;
    if (isdel != null ? !isdel.equals(tresource.isdel) : tresource.isdel != null) return false;
    if (lastmodifier != null ? !lastmodifier.equals(tresource.lastmodifier) : tresource.lastmodifier != null) return false;
    if (lastmodifydate != null ? !lastmodifydate.equals(tresource.lastmodifydate) : tresource.lastmodifydate != null) return false;
    if (name != null ? !name.equals(tresource.name) : tresource.name != null) return false;
    if (parentId != null ? !parentId.equals(tresource.parentId) : tresource.parentId != null) return false;
    if (type != null ? !type.equals(tresource.type) : tresource.type != null) return false;

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
    result = 31 * result + (accessurl != null ? accessurl.hashCode() : 0);
    result = 31 * result + (code != null ? code.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (ename != null ? ename.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
    result = 31 * result + (iconclass != null ? iconclass.hashCode() : 0);
    return result;
  }

  @ManyToOne
  @JoinColumn(name = "PARENT_ID", referencedColumnName = "ID")
  public Tresource getTresourceByParentId() {
    return tresourceByParentId;
  }

  public void setTresourceByParentId(Tresource tresourceByParentId) {
    this.tresourceByParentId = tresourceByParentId;
  }

  @OneToMany(mappedBy = "tresourceByParentId")
  public Collection<Tresource> getTresourcesById() {
    return tresourcesById;
  }

  public void setTresourcesById(Collection<Tresource> tresourcesById) {
    this.tresourcesById = tresourcesById;
  }

  @OneToMany(mappedBy = "tresourceByResourcesId")
  public Collection<TroleTresource> getTroleTresourcesById() {
    return troleTresourcesById;
  }

  public void setTroleTresourcesById(Collection<TroleTresource> troleTresourcesById) {
    this.troleTresourcesById = troleTresourcesById;
  }
}

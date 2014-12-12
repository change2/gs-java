package com.shclearing.model;

import javax.persistence.*;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
@Table(name = "TROLE_TRESOURCE", schema = "SHCHNM", catalog = "")
@IdClass(TroleTresourcePK.class)
public class TroleTresource {


  private String rolesId;
  private String resourcesId;
  private Tresource tresourceByResourcesId;
  private Trole troleByRolesId;

  @Id
  @Column(name = "ROLES_ID")
  public String getRolesId() {
    return rolesId;
  }

  public void setRolesId(String rolesId) {
    this.rolesId = rolesId;
  }

  @Id
  @Column(name = "RESOURCES_ID")
  public String getResourcesId() {
    return resourcesId;
  }

  public void setResourcesId(String resourcesId) {
    this.resourcesId = resourcesId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TroleTresource that = (TroleTresource) o;

    if (resourcesId != null ? !resourcesId.equals(that.resourcesId) : that.resourcesId != null) return false;
    if (rolesId != null ? !rolesId.equals(that.rolesId) : that.rolesId != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = rolesId != null ? rolesId.hashCode() : 0;
    result = 31 * result + (resourcesId != null ? resourcesId.hashCode() : 0);
    return result;
  }

  @ManyToOne
  @JoinColumn(name = "RESOURCES_ID", referencedColumnName = "ID", nullable = false)
  public Tresource getTresourceByResourcesId() {
    return tresourceByResourcesId;
  }

  public void setTresourceByResourcesId(Tresource tresourceByResourcesId) {
    this.tresourceByResourcesId = tresourceByResourcesId;
  }

  @ManyToOne
  @JoinColumn(name = "ROLES_ID", referencedColumnName = "ID", nullable = false)
  public Trole getTroleByRolesId() {
    return troleByRolesId;
  }

  public void setTroleByRolesId(Trole troleByRolesId) {
    this.troleByRolesId = troleByRolesId;
  }
}

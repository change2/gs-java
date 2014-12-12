package com.shclearing.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
public class TroleTresourcePK implements Serializable {


  private String rolesId;
  private String resourcesId;

  @Column(name = "ROLES_ID")
  @Id
  public String getRolesId() {
    return rolesId;
  }

  public void setRolesId(String rolesId) {
    this.rolesId = rolesId;
  }

  @Column(name = "RESOURCES_ID")
  @Id
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

    TroleTresourcePK that = (TroleTresourcePK) o;

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
}

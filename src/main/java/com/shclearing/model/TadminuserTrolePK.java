package com.shclearing.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
public class TadminuserTrolePK implements Serializable {


  private String usersId;
  private String rolesId;

  @Column(name = "USERS_ID")
  @Id
  public String getUsersId() {
    return usersId;
  }

  public void setUsersId(String usersId) {
    this.usersId = usersId;
  }

  @Column(name = "ROLES_ID")
  @Id
  public String getRolesId() {
    return rolesId;
  }

  public void setRolesId(String rolesId) {
    this.rolesId = rolesId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TadminuserTrolePK that = (TadminuserTrolePK) o;

    if (rolesId != null ? !rolesId.equals(that.rolesId) : that.rolesId != null) return false;
    if (usersId != null ? !usersId.equals(that.usersId) : that.usersId != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = usersId != null ? usersId.hashCode() : 0;
    result = 31 * result + (rolesId != null ? rolesId.hashCode() : 0);
    return result;
  }
}

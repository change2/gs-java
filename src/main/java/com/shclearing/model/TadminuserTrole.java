package com.shclearing.model;

import javax.persistence.*;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
@Table(name = "TADMINUSER_TROLE", schema = "SHCHNM", catalog = "")
@IdClass(TadminuserTrolePK.class)
public class TadminuserTrole {


  private String usersId;
  private String rolesId;
  private Tadminuser tadminuserByUsersId;
  private Trole troleByRolesId;

  @Id
  @Column(name = "USERS_ID")
  public String getUsersId() {
    return usersId;
  }

  public void setUsersId(String usersId) {
    this.usersId = usersId;
  }

  @Id
  @Column(name = "ROLES_ID")
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

    TadminuserTrole that = (TadminuserTrole) o;

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

  @ManyToOne
  @JoinColumn(name = "USERS_ID", referencedColumnName = "ID", nullable = false)
  public Tadminuser getTadminuserByUsersId() {
    return tadminuserByUsersId;
  }

  public void setTadminuserByUsersId(Tadminuser tadminuserByUsersId) {
    this.tadminuserByUsersId = tadminuserByUsersId;
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

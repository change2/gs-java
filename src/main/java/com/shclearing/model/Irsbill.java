package com.shclearing.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
public class Irsbill {


  private String id;
  private String account;
  private Timestamp crtime;
  private String cruser;
  private Timestamp filedate;
  private String filepath;
  private String importlogid;
  private String memberabbr;
  private String name;
  private String type;
  private String abbr;

  @Id
  @Column(name = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
  @Column(name = "FILEDATE")
  public Timestamp getFiledate() {
    return filedate;
  }

  public void setFiledate(Timestamp filedate) {
    this.filedate = filedate;
  }

  @Basic
  @Column(name = "FILEPATH")
  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  @Basic
  @Column(name = "IMPORTLOGID")
  public String getImportlogid() {
    return importlogid;
  }

  public void setImportlogid(String importlogid) {
    this.importlogid = importlogid;
  }

  @Basic
  @Column(name = "MEMBERABBR")
  public String getMemberabbr() {
    return memberabbr;
  }

  public void setMemberabbr(String memberabbr) {
    this.memberabbr = memberabbr;
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
  @Column(name = "TYPE")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Basic
  @Column(name = "ABBR")
  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Irsbill irsbill = (Irsbill) o;

    if (abbr != null ? !abbr.equals(irsbill.abbr) : irsbill.abbr != null) return false;
    if (account != null ? !account.equals(irsbill.account) : irsbill.account != null) return false;
    if (crtime != null ? !crtime.equals(irsbill.crtime) : irsbill.crtime != null) return false;
    if (cruser != null ? !cruser.equals(irsbill.cruser) : irsbill.cruser != null) return false;
    if (filedate != null ? !filedate.equals(irsbill.filedate) : irsbill.filedate != null) return false;
    if (filepath != null ? !filepath.equals(irsbill.filepath) : irsbill.filepath != null) return false;
    if (id != null ? !id.equals(irsbill.id) : irsbill.id != null) return false;
    if (importlogid != null ? !importlogid.equals(irsbill.importlogid) : irsbill.importlogid != null) return false;
    if (memberabbr != null ? !memberabbr.equals(irsbill.memberabbr) : irsbill.memberabbr != null) return false;
    if (name != null ? !name.equals(irsbill.name) : irsbill.name != null) return false;
    if (type != null ? !type.equals(irsbill.type) : irsbill.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (account != null ? account.hashCode() : 0);
    result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
    result = 31 * result + (cruser != null ? cruser.hashCode() : 0);
    result = 31 * result + (filedate != null ? filedate.hashCode() : 0);
    result = 31 * result + (filepath != null ? filepath.hashCode() : 0);
    result = 31 * result + (importlogid != null ? importlogid.hashCode() : 0);
    result = 31 * result + (memberabbr != null ? memberabbr.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (abbr != null ? abbr.hashCode() : 0);
    return result;
  }
}

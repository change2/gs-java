package com.shclearing.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
public class Importdatalog {


  private String module;
  private String id;
  private String datadate;
  private String datafilename;
  private String datasource;
  private Date opercompletetime;
  private Date opertime;
  private String resultdesc;
  private Integer signfilemodifytime;
  private String signfilename;
  private String type;
  private String operuser;
  private String errfilepath;
  private Integer failnum;
  private Integer successnum;

  @Basic
  @Column(name = "MODULE")
  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
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
  @Column(name = "DATADATE")
  public String getDatadate() {
    return datadate;
  }

  public void setDatadate(String datadate) {
    this.datadate = datadate;
  }

  @Basic
  @Column(name = "DATAFILENAME")
  public String getDatafilename() {
    return datafilename;
  }

  public void setDatafilename(String datafilename) {
    this.datafilename = datafilename;
  }

  @Basic
  @Column(name = "DATASOURCE")
  public String getDatasource() {
    return datasource;
  }

  public void setDatasource(String datasource) {
    this.datasource = datasource;
  }

  @Basic
  @Column(name = "OPERCOMPLETETIME")
  public Date getOpercompletetime() {
    return opercompletetime;
  }

  public void setOpercompletetime(Date opercompletetime) {
    this.opercompletetime = opercompletetime;
  }

  @Basic
  @Column(name = "OPERTIME")
  public Date getOpertime() {
    return opertime;
  }

  public void setOpertime(Date opertime) {
    this.opertime = opertime;
  }

  @Basic
  @Column(name = "RESULTDESC")
  public String getResultdesc() {
    return resultdesc;
  }

  public void setResultdesc(String resultdesc) {
    this.resultdesc = resultdesc;
  }

  @Basic
  @Column(name = "SIGNFILEMODIFYTIME")
  public Integer getSignfilemodifytime() {
    return signfilemodifytime;
  }

  public void setSignfilemodifytime(Integer signfilemodifytime) {
    this.signfilemodifytime = signfilemodifytime;
  }

  @Basic
  @Column(name = "SIGNFILENAME")
  public String getSignfilename() {
    return signfilename;
  }

  public void setSignfilename(String signfilename) {
    this.signfilename = signfilename;
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
  @Column(name = "OPERUSER")
  public String getOperuser() {
    return operuser;
  }

  public void setOperuser(String operuser) {
    this.operuser = operuser;
  }

  @Basic
  @Column(name = "ERRFILEPATH")
  public String getErrfilepath() {
    return errfilepath;
  }

  public void setErrfilepath(String errfilepath) {
    this.errfilepath = errfilepath;
  }

  @Basic
  @Column(name = "FAILNUM")
  public Integer getFailnum() {
    return failnum;
  }

  public void setFailnum(Integer failnum) {
    this.failnum = failnum;
  }

  @Basic
  @Column(name = "SUCCESSNUM")
  public Integer getSuccessnum() {
    return successnum;
  }

  public void setSuccessnum(Integer successnum) {
    this.successnum = successnum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Importdatalog that = (Importdatalog) o;

    if (datadate != null ? !datadate.equals(that.datadate) : that.datadate != null) return false;
    if (datafilename != null ? !datafilename.equals(that.datafilename) : that.datafilename != null) return false;
    if (datasource != null ? !datasource.equals(that.datasource) : that.datasource != null) return false;
    if (errfilepath != null ? !errfilepath.equals(that.errfilepath) : that.errfilepath != null) return false;
    if (failnum != null ? !failnum.equals(that.failnum) : that.failnum != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (module != null ? !module.equals(that.module) : that.module != null) return false;
    if (opercompletetime != null ? !opercompletetime.equals(that.opercompletetime) : that.opercompletetime != null) return false;
    if (opertime != null ? !opertime.equals(that.opertime) : that.opertime != null) return false;
    if (operuser != null ? !operuser.equals(that.operuser) : that.operuser != null) return false;
    if (resultdesc != null ? !resultdesc.equals(that.resultdesc) : that.resultdesc != null) return false;
    if (signfilemodifytime != null ? !signfilemodifytime.equals(that.signfilemodifytime) : that.signfilemodifytime != null) return false;
    if (signfilename != null ? !signfilename.equals(that.signfilename) : that.signfilename != null) return false;
    if (successnum != null ? !successnum.equals(that.successnum) : that.successnum != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = module != null ? module.hashCode() : 0;
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (datadate != null ? datadate.hashCode() : 0);
    result = 31 * result + (datafilename != null ? datafilename.hashCode() : 0);
    result = 31 * result + (datasource != null ? datasource.hashCode() : 0);
    result = 31 * result + (opercompletetime != null ? opercompletetime.hashCode() : 0);
    result = 31 * result + (opertime != null ? opertime.hashCode() : 0);
    result = 31 * result + (resultdesc != null ? resultdesc.hashCode() : 0);
    result = 31 * result + (signfilemodifytime != null ? signfilemodifytime.hashCode() : 0);
    result = 31 * result + (signfilename != null ? signfilename.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (operuser != null ? operuser.hashCode() : 0);
    result = 31 * result + (errfilepath != null ? errfilepath.hashCode() : 0);
    result = 31 * result + (failnum != null ? failnum.hashCode() : 0);
    result = 31 * result + (successnum != null ? successnum.hashCode() : 0);
    return result;
  }
}

package com.shclearing.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: changejava
 * Date: 2014/12/1
 * Time: 10:04
 */
@Entity
@Table(name = "TROLEAPPLY_LOG", schema = "SHCHNM", catalog = "")
public class TroleapplyLog {


  private String id;
  private Timestamp opertime;
  private String opertype;
  private String operator;
  private String applyId;
  private Troleapply troleapplyByApplyId;

  @Id
  @Column(name = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
  @Column(name = "OPERTYPE")
  public String getOpertype() {
    return opertype;
  }

  public void setOpertype(String opertype) {
    this.opertype = opertype;
  }

  @Basic
  @Column(name = "OPERATOR")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  @Basic
  @Column(name = "APPLY_ID")
  public String getApplyId() {
    return applyId;
  }

  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TroleapplyLog that = (TroleapplyLog) o;

    if (applyId != null ? !applyId.equals(that.applyId) : that.applyId != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
    if (opertime != null ? !opertime.equals(that.opertime) : that.opertime != null) return false;
    if (opertype != null ? !opertype.equals(that.opertype) : that.opertype != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (opertime != null ? opertime.hashCode() : 0);
    result = 31 * result + (opertype != null ? opertype.hashCode() : 0);
    result = 31 * result + (operator != null ? operator.hashCode() : 0);
    result = 31 * result + (applyId != null ? applyId.hashCode() : 0);
    return result;
  }

  @ManyToOne
  @JoinColumn(name = "APPLY_ID", referencedColumnName = "ID")
  public Troleapply getTroleapplyByApplyId() {
    return troleapplyByApplyId;
  }

  public void setTroleapplyByApplyId(Troleapply troleapplyByApplyId) {
    this.troleapplyByApplyId = troleapplyByApplyId;
  }
}

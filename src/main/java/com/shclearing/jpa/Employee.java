package com.shclearing.jpa;

import javax.persistence.*;

/**
 * User: changejava
 * Date: 2015/2/12
 * Time: 14:28
 */
@Entity
public class Employee {


  @Id
  @Column(name = "employee_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long employeeId;

  @Column(name = "employee_name")
  private String employeeName;

  public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Employee{");
    sb.append("employeeId=").append(employeeId);
    sb.append(", employeeName='").append(employeeName).append('\'');
    sb.append('}');
    return sb.toString();
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

}

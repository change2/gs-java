package com.shclearing.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;


/**
 * User: changejava
 * Date: 2015/1/5
 * Time: 22:25
 */
@Entity
public class Person {
  @Id
  private Long id;

  @Pattern(regexp = "[A-Za-z0-9]{5,20}", message = "{username.illegal}")
  @NotEmpty
  private String name;


  private String description;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (description != null ? !description.equals(person.description) : person.description != null) return false;
    if (id != null ? !id.equals(person.id) : person.id != null) return false;
    return !(name != null ? !name.equals(person.name) : person.name != null);

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      '}';
  }
}

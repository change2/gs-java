package com.shclearing.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * User: changejava
 * Date: 2015/2/12
 * Time: 14:26
 */
public class JPADemo {


  public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPU");
    EntityManager em = factory.createEntityManager();

    Query query = em.createNativeQuery("Select employee_id, employee_name from employee", Employee.class);
    List list = query.getResultList();
    System.out.println(list);
    System.exit(0);

  }
}

package com.shclearing.distributed.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.RemoteException;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:07
 */
public class SpringRmiServer {


  public static void main(String[] args) throws RemoteException {
    ApplicationContext fxa = new ClassPathXmlApplicationContext("rmi/application-rmi.xml");
    System.out.println("Server has been started!");
  }
}

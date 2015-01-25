package com.shclearing.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: changejava
 * Date: 2015/1/17
 * Time: 19:56
 */
public class SpringInit {


  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    PropertyPlaceholderConfigurer propertyPlaceHolder = (PropertyPlaceholderConfigurer) context.getBean("configurer");
  }
}

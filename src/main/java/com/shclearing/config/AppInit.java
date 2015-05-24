package com.shclearing.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Properties;

/**
 * User: changejava
 * Date: 2015/1/17
 * Time: 18:06
 */
public class AppInit {


  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Properties props = (Properties) context.getBean("props");
    props.list(System.out);

  }

}

package com.shclearing.aop.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: changejava
 * Date: 2015/5/31
 * Time: 0:16
 */
public class AopTest {


  public static void main(String[] args) {

    ClassPathXmlApplicationContext cax = new ClassPathXmlApplicationContext(new String[]{"application-annotation.xml"});
    AopService aopPorxyBean = cax.getBean(AopService.class);
    aopPorxyBean.func("changejava");
  }
}

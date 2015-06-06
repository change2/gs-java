package com.shclearing.aop.xml;

import org.springframework.stereotype.Component;

/**
 * User: changejava
 * Date: 2015/5/30
 * Time: 23:56
 */
@Component
public class AopServiceImpl implements AopService {


  @Override
  public void func(String str) {
    System.err.println(str+"================");
  }
}

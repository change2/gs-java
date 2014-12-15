package com.shclearing.core;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * User: changejava
 * Date: 2014/12/12
 * Time: 16:29
 */
public class IntegerTest {


//  public String test(){
//    return null;
//  }
//
//  public Object test(){
//    return null;
//  }

  //  public String test(){}
  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

    Class<?> cache = Class.forName("java.lang.Integer$IntegerCache");
    Field field = cache.getDeclaredField("cache");
    field.setAccessible(true);
    Integer[] caches = (Integer[]) field.get(cache);
    for (int i = 0; i < caches.length; i++) {
      caches[i] = new Integer(new Random().nextInt(caches.length));
    }
    for (int i = 0; i < 10; i++) {
      System.out.println((Integer) i);
    }

    Object o1 = true ? new Integer(1) : new Double(2.01);
    System.out.println(o1);
    Object o2;
    if (true)
      o2 = new Integer(1);
    else
      o2 = new Double(2.0);
    System.out.println(o2);
    Integer i = new Integer(1);
    if (i.equals(1)) {
    }
    i = null;
    Double d = new Double(2.0);
    Object o = true ? i : d; // NullPointerException!
    System.out.println(o);
  }

}

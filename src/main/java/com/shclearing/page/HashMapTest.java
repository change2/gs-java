package com.shclearing.page;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * User: changejava
 * Date: 2015/2/13
 * Time: 10:21
 */
public class HashMapTest {


  public static void main(String[] args) {
    Map map = new HashMap();

    map.put(null, new Object());
    map.put(null, 111);

    CopyOnWriteArrayList list = new CopyOnWriteArrayList();

    CopyOnWriteArraySet set = new CopyOnWriteArraySet();
    set.add(1);


  }

}

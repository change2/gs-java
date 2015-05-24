package com.shclearing.distributed.java;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * User: changejava
 * Date: 2015/2/16
 * Time: 9:57
 */
public class ObjectCachePool<K, V> {

  public static final int FIFI_POLICY = 1;
  public static final int LRU_POLICY = 2;
  public static final int DEFAULT_SIZE = 10;

  public Map<K, V> cacheObjects;

  public ObjectCachePool() {
    this(DEFAULT_SIZE);
  }

  public ObjectCachePool(final int size) {
    this(size, FIFI_POLICY);
  }

  public ObjectCachePool(final int size, int policy) {
    switch (policy) {
      case FIFI_POLICY:
        cacheObjects = new LinkedHashMap<K, V>(size) {
          @Override
          protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > size;
          }
        };
        break;
      case LRU_POLICY:
        cacheObjects = new LinkedHashMap<K, V>(size) {
          @Override
          protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > size;
          }
        };
        break;
      default:
        throw new IllegalArgumentException("Unknown Policy");
    }
  }

  public void put(K key, V value) {
    cacheObjects.put(key, value);
  }

  public void remove(K key) {
    cacheObjects.remove(key);
  }

  public void clear() {
    cacheObjects.clear();
  }
}

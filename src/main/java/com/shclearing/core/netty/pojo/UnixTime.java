package com.shclearing.core.netty.pojo;

import java.util.Date;

/**
 * User: changejava
 * Date: 2015/1/6
 * Time: 10:30
 * 用POJO代替ByteBuf
 */
public class UnixTime {

  final int value;
  final String reserve;

  public UnixTime() {
    this((int) (System.currentTimeMillis() / 1000L), null);
  }

  public UnixTime(int value, String reserve) {
    this.value = value;
    this.reserve = reserve;
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    return new Date((getValue()) * 1000L).toString() + "========" + this.reserve;
  }

  public String getReserve() {
    return reserve;
  }
}

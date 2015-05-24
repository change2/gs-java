package com.shclearing.distributed.spring;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:05
 */
public interface BusinessService {

  public String echo(String message);

  public String upload(byte[] buffers);

}

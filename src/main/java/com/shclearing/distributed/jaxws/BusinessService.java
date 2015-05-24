package com.shclearing.distributed.jaxws;

import javax.jws.WebService;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:05
 */
@WebService
public interface BusinessService {

  public String echo(String message);

  public String upload(byte[] buffers);

}

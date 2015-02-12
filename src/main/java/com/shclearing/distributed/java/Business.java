package com.shclearing.distributed.java;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:05
 */
public interface Business extends Remote {

  public String echo(String message) throws RemoteException;

  public String upload(byte[] buffers) throws RemoteException;

}

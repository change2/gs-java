package com.shclearing.distributed.java;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:07
 */
public class RmiServer {


  public static void main(String[] args) throws RemoteException {
    int port = 9527;
    final String name = "Business";
    Business business = new BussinessImpl();
    UnicastRemoteObject.exportObject(business, port);
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.rebind(name, business);
  }
}

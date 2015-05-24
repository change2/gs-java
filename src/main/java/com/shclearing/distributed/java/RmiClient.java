package com.shclearing.distributed.java;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:11
 */
public class RmiClient {


  public static void main(String[] args) throws RemoteException, NotBoundException, IOException {
    Registry registry = LocateRegistry.getRegistry("localhost");
    final String name = "Business";
    Business business = (Business) registry.lookup(name);
    System.out.println(business.echo("change"));


    for (int i = 0; i < 1000; i++) {
      long start = System.currentTimeMillis();
      FileInputStream in = null;
      try {
        in = new FileInputStream(new File("D:\\work\\shclearing\\oracle\\trswcm2.sql"));
        business.upload(IOUtils.toByteArray(in));
        System.out.println((System.currentTimeMillis() - start));
      } finally {
        IOUtils.closeQuietly(in);
      }
    }
  }

}

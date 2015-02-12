package com.shclearing.distributed.spring;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:06
 */
public class BusinessServiceImpl implements BusinessService {


  @Override
  public String echo(String message) {
    if ("quit".equalsIgnoreCase(message)) {
      System.out.println("Server will be shutdown");
      System.exit(0);
    }
    return "Server Response " + message;
  }

  @Override
  public String upload(byte[] buffers) {
    final long name = System.nanoTime();
    FileOutputStream fis = null;
    ByteArrayInputStream bis = null;
    try {
      fis = FileUtils.openOutputStream(new File("d:/tmp", name + ""));
      bis = new ByteArrayInputStream(buffers);
      IOUtils.copyLarge(bis, fis);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      IOUtils.closeQuietly(bis);
      IOUtils.closeQuietly(fis);
      if (buffers == null) {
        buffers = null;
      }
    }
    return name + "";
  }


}

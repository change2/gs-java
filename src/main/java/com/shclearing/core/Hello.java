package com.shclearing.core;

import java.io.*;

/**
 * User: changejava
 * Date: 2014/11/14
 * Time: 14:49
 */
public class Hello {


  public static void main(String[] args) throws IOException {
    InputStream inputStream = new Hello().getClass().getResourceAsStream("/ws/1.txt");
    if (inputStream.available() > 0) {
      ByteArrayOutputStream bis = new ByteArrayOutputStream();
      byte[] bytes = new byte[1024];
      int len = 0;
      while ((len = inputStream.read(bytes)) > 0) {
        bis.write(bytes, 0, len);
      }
      bis.flush();
      bis.close();
      System.err.println(bis.toString());
    }
    inputStream.close();


    ClassLoader loader = Hello.class.getClassLoader();
    InputStream in = loader.getResourceAsStream(".");
    BufferedReader rdr = new BufferedReader(new InputStreamReader(in));
    String line;
    while ((line = rdr.readLine()) != null) {
      System.out.println("file: " + line);
    }
    rdr.close();
  }

  public String say() {
    return "Hello Gradle!" + gogo();
  }

  @Deprecated
  private String gogo() {
    return "Hello Demo";
  }
}

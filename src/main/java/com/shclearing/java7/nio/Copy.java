package com.shclearing.java7.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * User: changejava
 * Date: 2015/2/12
 * Time: 14:01
 */
public class Copy {


  public static void main(String[] args) {
    Path source = Paths.get("c:/tmp/log.log");
    Path target = Paths.get("c:/tmp/copy.log");

    try {
      Files.copy(source, target);
      Files.delete(source);

      Path target2 = Paths.get("c:/tmp1/move.log");

      Files.move(target, target2);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

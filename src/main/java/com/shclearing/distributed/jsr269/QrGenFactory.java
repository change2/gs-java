package com.shclearing.distributed.jsr269;

import lombok.Getter;
import lombok.Setter;
import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;
import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * User: changejava
 * Date: 2015/2/11
 * Time: 11:05
 */
public class QrGenFactory {
  public static final String AAA = "abcd1234";
  public static boolean debug = false;
  private
  @Getter
  @Setter
  String name;

  public static void main(String[] args) throws IOException {
    System.out.println(QrGenFactory.class.getClassLoader());
    ByteArrayOutputStream stream = QRCode.from("http://www.shclearing.com").to(ImageType.PNG).withSize(250, 250).stream();
    FileOutputStream fos = FileUtils.openOutputStream(new File("d:/tmp", "1.png"));
    fos.write(stream.toByteArray());
    fos.close();
    System.out.println(Arrays.asList(new String[]{"11"}));
    Point point = new Point(1, 3);
    System.out.println("point x:" + point.x + ",point y:" + point.y);

  }

  public void func() {
    if (debug) System.out.println("111");
  }

  static class Point {
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public void setX(int x) {
      this.x = x;
    }

    public int getY() {
      return y;
    }

    public void setY(int y) {
      this.y = y;
    }
  }

}

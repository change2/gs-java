package com.shclearing.core;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

public class DesUtil {
  public static void main(String[] args) throws Exception {
    String data = "abc0123456789dadad";
    String key = "12345678";
    System.out.println(encrypt(data, key));
  }

  /**
   * Description 根据键值进行加密
   *
   * @param data
   * @param key  加密键byte数组
   * @return
   * @throws Exception
   */
  public static String encrypt(String data, String key) throws Exception {
    byte[] bt = encrypt(data.getBytes(), key.getBytes());
    return bytesToHexString(bt).toUpperCase();
  }

  /**
   * @param src byte[] data
   * @return hex string
   */
  public static String bytesToHexString(byte[] src) {
    StringBuilder stringBuilder = new StringBuilder("");
    if (src == null || src.length <= 0) {
      return null;
    }
    for (int i = 0; i < src.length; i++) {
      int v = src[i] & 0xFF;
      String hv = Integer.toHexString(v);
      if (hv.length() < 2) {
        stringBuilder.append(0);
      }
      stringBuilder.append(hv);
    }
    return stringBuilder.toString();
  }

  /**
   * Description 根据键值进行加密
   *
   * @param data
   * @param key  加密键byte数组
   * @return
   * @throws Exception
   */
  private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
    // 生成一个可信任的随机数源
    SecureRandom sr = new SecureRandom();
    // 从原始密钥数据创建DESKeySpec对象
    DESKeySpec dks = new DESKeySpec(key);
    // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
    SecretKey securekey = keyFactory.generateSecret(dks);
    // Cipher对象实际完成加密操作
    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
    // 用密钥初始化Cipher对象
    cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

    //字节数组长度不足8的倍数补充到8的倍数
    int oldLen = data.length;
    int newLen = oldLen;
    if (oldLen % 8 != 0) {
      newLen = oldLen - oldLen % 8 + 8;
    }
    byte[] newData = new byte[newLen];
    System.arraycopy(data, 0, newData, 0, oldLen);
    for (int i = oldLen; i < newLen; i++)
      newData[i] = 0x00;
    return cipher.doFinal(newData);
  }
} 
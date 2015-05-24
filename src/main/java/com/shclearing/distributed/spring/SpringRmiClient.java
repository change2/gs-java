package com.shclearing.distributed.spring;

import org.apache.commons.io.IOUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileInputStream;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 15:07
 */
public class SpringRmiClient {


  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext cax = new ClassPathXmlApplicationContext("rmi/application-rmiclient.xml");
    final BusinessService businessService = (BusinessService) cax.getBean("businessService");
    for (int i = 0; i < 1000; i++) {
      long start = System.currentTimeMillis();
      FileInputStream in = null;
      try {
        in = new FileInputStream(new File("D:\\work\\shclearing\\oracle\\trswcm2.sql"));
        businessService.upload(IOUtils.toByteArray(in));
        System.out.println((System.currentTimeMillis() - start));
      } finally {
        IOUtils.closeQuietly(in);
      }
    }

  }
}

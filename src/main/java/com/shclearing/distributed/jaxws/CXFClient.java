package com.shclearing.distributed.jaxws;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.io.File;
import java.io.FileInputStream;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 16:36
 */
public class CXFClient {


  public static void main(String[] args) throws Exception {


    JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
    factoryBean.setServiceClass(BusinessService.class);
    factoryBean.setAddress("http://localhost:9000/BusinessService");
    factoryBean.getInInterceptors().add(new LoggingInInterceptor());
    factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
    BusinessService businessService = (BusinessService) factoryBean.create();
    System.out.println("Client started!!");

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

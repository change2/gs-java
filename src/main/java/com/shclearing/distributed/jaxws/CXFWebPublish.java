package com.shclearing.distributed.jaxws;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * User: changejava
 * Date: 2015/2/10
 * Time: 16:36
 */
public class CXFWebPublish {


  public static void main(String[] args) {

    BusinessServiceImpl implementor = new BusinessServiceImpl();
    JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean();
    svrFactory.setServiceClass(BusinessService.class);
    svrFactory.setAddress("http://localhost:9000/BusinessService");
    svrFactory.setServiceBean(implementor);
    svrFactory.getInInterceptors().add(new LoggingInInterceptor());
    svrFactory.getOutInterceptors().add(new LoggingOutInterceptor());
    svrFactory.create();
    System.out.println("Server started!!");
  }

}

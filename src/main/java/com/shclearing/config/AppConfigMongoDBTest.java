package com.shclearing.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * User: changejava
 * Date: 2015/2/12
 * Time: 15:39
 */
public class AppConfigMongoDBTest {


  public static void main(String[] args) {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(AppConfigMongoDB.class);
    ctx.refresh();

    MongoTemplate mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");

    System.out.println(mongoTemplate);
  }
}

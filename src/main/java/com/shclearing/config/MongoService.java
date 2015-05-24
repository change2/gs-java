package com.shclearing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.inject.Inject;

/**
 * User: changejava
 * Date: 2015/2/12
 * Time: 15:48
 */
@Configuration
@Import(value = AppConfig.class)
public class MongoService {


  private
  @Inject
  MongoTemplate mongoTemplate;


  public MongoTemplate getMongoTemplate() {
    return mongoTemplate;
  }

  public void setMongoTemplate(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }
}

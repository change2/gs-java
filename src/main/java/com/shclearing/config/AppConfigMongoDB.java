package com.shclearing.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * User: changejava
 * Date: 2015/2/12
 * Time: 15:26
 */
@Configuration
@ComponentScan(basePackages = {"com.shclearing.*"})
@PropertySource({
  "classpath:mongodb.properties",
  "classpath:jdbc.properties"
})
public class AppConfigMongoDB {


  //  @Value("${mongodb.url?:'127.0.0.1}") spring 4.0
  @Value("${mongodb.url:127.0.0.1}")//spring 3.0
  private String mongodbUrl;

  @Value("${mongodb.db?:testdb}")
  private String defaultDb;

  @Autowired
  private Environment env;

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean(name = "mongoTemplate")
  public MongoTemplate mongoTemplate() throws Exception {

    MongoClientOptions mongoOptions =
      new MongoClientOptions.Builder().maxWaitTime(1000 * 60 * 5).build();
    MongoClient mongo = new MongoClient(mongodbUrl, mongoOptions);
    MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongo, defaultDb);
    return new MongoTemplate(mongoDbFactory);
  }

}

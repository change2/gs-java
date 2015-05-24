package com.shclearing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * User: changejava
 * Date: 2015/1/17
 * Time: 18:05
 */
@Configuration
public class AppConfig {

  @Bean(name = "props")
  public Properties initProp() {
    Properties properties = new Properties();
    properties.setProperty("name", "change");
    return properties;
  }

}

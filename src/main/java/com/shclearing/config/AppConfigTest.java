package com.shclearing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.List;
import java.util.Properties;

/**
 * User: changejava
 * Date: 2015/1/17
 * Time: 18:05
 */
@Configuration
@PropertySource(value = "classpath:jdbc.properties")
public class AppConfigTest {

  @Value("#{'${server.name}'.split(',')}")
  private List<String> servers;

  @Value("#{'${server.id}'.split(',')}")
  private List<Integer> serverIds;

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(AppConfigTest.class);
    ctx.refresh();
    Properties properties = (Properties) ctx.getBean("AppConfigTest");

    properties.list(System.out);
  }

  @Bean(name = "AppConfigTest")
  public Properties initProp() {
    Properties properties = new Properties();
    properties.setProperty("name", "change");
    properties.setProperty("servers", servers + "");
    properties.setProperty("serverIds", serverIds + "");
    return properties;
  }
}

package com.shclearing.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: changejava
 * Date: 2014/11/27
 * Time: 17:10
 */
@Controller
@RequestMapping("/main")
public class MainController {

  Logger logger = LoggerFactory.getLogger(MainController.class);

  public MainController() {
    System.out.println("=========================");
  }

  @RequestMapping(value = "/test", method = RequestMethod.POST)
  public void main(HttpServletRequest request, HttpServletResponse response) {
    logger.info("logger:{}", request.getParameter("main"));
  }

}

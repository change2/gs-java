package com.shclearing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: changejava
 * Date: 2015/1/5
 * Time: 23:09
 */
@Controller
@RequestMapping("/welcome")
public class HelloCtrl {


  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {
    model.addAttribute("message", "Spring 3 MVC Hello World");
    return "hello";
  }

}

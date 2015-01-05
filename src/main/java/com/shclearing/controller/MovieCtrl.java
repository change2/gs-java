package com.shclearing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: changejava
 * Date: 2015/1/6
 * Time: 0:04
 */
@Controller
@RequestMapping("/movie")
public class MovieCtrl {

  public MovieCtrl() {
    System.out.println("=========================");
  }

  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  public String getMovie(@PathVariable String name, ModelMap modelMap) {
    modelMap.addAttribute("movie", name);
    return "list";
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getDefaultMovie(ModelMap model) {
    model.addAttribute("movie", "this is default movie");
    return "list";

  }
}

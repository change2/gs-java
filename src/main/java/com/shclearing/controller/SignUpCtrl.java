package com.shclearing.controller;

import com.shclearing.database.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * User: changejava
 * Date: 2015/1/6
 * Time: 0:39
 */
@Controller
@RequestMapping("/customer")
public class SignUpCtrl {

  @RequestMapping(value = "signup", method = RequestMethod.POST)
  public String addCustomer(@Valid @ModelAttribute Customer customer, BindingResult result) {
    if (result.hasErrors()) {
      return "SignUpForm";
    } else {
      return "Done";
    }
  }

  @RequestMapping(method = RequestMethod.GET)
  public String displayCustomerForm(ModelMap model) {
    model.addAttribute("customer", new Customer());
    return "SignUpForm";

  }

}

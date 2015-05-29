package com.shclearing.controller;

import com.shclearing.fk.HtmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: changejava
 * Date: 2015/5/26
 * Time: 1:15
 */
@Controller
@RequestMapping("/html")
public class HtmlController {
  @Autowired
  private HtmlService htmlService;

  @RequestMapping(value = "/create")
  @ResponseBody
  public ReturnBase all(HttpServletRequest request,
                        HttpServletResponse response) {
    ReturnBase returnStatus = new ReturnBase();
    String msg = request.getParameter("msg");
    System.out.println("*********msg***" + msg);
    try {
      this.htmlService.all(msg);
      returnStatus.setSuccess(true);
      returnStatus.setMsg("³É¹¦!");
    } catch (Exception e) {
      e.printStackTrace();
      returnStatus.setSuccess(false);
      returnStatus.setMsg(e.getMessage());
    }
    return returnStatus;

  }

}

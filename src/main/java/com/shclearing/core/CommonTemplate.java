package com.shclearing.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: changejava
 * Date: 2014/11/11
 * Time: 14:29
 */
@WebServlet(name = "CommonTemplate", urlPatterns = "/CommonTemplate")
public class CommonTemplate extends HttpServlet {
  private static final Logger LOGGER = LoggerFactory.getLogger(CommonTemplate.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    LOGGER.info("this is test {}, hello {}", 1, "gradle");
    List list = new ArrayList();
    LOGGER.info("list size {}", list.size());
    LOGGER.info("list size {}", list.size());
    resp.getWriter().write(new Hello().say());

  }
}

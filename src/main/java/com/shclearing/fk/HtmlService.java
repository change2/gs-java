package com.shclearing.fk;

import com.shclearing.model.Article;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * User: changejava
 * Date: 2015/5/26
 * Time: 1:14
 */
@Service("com.shclearing.fk.htmlService")
public class HtmlService {

  @Autowired
  private FreeMarkerConfigurer freemarkerConfigurer;

  public void all(String msg) throws Exception {
    Map<String, Article> rootMap = new HashMap<String, Article>();
    process("file.ftl", rootMap);
  }

  public void process(String templateName, Map<String, Article> rootMap)
    throws Exception {
    Configuration configuration = freemarkerConfigurer.getConfiguration();
    Template template = configuration.getTemplate(templateName);
    File file = new File("d:/file.html");
    Article article = new Article();
    article.setTitle("test" +  System.currentTimeMillis());
    article.setContent("<h1>haha1</h1>");
    rootMap.put("article", article);
    Writer out = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
    template.process(rootMap, out);
    IOUtils.closeQuietly(out);

  }
}

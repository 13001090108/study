package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

/*
要理解该程序清单是如何工作的。我们可能只需要知道扩展AbstractAnnotationConfigDispatcherServletInitializer
的人以类都会自动的配置DispatcherServlet和Spring应用上下文，Spring的应用上下文会位于应用程序的Servlet上下文之中。
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }

  //指定配置类
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  /*该方法会将一个或刀哥路径映射到DispatcherServlet上。在本例中，它映射的是"/"这表示他回溯应用的默认Servlet。

  将DispatcherServlet映射到"/"
   */
  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}
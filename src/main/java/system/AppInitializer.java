package system;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

    @Override  
    public void onStartup(ServletContext servletContext) throws ServletException {  
        AnnotationConfigWebApplicationContext webApplicationContext =  
                new AnnotationConfigWebApplicationContext();  
        webApplicationContext.register(AppConfig.class);  
        
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);  
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("SpringBaseDispatcher", dispatcherServlet);  
        dynamic.addMapping("/");  
        
        
         org.apache.catalina.servlets.DefaultServlet defaultServlet = new org.apache.catalina.servlets.DefaultServlet();
         ServletRegistration.Dynamic dynamic1 = servletContext.addServlet("default", defaultServlet);  
         dynamic1.addMapping("*.html");  
  
  
       
    }  
} 

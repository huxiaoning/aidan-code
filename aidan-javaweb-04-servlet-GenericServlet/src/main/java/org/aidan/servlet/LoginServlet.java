package org.aidan.servlet;


import javax.servlet.*;

/**
 * LoginServlet继承自GenericServlet,阅读其源码
 *
 * @author Aidan
 * @date 2016/10/31
 */
public class LoginServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) {
        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext = getServletContext();
        ServletContext servletContext1 = servletConfig.getServletContext();
        System.out.println(servletContext == servletContext1);
    }
}

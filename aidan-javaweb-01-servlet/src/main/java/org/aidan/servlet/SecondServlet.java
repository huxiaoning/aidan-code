package org.aidan.servlet;

import javax.servlet.*;
import java.io.IOException;

public class SecondServlet implements Servlet {

    public SecondServlet() {
        System.out.println("secondServlet构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("secondServlet init");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("secondServlet getServletConfig");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("secondServlet service");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletConfig getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("getServletConfig destroy");
    }
}

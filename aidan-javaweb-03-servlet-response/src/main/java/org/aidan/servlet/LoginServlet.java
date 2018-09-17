package org.aidan.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class LoginServlet implements Servlet {
    @Override
    public void init(ServletConfig config) {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) {
        int bufferSize = response.getBufferSize();
        System.out.println("bufferSize = " + bufferSize);
        response.setCharacterEncoding("UTF-8");
        String characterEncoding = response.getCharacterEncoding();
        System.out.println("characterEncoding = " + characterEncoding);
        String contentType = response.getContentType();
        System.out.println("contentType = " + contentType);
        Locale locale = response.getLocale();
        System.out.println("locale = " + locale);
        // E:\developerInstall\Tomcat\apache-tomcat-7.0.70\conf\web.xml里面查找word
        response.setContentType("application/msword");
        try {
            PrintWriter writer = response.getWriter();
            writer.println("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

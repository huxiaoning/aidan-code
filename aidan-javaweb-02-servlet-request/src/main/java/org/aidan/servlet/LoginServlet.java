package org.aidan.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.Principal;
import java.util.Enumeration;

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
        System.out.println("请求过来了!!!");
        // 1 获取参数
//        System.out.println("--------------获取请求参数----------------");
//        String user = request.getParameter("user");
//        System.out.println(user);
//        String password = request.getParameter("password");
//        System.out.println(password);
//        String[] interests = request.getParameterValues("interest");
//        for (String interest : interests) {
//            System.out.println(interest);
//        }
//        // 2 获取请求体编码方式
//        System.out.println("--------------获取请求体编码方式----------------");
//        String characterEncoding = request.getCharacterEncoding();
//        System.out.println(characterEncoding);
//
//        System.out.println(request.getContentType());
//        System.out.println(request.getDispatcherType());
//        System.out.println(request);
        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println("method = " + httpServletRequest.getMethod());
        // GET请求才会有 queryString
        System.out.println("queryString = " + httpServletRequest.getQueryString());
        System.out.println("URL = " + httpServletRequest.getRequestURL());
        System.out.println("URI = " + httpServletRequest.getRequestURI());

        System.out.println("servletPath = " + httpServletRequest.getServletPath());

        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            System.out.println(headerName + ":" + httpServletRequest.getHeader(headerName));
        }
        // TODO 这个确实还不知道怎么用
        Principal userPrincipal = httpServletRequest.getUserPrincipal();
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

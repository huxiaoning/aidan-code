package org.aidan.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/9/23 下午2:30
 * @描述: HttpServlet Demo
 */
public class LoginServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext = getServletContext();
        System.out.println(getServletName());
        System.out.println(getServletInfo());
    }
}

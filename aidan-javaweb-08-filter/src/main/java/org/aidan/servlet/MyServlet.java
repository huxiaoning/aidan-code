package org.aidan.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Aidan
 * @创建时间：2018/11/8 下午4:29
 * @描述: MyServlet
 */
public class MyServlet extends HttpServlet {

    public MyServlet() {
        System.out.println("MyServlet 构造器");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("MyServlet.doGet");
    }
}

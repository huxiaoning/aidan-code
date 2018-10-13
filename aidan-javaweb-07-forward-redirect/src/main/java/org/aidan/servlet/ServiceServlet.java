package org.aidan.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 胡小宁
 * @创建时间：2018/10/13 上午9:10
 * @描述: 真正服务的servlet
 */
public class ServiceServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Object name = request.getAttribute("name");
        System.out.println("name = " + name);
    }
}

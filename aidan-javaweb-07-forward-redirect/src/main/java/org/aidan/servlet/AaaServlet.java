package org.aidan.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/10/13 上午9:14
 * @描述: 转发
 */
public class AaaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name", "张三");

        /** 请求转发: / 表示当前应用的根目录 ,只能转发到当前应用下的资源 */
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service");

        requestDispatcher.forward(request, response);
    }
}

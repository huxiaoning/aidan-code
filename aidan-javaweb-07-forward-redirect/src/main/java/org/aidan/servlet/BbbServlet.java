package org.aidan.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/10/13 上午9:14
 * @描述: 重定向
 */
public class BbbServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setAttribute("name", "张三");

        /** 请求重定向：/ 表示当前站点下的根目 可以重定向到任意网络上的资源 */
        // 重定向到当前站点下的service路径
//        response.sendRedirect("/service");

        // 重定向到百度
        response.sendRedirect("https://www.baidu.com");
    }
}

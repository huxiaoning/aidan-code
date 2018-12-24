package org.aidan.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/11/22 8:37 PM
 * @描述: MyFilter
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}

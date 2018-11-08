package org.aidan.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/11/8 下午4:34
 * @描述: MyFilter
 */
public class MyFilter implements Filter {

    public MyFilter() {
        System.out.println("MyFilter 构造器");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter.init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter.doFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter.destroy");
    }
}

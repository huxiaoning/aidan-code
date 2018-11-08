package org.aidan.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Aidan
 * @创建时间：2018/11/8 下午5:24
 * @描述: MyServletContextListener
 */
public class MyServletContextListener implements ServletContextListener {

    private ServletContext servletContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        if (this.servletContext == null) {
            servletContext = sce.getServletContext();
        }
        System.out.println("servletContext初始化！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if (this.servletContext == null) {
            servletContext = sce.getServletContext();
        }
        System.out.println("servletContext销毁！");
    }
}

package org.aidan.servlet;

import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class HelloServlet implements Servlet {


    public HelloServlet() {
        System.out.println("helloServlet构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("helloServlet init");
        /** servletConfig对象 */
        // 1 api 获取servlet名字
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
        // 2 api 获取servlet初始化参数名（数组?）
        Enumeration<String> servletInitParameterNames = servletConfig.getInitParameterNames();
        while (servletInitParameterNames.hasMoreElements()) {
            String name = servletInitParameterNames.nextElement();
            // 3 api 根据servlet初始化参数名 取 参数值
            String value = servletConfig.getInitParameter(name);
            System.out.println(name + ":" + value);
        }


        /** ServletContext对象 代表的是当前的应用 application */
        ServletContext servletContext = servletConfig.getServletContext();
        // 1 api 获取全局初始化参数
        Enumeration<String> contextInitParameterNames = servletContext.getInitParameterNames();
        while (contextInitParameterNames.hasMoreElements()) {
            String paramName = contextInitParameterNames.nextElement();
            // 2 api
            String paramValue = servletContext.getInitParameter(paramName);
            System.out.println(paramName + ":" + paramValue);
        }

        // 3 api 获取当前WEB应用中某个文件的绝对路径
        String realPath = servletContext.getRealPath(File.separator + "static" + File.separator + "js");
        System.out.println("realPath :" + realPath);

        // 4 api 获取当前应用的名称
        String contextPath = servletContext.getContextPath();
        System.out.println("contextPath :" + contextPath);

        // 5 api 获取当前WEB应用的某个文件对应的输入流
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("db.properties");
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        System.out.println("-------------5 读取某个资源文件------------");
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("-------------5 读取某个资源文件 更高端的方式------------");
        InputStream is = servletContext.getResourceAsStream("db.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
            System.out.println("url : --> : " + properties.getProperty("url"));
            System.out.println("password : --> : " + properties.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("helloServlet getServletConfig");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("helloServlet service");
    }

    @Override
    public String getServletInfo() {
        System.out.println("helloServlet getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("helloServlet destroy");
    }
}

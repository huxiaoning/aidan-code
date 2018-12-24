package org.aidan.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * @author Aidan
 * @创建时间：2018/11/12 上午9:17
 * @描述: SpittrWebAppInitializer
 * <p>
 * DispatcherServlet 和 ContextLoaderListener(是ServletContext监听器,可以感知ServletContext上下文的创建与销毁)    的关系？
 * <p>
 * DispatcherServlet : 加载包含web组件的bean,如控制器 视图解析器 以及处理器映射
 * ContextLoaderListener : 加载应用中的其他bean.这些bean通常是驱动应用后端的中间层和数据层组件
 * <p>
 * 而 AbstractAnnotationConfigDispatcherServletInitializer(当前类扩展自此类) 会同时创建 DispatcherServlet 和 ContextLoaderListener
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 返回的带有@Configuration注解的类将会用来配置ContextLoaderListener创建的应用上下文中的bean
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    /**
     * 返回的带有@Configuration注解的类将会用来定义 DispatcherServlet 应用上下文中的bean
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * 将DispatcherServlet映射到"/"
     * DispatcherServlet会处理进入应用的所有请求
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads"));
    }
}

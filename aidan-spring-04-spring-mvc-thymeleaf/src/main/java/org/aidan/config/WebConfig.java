package org.aidan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Aidan
 * @创建时间：2018/11/12 上午9:23
 * @描述: WebConfig
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.aidan.web"})
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * 配置静态资源的处理
     * <p>
     * DispatcherServlet会处理所有请求，但排除静态资源
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        /*
         * DispatcherServlet 会将静态资源的请求转发给servlet容器默认的Servlet实现来处理
         * 而不是使用DispatcherServlet本身来处理此类请求
         */
        configurer.enable();
    }

    /**
     * 配置Thymeleaf视图解析器 开始
     */

    /** 配置Thymeleaf视图解析器 结束 */
}

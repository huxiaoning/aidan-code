package org.aidan.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author Aidan
 * @创建时间：2018/11/12 上午9:23
 * @描述: WebConfig
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.aidan.web"})
@ImportResource("classpath:spring-mvc.xml")
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
     * 配置jsp视图解析器
     *
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasename("file:///etc/spittr/messages");
        // 上面的被覆盖掉了
        messageSource.setBasename("classpath:messages");
        messageSource.setCacheSeconds(10);
//        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

    @Bean("localeResolver")
    public SessionLocaleResolver sessionLocaleResolver() {
        return new SessionLocaleResolver();
    }

}

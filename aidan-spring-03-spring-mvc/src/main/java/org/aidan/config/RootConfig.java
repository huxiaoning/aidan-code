package org.aidan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Aidan
 * @创建时间：2018/11/12 上午9:23
 * @描述: RootConfig
 */
@Configuration
@ComponentScan(
        basePackages = {"org.aidan"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {EnableWebMvc.class})
        }
)
public class RootConfig {
}

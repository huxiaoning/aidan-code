package org.aidan.chapter2_2_1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aidan
 * @创建时间：2018/11/10 上午10:41
 * @描述: TODO
 */
@Configuration
@ComponentScans(value = {
        @ComponentScan(basePackages = {"org.aidan.chapter2_2_1"}),
        @ComponentScan(basePackageClasses = {CompactDisc.class})
})
public class CDPlayerConfig {

}

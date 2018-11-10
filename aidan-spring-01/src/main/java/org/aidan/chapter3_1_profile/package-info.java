/**
 * @author Aidan
 * @创建时间：2018/11/10 下午3:20
 * @描述: 环境与profile
 * 一次构建，满足各种运行环境。即运行时决定启用哪种配置
 * <p>
 * <p>
 * javaConfig:  @Profile(value = {"dev"})
 * xmlConfig:   <beans profile="dev"></beans>
 * <p>
 * <p>
 *
 * spring.profiles.active
 * spring.profiles.default
 *
 * 如何激活呢？
 * 1 作为DispatcherServlet的初始化参数
 * 2 作为web应用的上下文参数
 * 3 作为JNDI条目
 * 4 作为环境变量
 * 5 在集成测试类上，使用@ActiveProfiles
 */
package org.aidan.chapter3_1_profile;